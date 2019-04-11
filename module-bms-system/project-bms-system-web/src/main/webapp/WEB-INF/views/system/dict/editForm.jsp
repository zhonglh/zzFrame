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


                <div id="detailForm">
                    <table class="info-table">
                                <tr>

                                    <th width="15%">字典类型<font color="red">*</font></th>

                                    <td>
                                            ${ m.dictTypeName }


                                    </td>

                                    <th width="15%">字典值<font color="red">*</font></th>

                                    <td>
                                            ${ m.dictValName }
                                    </td>


                                </tr>


                                <tr>

                                    <th width="15%">字典名<font color="red">*</font></th>

                                    <td>
                                            ${ m.dictName }


                                    </td>

                                    <th width="15%">名称国际化</th>

                                    <td>
                                            ${ m.dictI18n }
                                    </td>


                                </tr>


                                <tr>

                                    <th width="15%">字典限制正则</th>

                                    <td>
                                            ${ m.dictReg }


                                    </td>

                                    <th width="15%">顺序<font color="red">*</font></th>

                                    <td>
                                            ${ m.orderby }
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

                                    <th width="15%">字典类型<font color="red">*</font></th>

                                    <td>



                                            <div class="input-group">

                                                <c:if test="${ fn.indexOf(queryString,'dictTypeId') }">
                                                    <input type="text" class="form-control input-sm" name="dictTypeName" id="dictTypeName" value="${ m.dictTypeName }" readonly>
                                                </c:if>

                                                <c:if test="${ !fn.indexOf(queryString,'dictTypeId') }">
                                                <input type="hidden" name="dictTypeId" id="dictTypeId" value="${ m.dictTypeId }">
                                                <input type="text" name="dictTypeName" id="dictTypeName" value="${ m.dictTypeName }" required="required" class="form-control input-sm dictTypeName " placeholder="请选择字典类型" style="width: 150px; cursor: pointer;" readonly="readonly">

                                                <div class="input-group-btn">
                                                    <button type="button"
                                                            class="btn btn-primary btn-sm dictTypeName">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearDictTypeId"
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



                                        <th width="15%">字典值<font color="red">*</font></th>

                                        <td>





                                                    <select id="dictVal"  name="dictVal" required="required" >
                                                        <option value="" ></option>
                                                        <c:forEach items="${ dict_val }" var="dict">
                                                            <option value="${ dict.value }">${  dict.name }</option>
                                                        </c:forEach>
                                                    </select>



                                        </td>


                                </tr>


                                <tr>

                                    <th width="15%">字典名<font color="red">*</font></th>

                                    <td>


                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入字典名" autocomplete="off"
                                                       value="${ m.dictName }" id="dictName" name="dictName"
                                                           maxlength="50"  />



                                    </td>



                                        <th width="15%">名称国际化</th>

                                        <td>





                                                    <input type="text"  class="form-control input-sm "
                                                           placeholder="请输入名称国际化" autocomplete="off"
                                                           value="${ m.dictI18n }" id="dictI18n" name="dictI18n"
                                                               maxlength="100"  />




                                        </td>


                                </tr>


                                <tr>

                                    <th width="15%">字典限制正则</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入字典限制正则" autocomplete="off"
                                                       value="${ m.dictReg }" id="dictReg" name="dictReg"
                                                           maxlength="100"  />



                                    </td>



                                        <th width="15%">顺序<font color="red">*</font></th>

                                        <td>





                                                    <input type="text" required="required" class="form-control input-sm required"
                                                           placeholder="请输入顺序" autocomplete="off"
                                                           value="${ m.orderby }" id="orderby" name="orderby"
                                                               maxlength="10"  />




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

    var queryString = "${ queryString }";
</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


    <script src="${ staticUrl }/statics2/business-js/system/dicttype/search.js"></script>



<script language="JavaScript">


    $(function() {

        //选择字典类型
        $(".dictTypeName").OpenSystemDicttypeSelectWin({
            title: "字典类型",
            selectType: "t1",
            callId: "dictTypeId",
            callName: "dictTypeName",
            clearId: "clearDictTypeId"
        });

    });


</script>

<bms:contentFooter />