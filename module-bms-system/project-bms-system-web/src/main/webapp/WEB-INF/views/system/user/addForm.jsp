<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz后台管理系统" />


<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">

            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>基本信息
                </div>
                <form id="editForm" action="" method="post">
                    <input type="hidden" id="id" name="id" value="${m.id}">
                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                        <tr>
                            <th>用户名称<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入用户名称"
                                       value="${m.userName}" id="userName" name="userName" minlength="2" maxlength='50'/></td>

                            <th>用户登录名<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入用户登录名"  autocomplete="off"
                                       value="${m.loginName}" id="loginName" name="loginName" minlength="4" maxlength='20'/></td>
                        </tr>

                        <c:if test="${empty m.id}">
                        <tr>
                            <th>密码<font color="red">*</font></th>
                            <td><input type="password" class="form-control input-sm required"  placeholder="请输入用户名称"
                                       autocomplete="off" id="loginPassword" name="loginPassword" minlength="6" maxlength='10'/></td>

                            <th>确认密码<font color="red">*</font></th>
                            <td><input type="password" class="form-control input-sm required"  placeholder="请输入用户名称" id="loginPasswordConfirm" name="loginPasswordConfirm"
                                       autocomplete="off" equalto="#loginPassword" data-msg-equalto="您2次输入的新密码不一致！" minlength="6" maxlength='10'/></td>
                        </tr>
                        </c:if>

                        <tr>
                            <th>直属领导</th>
                            <td>

                                <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')>=0 }">
                                    <input type="text"  id="leadUserName" name="leadUserName" class="form-control input-sm" readonly="readonly">
                                </c:if>
                                <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')>=0 }">
                                <div class="input-group">
                                    <input type="text"  id="leadUserName" name="leadUserName" class="form-control input-sm leadUserName"
                                           placeholder="请选择直属领导" readonly="readonly">
                                    <input type="hidden" id="leadUserId" name="leadUserId" value="${m.leadUserId}">
                                    <div class="input-group-btn">
                                        <button type="button"  class="btn btn-primary btn-sm leadUserName">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                                            </svg>
                                        </button>
                                        <button type="button"  id="clearLeadUserId"  class="btn btn-primary btn-sm">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                                </c:if>
                            </td>
                            <th>所在部门</th>
                            <td>
                                <c:if test="${ fn:indexOf(allQueryString,'&depId=')>=0 }">
                                    <input type="text"  id="depName" name="depName" value="${m.depId}" class="form-control input-sm" readonly="readonly" >
                                </c:if>
                                <c:if test="${ fn:indexOf(allQueryString,'&depId=')>=0 }">
                                <div class="input-group">
                                    <input type="text"  id="depName" name="depName" value="${m.depId}" class="form-control input-sm  depName "
                                           placeholder="请选择所在部门" readonly="readonly" >
                                    <input type="hidden" id="depId" name="depId" value="${m.depId}">
                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-primary btn-sm depName">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                                            </svg>
                                        </button>
                                        <button type="button" id="cleaDepId" class="btn btn-primary btn-sm">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                                </c:if>
                            </td>
                        </tr>

                        <tr>
                            <th>手机号<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入手机号"
                                       value="${m.phone}" id="phone" name="phone" minlength="11" maxlength='11'/></td>

                            <th>邮箱<font color="red">*</font></th>
                            <td><input type="email" class="form-control input-sm required"  placeholder="请输入邮箱"
                                       value="${m.email}"  id="email" name="email" minlength="4" maxlength='50'/></td>
                        </tr>
                        <tr>
                            <th >备注</th>
                            <td colspan="3">
                                <div class="info-detail">
                                    <textarea class="form-control input-sm" name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="3">${m.remark}</textarea>
                                </div>
                            </td>
                        </tr>
                        </tbody>

                    </table>
                </form>
            </div>




            <div style="margin-top:10px;position:absolute;">


                <shiro:hasPermission name="system.user:add">
                <button type="button" class="btn btn-primary btn-sm" onclick="doSave()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                    </svg>
                    <span>保 存</span>
                </button>
                </shiro:hasPermission>


                <button type="button" class="btn  btn-warning btn-sm" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                    </svg>
                    <span>取 消</span>
                </button>
            </div>


        </div>
    </div>
</div>





<script>
    var inAllPage = "${inAllPage}";
</script>



<bms:contentJS />

<script src="${staticUrl}/statics2/js/project/form.js"></script>


<script src="${staticUrl}/statics2/business-js/system/dep/search.js"></script>
<script src="${staticUrl}/statics2/business-js/system/user/search.js"></script>


<script language="JavaScript">


    $(function() {


        //部门选择
        $(".depName").OpenSystemDepSelectWin({
            title: "上级部门",
            selectType: "t1",
            callId: "depId",
            callName: "depName",
            clearId: "clearDepId"
        });


        //人员选择
        $(".leadUserName").OpenSystemUserSelectWin({
            title: "直属领导",
            selectType: "d1",
            callId: "leadUserId",
            callName: "leadUserName",
            clearId: "clearLeadUserId"
        });


    });


</script>



<bms:contentFooter />

