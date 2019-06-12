<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    &nbsp;<i class="fa fa-th-list"></i>&nbsp;基本信息
                </div>


                <form id="editForm" action="" method="post">
                    <table class="info-table">
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



                                    <th width="15%">菜单编号<font color="red">*</font></th>

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


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入菜单顺序" autocomplete="off"
                                                       value="${ m.menuSort }" id="menuSort" name="menuSort"
                                                          maxlength="2"  />



                                    </td>



                                    <th width="15%">菜单地址<font color="red">*</font></th>

                                    <td>





                                            <input type="text" required="required" class="form-control input-sm required"
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



                                    <th width="15%">菜单图标</th>

                                    <td>





                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入菜单图标" autocomplete="off"
                                                   value="${ m.menuIcon }" id="menuIcon" name="menuIcon"
                                                       maxlength="20"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>跳转目标</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入跳转目标" autocomplete="off"
                                                       value="${ m.menuRedirect }" id="menuRedirect" name="menuRedirect"
                                                          maxlength="50"  />



                                    </td>



                                    <th width="15%">快捷菜单<font color="red">*</font></th>

                                    <td>





                                            <select id="shortcut"  name="shortcut" required="required" >
                                                <option value="" ></option>
                                                <c:forEach items="${ yes_no_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.shortcut }">selected</c:if>>${ dict.dictName }</option>
                                                </c:forEach>
                                            </select>



                                    </td>


                                </tr>


                                <tr>

                                    <th>层级<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入层级" autocomplete="off"
                                                       value="${ m.level }" id="level" name="level"
                                                          maxlength="10"  />



                                    </td>



                                    <th width="15%">是否叶节点<font color="red">*</font></th>

                                    <td>





                                            <select id="leaf"  name="leaf" required="required" >
                                                <option value="" ></option>
                                                <c:forEach items="${ yes_no_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.leaf }">selected</c:if>>${ dict.dictName }</option>
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

                                    <th>备注</th>

                                    <td>


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



                <shiro:hasPermission name="system.user:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doSave()">
                        <i class="fa fa-save"></i>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>


                <button type="button" class="btn  btn-warning btn-sm" onclick="closeWindow()">
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