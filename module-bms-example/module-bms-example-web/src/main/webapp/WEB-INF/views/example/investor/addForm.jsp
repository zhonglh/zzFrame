<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />


<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form id="editForm" action="" method="post">

                    <div class="block-tit">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                        </svg>基本信息
                    </div>

                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>


                                <tr>
                                    <th>投资人名称<font color="red">*</font></th>
                                    <td>
                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入投资人名称" autocomplete="off"
                                                       value="${ m.investorName }" id="investorName" name="investorName"
                                                           maxlength="50"  />
                                    </td>
                                        <th>投资人代码<font color="red">*</font></th>
                                        <td>
                                                    <input type="text" required="required" class="form-control input-sm required"
                                                           placeholder="请输入投资人代码" autocomplete="off"
                                                           value="${ m.investorCode }" id="investorCode" name="investorCode"
                                                               maxlength="10"  />
                                        </td>
                                </tr>
                                <tr>
                                    <th>投资人类型<font color="red">*</font></th>
                                    <td>
                                                <select id="investorType"  name="investorType" required="required" style="width:98%">
                                                    <option value="" ></option>
                                                    <c:forEach items="${ investor_type_dicts }" var="dict">
                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.investorType }">selected</c:if>>${ dict.dictName  }</option>
                                                    </c:forEach>
                                                </select>
                                    </td>
                                        <th>投资经理<font color="red">*</font></th>
                                        <td>
                                                    <c:if test="${ fn:indexOf(allQueryString,'&manageUserId=') >= 0 }">
                                                        <input type="text" class="form-control input-sm" name="manageUserName" id="manageUserName"  value="${ m.manageUserName }" readonly>
                                                    </c:if>
                                                    <c:if test="${ fn:indexOf(allQueryString,'&manageUserId=') < 0 }">
                                                        <div class="input-group">
                                                            <input type="hidden" name="manageUserId" id="manageUserId" value="${ m.manageUserId }" >
                                                            <input type="text" name="manageUserName" id="manageUserName" value="${ m.manageUserName }" required="required" class="form-control input-sm manageUserName " placeholder="请选择投资经理" style="cursor: pointer;" readonly="readonly">
                                                            <div class="input-group-btn">
                                                                <button type="button"  class="btn btn-primary btn-sm manageUserName">
                                                                    <svg class="icon" aria-hidden="true">
                                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                             xlink:href="#icon-sousuo">
                                                                        </use>
                                                                    </svg>
                                                                </button>
                                                                <button type="button" id="clearManageUserId"   class="btn btn-primary btn-sm">
                                                                    <svg class="icon" aria-hidden="true">
                                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                             xlink:href="#icon-close">
                                                                        </use>
                                                                    </svg>
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </c:if>
                                        </td>
                                </tr>
                                <tr>
                                    <th>证件类型</th>
                                    <td>
                                                <select id="cardType"  name="cardType"  style="width:98%">
                                                    <option value="" ></option>
                                                    <c:forEach items="${ card_type_dicts }" var="dict">
                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.cardType }">selected</c:if>>${ dict.dictName  }</option>
                                                    </c:forEach>
                                                </select>
                                    </td>
                                        <th>证件号码</th>
                                        <td>
                                                    <input type="text"  class="form-control input-sm "
                                                           placeholder="请输入证件号码" autocomplete="off"
                                                           value="${ m.cardNo }" id="cardNo" name="cardNo"
                                                               maxlength="100"  />
                                        </td>
                                </tr>
                                <tr>
                                    <th>附件</th>
                                    <td>
                                    </td>
                                        <th>备注</th>
                                        <td>
                                                    <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="4">${ m.remark }</textarea>
                                                    </div>
                                        </td>
                                </tr>
                        </tbody>
                    </table>









                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">
                <shiro:hasPermission name="example.investor:add">
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
    var inAllPage = "${ inAllPage }";
</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/form.js"></script>



<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>




<script language="JavaScript">
    $(function() {


        //选择投资经理
        $(".manageUserName").OpenSystemUserSelectWin({
            title: "投资经理",
            selectType: "d1",
            callId: "manageUserId",
            callName: "manageUserName",
            clearId: "clearManageUserId"
        });






    });


    var tableId , tableJavaName;












</script>


<bms:contentFooter />