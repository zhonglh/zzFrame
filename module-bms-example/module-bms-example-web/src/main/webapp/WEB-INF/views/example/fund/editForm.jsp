<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form action="" method="post" id="editForm" viewId="editForm" >

                    <div class="block-tit">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                        </svg>基本信息
                    </div>


                    <table class="info-table hide-area">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                            <tr>
                                <th>基金名称<font color="red">*</font></th>
                                <td class="fd_fundName">
                                    <c:out value="${ m.fundName }" escapeXml="true"/>
                                </td>
                                <th>基金代码<font color="red">*</font></th>
                                <td class="fd_fundCode">
                                    <c:out value="${ m.fundCode }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>基金类型<font color="red">*</font></th>
                                <td class="fd_fundTypeName">
                                    ${ m.fundTypeName }
                                </td>
                                <th>基金投向<font color="red">*</font></th>
                                <td class="fd_fundDirectionName">
                                    ${ m.fundDirectionName }
                                </td>
                            </tr>

                            <tr>
                                <th>起购金额<font color="red">*</font></th>
                                <td class="fd_startMoney">
                                    <c:out value="${ m.startMoney }" escapeXml="true"/>
                                </td>
                                <th>管理类型<font color="red">*</font></th>
                                <td class="fd_managTypeName">
                                    ${ m.managTypeName }
                                </td>
                            </tr>

                            <tr>
                                <th>基金规模<font color="red">*</font></th>
                                <td class="fd_fundScale">
                                    <c:out value="${ m.fundScale }" escapeXml="true"/>
                                </td>
                                <th>基金经理<font color="red">*</font></th>
                                <td class="fd_managerUserName">
                                    <c:out value="${ m.managerUserName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>成立日期</th>
                                <td class="fd_startDate">
                                    <fmt:formatDate value="${ m.startDate }" pattern="yyyy-MM-dd" />
                                </td>
                                <th>到期日期</th>
                                <td class="fd_endDate">
                                    <fmt:formatDate value="${ m.endDate }" pattern="yyyy-MM-dd" />
                                </td>
                            </tr>

                            <tr>
                                <th>投资领域</th>
                                <td class="fd_investmentField">
                                    <c:out value="${ m.investmentField }" escapeXml="true"/>
                                </td>
                                <th>收入分配</th>
                                <td class="fd_incomeAllocation">
                                    <c:out value="${ m.incomeAllocation }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td class="fd_fundFiles">
                                    <c:out value="${ m.fundFiles }" escapeXml="true"/>
                                </td>
                                <th>备注</th>
                                <td class="fd_remark">
                                    <c:out value="${ m.remark }" escapeXml="true"/>
                                </td>
                            </tr>


                        </tbody>
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
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundDirection }">selected</c:if>>${  dict.dictName }</option>
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
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.managType }">selected</c:if>>${  dict.dictName }</option>
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
                                                <input type="text" class="form-control input-sm" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" readonly>
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
                                            <input type="text"  class="form-control input-sm Wdate"
                                                   placeholder="请输入成立日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'startDate'})"
                                                           value="${ m.startDate }" id="startDate" name="startDate" readonly   />
                                        </div>
                                </td>
                                <th>到期日期</th>
                                <td>
                                        <div class="input-group">
                                            <input type="text"  class="form-control input-sm Wdate"
                                                   placeholder="请输入到期日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'endDate'})"
                                                           value="${ m.endDate }" id="endDate" name="endDate" readonly   />
                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>投资领域</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="investmentField " placeholder="请输入投资领域，500字以内" maxlength="500" rows="6"><c:out value="${ m.investmentField }" escapeXml="true"/></textarea>
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
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="example.fund:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                        </svg>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="example.fund:update">
                    <button type="button" class="btn btn-primary btn-sm show-area" onclick="doUpdate()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm show-area" onclick="cancelEdit()">
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