package com.zz.bms.system.listeners;

import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumOperationType;
import com.zz.bms.events.LoginLogEvent;
import com.zz.bms.system.bo.TsLoginLogBO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.service.TsLoginLogService;
import com.zz.bms.system.service.TsUserService;
import com.zz.bms.util.base.data.DateKit;
import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.util.web.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * 登陆(登出)事件监听
 * @author zhonglh
 */
@Component
public class LoginEventListener implements ApplicationListener<LoginLogEvent> {

    @Autowired
    private TsLoginLogService loginLogService;

    @Autowired
    private TsUserService userService;

    @Override
    public void onApplicationEvent(LoginLogEvent loginLogEvent) {
        String userId = (String)loginLogEvent.getUserId();
        String loginType = loginLogEvent.getLoginType();
        String ip = loginLogEvent.getIp();

        EnumOperationType operationType = EnumOperationType.getEnumByValue(loginType);

        TsUserBO loginUser = userService.getById(userId,false);


        TsLoginLogBO loginLogBO = new TsLoginLogBO();
        loginLogBO.setId(IdUtils.getId());
        loginLogBO.setOperationType(operationType.getVal());
        loginLogBO.setOperationTypeName(operationType.getLabel());
        loginLogBO.setDepId((String)loginUser.getDepId());
        loginLogBO.setDepName(loginUser.getDepName());
        loginLogBO.setOperationUserId((String)loginUser.getId());
        loginLogBO.setOperationUserName(loginUser.getUserName());
        loginLogBO.setOperationIp(ip);
        loginLogBO.setOrganId((String)loginUser.getOrganId());
        loginLogBO.setTenantId(loginUser.getTenantId());
        loginLogBO.setOperationTime(DateKit.getCurrentDate());
        loginLogService.save(loginLogBO);


    }
}
