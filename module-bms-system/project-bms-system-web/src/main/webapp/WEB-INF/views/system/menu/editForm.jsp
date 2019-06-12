<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">


                <form action="" method="post" id="editForm" viewId="editForm" >

                    <div class="block-tit">
                        &nbsp;<i class="fa fa-th-list"></i>&nbsp;基本信息
                    </div>


                    <table class="info-table hide-area">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>


                                <tr>

                                    <th>菜单名称<font color="red">*</font></th>

                                    <td class="fd_menuName">
                                            ${ m.menuName }


                                    </td>

                                    <th>菜单编号<font color="red">*</font></th>

                                    <td class="fd_menuCode">
                                            ${ m.menuCode }
                                    </td>


                                </tr>


                                <tr>

                                    <th>菜单顺序<font color="red">*</font></th>

                                    <td class="fd_menuSort">
                                            ${ m.menuSort }


                                    </td>

                                    <th>菜单地址</th>

                                    <td class="fd_menuUrl">
                                            ${ m.menuUrl }
                                    </td>


                                </tr>


                                <tr>

                                    <th>菜单提示信息</th>

                                    <td class="fd_menuMsg">
                                            ${ m.menuMsg }


                                    </td>

                                    <th>菜单图标</th>

                                    <td class="fd_menuIcon">
                                            ${ m.menuIcon }
                                    </td>


                                </tr>


                                <tr>

                                    <th>路由目标</th>

                                    <td class="fd_menuRedirect">
                                            ${ m.menuRedirect }
                                    </td>

                                    <th>快捷菜单</th>

                                    <td class="fd_shortcutName">
                                    ${ m.shortcutName }
                                    </td>



                                </tr>


                                <tr>


                                    <th>是否隐藏<font color="red">*</font></th>
                                    <td class="fd_hiddenName">
                                    ${ m.hiddenName }

                                    </td>

                                    <th>链接目标</th>

                                    <td class="fd_target">
                                    ${ m.target }


                                    </td>



                                </tr>

                                <tr>

                                    <th>备注</th>

                                    <td colspan="3" class="fd_remark">
                                    ${ m.remark }


                                    </td>
                                </tr>



                    </table>

                    <input type="hidden" id="id" name="id" value="${ m.id }">

                    <table class="info-table show-area">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>

                                <tr>

                                    <th>菜单名称<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入菜单名称" autocomplete="off"
                                                       value="${ m.menuName }" id="menuName" name="menuName"
                                                           maxlength="30"  />



                                    </td>



                                        <th>菜单编号<font color="red">*</font></th>

                                        <td>





                                                    <input type="text" required="required" class="form-control input-sm required"
                                                           placeholder="请输入菜单编号" autocomplete="off"
                                                           value="${ m.menuCode }" id="menuCode" name="menuCode"
                                                               maxlength="50"  />




                                        </td>


                                </tr>


                                <tr>

                                    <th>菜单顺序<font color="red">*</font></th>

                                    <td>
                                                <input type="text" required="required" class="form-control input-sm number required"
                                                       placeholder="请输入菜单顺序" autocomplete="off"
                                                       value="${ m.menuSort }" id="menuSort" name="menuSort"
                                                           maxlength="2"  />

                                    </td>



                                    <th>菜单地址</th>

                                    <td>
                                                <input type="text"  class="form-control input-sm"
                                                       placeholder="请输入菜单地址" autocomplete="off"
                                                       value="${ m.menuUrl }" id="menuUrl" name="menuUrl"
                                                           maxlength="200"  />
                                    </td>


                                </tr>


                                <tr>

                                    <th>菜单提示信息</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入菜单提示信息" autocomplete="off"
                                                       value="${ m.menuMsg }" id="menuMsg" name="menuMsg"
                                                           maxlength="50"  />



                                    </td>

                                    <th>菜单图标</th>

                                    <td>
                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入菜单图标" autocomplete="off"
                                                       value="${ m.menuIcon }" id="menuIcon" name="menuIcon"
                                                           maxlength="20"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>路由目标</th>
                                    <td>
                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入跳转目标" autocomplete="off"
                                                       value="${ m.menuRedirect }" id="menuRedirect" name="menuRedirect"
                                                           maxlength="50"  />
                                    </td>


                                    <th>快捷菜单<font color="red">*</font></th>
                                    <td>
                                                <select id="shortcut"  name="shortcut" required="required" >
                                                    <option value="" ></option>
                                                    <c:forEach items="${ yes_no_dicts }" var="dict">
                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.shortcut }">selected</c:if>>${  dict.dictName }</option>
                                                    </c:forEach>
                                                </select>
                                    </td>
                                </tr>


                                <tr>


                                    <th>是否隐藏<font color="red">*</font></th>
                                    <td>
                                        <select id="hidden"  name="hidden" required="required" style="width:98%">
                                        <option value="" ></option>
                                        <c:forEach items="${ yes_no_dicts }" var="dict">
                                            <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.hidden }">selected</c:if>>${ dict.dictName }</option>
                                        </c:forEach>
                                        </select>
                                    </td>

                                    <th>链接目标</th>
                                    <td>
                                        <input type="text"  class="form-control input-sm "
                                        placeholder="请输入菜单链接目标" autocomplete="off"
                                        value="${ m.target }" id="target" name="target"
                                        maxlength="50"  />

                                    </td>



                                </tr>

                                <tr>



                                <th>备注</th>
                                <td colspan="3">
                                <input type="text"  class="form-control input-sm "
                                placeholder="请输入备注" autocomplete="off"
                                value="${ m.remark }" id="remark" name="remark"
                                maxlength="200"  />

                                </td>



                                </tr>


                        </tbody>


                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">



                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm show-area" onclick="doUpdate()">
                        <i class="fa fa-save"></i>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm show-area" onclick="cancelEdit()">
                    <i class="fa fa-close"></i>
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


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


<script src="${ staticUrl }/statics2/business-js/system/menu/search.js"></script>



<script language="JavaScript">


    $(function() {


    });


</script>

<bms:contentFooter />