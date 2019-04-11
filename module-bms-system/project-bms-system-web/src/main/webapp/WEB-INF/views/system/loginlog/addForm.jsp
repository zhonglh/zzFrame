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

                                    <th>操作类型<font color="red">*</font></th>

                                    <td>


                                                <select id="operationType"  name="operationType" required="required" >
                                                <option value="" ></option>
                                                <c:forEach items="${ operation_type }" var="dict">
                                                    <option value="${ dict.value }">${ dict.name}  }</option>
                                                </c:forEach>
                                                </select>


                                    </td>



                                    <th width="15%">操作说明</th>

                                    <td>





                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入操作说明" autocomplete="off"
                                                   value="${ m.operationlogName }" id="operationlogName" name="operationlogName"
                                                       maxlength="100"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>部门<font color="red">*</font></th>

                                    <td>



                                            <div class="input-group">
                                                <c:if test="${ fn.indexOf(queryString,'depId') }">
                                                    <input type="text" class="form-control input-sm" name="depName" id="depName" value="${ m.depName }" readonly>
                                                </c:if>

                                                <c:if test="${ !fn.indexOf(queryString,'depId') }">


                                                <input type="hidden" name="depId" id="depId" value="${ m.depId }">
                                                <input type="text" name="depName" id="depName" value="${ m.depName }" required="required" class="form-control input-sm depName " placeholder="请选择部门" style="width: 150px; cursor: pointer;" readonly="readonly">

                                                <div class="input-group-btn">
                                                    <button type="button"
                                                            class="btn btn-primary btn-sm depName">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearDepId"
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



                                    <th width="15%">机构<font color="red">*</font></th>

                                    <td>





                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入机构" autocomplete="off"
                                                   value="${ m.organId }" id="organId" name="organId"
                                                       maxlength="32"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>操作人IP</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入操作人IP" autocomplete="off"
                                                       value="${ m.operationIp }" id="operationIp" name="operationIp"
                                                          maxlength="30"  />



                                    </td>



                                    <th width="15%">操作人名称<font color="red">*</font></th>

                                    <td>





                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入操作人名称" autocomplete="off"
                                                   value="${ m.operationUserName }" id="operationUserName" name="operationUserName"
                                                       maxlength="50"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>操作时间<font color="red">*</font></th>

                                    <td>



                                            <div class="input-group">

                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入操作时间" autocomplete="off"
                                                       onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'operationTime'})
                                                       value="${ m.operationTime }" id="operationTime" name="operationTime" readonly   />

                                                <div class="input-group-btn">
                                                    <button type="button" class="btn btn-primary btn-sm" onclick="document.getElementById('operationTime').click()">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-rili"></use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" class="btn btn-primary btn-sm" onclick="clearTime(OperationTime);">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use  xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                                        </svg>
                                                    </button>
                                                </div>

                                            </div>



                                    </td>



                                </tr>



                        </tbody>

                    </table>
                </form>
            </div>










            <div style="margin-top:10px;position:absolute;" align="center" id="toolBar">



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


    var queryString = "${ queryString }";
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