<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="staticUrl" value="${pageContext.request.contextPath}"/>
<%--

<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en" xmlns="http://www.w3.org/1999/html">
<!--<![endif]-->
--%>

<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="Window-target" content="_top">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1">



    <meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <!-- 页面按原比例显示 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>zz后台管理系统</title>
    <link rel="icon" href="${staticUrl}/statics2/image/favicon.ico">
    <link rel="shortcut icon" href="${staticUrl}/statics2/image/favicon.ico">





    <link rel="stylesheet" href="${ctx}/statics2/font-awesome/font-awesome.min.css"/>
    <link rel="stylesheet" href="${ctx}/statics2/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${ctx}/statics2/jquery/easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="${ctx}/statics2/jquery/opentip/opentip.css" />
    <link rel="stylesheet" href="${ctx}/statics2/jquery/jquery-confirm/jquery-confirm.min.css"/>
    <link rel="stylesheet" href="${ctx}/statics2/jquery/toastr/toastr.min.css"/>
    <link rel="stylesheet" href="${ctx}/statics2/jquery/cropper/cropper.min.css">
    <link rel="stylesheet" href="${ctx}/statics2/jquery/cropper/main.css">
    <link rel="stylesheet" href="${ctx}/statics2/jquery/custom-scrollbar/jquery.mCustomScrollbar.min.css">


    <link rel="stylesheet" href="${ctx}/statics2/css/home.css">
    <link rel="stylesheet" href="${ctx}/statics2/css/common.css"/>

    <style>
        #full-screen {padding: 10px; background: #ffffff; position: fixed; top: 0; right: 0; bottom: 0; left: 0; z-index: 99999; overflow: auto}
        .fixed-top-show{position: fixed;top: 0;left: 0;right: 0;bottom: 0}
        @media (min-width: 992px){.col-md-3 .block-each{margin-left: 10px}}
        @media (max-width: 767px){.col-xs-12 .block-each{margin-left: 0}}
        .nav-personal .dropdown+li {border-left: 1px solid #0896ba;}
    </style>
</head>

<body>
<nav class="navbar" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><img class="logo" src="http://123.57.235.9:88/tzcp/image/logo.png"/></div>
        <div class="collapse navbar-collapse" style="padding-left: 0;margin-left: 230px;">

            <div id="limitSec">

                <div id="drag-placeholder">点击"+"号定制<br/>快捷菜单</div>
                <a href="${ctx}/main/home" class="home-btn" data-ot=" 首页 " data-ot-delay="1"><i class="fa fa-home"></i></a>
                <ul class="nav navbar-nav" id="nav-bar">

                    <li menuId='100' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/100/3')"><i class="fa fa-list-alt"></i></i><span>发起流程</span></a></li>

                    <li menuId='2' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/2/3')"><i class="fa fa-random"></i></i><span>待办流程</span></a></li>

                    <li menuId='34' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/34/3')"><i class="fa fa-list-alt"></i></i><span>我的项目</span></a></li>

                </ul>

                <div class="last-nav">
                    <a href="javascript:;"><i class="fa fa-plus"></i></a>
                    <div class="nav-more" style="display: none">
                        <ul id="nav-more">

                            <li menuId='61' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/61/3')"><i class="fa fa-calendar-o"></i></i><span title='会议室预定'>会议室预定</span></a></li>

                            <li menuId='58' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/58/3')"><i class="fa fa-bar-chart"></i></i><span title='我的报表'>我的报表</span></a></li>

                            <li menuId='62' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/62/3')"><i class="fa fa-list-alt"></i></i><span title='员工通讯录'>员工通讯录</span></a></li>

                        </ul>
                    </div>
                </div>
            </div>

            <!-- 右侧菜单按钮 -->
            <ul class="nav navbar-nav navbar-right nav-personal">

                <li class='dropdown'>
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" style='margin-top: -8px; margin-bottom: 0px; padding-bottom: 3px;'>
                        <img id='imgUserAvatar' class='img-circle' src="${staticUrl}/statics2/image/default.png"
                             width=40 height=40 style='border:solid 2px;' />
                        <span>&nbsp;范红宇&nbsp;</span><span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="javascript: changeProfile();"><i class='fa fa-cog'></i>&nbsp;个人设置</a></li>
                        <li role="presentation" class="divider"></li>
                        <li><a href="javascript: logoutSystem();"><i class='fa fa-power-off'></i>&nbsp;退出系统</a></li>
                    </ul>
                </li>

                <li>
                    <a href="javascript:openMenu('http://123.57.235.9:88/tzcp/platform/msg')">
                        <i class="fa fa-bell-o"><span class="badge hidden">0</span></i>
                    </a>

                    <div class="msg-toast-container">
                        <div class="msg-toast-title">
                            <svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-message"></use></svg>
                            <span><font color="red">0</font> 条未读消息</span>
                        </div>

                        <ul class="unread-list"></ul>

                        <a href="javascript:openMenu('http://123.57.235.9:88/tzcp/platform/msg')" class="show-all-msg">
                            <span>查看所有消息</span>
                            <svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-showall"></use></svg>
                        </a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- 左侧菜单 -->
<div class='left-menu'>

    <label class="search-items"><i class="fa fa-search"></i>
        <input type="text" class="form-control" placeholder="搜索功能模块" id="func-search"
               oninput="OnInput()" onpropertychange="OnPropChanged() " />
    </label>

    <ul class="menu" id="ul_cartList">



        <li menuNodeNo="2" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/2/3');" title="待办流程" style="padding-left: 6px;"><i class="fa fa-random"></i>待办流程</a>
        </li>

        <li menuNodeNo="100" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/100/3');" title="发起流程" style="padding-left: 6px;"><i class="fa fa-list-alt"></i>发起流程</a>
        </li>

        <li menuNodeNo="32" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/32/3');" title="投资人管理" style="padding-left: 6px;"><i class="fa fa-user"></i>投资人管理</a>
        </li>

        <li menuNodeNo="31" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/31/3');" title="私募基金管理" style="padding-left: 6px;"><i class="fa fa-shield"></i>私募基金管理</a>
        </li>

        <li menuNodeNo="33" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="投资项目管理" style="padding-left: 6px;"><i class="fa fa-suitcase"></i>投资项目管理</a>
        </li>

        <li menuNodeNo="33-34" menuLevel="2" parentNodeNo="33" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/34/3');" title="我的项目" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>我的项目</a>
        </li>

        <li menuNodeNo="33-35" menuLevel="2" parentNodeNo="33" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/35/3');" title="投资项目管理" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>投资项目管理</a>
        </li>

        <li menuNodeNo="54" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="风控合规管理" style="padding-left: 6px;"><i class="fa fa-rocket"></i>风控合规管理</a>
        </li>

        <li menuNodeNo="54-57" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/57/3');" title="基金风险检测" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>基金风险检测</a>
        </li>

        <li menuNodeNo="54-56" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/56/3');" title="项目风险检测" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>项目风险检测</a>
        </li>

        <li menuNodeNo="54-55" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/55/3');" title="风险处置管理" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>风险处置管理</a>
        </li>

        <li menuNodeNo="42" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="资金运作管理" style="padding-left: 6px;"><i class="fa fa-asterisk"></i>资金运作管理</a>
        </li>

        <li menuNodeNo="42-43" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/43/3');" title="LP出资单据" style="padding-left: 28px;"><i class="fa fa-graduation-cap"></i>LP出资单据</a>
        </li>

        <li menuNodeNo="42-44" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/44/3');" title="LP退出单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>LP退出单据</a>
        </li>

        <li menuNodeNo="42-45" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/45/3');" title="投资支付单据" style="padding-left: 28px;"><i class="fa fa-twitch"></i>投资支付单据</a>
        </li>

        <li menuNodeNo="42-46" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/46/3');" title="投资收益单据" style="padding-left: 28px;"><i class="fa fa-bookmark"></i>投资收益单据</a>
        </li>

        <li menuNodeNo="42-47" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/47/3');" title="收益分配单据" style="padding-left: 28px;"><i class="fa fa-star-half-o"></i>收益分配单据</a>
        </li>

        <li menuNodeNo="42-48" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/48/3');" title="清算分配单据" style="padding-left: 28px;"><i class="fa fa-asterisk"></i>清算分配单据</a>
        </li>

        <li menuNodeNo="42-49" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/49/3');" title="费用报销单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>费用报销单据</a>
        </li>

        <li menuNodeNo="42-50" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/50/3');" title="费用分摊单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>费用分摊单据</a>
        </li>

        <li menuNodeNo="42-51" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/51/3');" title="投资者权益账户" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>投资者权益账户</a>
        </li>

        <li menuNodeNo="58" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/58/3');" title="统计分析报表" style="padding-left: 6px;"><i class="fa fa-bar-chart"></i>统计分析报表</a>
        </li>

        <li menuNodeNo="59" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="人事行政管理" style="padding-left: 6px;"><i class="fa fa-users"></i>人事行政管理</a>
        </li>

        <li menuNodeNo="59-61" menuLevel="2" parentNodeNo="59" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/61/3');" title="会议室预定" style="padding-left: 28px;"><i class="fa fa-calendar-o"></i>会议室预定</a>
        </li>

        <li menuNodeNo="59-62" menuLevel="2" parentNodeNo="59" style="display: none">
            <a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/62/3');" title="员工通讯录" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>员工通讯录</a>
        </li>

    </ul>

    <ul class="menu search-menu"  id="sMenu"></ul>
</div>

<!-- 工作区 -->
<div style='position: absolute; left: 230px; top: 50px; bottom: 0px; right: 0px;'>
    <iframe id='ifrmWorkspace' name='ifrmWorkspace' width='100%' height='100%' frameborder='0'  style="background-color: #ffffff;"></iframe>
</div>

<div class='interruption' style="display: none">
    <div class="item">
        <div class="item-inner"><div class="item-loader-container"><div class="la-timer"><div></div></div></div></div>
        <div class="item-title"><span>处理中，请稍候......</span></div>
    </div>
</div>

<div class="hidden">
    <form id="formProfile" class="form-horizontal" action="http://123.57.235.9:88/tzcp/platform/profile" method="post">
        <input name="headImg" type="hidden" value="default.png">
        <table width="100%">
            <tr>
                <td>
                    <table width="100%">
                        <tr>
                            <td align="right" width="100">手机号码：</td>
                            <td><input name="mobilePhone" class="form-control input-sm" pattern='1\d{10}' data-msg-pattern='无效的手机号码！'></td>
                        </tr>

                        <tr>
                            <td align="right">电子邮件：</td>
                            <td><input name="email" class="form-control input-sm email" maxlength="30"></td>
                        </tr>

                        <tr>
                            <td align="right">分页记录数：</td>
                            <td><select name="pageLimit" class="form-control input-sm"></select></td>
                        </tr>

                        <tr>
                            <td align="right">原密码：</td>
                            <td><input name="origPassword" type="password" class="form-control input-sm" autocomplete="off"></td>
                        </tr>

                        <tr>
                            <td align="right">新密码：</td>
                            <td><input id="newPassword" name="newPassword" type="password" class="form-control input-sm" minlength=6 autocomplete="off"></td>
                        </tr>

                        <tr>
                            <td align="right">确认新密码：</td>
                            <td><input name="confirmNewPassword" type="password" class="form-control input-sm" equalto="#newPassword" data-msg-equalto="您2次输入的新密码不一致！" minlength=6 autocomplete="off"></td>
                        </tr>
                    </table>
                </td>
                <td width="160" align="right"><img id="userHeadImg" src="" style="cursor: pointer; border: solid 1px #c0c0c0; margin: 5 0 0 5; width: 150px; height: 170px;" onclick="changeHeadImage();"></td>
            </tr>
        </table>
    </form>
</div>

<div class="hidden">
    <div class="Container" style="margin-left: 12px" id="modal" >
        <input type="hidden" id="aspectRatioVal">
        <input type="hidden" id="cropWidthVal">
        <input type="hidden" id="cropHeightVal">
        <div class="row" style="position: relative">
            <div class="col-md-8">
                <div class="img-container" style="width: 480px;height: 390px;background-color: #ccc;"><img id="image" src=""></div>
            </div>

            <div class="col-md-4">
                <div style="margin-left: 17px; margin-top: 38px;" class="img-preview preview-head"></div>
                <!-- 开始 选择 放大 缩放 按钮 -->
                <div class="docs-buttons" style="position: absolute;top: 300px;left: 25px;">
                    <div class="btn-group" style="float: left">
                        <label class="btn btn-danger btn-upload " for="inputImage" title="选择图片" style="width:100px">
                            <input type="file" class="sr-only" id="inputImage" name="inputImage">
                            <span class="docs-tooltip" data-toggle="tooltip" title="选择图片">
							<span class="fa fa-file-photo-o "></span>&nbsp;选图片 </span>
                        </label>
                    </div>

                    <div class="btn-group" style="float: left; ">
                        <button type="button" class="btn btn-primary" id="zoomIn"><span class="docs-tooltip" data-toggle="tooltip" title="放大图片"><span class="fa fa-search-plus"></span></span></button>
                        <button type="button" class="btn btn-primary" id="zoomOut"><span class="docs-tooltip" data-toggle="tooltip" title="缩小图片"><span class="fa fa-search-minus"></span></span></button>
                    </div>

                    <div class="btn-group" style="float: left; ">
                        <button type="button" class="btn btn-primary" id="zoomLeft"><span class="docs-tooltip" data-toggle="tooltip" title="逆时针旋转45°"><span class="fa fa-rotate-left"></span></span></button>
                        <button type="button" class="btn btn-primary" id="zoomRight"><span class="docs-tooltip" data-toggle="tooltip" title="顺时针旋转45°"><span class="fa fa-rotate-right"></span></span></button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- model 大结束-->
</div>



<script src="${staticUrl}/statics2/iconfont/iconfont.js"></script>

<script src="${staticUrl}/statics2/jquery/jquery.min.js"></script>
<script src="${staticUrl}/statics2/jquery/jquery-migrate.min.js"></script>
<script src="${staticUrl}/statics2/bootstrap/bootstrap.min.js"></script>

<script src="${staticUrl}/statics2/jquery/easyui/jquery.easyui.min.js"></script>
<script src="${staticUrl}/statics2/jquery/easyui/jquery.easyui.patch.js"></script>
<script src="${staticUrl}/statics2/jquery/easyui/easyui-lang-zh_CN.js"></script>

<script src="${staticUrl}/statics2/jquery/dialog/jquery.iDialog.min.js" dialog-theme="default"></script>

<script src="${staticUrl}/statics2/jquery/opentip/opentip-jquery.min.js"></script>
<script src="${staticUrl}/statics2/jquery/opentip/opentip-jquery-excanvas.min.js"></script>

<script src="${staticUrl}/statics2/jquery/validate/jquery.validate.min.js"></script>
<script src="${staticUrl}/statics2/jquery/validate/additional-methods.min.js"></script>
<script src="${staticUrl}/statics2/jquery/validate/messages_zh.min.js"></script>

<script src="${staticUrl}/statics2/jquery/97-date-picker/WdatePicker.js"></script>

<!--[if IE 9]>
<script src="${staticUrl}/statics2/base64.min.js"></script>
<![endif]-->
<script src="${staticUrl}/statics2/jquery/jquery-confirm/jquery-confirm.min.js"></script>

<script src="${staticUrl}/statics2/jquery/jquery.form.js"></script>

<script src="${staticUrl}/statics2/jquery/toastr/toastr.min.js"></script>
<script src='${staticUrl}/statics2/jquery/custom-scrollbar/jquery.mCustomScrollbar.concat.min.js'></script>

<script src="${staticUrl}/statics2/jquery/cropper/cropper.min.js"></script>


<script>
    // Global Const
    var $AppContext = '${ctx}';
    var ctx = $AppContext;
    var $PagingSize = 50 || 20;
    var $DBType = 'mysql';
    // var $ShowGlolalLoadingMask = true;

    var $RootDeptId = '1';
    var $RootDeptName = '西点软件';
    var $RootDeptNodeNo = '001';
    var $DomainId = '1';
    var $AttachmentEngine = 'mongodb';
    var $AlibabaMediaNameSpace = '';
    var opinionsContentDisply = 'true';  //流转意见是否显示
</script>


<script src="${staticUrl}/statics2/js/common.js"></script>
<script src="${staticUrl}/statics2/js/common-tools.js"></script>
<script src="${staticUrl}/statics2/js/common-setting.js"></script>
<script src="${staticUrl}/statics2/js/common-data.js"></script>
<script src="${staticUrl}/statics2/js/Sortable.min.js"></script>

<script type="text/javascript">
    var dlgData;
    var $image = $('#image');
    var avatar_callback;

    /**
     * 初始化截图控件
     */
    $(function ()
    {
        'use strict';//表示强规则
        var options =
            {
                zoomable: true,
                dragMode: "move",
                viewMode:  3,
                preview: '.img-preview',//预览区域
            };

        //根据传入参数控制截图框大小
        options.built = function()
        {
            $image.cropper('setAspectRatio', $("#aspectRatioVal").val());
            var croppBoxData = {width: 151, height: 171};
            $image.cropper('setCropBoxData', croppBoxData);
        };

        // 响应 选框 事件
        $image.on({}).cropper(options);

        // 选择 图片 预览图片
        var $inputImage = $('#inputImage');
        var URL = window.URL || window.webkitURL;
        var blobURL;
        if (URL)
        {
            $inputImage.change(function()
            {
                var files = this.files;
                var file;
                if (!$image.data('cropper'))
                {
                    return;
                }

                if (files && files.length)
                {
                    file = files[0];
                    if (/^image\/\w+$/.test(file.type))
                    {
                        blobURL = URL.createObjectURL(file);
                        $image.one('built.cropper', function()
                        {
                            // Revoke when load complete
                            URL.revokeObjectURL(blobURL);
                        }).cropper('reset').cropper('replace', blobURL);
                        //$inputImage.val('');
                    }
                    else
                    {
                        window.alert('请选择一张图片.');
                    }
                }
            });
        }
        else
        {
            $inputImage.prop('disabled', true).parent().addClass('disabled');
        }
    });

    //图片上传弹出框
    function initCropImgDialog(callback)
    {
        resetCrop();

        avatar_callback = callback;
        if (null == dlgData)
        {
            $("#cropWidthVal").val(251);
            $("#heightVal").val(271);
            $("#aspectRatioVal").val(8 / 10);
            dlgData = iDialog(
                {
                    content: $('#modal')[0], lock: true, effect: 'i-super-scale', width: 770, height: 490,
                    btn: {ok: {val: '保存', type: 'green', click: cropImgUpload}, cancel: {val: '取消', click: resetCrop}}
                });
        }

        dlgData.$title.html('图片上传');
        dlgData.show();
    }

    //重置图片控件
    function resetCrop()
    {
        $("#image").attr('src', '');
        $("#inputImage").val('');
        $(".img-preview").html('');
        $(".cropper-container").remove();
    }

    //放大待截取图片
    $("#zoomIn").click(function()
    {
        $image.cropper("zoom", 1);
    });

    $("#zoomOut").click(function()
    {
        $image.cropper("zoom", -1);
    });

    //缩小待截取图片
    $("#zoomLeft").click(function()
    {
        $image.cropper("rotate", -45);
    });

    $("#zoomRight").click(function()
    {
        $image.cropper("rotate", 45);
    });

    //截取并上传
    function cropImgUpload(callback)
    {
        var option = {width: $("#cropWidthVal").val(), height: $("#cropHeightVal").val()};
        //截取方法
        var result = $image.cropper("getCroppedCanvas", option);
        var flag=true;
        $.ajax(
            {
                url: $AppContext + '/third/corpper/avatar', type: 'post', data: {"imageData": result.toDataURL().toString()}, dataType: 'json', async: false,
                success: function (data)
                {
                    if (data.id)
                    {
                        avatar_callback(data.id);
                        resetCrop();
                        $("#modal").modal('hide');
                    }
                    else
                    {
                        error("设置失败");
                        flag = false;
                    }
                }
            });

        return flag;
    }


    var myProfile = {headImg: 'default.png', mobilePhone: '13809896650', email: 'fanhy@ccne.com', pageLimit: 50};
    var msgInterval = null;

    /**
     * Windows Resize事件
     */
    $(window).resize(function()
    {
        sortShortcutMenu();
    });

    /**
     * jQuery初始化
     */
    $(function()
    {


        // 刷新头像
        $('#imgUserAvatar').prop('src', getUserAvatarUrl('default.png', 1));
        // 初始化左侧菜单
        initMenu();
        // 初始化顶部快捷菜单
        initShortcutMenu();

        // 初始化模块搜索功能
        $("#func-search").keyup(function()
        {
            var $this = $(this);
            var _value = $this.val();
            if (_value == '')
                $(".search-menu").hide();
            else
                $(".search-menu").show();
        });

        // 点击空白区域关闭快捷菜单
        $(window).click(function(e)
        {
            var str = e.target.className.toString();
            if (str.indexOf("fa-plus") > -1)
            {
                if ($(".nav-more").is(":hidden"))
                    $(".nav-more").show();
                else
                if (!$(".nav-more").is(":hidden"))
                    $(".nav-more").hide();
            }
            else
                $(".nav-more").hide();
        });

        // 查询未读消息
        loadMyMessage();
        msgInterval = setInterval("loadMyMessage()", 60 * 1000);
    });

    // 搜索功能模块，非IE内核浏览器调用方法
    function OnInput()
    {
        OnPropChanged();
    }

    //搜索功能模块，IE内核浏览器调用方法
    function  OnPropChanged()
    {
        var content = $('#func-search').val();
        var htmls = '';
        for (var i = 0; i < $("#ul_cartList li").length; i++)
        {
            var spanElement = $("#ul_cartList li a")[i];
            // console.log(spanElement.title);
            if (spanElement.title.indexOf(content) >= 0)
            {
                if (spanElement.href.indexOf('/') != -1)
                {
                    htmls += '<li><a href="'+spanElement.href+'">'+spanElement.title+'</a></li>'
                }
            }
        }

        $('#sMenu').html(htmls);
    }

    //----------------------------------------------------------------------------------------------
    //		快捷菜单
    //----------------------------------------------------------------------------------------------

    /**
     * 初始化顶部快捷菜单
     */
    function initShortcutMenu()
    {
        // 初始化Sortable(grouping)
        Sortable.create(document.getElementById('nav-bar'),
            {
                group: "omega", //group相同才能互相拖拽
                animation: 150, //动画参数
                // 拖拽时候添加有新的节点的时候触发该事件
                onAdd: function (evt) {sortShortcutMenu();},
                // 拖拽更新节点位置触发该事件
                onUpdate: function (evt) {},		// 删除拖拽节点的时候触发该事件
                onRemove: function (evt)
                {
                    sortShortcutMenu();
                    // 拖拽删除,删掉了最后一个,重新计算placeholder块儿的宽度
                    var LAST = $("#nav-bar").children().length;
                    if (LAST == 0)
                    {
                        var placeholderWidth = 42 + evt.item.textContent.length * 13;
                        $("#drag-placeholder").css("width",placeholderWidth);
                        $(".last-nav").css({"left": placeholderWidth + 50 + "px", "width": placeholderWidth + "px"});
                    }
                },
                // 开始拖拽触发该事件
                onStart: function(evt) {},
                // 发生排序触发该事件
                onSort: function(evt) {saveShortcutLayout();},
                //拖拽完毕之后触发该事件
                onEnd: function(evt) {}
            });

        Sortable.create(document.getElementById('nav-more'),
            {
                group: "omega", //group相同才能互相拖拽
                animation: 150 //动画参数
            });

        // 传参数修正导航个数的问题
        sortShortcutMenu();
    }

    // 初始化和调整窗口时都要调用的公共事件
    function sortShortcutMenu(obj)
    {
        // 左侧导航可x显示宽度
        var collapseWidth = $(window).width() - 230;
        var navPersonalWidth = $(".nav-personal").width();
        var menuWidth = parseInt(collapseWidth - navPersonalWidth);
        // 初始化实际导航宽度，初始值为"home"按钮的宽度
        var navWidth = 50;
        // 两个导航list
        var $eachLi = $("#nav-bar").children();
        var $eachLiMore = $("#nav-more").children();

        // 导航总个数
        var LENGTH = $eachLi.length;
        // 导航数为零
        if (LENGTH == 0)
        {
            $("#drag-placeholder").show();
            var dpWidth = $("#drag-placeholder")[0].offsetWidth;
            $(".nav-more").addClass("pos-r");
            $(".last-nav").css({"left": dpWidth + 50 + "px", "width": dpWidth + "px"});
        }
        else if (LENGTH == 1)
        {
            $("#drag-placeholder").hide();
            var uniqueWidth = $eachLi.width();
            $(".last-nav").css({"left": uniqueWidth + 50 + "px", "width": (menuWidth - uniqueWidth - 50) + "px"});
        }
        else
        {
            $("#drag-placeholder").hide();
            // 遍历过程中调整最后的加号位置
            $eachLi.each(function(i, el)
            {
                navWidth += $(el).width();
                // 显示不全，则隐藏的快捷菜单露出一部分
                if (navWidth <= menuWidth && (menuWidth - navWidth) > (50 + 60))
                {
                    $(".last-nav").css({"left": navWidth + 60 + "px", "width": (menuWidth - navWidth - 60) + "px"});
                    if (i < 1)
                        $(".nav-more").addClass("pos-r");
                    // 快捷菜单能够全部显示时
                    else
                    if(i + 1 == LENGTH)
                        $(".last-nav").css({"left": navWidth + "px", "width": (menuWidth - navWidth) + "px"});
                    else
                        $(".nav-more").removeClass("pos-r");
                }
            });
        }
    }

    //----------------------------------------------------------------------------------------------
    //		左侧菜单
    //----------------------------------------------------------------------------------------------

    /**
     * 初始化系统菜单
     */
    function initMenu()
    {
        // 顶部菜单 - 鼠标移动自动展示
        $('ul.nav li.dropdown').hover
        (
            function() {$(this).find('.dropdown-menu').stop(true, true).delay(10).fadeIn(200);},
            function() {$(this).find('.dropdown-menu').stop(true, true).delay(10).fadeOut(200);}
        );

        // 左侧导航菜单
        $(window).on("load",function()
        {
            addMenuEvent();
            // 菜单区域添加滚动条效果
            $(".menu").mCustomScrollbar(
                {
                    autoHideScrollbar: true, theme: "light" /* dark,light,rounded 默认：light */
                });
        });
    }

    /**
     * 添加菜单点击事件
     */
    function addMenuEvent()
    {
        var $lis = $(".menu li");
        for (var i = 0; i < $lis.length; i++)
        {
            var curLi = $lis.eq(i);
            if (curLi.siblings('[menuNodeNo^=\'' + curLi.attr("menuNodeNo") + '-\']').length > 0)
                curLi.find("a").addClass("arrow").parent().attr('hasChild',"1").attr('num',0);
            else
                curLi.find("a").parent().attr('hasChild',"0").attr('num',0);

            // 1级大类添加右侧箭头
            if (1 == curLi.attr('menuLevel'))
            {
                curLi.find("a").addClass("right-arrow");
            }
        }

        $lis.click(function()
        {
            var $this = $(this);
            var $siblings = $this.siblings();
            var _thisMenuNo = $this.attr("menuNodeNo");
            var _hasChild = $this.attr('hasChild');
            // 焦点切换
            if (!$this.find("a").hasClass("active"))
            {
                $this.find("a").addClass("active");
                $siblings.find("a").removeClass("active");
            }

            if (_hasChild == '1')
            {
                var children = $this.siblings('[menuNodeNo^=\'' + _thisMenuNo + '-\']');
                // 菜单展开合并
                if ($this.find("a").hasClass('right-arrow'))
                {
                    // 展开菜单
                    for (var i = 0; i < children.length; i++)
                    {
                        var child = $(children[i]);
                        var num = parseInt(child.attr('num'));
                        if(num == 0)
                            child.slideDown();
                        else
                        if (num > 0)
                        {
                            num = num - 1;
                            if (num == 0)
                                child.slideDown().attr('num', num);
                            else
                                child.attr('num', num);
                        }
                    }

                    $this.find("a").removeClass("right-arrow");
                }
                else
                if (!$this.find("a").hasClass('right-arrow'))
                {
                    // 合并菜单
                    for (var i=0;i<children.length;i++)
                    {
                        var child = $(children[i]);
                        var num = parseInt(child.attr('num'));
                        child.slideUp().attr('num', num + 1);
                    }

                    $this.find("a").addClass("right-arrow");
                }
            }
        });

        // 展开第一个大类菜单
        setTimeout(function()
        {
            $lis.eq(0).trigger('click');
        }, 100);
    }

    /**
     * 打开菜单链接
     */
    function openMenu(url)
    {
        if (url)
        {
            $("#ifrmWorkspace").attr("src", url);
        }
    }

    //----------------------------------------------------------------------------------------------
    //		个人参数修改
    //----------------------------------------------------------------------------------------------

    var profileDlg;
    /**
     * 修改个人参数
     */
    function changeProfile(id)
    {
        if (null == profileDlg)
        {
            profileDlg = iDialog(
                {
                    content: $('#formProfile')[0], effect: 'i-super-scale', width: 500, lock: true,
                    btn:
                        {
                            ok:
                                {
                                    val: '保存', type: 'green', click: function(btn)
                                {
                                    if (!$("#formProfile").valid())
                                    {
                                        warn('保存失败：表单信息填写不完整！');
                                        return false;
                                    }

                                    // 校验修改密码逻辑
                                    var passwds = 0;
                                    if ($('input[name="origPassword"]').val().length > 0)
                                        passwds ++;

                                    if ($('input[name="newPassword"]').val().length > 0)
                                        passwds ++;

                                    if ($('input[name="confirmNewPassword"]').val().length > 0)
                                        passwds ++;

                                    if (passwds > 0 && 3 != passwds)
                                    {
                                        warn('请输入“原密码”、“新密码”和“确认新密码”3项信息才能修改密码。请检查您的输入！');
                                        return false;
                                    }

                                    $('#formProfile').ajaxSubmit(
                                        {
                                            success: function(rsp)
                                            {
                                                if (rsp.success)
                                                {
                                                    profileDlg.hide();
                                                    info('个人参数信息保存成功！', function(){window.location.reload();});
                                                }
                                                else
                                                    error(rsp.msg);
                                            }
                                        });

                                    // 不关闭对话框
                                    return false;
                                }
                                },
                            cancle: {val: '取消'}
                        }
                });

            $('select[name="pageLimit"]').html(getSelectOptions([[20, '20条每页'], [30, '30条每页'], [40, '40条每页'], [50, '50条每页'], [100, '100条每页']], 20));
            profileDlg.$title.html('<i class="fa fa-pencil"></i>&nbsp修改');

            // 初始化校验规则
            $("#formProfile").validate();
        }

        $('#formProfile')[0].reset();
        fillFormData('formProfile', myProfile);
        $('#userHeadImg').prop('src', getUserAvatarUrl(myProfile.headImg, 1));
        profileDlg.show();
        $("#formProfile").clearValidate();
    }

    /// 更换新头像
    function changeHeadImage()
    {
// 	uploadNewHeadImage({}, function(newFileName)
// 	{
// 		$('#userHeadImg').prop('src', 'http://123.57.235.9:88/tzcp/third/avatar/temp/' + newFileName);
// 		$('input[name="headImg"]').val(newFileName);
// 	});

        initCropImgDialog(function(newFileName){

            $('#userHeadImg').prop('src', 'http://123.57.235.9:88/tzcp/third/avatar/temp/' + newFileName);
            $('input[name="headImg"]').val(newFileName);
        });

    }

    /**
     * 退出系统
     */
    function logoutSystem()
    {
        confirm('您确定现在就退出系统吗？', function()
        {
            window.location = 'http://123.57.235.9:88/tzcp/platform/logout/3';
        });
    }

    //----------------------------------------------------------------------------------------------
    //		快捷菜单
    //----------------------------------------------------------------------------------------------

    var shortcutSaveTimeout = null;

    /**
     * 保存快捷方式布局
     */
    function saveShortcutLayout()
    {
        // console.debug('延时5秒后持久化！');
        // 重新延时5秒保存
        if (null != shortcutSaveTimeout)
            clearTimeout(shortcutSaveTimeout);

        shortcutSaveTimeout = setTimeout("saveShortcut()", 5 * 1000);
    }

    /**
     * 持久化快捷方式布局
     */
    function saveShortcut()
    {
        var shortcuts = $("#nav-bar").children();
        var lies = [];
        shortcuts.each(function(index, li)
        {
            lies.push($(li).attr('menuId'));
        });

        $.post
        (
            'http://123.57.235.9:88/tzcp/platform/shortcut', {menuIds: lies.join(',')},
            function(rsp, textStatus, jqXHR)
            {
                if (!rsp.success)
                    error(rsp.msg, function(){});
            }
        )
    }

    //----------------------------------------------------------------------------------------------
    //		系统消息
    //----------------------------------------------------------------------------------------------

    /***
     * 查询我的未读消息
     */
    function loadMyMessage()
    {
        $.post('http://123.57.235.9:88/tzcp/platform/msg/unread', function(rsp, textStatus, jqXHR)
        {
            if (200 == rsp.code)
            {
                if (0 == rsp.data.total)
                {
                    $('.badge').addClass('hidden');
                    $('i.fa-bell-o').removeClass('animated-bell');
                    $('.msg-toast-container').addClass('hidden');

                    $(".unread-list").html('');
                }
                else
                {
                    $('.badge').removeClass('hidden');
                    $(".badge").html(rsp.data.total > 99 ? '99+' : rsp.data.total);
                    $('i.fa-bell-o').addClass('animated-bell');
                    $('.msg-toast-container').removeClass('hidden');
                    $('.msg-toast-title font').html(rsp.data.total);

                    var html = '';
                    $.each(rsp.data.rows, function(index, r)
                    {
                        html +=
                            '<li>' +
                            '	<a href="javascript:openMenu(\'http://123.57.235.9:88/tzcp/platform/msg?id=' + r.id + '\')">' +
                            '		<div><img src="' + getUserAvatarUrl(r.headImg, r.domainId) + '"/></div>' +
                            '		<div>' +
                            '			<div>' +
                            '				<span>' + r.userName + ': </span>' +
                            '				<span title="' + r.title + '">' + r.title + '</span>' +
                            '			</div>' +
                            '			<div>' +
                            '				<svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-time"></use></svg>' +
                            '				<span>' + r.createDate.substring(0, 16) + '</span>' +
                            '				<span>' + r.category + '</span>' +
                            '			</div>' +
                            '		</div>' +
                            '	</a>' +
                            '</li>';
                    });

                    $(".unread-list").html(html);
                }
            }
        });
    }
</script>

</body>

</html>