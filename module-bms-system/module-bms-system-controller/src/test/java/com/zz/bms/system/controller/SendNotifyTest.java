package com.zz.bms.system.controller;

import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.bo.TsNotificationReceiveBO;
import com.zz.bms.system.websocket.ZzSendNotify;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SendNotifyTest extends BaseTest {



    @Autowired
    private ZzSendNotify sendNotify;

    /**
     * 测试发送通知
     * @param loginUser
     */
    private void testNotify(ILoginUserEntity loginUser){
        for (int i = 0; i < 10; i++){
            new Thread(new Aaa(i+1 , sendNotify , loginUser)).start();
        }
    }


    static class Aaa implements Runnable{
        ZzSendNotify sendNotify;
        ILoginUserEntity loginUser;
        int index ;
        public Aaa(int index , ZzSendNotify sendNotify , ILoginUserEntity loginUser){
            this.index = index;
            this.sendNotify = sendNotify;
            this.loginUser = loginUser;
        }

        @Override
        public void run() {
            long stime = 1000 * 10 * index;
            try {
                Thread.sleep(stime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TsNotificationBO notify = new TsNotificationBO();
            notify.setTitle("aaa");
            notify.setContent("dfsadweqq    这是一个动画显示的\r\n对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示信息。对话框窗口可以移动，调dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可\n以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话\n框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，\n调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示信息。对话框窗口可以移动，调整尺寸，默认可通过 用户输入错误 用于显示信息。对话框窗口可以移动，调整尺寸，默认可通过 信息。对话框窗口可以移动，调整尺寸，默认可通过 整尺寸，默认可通过    ");
            TsNotificationReceiveBO notificationReceiveBO = new TsNotificationReceiveBO();
            notificationReceiveBO.setReceiveUserId((String)loginUser.getId());
            notificationReceiveBO.setIsRead(EnumYesNo.NO.getCode());
            List<TsNotificationReceiveBO> bos = new ArrayList<TsNotificationReceiveBO>();
            bos.add(notificationReceiveBO);
            sendNotify.sendNotify(notify, bos , loginUser);
        }
    }
}
