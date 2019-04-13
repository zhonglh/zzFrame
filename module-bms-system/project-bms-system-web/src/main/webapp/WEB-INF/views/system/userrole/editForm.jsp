<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>基本信息
                </div>


                <div id="detailForm" class="detailForm">
                    <table class="info-table">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                                <tr>
                                    <th>用户<font color="red">*</font></th>
                                    <td class="fd_userName">
                                        <c:out value="${ m.userName }" escapeXml="true"/>
                                    </td>
                                    <th>角色<font color="red">*</font></th>
                                    <td class="fd_roleName">
                                        <c:out value="${ m.roleName }" escapeXml="true"/>
                                    </td>
                                </tr>

                        </tbody>
                    </table>
                </div>


                <form action="" method="post" class="form-auto-fill hide editForm" id="editForm" viewId="detailForm" formId="editForm">
                    <input type="hidden" id="id" name="id" value="${ m.id }">
                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>

                                <tr>
                                    <th>用户<font color="red">*</font></th>
                                    <td>
                                        <div class="input-group">
                                            <c:if test="${ fn:indexOf(allQueryString,'&userId=')>=0 }">
                                                <input type="text" class="form-control input-sm" name="userName" id="userName" value="${ m.userName }" readonly>
                                            </c:if>
                                            <c:if test="${ !fn:indexOf(allQueryString,'&userId=')<0 }">
                                            <input type="hidden" name="userId" id="userId" value="${ m.userId }">
                                            <input type="text" name="userName" id="userName" value="${ m.userName }" required="required" class="form-control input-sm userName " placeholder="请选择用户" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm userName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearUserId"
                                                        class="btn btn-primary btn-sm">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-close">
                                                        </use>
                                                    </svg>
                                                </button>
                                            </div>
                                            </c:if>
                                        </div>
                                    </td>
                                    <th>角色<font color="red">*</font></th>
                                    <td>
                                            <div class="input-group">
                                                <c:if test="${ fn:indexOf(allQueryString,'&roleId=')>=0 }">
                                                    <input type="text" class="form-control input-sm" name="roleName" id="roleName" value="${ m.roleName }" readonly>
                                                </c:if>
                                                <c:if test="${ !fn:indexOf(allQueryString,'&roleId=')<0 }">
                                                <input type="hidden" name="roleId" id="roleId" value="${ m.roleId }" >
                                                <input type="text" name="roleName" id="roleName" value="${ m.roleName }" required="required" class="form-control input-sm roleName " placeholder="请选择角色" style="cursor: pointer;" readonly="readonly">
                                                <div class="input-group-btn">
                                                    <button type="button"  class="btn btn-primary btn-sm roleName">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearRoleId"   class="btn btn-primary btn-sm">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-close">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                </div>
                                                </c:if>
                                            </div>
                                    </td>
                                </tr>

                        </tbody>
                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" id="toolBar">

                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm btn-showEdit" onclick="switchEditDetail()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                        </svg>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm btn-showEdit" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide" onclick="doUpdate()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide" onclick="switchEditDetail()">
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
    //显示模式   明细/编辑
    var showMode = "detail";
    var inAllPage = "${inAllPage}";
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/role/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>


<script language="JavaScript">

    $(function() {
        //选择用户
        $(".userName").OpenSystemUserSelectWin({
            title: "用户",
            selectType: "d1",
            callId: "userId",
            callName: "userName",
            clearId: "clearUserId"
        });
        //选择角色
        $(".roleName").OpenSystemRoleSelectWin({
            title: "角色",
            selectType: "d1",
            callId: "roleId",
            callName: "roleName",
            clearId: "clearRoleId"
        });
    });

</script>

<bms:contentFooter />