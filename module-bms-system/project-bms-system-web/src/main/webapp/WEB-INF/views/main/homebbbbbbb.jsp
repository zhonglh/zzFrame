<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHomeHeader title="zz后台管理系统" />








<nav class="navbar" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><img class="logo" src="${staticUrl}/statics/image/logo.png"/></div>
        <div class="collapse navbar-collapse" style="padding-left: 0;margin-left: 230px;">
            <!-- 快捷方式 -->
            <div id="limitSec">
                <!-- 拖拽placeholder -->
                <div id="drag-placeholder">点"+"号定制<br/>快捷菜单</div>
                <a href="${ctx}/main/home" class="home-btn" data-ot=" 首页 " data-ot-delay="1"><i class="fa fa-home"></i></a>
                <ul class="nav navbar-nav" id="nav-bar">

                    <li menuId='100' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/100/3')"><i class="fa fa-list-alt"></i></i><span>发起流程</span></a></li>

                    <li menuId='2' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/2/3')"><i class="fa fa-random"></i></i><span>待办流程</span></a></li>

                    <li menuId='34' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/34/3')"><i class="fa fa-list-alt"></i></i><span>我的项目</span></a></li>

                </ul>

                <div class="last-nav">
                    <a href="javascript:;"><i class="fa fa-plus"></i></a>
                    <div class="nav-more" style="display: none">
                        <ul id="nav-more">

                            <li menuId='61' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/61/3')"><i class="fa fa-calendar-o"></i></i><span title='会议室预定'>会议室预定</span></a></li>

                            <li menuId='58' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/58/3')"><i class="fa fa-bar-chart"></i></i><span title='我的报表'>我的报表</span></a></li>

                            <li menuId='62' data-ot="<b>点击</b>: 打开菜单功能<br/><b>拖动</b>：变更位置" data-ot-delay="2"><a href="javascript: openMenu('/tzcp/platform/menu/62/3')"><i class="fa fa-list-alt"></i></i><span title='员工通讯录'>员工通讯录</span></a></li>

                        </ul>
                    </div>
                </div>
            </div>

            <!-- 右侧菜单按钮 -->
            <ul class="nav navbar-nav navbar-right nav-personal">
                <!-- 个人参数 -->
                <li class='dropdown'>
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" style='margin-top: -8px; margin-bottom: 0px; padding-bottom: 3px;'><img id='imgUserAvatar' class='img-circle' src="${staticUrl}/statics/images/default.png" width=40 height=40 style='border: solid 2px;' /><span>&nbsp;范红宇&nbsp;</span><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="javascript: changeProfile();"><i class='fa fa-cog'></i>&nbsp;个人参数</a></li>
                        <li role="presentation" class="divider"></li>
                        <li><a href="javascript: logoutSystem();"><i class='fa fa-power-off'></i>&nbsp;退出系统</a></li>
                    </ul>
                </li>

                <li>
                    <a href="javascript:openMenu('/tzcp/platform/msg')"><i class="fa fa-bell-o"><span class="badge hidden">0</span></i></a>

                    <div class="msg-toast-container">
                        <div class="msg-toast-title">
                            <svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-message"></use></svg>
                            <span><font color="red">0</font> 条未读消息</span>
                        </div>

                        <ul class="unread-list"></ul>

                        <a href="javascript:openMenu('/tzcp/platform/msg')" class="show-all-msg">
                            <span>查看所有消息</span><svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-showall"></use></svg>
                        </a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- 左侧菜单 -->
<div class='left-menu'>
    <label class="search-items"><i class="fa fa-search"></i><input type="text" class="form-control" placeholder="搜索功能模块" id="func-search"  oninput="OnInput()" onpropertychange="OnPropChanged() " /></label>
    <ul class="menu" id="ul_cartList">



        <li menuNodeNo="2" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('/tzcp/platform/menu/2/3');" title="待办流程" style="padding-left: 6px;"><i class="fa fa-random"></i>待办流程</a>
        </li>

        <li menuNodeNo="100" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('/tzcp/platform/menu/100/3');" title="发起流程" style="padding-left: 6px;"><i class="fa fa-list-alt"></i>发起流程</a>
        </li>

        <li menuNodeNo="32" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('/tzcp/platform/menu/32/3');" title="投资人管理" style="padding-left: 6px;"><i class="fa fa-user"></i>投资人管理</a>
        </li>

        <li menuNodeNo="31" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('/tzcp/platform/menu/31/3');" title="私募基金管理" style="padding-left: 6px;"><i class="fa fa-shield"></i>私募基金管理</a>
        </li>

        <li menuNodeNo="33" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="投资项目管理" style="padding-left: 6px;"><i class="fa fa-suitcase"></i>投资项目管理</a>
        </li>

        <li menuNodeNo="33-34" menuLevel="2" parentNodeNo="33" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/34/3');" title="我的项目" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>我的项目</a>
        </li>

        <li menuNodeNo="33-35" menuLevel="2" parentNodeNo="33" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/35/3');" title="投资项目管理" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>投资项目管理</a>
        </li>

        <li menuNodeNo="54" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="风控合规管理" style="padding-left: 6px;"><i class="fa fa-rocket"></i>风控合规管理</a>
        </li>

        <li menuNodeNo="54-57" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/57/3');" title="基金风险检测" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>基金风险检测</a>
        </li>

        <li menuNodeNo="54-56" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/56/3');" title="项目风险检测" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>项目风险检测</a>
        </li>

        <li menuNodeNo="54-55" menuLevel="2" parentNodeNo="54" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/55/3');" title="风险处置管理" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>风险处置管理</a>
        </li>

        <li menuNodeNo="42" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="资金运作管理" style="padding-left: 6px;"><i class="fa fa-asterisk"></i>资金运作管理</a>
        </li>

        <li menuNodeNo="42-43" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/43/3');" title="LP出资单据" style="padding-left: 28px;"><i class="fa fa-graduation-cap"></i>LP出资单据</a>
        </li>

        <li menuNodeNo="42-44" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/44/3');" title="LP退出单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>LP退出单据</a>
        </li>

        <li menuNodeNo="42-45" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/45/3');" title="投资支付单据" style="padding-left: 28px;"><i class="fa fa-twitch"></i>投资支付单据</a>
        </li>

        <li menuNodeNo="42-46" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/46/3');" title="投资收益单据" style="padding-left: 28px;"><i class="fa fa-bookmark"></i>投资收益单据</a>
        </li>

        <li menuNodeNo="42-47" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/47/3');" title="收益分配单据" style="padding-left: 28px;"><i class="fa fa-star-half-o"></i>收益分配单据</a>
        </li>

        <li menuNodeNo="42-48" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/48/3');" title="清算分配单据" style="padding-left: 28px;"><i class="fa fa-asterisk"></i>清算分配单据</a>
        </li>

        <li menuNodeNo="42-49" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/49/3');" title="费用报销单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>费用报销单据</a>
        </li>

        <li menuNodeNo="42-50" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/50/3');" title="费用分摊单据" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>费用分摊单据</a>
        </li>

        <li menuNodeNo="42-51" menuLevel="2" parentNodeNo="42" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/51/3');" title="投资者权益账户" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>投资者权益账户</a>
        </li>

        <li menuNodeNo="58" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('/tzcp/platform/menu/58/3');" title="统计分析报表" style="padding-left: 6px;"><i class="fa fa-bar-chart"></i>统计分析报表</a>
        </li>

        <li menuNodeNo="59" menuLevel="1" parentNodeNo="-1" style="display: block">
            <a href="javascript: openMenu('');" title="人事行政管理" style="padding-left: 6px;"><i class="fa fa-users"></i>人事行政管理</a>
        </li>

        <li menuNodeNo="59-61" menuLevel="2" parentNodeNo="59" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/61/3');" title="会议室预定" style="padding-left: 28px;"><i class="fa fa-calendar-o"></i>会议室预定</a>
        </li>

        <li menuNodeNo="59-62" menuLevel="2" parentNodeNo="59" style="display: none">
            <a href="javascript: openMenu('/tzcp/platform/menu/62/3');" title="员工通讯录" style="padding-left: 28px;"><i class="fa fa-list-alt"></i>员工通讯录</a>
        </li>

    </ul>

    <ul class="menu search-menu"  id="sMenu"></ul>
</div>

<!-- 工作区 -->
<div style='position: absolute; left: 230px; top: 50px; bottom: 0px; right: 0px;'>
    <iframe id='ifrmWorkspace' name='ifrmWorkspace' width='100%' height='100%' frameborder='0' src='${ctx}/welcome' style="background-color: #ffffff;"></iframe>
</div>

<div class='interruption' style="display: none">
    <div class="item">
        <div class="item-inner"><div class="item-loader-container"><div class="la-timer"><div></div></div></div></div>
        <div class="item-title"><span>处理中，请稍候......</span></div>
    </div>
</div>

<div class="hidden">
    <form id="formProfile" class="form-horizontal" action="${ctx}/platform/profile" method="post">
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

























<bms:contentHomeFooter />