package com.zz.bms.system.websocket;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.bo.TsNotificationReceiveBO;
import com.zz.bms.system.query.VsNotificationQuery;
import com.zz.bms.system.query.impl.VsNotificationQueryImpl;
import com.zz.bms.system.service.TsNotificationReceiveService;
import com.zz.bms.system.service.TsNotificationService;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 发送通知
 * @author Administrator
 */
@Component
public class ZzSendNotify {

    @Autowired
    private TsNotificationService tsNotificationService ;


    @Autowired
    private TsNotificationReceiveService tsNotificationReceiveService ;




    @Transactional(rollbackFor = Exception.class)
    public void sendNotify(TsNotificationBO notify , List<TsNotificationReceiveBO> receiveBOs, ILoginUserEntity loginUser){
        if(notify == null){
            return ;
        }

        if(loginUser == null || StringUtils.isEmpty((String)loginUser.getId())){
            return ;
        }


        if(receiveBOs == null || receiveBOs.isEmpty()){
            throw new InternalException();
        }

        EntityUtil.autoSetInsertEntity(notify, loginUser);
        tsNotificationService.save(notify);

        for(TsNotificationReceiveBO bo : receiveBOs){
            bo.setId(IdUtils.getId());
            bo.setNotifyId(notify.getId());
        }
        tsNotificationReceiveService.saveBatch(receiveBOs);

        sendNotify(notify, receiveBOs);


    }

    @Async
    public void sendNotify(TsNotificationBO notify, List<TsNotificationReceiveBO> receiveBOs) {
        for( TsNotificationReceiveBO bo : receiveBOs) {
            VsNotificationQuery query = new VsNotificationQueryImpl();
            query.receiveUserId(bo.getReceiveUserId());
            query.isRead(EnumYesNo.NO.getCode());
            int count = tsNotificationService.count(query.buildWrapper());
            WebSocketHelp.sendMessage(notify, bo , count);
        }
    }



}
