<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="staticUrl" value="${pageContext.request.contextPath}"/>

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

    <title><spring:message code="common.platform.info" text="zz后台管理系统" /></title>
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


    <!--[if IE 7]>
    <link type="text/css" rel="stylesheet" href="${staticUrl}/statics2/font-wesome/font-awesome-ie7.min.css">
    <![endif]-->

    <!--[if lt IE 9]>
    <script src="${staticUrl}/statics2/js/html5shiv.min.js"></script>
    <script src="${staticUrl}/statics2/js/respond.js"></script>

    <![endif]-->


    <link rel="stylesheet" href="${ctx}/statics2/css/home.css">
    <link rel="stylesheet" href="${ctx}/statics2/css/common-style-${theme}.css">



    <style>
        .theme-panel ul{
            display: block;
        }

        .theme-panel ul li{
            width: 60px;
            height: 50px;
            display: block;
            float: left;
            margin-left: 5px;
            margin-top: 10px;
            text-align: center;
            cursor: pointer;
        }
    </style>



    <script>
        // Global Const
        var ctx = '${ctx}';
        var $AppContext = ctx;


        var staticUrl = '${staticUrl}';

        var $PagingSize = 50 || 20;

        var $AttachmentEngine = 'file';


        var dataUrl = "/${currParentUrl}";
        var breadcrumb = "${breadcrumb}";


    </script>
</head>

<body>
<nav class="navbar" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><img class="logo" src="${ctx}/statics2/image/logo.png"/></div>
        <div class="collapse navbar-collapse" style="padding-left: 0;margin-left: 230px;">

            <div id="limitSec">

                <%--<div id="drag-placeholder" >点击"+"号定制<br/>快捷菜单</div>--%>
                <a href="${ctx}/main/home" class="home-btn" data-ot=" 首页 " data-ot-delay="1"><i class="fa fa-home"></i></a>
                <%--
                <ul class="nav navbar-nav" id="nav-bar">

                    <c:forEach items="${topShortcutMenus}" var="shortcut">

                        <li menuId='${shortcut.id}' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('${ctx}${shortcut.path}')"><c:if test="${not empty shortcut.icon}"><i class="fa ${shortcut.icon}"></i></c:if><span>${shortcut.title}</span></a></li>

                    </c:forEach>



                    <li menuId='100' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/100/3')"><i class="fa fa-list-alt"></i></i><span>发起流程</span></a></li>

                    <li menuId='2' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/2/3')"><i class="fa fa-random"></i></i><span>待办流程</span></a></li>

                    <li menuId='34' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/34/3')"><i class="fa fa-list-alt"></i></i><span>我的项目</span></a></li>


                </ul>
                --%>

       <%--         <div class="last-nav">
                    <a href="javascript:;"><i class="fa fa-plus"></i></a>
                    <div class="nav-more" style="display: none">
                        <ul id="nav-more">

                            <c:forEach items="${moreShortcutMenus}" var="shortcut">

                                <li menuId='${shortcut.id}' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('${ctx}${shortcut.path}')"><c:if test="${not empty shortcut.icon}"><i class="fa ${shortcut.icon}"></i></c:if><span>${shortcut.title}</span></a></li>

                            </c:forEach>

                           &lt;%&ndash;
                            <li menuId='61' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/61/3')"><i class="fa fa-calendar-o"></i></i><span title='会议室预定'>会议室预定</span></a></li>

                            <li menuId='58' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/58/3')"><i class="fa fa-bar-chart"></i></i><span title='我的报表'>我的报表</span></a></li>

                            <li menuId='62' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('http://123.57.235.9:88/tzcp/platform/menu/62/3')"><i class="fa fa-list-alt"></i></i><span title='员工通讯录'>员工通讯录</span></a></li>
                            &ndash;%&gt;
                        </ul>
                    </div>
                </div>
--%>
            </div>

            <!-- 右侧菜单按钮 -->
            <ul class="nav navbar-nav navbar-right nav-personal">

                <li class='dropdown'>
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" style='margin-top: -8px; margin-bottom: 0px; padding-bottom: 3px;'>
                        <img id='imgUserAvatar' class='img-circle' src="${userImageUrl}"
                             width=40 height=40 style='border:solid 2px;' />
                        <span>&nbsp; <shiro:principal property="userName" /> &nbsp;</span><span class="caret"></span>



                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="javascript: changeProfile();"><i class='fa fa-cog'></i>&nbsp;个人设置</a></li>
                        <li role="presentation" class="divider"></li>
                        <li><a href="javascript: logoutSystem();"><i class='fa fa-power-off'></i>&nbsp;退出系统</a></li>
                    </ul>
                </li>

                <li>
                    <a href="javascript:openMenu('${ctx}/system/notification/toList')" >
                        <i class="fa fa-bell-o"><span class="badge hidden">0</span></i>
                    </a>




                    <%--<div class="msg-toast-container">
                        <div class="msg-toast-title">
                            <svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-message"></use></svg>
                            <span><font color="red">0</font> 条未读消息</span>
                        </div>

                        <ul class="unread-list"></ul>

                        <a href="javascript:openMenu('http://123.57.235.9:88/tzcp/platform/msg')" class="show-all-msg">
                            <span>查看所有消息</span>
                            <svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-showall"></use></svg>
                        </a>
                    </div>--%>
                </li>
                <li class='dropdown'>
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" style='margin-top: -8px; margin-bottom: 0px; padding-bottom: 3px;line-height: 35px;'>
                        <img id='colorImg'  src="${staticUrl}/statics2/image/color.png"
                             width=20 height=20 style='border:solid 0px;border-radius: 10px;' />
                    </a>

                    <div class="dropdown-menu theme-panel" style="width: 280px;display: none;height: 90px;background-color: #ccc; overflow-y: auto">
                        <ul>
                            <li onclick="changeTheme('red')">
                                <span style="background: rgba(236, 100, 75, 1);width: 30px;height: 30px;border-radius: 20px;display: block;margin: 0 auto"></span>
                                <span style="clear: left;display: block">红色</span>
                            </li>
                            <li onclick="changeTheme('green')">
                                <span style="background: rgba(38, 166, 91, 1);width: 30px;height: 30px;border-radius: 20px;display: block;margin: 0 auto"></span>
                                <span style="clear: left">绿色</span>
                            </li>
                            <li onclick="changeTheme('blue')">
                                <span style="background: rgba(68, 108, 179, 1);width: 30px;height: 30px;border-radius: 20px;display: block;margin: 0 auto"></span>
                                <span style="clear: left">蓝色</span>
                            </li>

                            <li onclick="changeTheme('brown')">
                                <span style="background: #918072;width: 30px;height: 30px;border-radius: 20px;display: block;margin: 0 auto"></span>
                                <span style="clear: left">棕色</span>
                            </li>

                        </ul>
                    </div>
                </li>


            </ul>
        </div>
    </div>
</nav>

<!-- 左侧菜单 -->
<div class='left-menu'>
    <label class="search-items"><i class="fa fa-search"></i><input type="text" class="form-control" placeholder="搜索功能模块" id="func-search" oninput="OnInput()" onpropertychange="OnPropChanged() " /></label>
    <ul class="menu" id="ul_cartList">

        <c:forEach items="${menus}" var="menu">

            <li menuNodeNo="${menu.id}" menuLevel="${menu.level}" menuLeaf="${menu.leaf}" style="display : <c:if test="${menu.level == 1}">block</c:if><c:if test="${menu.level > 1}">none</c:if>" parentNodeNo="<c:if test="${empty menu.pid}">-1</c:if><c:if test="${not empty menu.pid}">${menu.pid}</c:if>"  >
                <c:if test="${empty menu.target}">
                <a href="javascript: openMenu('<c:if test="${menu.leaf == '1'}">${ctx}${menu.path}</c:if>');" title="${menu.title}"  style="padding-left: <c:if test="${menu.level == 1}">6</c:if><c:if test="${menu.level != 1}">${(menu.level-1)*22}</c:if>px;">
                    <c:if test="${not empty menu.icon}"><i class="${menu.icon}"></i></c:if>${menu.title}
                </a>
                </c:if>
                <c:if test="${not empty menu.target}">
                    <a href="${menu.path}" target="${menu.target}" title="${menu.title}"  style="padding-left: <c:if test="${menu.level == 1}">6</c:if><c:if test="${menu.level != 1}">${(menu.level-1)*22}</c:if>px;">
                        <c:if test="${not empty menu.icon}"><i class="${menu.icon}"></i></c:if>${menu.title}
                    </a>
                </c:if>
            </li>

        </c:forEach>

    </ul>

    <ul class="menu search-menu"  id="sMenu"></ul>
</div>

<div style='position: absolute; left: 230px; top: 50px; bottom: 0px; right: 0px;'>
    <iframe id='ifrmWorkspace'  name='ifrmWorkspace' src="${ctx}/main/welcome" width='100%' height='100%' frameborder='0'  style="background-color: #ffffff;"></iframe>
</div>


<div class='interruption' style="display: none">
    <div class="item">
        <div class="item-inner"><div class="item-loader-container"><div class="la-timer"><div></div></div></div></div>
        <div class="item-title"><span>正在处理，请稍候......</span></div>
    </div>
</div>

<div class="hidden">
    <form id="formProfile" class="form-horizontal" action="${ctx}/system/user/updateMyProfile" method="post">
        <input name="avatarImage" id="avatarImage" type="hidden" value="${loginUser.avatarImage}">
        <input name="hasSaveHeaderImage" id="hasSaveHeaderImage" type="hidden" value="0">
        <table width="100%">
            <tr>
                <td>
                    <table width="100%">
                        <tr>
                            <td align="right" width="100">手机号码：</td>
                            <td><input name="phone" id="phone"  class="form-control input-sm" pattern='1\d{10}' data-msg-pattern='无效的手机号码！'></td>
                        </tr>

                        <tr>
                            <td align="right">电子邮件：</td>
                            <td><input name="email" id="email"  class="form-control input-sm email" maxlength="30"></td>
                        </tr>

                        <tr>
                            <td align="right">每页记录数：</td>
                            <td><select name="pageLimit" id="pageLimit"  class="form-control input-sm"></select></td>
                        </tr>

                        <tr>
                            <td align="right">原密码：</td>
                            <td><input name="origPassword" type="password" class="form-control input-sm" autocomplete="off"></td>
                        </tr>

                        <tr>
                            <td align="right">新密码：</td>
                            <td>
                                <input id="newPassword" name="newPassword" type="password"
                                       class="form-control input-sm"  minlength=6 autocomplete="off">
                            </td>
                        </tr>

                        <tr>
                            <td align="right">确认新密码：</td>
                            <td>
                                <input name="confirmNewPassword" type="password" class="form-control input-sm"
                                       equalto="#newPassword" data-msg-equalto="您2次输入的新密码不一致！" minlength=6 autocomplete="off">
                            </td>
                        </tr>
                    </table>
                </td>
                <td width="160" align="right">
                    <img id="userHeadImg" src="${userImageUrl}" onclick="changeHeadImage();"
                          style="cursor: pointer; border: solid 1px #c0c0c0;  width: 150px; height: 170px;" />
                </td>
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
                <div class="img-container" style="width: 480px;height: 390px;background-color: #ccc;"><img id="image"></div>
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
                        <button type="button" class="btn btn-primary" id="zoomIn">
                            <span class="docs-tooltip" data-toggle="tooltip" title="放大图片"><span class="fa fa-search-plus"></span></span>
                        </button>
                        <button type="button" class="btn btn-primary" id="zoomOut">
                            <span class="docs-tooltip" data-toggle="tooltip" title="缩小图片"><span class="fa fa-search-minus"></span></span>
                        </button>
                    </div>

                    <div class="btn-group" style="float: left; ">
                        <button type="button" class="btn btn-primary" id="zoomLeft">
                            <span class="docs-tooltip" data-toggle="tooltip" title="逆时针旋转45°"><span class="fa fa-rotate-left"></span></span>
                        </button>
                        <button type="button" class="btn btn-primary" id="zoomRight">
                            <span class="docs-tooltip" data-toggle="tooltip" title="顺时针旋转45°"><span class="fa fa-rotate-right"></span></span>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- model 大结束-->
</div>


<script>


    var notReadCount = ${notReadNotifyCount};
    var userKey = "${loginUser.id}";
    var userSessoinId = "${userSessoinId}";

    var myProfile = {phone: '<shiro:principal property="phone" />', email: '<shiro:principal property="email" />', pageLimit: <shiro:principal property="pageLimit" /> };
</script>

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
<script src="${staticUrl}/statics2/js/Sortable.min.js"></script>




<script src="${staticUrl}/statics2/js/project/common.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-tools.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-setting.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-jquery.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-data.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-validate.js?dt=${applicationScope.startServerTime}"></script>
<script src="${staticUrl}/statics2/js/project/common-upload.js?dt=${applicationScope.startServerTime}"></script>

<script src="${staticUrl}/statics2/js/project/home.js?dt=${applicationScope.startServerTime}"></script>

<script>

    function changeTheme(theme) {

        $.ajax({
            url: '${staticUrl}/main/setTheme',
            type: 'POST',
            data: {"theme" : theme } ,
            success: function(rsp, status) {
                window.location.reload();
            }
        });

    }
</script>

</body>

</html>