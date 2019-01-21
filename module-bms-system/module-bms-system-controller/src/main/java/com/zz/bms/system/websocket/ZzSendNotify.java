package com.zz.bms.system.websocket;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.query.TsNotificationQuery;
import com.zz.bms.system.query.impl.TsNotificationQueryImpl;
import com.zz.bms.system.service.TsNotificationService;
import com.zz.bms.util.base.data.DateKit;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 发送通知
 * @author Administrator
 */
@Component
public class ZzSendNotify {

    @Autowired
    private TsNotificationService tsNotificationService ;


    public void sendNotify(TsNotificationBO notify , ILoginUserEntity loginUser){
        if(notify == null){
            return ;
        }

        if(loginUser == null || StringUtils.isEmpty((String)loginUser.getId())){
            return ;
        }
        if(StringUtils.isEmpty(notify.getToUserId())){
            throw new InternalException();
        }

        if(StringUtils.isNotEmpty(notify.getContent())) {
            EntityUtil.autoSetInsertEntity(notify, loginUser);
            notify.setIsRead(EnumYesNo.NO.getCode());
            notify.setIsReadName(EnumYesNo.NO.getName());
            notify.setNotifyTime(DateKit.getCurrentDate());
            tsNotificationService.save(notify);
        }

        TsNotificationQuery query = new TsNotificationQueryImpl();
        query.toUserId(notify.getToUserId());
        query.isRead(EnumYesNo.NO.getCode());
        int count = tsNotificationService.count(query.buildWrapper());
        WebSocketHelp.sendMessage(notify, count);


    }
    public void sendNotify(List<TsNotificationBO> notifys , ILoginUserEntity loginUser){

        if(notifys == null || notifys.isEmpty()){
            return ;
        }

        if(loginUser == null || StringUtils.isEmpty((String)loginUser.getId())){
            return ;
        }
        List<TsNotificationBO> addNotifyList = new ArrayList<TsNotificationBO>();
        Set<String> toUserIdSet = new HashSet<String>();
        for(TsNotificationBO notify: notifys){
            if(StringUtils.isEmpty(notify.getToUserId())){
                throw new InternalException();
            }

            if(StringUtils.isNotEmpty(notify.getContent())) {
                EntityUtil.autoSetInsertEntity(notify, loginUser);
                notify.setIsRead(EnumYesNo.NO.getCode());
                notify.setIsReadName(EnumYesNo.NO.getName());
                notify.setNotifyTime(DateKit.getCurrentDate());
                addNotifyList.add(notify);
            }
            toUserIdSet.add(notify.getToUserId());
        }
        //只保存有内容的通知
        tsNotificationService.saveBatch(addNotifyList , 1000);

        if(toUserIdSet.size() ==1) {
            TsNotificationQuery query = new TsNotificationQueryImpl();
                query.toUserId((String)toUserIdSet.toArray()[0]);
                query.isRead(EnumYesNo.NO.getCode());

            int count = tsNotificationService.count(query.buildWrapper());
            for(TsNotificationBO notify: notifys) {
                WebSocketHelp.sendMessage(notify, count);
            }
        }else if(toUserIdSet.size() >1) {

            List<Map<String,Object>> userCounts = tsNotificationService.getUserNotReadCount(toUserIdSet.toArray(new String[toUserIdSet.size()]));
            if(userCounts == null || userCounts.isEmpty()){
                return ;
            }
            Map<String, Integer> userCountMap = new HashMap<>();
            for(Map map : userCounts){
                String userId = (String)map.get("u");
                Integer count = (Integer)map.get("c");
                if(userId != null && count != null){
                    userCountMap.put(userId , count);
                }
            }

            for(TsNotificationBO notify: notifys) {
                Integer count = userCountMap.get(notify.getToUserId());
                if(count != null) {
                    WebSocketHelp.sendMessage(notify, count);
                }
            }
        }

    }


}
