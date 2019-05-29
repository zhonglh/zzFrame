<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">

            <div class="block-each block-each-another">
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

                                <th>操作类型<font color="red">*</font></th>

                                <td class="fd_operationTypeName">
                                        ${ m.operationTypeName }


                                </td>

                                <th>操作说明</th>

                                <td>
                                        ${ m.operationlogName }
                                </td>


                            </tr>


                            <tr>

                                <th>部门<font color="red">*</font></th>

                                <td class="fd_depName">
                                        ${ m.depName }


                                </td>

                                <th>机构<font color="red">*</font></th>

                                <td>
                                        ${ m.organId }
                                </td>


                            </tr>


                            <tr>

                                <th>操作人IP</th>

                                <td class="fd_operationIp">
                                        ${ m.operationIp }


                                </td>

                                <th>操作人名称<font color="red">*</font></th>

                                <td>
                                        ${ m.operationUserName }
                                </td>


                            </tr>


                            <tr>

                                <th>操作时间<font color="red">*</font></th>

                                <td class="fd_operationTime">
                                        <fmt:formatDate value="${ m.operationTime }" pattern="yyyy-MM-dd  HH:mm:ss" />


                                </td>



                            </tr>



                </table>

            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">




                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
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