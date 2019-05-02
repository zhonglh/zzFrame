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
                                    <th>基金名称<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入基金名称" autocomplete="off"
                                                   value="${ m.fundName }" id="fundName" name="fundName"
                                                      maxlength="50"  />
                                    </td>
                                    <th>基金代码<font color="red">*</font></th>
                                    <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入基金代码" autocomplete="off"
                                               value="${ m.fundCode }" id="fundCode" name="fundCode"
                                                   maxlength="10"  />
                                    </td>
                                </tr>
                                <tr>
                                    <th>基金类型<font color="red">*</font></th>
                                    <td>
                                            <select id="fundType"  name="fundType" required="required" style="width:98%">
                                            <option value="" ></option>
                                            <c:forEach items="${ fund_type_dicts }" var="dict">
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundType }">selected</c:if>>${ dict.dictName  }</option>
                                            </c:forEach>
                                            </select>
                                    </td>
                                    <th>基金投向<font color="red">*</font></th>
                                    <td>
                                        <select id="fundDirection"  name="fundDirection" required="required" style="width:98%">
                                            <option value="" ></option>
                                            <c:forEach items="${ fund_direction_dicts }" var="dict">
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundDirection }">selected</c:if>>${ dict.dictName }</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>起购金额<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm number fd-decimal2 required"
                                                   placeholder="请输入起购金额" autocomplete="off"
                                                   value="${ m.startMoney }" id="startMoney" name="startMoney" step="0.01"
                                                       maxlength="14"  />
                                    </td>
                                    <th>管理类型<font color="red">*</font></th>
                                    <td>
                                        <select id="managType"  name="managType" required="required" style="width:98%">
                                            <option value="" ></option>
                                            <c:forEach items="${ manag_type_dicts }" var="dict">
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.managType }">selected</c:if>>${ dict.dictName }</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>基金规模<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm number fd-decimal2 required"
                                                   placeholder="请输入基金规模" autocomplete="off"
                                                   value="${ m.fundScale }" id="fundScale" name="fundScale" step="0.01"
                                                       maxlength="14"  />
                                    </td>
                                    <th>基金经理<font color="red">*</font></th>
                                    <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&managerUserId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="managerUserName" id="managerUserName"  value="${ m.managerUserName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&managerUserId=') < 0 }">
                                        <div class="input-group">
                                            <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }" >
                                            <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm managerUserName " placeholder="请选择基金经理" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"  class="btn btn-primary btn-sm managerUserName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearManagerUserId"   class="btn btn-primary btn-sm">
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
                                    <th>成立日期</th>
                                    <td>
                                        <div class="input-group">
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入成立日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'startDate'})"
                                                   value="${ m.startDate }" id="startDate" name="startDate" readonly   />
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-primary btn-sm" onclick="document.getElementById('startDate').click()">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-rili"></use>
                                                    </svg>
                                                </button>
                                                <button type="button" class="btn btn-primary btn-sm" onclick="clearTime(StartDate);">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use  xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                                    </svg>
                                                </button>
                                            </div>
                                        </div>
                                    </td>
                                    <th>到期日期</th>
                                    <td>
                                        <div class="input-group">
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入到期日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'endDate'})"
                                                           value="${ m.endDate }" id="endDate" name="endDate" readonly   />
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-primary btn-sm" onclick="document.getElementById('endDate').click()">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-rili"></use>
                                                    </svg>
                                                </button>
                                                <button type="button" class="btn btn-primary btn-sm" onclick="clearTime(EndDate);">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use  xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                                    </svg>
                                                </button>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <th>投资领域</th>
                                    <td>
                                            <div class="info-detail">
                                                <textarea  class="form-control input-sm  "
                                                          name="investmentField" id="investmentField " placeholder="请输入投资领域，500字以内" maxlength="500" rows="4">${ m.investmentField }</textarea>
                                            </div>
                                    </td>
                                    <th>收入分配</th>
                                    <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="incomeAllocation" placeholder="请输入收入分配，500字以内" maxlength="500" rows="4">${ m.incomeAllocation }</textarea>
                                        </div>
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

                    <div class="block-each block-each-another">
                        <div class="block-tit">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                            </svg>基金账户
                        </div>

                        <div class="fundAccount">
                            <table id='tableData-fundAccount' class='easyui-datagrid' singleSelect="true" scrollbarSize="0"   method='post' fit='false'  fitColumns="true" border='true'>
                                <thead>
                                <tr>

                                    <th field='fundAccountTypeName' align="left" width="2" sortable='false' formatter="fundAccountTypeNameFmt">账户类型</th>
                                    <th field='bankName' align="left" width="2" sortable='false' formatter="bankNameFmt">开户行</th>
                                    <th field='accountName' align="left" width="2" sortable='false' formatter="accountNameFmt">账户名</th>
                                    <th field='accountNo' align="left" width="2" sortable='false' formatter="accountNoFmt">账号</th>



                                    <th field="option" align="left" formatter="markFmt">操作</th>
                                </tr>
                                </thead>
                            </table>
                            <div style="text-align: center;margin: 5px">
                                <button type="button" class="btn btn-primary btn-sm" onclick="doAdd()">
                                    <svg class="icon" aria-hidden="true">
                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                                    </svg>
                                    <span>添 加</span>
                                </button>
                            </div>
                        </div>
                        <input type="hidden" id="costShare" name="costShareCustomDetail" />
                        <input type="hidden" id="fileIds" name="fileIds" />
                        <input type="hidden" id="fileIds1" name="fileIds1" />
                        <input type="hidden" id="coustomTemp" />
                    </div>





                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">
                <shiro:hasPermission name="example.fund:add">
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
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>

<script language="JavaScript">
    $(function() {

        //选择基金经理
        $(".managerUserName").OpenSystemUserSelectWin({
            title: "基金经理",
            selectType: "d1",
            callId: "managerUserId",
            callName: "managerUserName",
            clearId: "clearManagerUserId"
        });
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