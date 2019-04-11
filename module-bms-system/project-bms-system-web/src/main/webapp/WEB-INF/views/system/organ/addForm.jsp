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

                                    <th>机构名称<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入机构名称" autocomplete="off"
                                                       value="${ m.organName }" id="organName" name="organName"
                                                          maxlength="100"  />



                                    </td>



                                    <th width="15%">机构代码<font color="red">*</font></th>

                                    <td>





                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入机构代码" autocomplete="off"
                                                   value="${ m.organCode }" id="organCode" name="organCode"
                                                       maxlength="20"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>机构类型</th>

                                    <td>


                                                <select id="organType"  name="organType"  >
                                                <option value="" ></option>
                                                <c:forEach items="${ organ_type }" var="dict">
                                                    <option value="${ dict.value }">${ dict.name}  }</option>
                                                </c:forEach>
                                                </select>


                                    </td>



                                    <th width="15%">机构地址</th>

                                    <td>





                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入机构地址" autocomplete="off"
                                                   value="${ m.organAddr }" id="organAddr" name="organAddr"
                                                       maxlength="200"  />




                                    </td>


                                </tr>


                                <tr>

                                    <th>状态<font color="red">*</font></th>

                                    <td>


                                                <select id="organStatus"  name="organStatus" required="required" >
                                                <option value="" ></option>
                                                <c:forEach items="${ organ_status }" var="dict">
                                                    <option value="${ dict.value }">${ dict.name}  }</option>
                                                </c:forEach>
                                                </select>


                                    </td>



                                    <th width="15%">负责人<font color="red">*</font></th>

                                    <td>






                                        <div class="input-group">
                                            <c:if test="${ fn.indexOf(queryString,'leadUserId') }">
                                                <input type="text" class="form-control input-sm" name="leadUserName" id="leadUserName" value="${ m.leadUserName }" readonly>
                                            </c:if>

                                            <c:if test="${ !fn.indexOf(queryString,'leadUserId') }">
                                            <input type="hidden" name="leadUserId" id="leadUserId" value="${ m.leadUserId }" >
                                            <input type="text" name="leadUserName" id="leadUserName" value="${ m.leadUserName }" required="required" class="form-control input-sm leadUserName " placeholder="请选择负责人" style="width: 150px; cursor: pointer;" readonly="readonly">

                                            <div class="input-group-btn">
                                                <button type="button"  class="btn btn-primary btn-sm leadUserName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearLeadUserId"   class="btn btn-primary btn-sm">
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


                                <tr>

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


    <script src="${ staticUrl }/statics2/business-js/system/organ/search.js"></script>
    <script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>



<script language="JavaScript">


    $(function() {

        //选择负责人
        $(".leadUserName").OpenSystemUserSelectWin({
            title: "负责人",
            selectType: "d1",
            callId: "leadUserId",
            callName: "leadUserName",
            clearId: "clearLeadUserId"
        });

    });



</script>

<bms:contentFooter />