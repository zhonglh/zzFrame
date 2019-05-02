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
                                    <th>协议名称<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入协议名称" autocomplete="off"
                                                   value="${ m.agreementName }" id="agreementName" name="agreementName"
                                                      maxlength="50"  />
                                    </td>
                                    <th>协议代码<font color="red">*</font></th>
                                    <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入协议代码" autocomplete="off"
                                               value="${ m.agreementCode }" id="agreementCode" name="agreementCode"
                                                   maxlength="10"  />
                                    </td>
                                </tr>
                                <tr>
                                    <th>认购基金<font color="red">*</font></th>
                                    <td>
                                            <c:if test="${ fn:indexOf(allQueryString,'&fundId=') >=0 }">
                                                <input type="text" class="form-control input-sm" name="fundName" id="fundName"  value="${ m.fundName }" readonly>
                                            </c:if>
                                            <c:if test="${ !fn.indexOf(allQueryString,'&fundId=') < 0 }">
                                            <div class="input-group">
                                                <input type="hidden" name="fundId" id="fundId" value="${ m.fundId }">
                                                <input type="text" name="fundName" id="fundName" value="${ m.fundName }" required="required" class="form-control input-sm fundName " placeholder="请选择认购基金" style="cursor: pointer;" readonly="readonly">
                                                <div class="input-group-btn">
                                                    <button type="button"
                                                            class="btn btn-primary btn-sm fundName">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearFundId"
                                                            class="btn btn-primary btn-sm">
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
                                    <th>投资人<font color="red">*</font></th>
                                    <td>
                                        <c:if test="${ fn.indexOf(allQueryString,'&investorId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="investorName" id="investorName"  value="${ m.investorName }" readonly>
                                        </c:if>
                                        <c:if test="${ !fn.indexOf(allQueryString,'&investorId=') < 0 }">
                                        <div class="input-group">
                                            <input type="hidden" name="investorId" id="investorId" value="${ m.investorId }" >
                                            <input type="text" name="investorName" id="investorName" value="${ m.investorName }" required="required" class="form-control input-sm investorName " placeholder="请选择投资人" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"  class="btn btn-primary btn-sm investorName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearInvestorId"   class="btn btn-primary btn-sm">
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
                                    <th>认购金额<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm number fd-decimal2 required"
                                                   placeholder="请输入认购金额" autocomplete="off"
                                                   value="${ m.amount }" id="amount" name="amount" step="0.01"
                                                       maxlength="14"  />
                                    </td>
                                    <th>实际出资金额</th>
                                    <td>
                                        <input type="text"  class="form-control input-sm number fd-decimal2 "
                                               placeholder="请输入实际出资金额" autocomplete="off"
                                               value="${ m.actualAmount }" id="actualAmount" name="actualAmount" step="0.01"
                                                   maxlength="14"  />
                                    </td>
                                </tr>
                                <tr>
                                    <th>协议简述</th>
                                    <td>
                                            <div class="info-detail">
                                                <textarea  class="form-control input-sm  "
                                                          name="sketch" id="sketch " placeholder="请输入协议简述，500字以内" maxlength="500" rows="4">${ m.sketch $}</textarea>
                                            </div>
                                    </td>
                                    <th>部门</th>
                                    <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入部门" autocomplete="off"
                                               value="${ m.signDepId }" id="signDepId" name="signDepId"
                                                   maxlength="32"  />
                                    </td>
                                </tr>
                                <tr>
                                    <th>机构</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入机构" autocomplete="off"
                                                   value="${ m.signOrganId }" id="signOrganId" name="signOrganId"
                                                      maxlength="32"  />
                                    </td>
                                    <th>签订人<font color="red">*</font></th>
                                    <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入签订人" autocomplete="off"
                                               value="${ m.signUserId }" id="signUserId" name="signUserId"
                                                   maxlength="32"  />
                                    </td>
                                </tr>
                                <tr>
                                    <th>签订日期<font color="red">*</font></th>
                                    <td>
                                        <div class="input-group">
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入签订日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'signDate'})"
                                                   value="${ m.signDate }" id="signDate" name="signDate" readonly   />
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-primary btn-sm" onclick="document.getElementById('signDate').click()">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-rili"></use>
                                                    </svg>
                                                </button>
                                                <button type="button" class="btn btn-primary btn-sm" onclick="clearTime(SignDate);">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use  xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                                    </svg>
                                                </button>
                                            </div>
                                        </div>
                                    </td>
                                    <th>附件</th>
                                    <td>
                                    </td>
                                </tr>
                                <tr>
                                    <th>备注</th>
                                    <td>
                                            <div class="info-detail">
                                                <textarea  class="form-control input-sm  "
                                                          name="remark" id="remark " placeholder="请输入备注，500字以内" maxlength="500" rows="4">${ m.remark $}</textarea>
                                            </div>
                                    </td>
                                </tr>
                        </tbody>
                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">
                <shiro:hasPermission name="example.investoragreement:add">
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
<script src="${ staticUrl }/statics2/business-js/example/fund/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/example/investor/search.js"></script>

<script language="JavaScript">
    $(function() {

        //选择认购基金
        $(".fundName").OpenExampleFundSelectWin({
            title: "认购基金",
            selectType: "d1",
            callId: "fundId",
            callName: "fundName",
            clearId: "clearFundId"
        });
        //选择投资人
        $(".investorName").OpenExampleInvestorSelectWin({
            title: "投资人",
            selectType: "d1",
            callId: "investorId",
            callName: "investorName",
            clearId: "clearInvestorId"
        });
    });

</script>

<bms:contentFooter />