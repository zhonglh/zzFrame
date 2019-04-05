<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>基本信息
                </div>


                <div id="detailForm">
                    <table class="info-table">
                                <tr>

                                    <th width="15%">角色名称<font color="red">*</font></th>

                                    <td>
                                            ${ m.roleName }


                                    </td>

                                    <th width="15%">角色编号<font color="red">*</font></th>

                                    <td>
                                            ${ m.roleCode }
                                    </td>


                                </tr>


                                <tr>

                                    <th width="15%">角色类型<font color="red">*</font></th>

                                    <td>
                                            ${ m.roleTypeName }


                                    </td>

                                    <th width="15%">部门<font color="red">*</font></th>

                                    <td>
                                            ${ m.depName }
                                    </td>


                                </tr>


                                <tr>

                                    <th width="15%">机构<font color="red">*</font></th>

                                    <td>
                                            ${ m.organId }


                                    </td>

                                    <th width="15%">角色状态<font color="red">*</font></th>

                                    <td>
                                            ${ m.roleStatusName }
                                    </td>


                                </tr>


                                <tr>

                                    <th width="15%">备注</th>

                                    <td>
                                            ${ m.remark }


                                    </td>

                                    <th width="15%">租户<font color="red">*</font></th>

                                    <td>
                                            ${ m.tenantId }
                                    </td>


                                </tr>




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

                                    <th width="15%">角色名称<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入角色名称" autocomplete="off"
                                                       value="${ m.roleName }" id="roleName" name="roleName"
                                                           maxlength="50"  />



                                    </td>



                                        <th width="15%">角色编号<font color="red">*</font></th>

                                        <td>





                                                    <input type="text" required="required" class="form-control input-sm required"
                                                           placeholder="请输入角色编号" autocomplete="off"
                                                           value="${ m.roleCode }" id="roleCode" name="roleCode"
                                                               maxlength="20"  />




                                        </td>


                                </tr>


                                <tr>

                                    <th width="15%">角色类型<font color="red">*</font></th>

                                    <td>


                                                <select id="roleType"  name="roleType" required="required" >
                                                    <option value="" ></option>
                                                    <c:forEach items="${ role_type }" var="dict">
                                                        <option value="${ dict.value }">${ dict.name}  }</option>
                                                    </c:forEach>
                                                </select>


                                    </td>



                                        <th width="15%">部门<font color="red">*</font></th>

                                        <td>






                                                    <div class="input-group">
                                                        <input type="hidden" name="depId" id="depId" value="${ m.depId }" >
                                                        <input type="text" name="depName" id="depName" value="${ m.depName }" required="required" class="form-control input-sm depName " placeholder="请选择部门" style="width: 150px; cursor: pointer;" readonly="readonly">

                                                        <div class="input-group-btn">
                                                            <button type="button"  class="btn btn-primary btn-sm depName">
                                                                <svg class="icon" aria-hidden="true">
                                                                    <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                         xlink:href="#icon-sousuo">
                                                                    </use>
                                                                </svg>
                                                            </button>
                                                            <button type="button" id="clearDepId"   class="btn btn-primary btn-sm">
                                                                <svg class="icon" aria-hidden="true">
                                                                    <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                         xlink:href="#icon-close">
                                                                    </use>
                                                                </svg>
                                                            </button>
                                                        </div>
                                                    </div>



                                        </td>


                                </tr>


                                <tr>

                                    <th width="15%">机构<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入机构" autocomplete="off"
                                                       value="${ m.organId }" id="organId" name="organId"
                                                           maxlength="32"  />



                                    </td>



                                        <th width="15%">角色状态<font color="red">*</font></th>

                                        <td>





                                                    <select id="roleStatus"  name="roleStatus" required="required" >
                                                        <option value="" ></option>
                                                        <c:forEach items="${ role_status }" var="dict">
                                                            <option value="${ dict.value }">${  dict.name }</option>
                                                        </c:forEach>
                                                    </select>



                                        </td>


                                </tr>


                                <tr>

                                    <th width="15%">备注</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入备注" autocomplete="off"
                                                       value="${ m.remark }" id="remark" name="remark"
                                                           maxlength="200"  />



                                    </td>



                                        <th width="15%">租户<font color="red">*</font></th>

                                        <td>





                                                    <input type="text" required="required" class="form-control input-sm required"
                                                           placeholder="请输入租户" autocomplete="off"
                                                           value="${ m.tenantId }" id="tenantId" name="tenantId"
                                                               maxlength="32"  />




                                        </td>


                                </tr>






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


    var tableid = "tableData-${ tableId }";

    //显示模式   明细/编辑
    var showMode = "detail";

</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


    <script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>



<script language="JavaScript">


    $(function() {

        //选择部门
        $(".depName").OpenSystemDepSelectWin({
            title: "部门",
            selectType: "t1",
            callId: "depId",
            callName: "depName",
            clearId: "clearDepId"
        });

    });


</script>

<bms:contentFooter />