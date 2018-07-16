<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentLoginHeader title="用户登录" index="true"/>


<div class="slider">
    <div class="feather"><img src="${staticUrl}/statics/image/p_login_slider.jpg" ></div>
    <div class="feather"><img src="${staticUrl}/statics/image/p_login_slider1.jpg" ></div>
    <div class="feather"> <img src="${staticUrl}/statics/image/p_login_slider2.jpg" > </div>
</div>



<!--内容-->
<div class="login_bg login_bg_img" id="loginbg">
    <div class="log-h-dow">
        <%--
        <a>手机App下载
            <div class="log-h-layout">
                <div class="log-h-arrow"></div>
                <img  src="/tzcp/image/barcode/download.png">
                <p>扫描二维码下载手机app</p>
            </div>
        </a>
        |
        <a>服务器地址
            <div class="log-h-layout">
                <div class="log-h-arrow"></div>
                <img  src="/tzcp/image/barcode/server-addr.png">
                <p>扫描二维码获取服务器地址</p>
            </div>
        </a>
    --%>
    </div>

    <div class="login">
        <div class="login_main container">
            <div class="row cl">
                <div class="col-xs-12 hidden-xs col-lg-5 col-lg-offset-1 col-md-5 col-md-offset-1 col-sm-5 col-sm-offset-0">
                    <!--左侧界面-->
                    <div class="login_main_l">
                        <dl>
                            <dt><spring:message code="common.corporate.culture.headline" text="攀越高峰" /><small><spring:message code="common.corporate.culture.subhead" text="Over the future" /></small></dt>
                            <dd>
                                <h4>
                                    <spring:message code="common.corporate.culture.content1" text="企业文化是一种撼世气度与一种超然境界" /> ！<br>
                                    <spring:message code="common.corporate.culture.content2" text="责任为重、诚信为本" /><br>
                                    <spring:message code="common.corporate.culture.content3" text="立足当下，着眼未来" /><br>
                                </h4>
                            </dd>
                        </dl>
                    </div>
                    <!--/左侧界面-->
                </div>

                <div class="col-xs-12  col-lg-4 col-lg-offset-1  col-md-5  col-md-offset-0  col-sm-6 col-sm-offset-1" style='margin-bottom: 20px;'>
                    <!--右侧界面-->
                    <div class="login_main_r ">
                        <div class="login_title"><ul><li title='后台管理系统'>后台管理系统</li></ul></div>


                        <form action="" method='post'>
                            <div class="input-group">
                                <div class="input-group-addon" for="loginName" title='账号'><i class="icon icon-user"></i></div>
                                <input type="text" id="loginName" name="loginName" value="${param.loginName}"
                                       class="input-login" placeholder="请输入用户名、邮箱或手机号">
                            </div>

                            <div class="input-group">
                                <div class="input-group-addon" for="loginPassword" title='密码'><i class="icon icon-lock4"></i></div>
                                <input type="password" id="loginPassword" name="loginPassword" maxlength=15 autocomplete="off"
                                       class="input-login" placeholder="请输入密码">
                            </div>

                            <div class="input-group"><button id='btnLogin' class="btn btn-info btn-block btn-lg" value="登录" type="button" onclick='doLogin();' style='border-radius: 2px; padding: 10px 20px 12px; font-size: 14px;'>登录</button></div>
                        </form>



                        <div style='padding-top: 23px;'>
                            <div id='divMsg' style='padding: 10px; border-top: 1px solid #6a6d6d; color: #ff0300; height: 42px; text-align: center; word-break: break-all;'></div>
                        </div>
                    </div>
                    <!--/右侧界面-->
                </div>
            </div>
        </div>
    </div>
</div>


<footer class="login_foot">
    <spring:message  code="common.copyright.info" />
</footer>

<bms:contentLoginFooter/>





<script>
    var isProcessing = false;

    if (self != top)
    {
        top.location.href = self.location.href;
    }


    /**
     * jQuery初始化
     */
    $(function()
    {
        // 兼容性规范：检测IE版本，低于IE8，直接提示下载。
        if ($.browser.msie ){
            var ieVersion = $.browser.version.split('.')[0];
            if( ieVersion < 8) {
                $('body').empty();
                alert('您的浏览器版本过低，严重影响平台的运行性能和展示效果！\r\n点击“确定”按钮下载、安装浏览器的新版本。');
                location.href = 'http://rj.baidu.com/soft/detail/14744.html';
                return;
            }else if(ieVersion == 8){
                $('.slider').hide();
            }else {
                // 初始化轮播图
                $('.slider').phoenix({fullscreen: true, height: '85%'});
                $("#loginbg").removeClass("login_bg_img");
            }


            $('input, textarea').placeholder();

        }else {
            // 初始化轮播图
            $('.slider').phoenix({fullscreen: true, height: '85%'});
            $("#loginbg").removeClass("login_bg_img");
        }

        // 回填登录系统
        if (null == $.cookie('loginName') || '' == $.cookie('loginName')) {
            if (!$.browser.msie ) {
                $('input[name="loginName"]').focus();
            }
        }
        else
        {
            $('input[name="loginName"]').val($.cookie('loginName'))
            if (!$.browser.msie ) {
                $('input[name="loginPassword"]').focus();
            }
        }
    });

    /**
     * Key down event
     */
    document.onkeydown = function (e)
    {
        e = e ? e : event;
        if (13 == e.keyCode)
            doLogin();
    }

    /**
     * 刷新验证码
     */
    function refreshCode()
    {
        $("#imgCode").attr("src","/code.vdi?" + Math.random());
    }

    /**
     * 登录系统
     */
    function doLogin()
    {
        if (isProcessing)
            return;

        $('#divMsg').html('');
        //定义登录请求参数
        var params={};
        // 有效性校验
        var field = $('input[name="loginName"]');
        if (0 == jQuery.trim(field.val()).length)
        {
            showMessage('请输入“账号”！');
            field.focus();

            return;
        }
        //登录请求参数中定义用户名及设置value
        params.loginName =  $('input[name="loginName"]').val();


        field = $('input[name="loginPassword"]');
        if (0 == jQuery.trim(field.val()).length)
        {
            showMessage('请输入“密码”！');
            field.focus();

            return;
        }
        //登录请求参数中定义密码及设置value
        params.loginPassword =  $('input[name="loginPassword"]').val();

        if('0' == '1')
        {
            field = $('input[name="code"]');
            if (0 == jQuery.trim(field.val()).length)
            {
                showMessage('请输入“验证码”！');
                field.focus();

                return;
            }
            else if (5 != field.val().length)
            {
                showMessage('请输入5位“验证码”！');
                field.focus();

                return;
            }
            //登录请求参数中定义验证码及设置value
            params.code =  $('input[name="code"]').val()
        }
        // 登录处理
        isProcessing = true;
        $('#btnLogin').text('登录中......').prop('disabled', 'true');

        var url = '${ctx}/login/login';


        ajaxPost(url , params ,  function(rsp, textStatus, jqXHR)
        {
            if (rsp.success)
            {
                $.cookie('loginName', $('input[name="loginName"]').val(), {expires: 365});

                window.location.href = '${ctx}/main/home';
            }
            else
            {
                if('0' == '1') {
                    refreshCode();
                }
                isProcessing = false;
                $('#btnLogin').text('登录').prop('disabled', '');

                showMessage(rsp.msg);
            }
        },function(){

            isProcessing = false;
            $('#btnLogin').text('登录').prop('disabled', '');

            showMessage("请求服务出现错误,请重试");
        } );

    }

    /**
     * 显示登录错误信息
     */
    function showMessage(msg)
    {
        $('#divMsg').html('<i class="icon icon-volume-down" style="font-size: 20px; vertical-align: bottom;"></i>&nbsp;' + msg)
            .show()
            .stop(true).fadeOut(500).fadeIn(500).fadeOut(500).fadeIn(500);
    }
</script>

</html>
