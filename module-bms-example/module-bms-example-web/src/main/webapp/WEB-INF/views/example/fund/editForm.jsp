<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader  />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form action="" method="post" id="editForm" viewId="editForm" >

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
                                <td class="fd_uploadFile_fundFiles">

                                    <ul style="margin: 0 0 10px 0">
                                        <c:forEach var="item" items="${m.fundFilesList}">
                                            <li>
                                                <a href="<c:if test="${item.fileEngine == '1'}">javascript:viewFile('${item.id}');</c:if><c:if test="${item.fileEngine != '1'}">${item.accessUrl}</c:if>" class="file-text" title="${item.showName}" style="float:left;">
                                                <span style="float:left;">${item.showName}</span>
                                                <span style="float:right;" class="fileSize" fileSize="${item.fileSize}">(${item.fileSize})</span>
                                                </a>

                                                <a href="javascript:downloadFile('${item.id}');" class="file-operate" style="float:right;"><i class="fa fa-download"></i></a>

                                                <div style="clear: both;"></div>
                                            </li>
                                        </c:forEach>
                                    </ul>

                                </td>
                                <th>备注</th>
                                <td class="fd_remark">
                                    <c:out value="${ m.remark }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>部门</th>
                                <td class="fd_depName">
                                    <c:out value="${ m.depName }" escapeXml="true"/>
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

                                                <c:if test="${ m.managerUserId != null}">
                                                    <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }">
                                                    <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.managerUserId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }" >
                                                        <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm managerUserName " placeholder="请选择基金经理" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn" >
                                                            <button type="button"  class="btn btn-primary btn-sm managerUserName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearManagerUserId"   class="btn btn-primary btn-sm">
                                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                            </button>
                                                        </div>
                                                    </div>
                                                </c:if>
                                            </c:if>
                                </td>
                            </tr>

                            <tr>
                                <th>成立日期</th>
                                <td>

                                            <input type="text"  class="form-control input-sm Wdate "
                                                   placeholder="请输入成立日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'startDate'})"
                                                   value='<fmt:formatDate value="${ m.startDate }" pattern="yyyy-MM-dd" />' id="startDate" name="startDate" readonly   />

                                </td>
                                <th>到期日期</th>
                                <td>
                                            <input type="text"  class="form-control input-sm Wdate "
                                                   placeholder="请输入到期日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'endDate'})"
                                                           value='<fmt:formatDate value="${ m.endDate }" pattern="yyyy-MM-dd" />' id="endDate" name="endDate" readonly   />
                                </td>
                            </tr>

                            <tr>
                                <th>投资领域</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="investmentField" id="investmentField"  placeholder="请输入投资领域，500字以内" maxlength="500" rows="5"><c:out value="${ m.investmentField }" escapeXml="true"/></textarea>
                                        </div>
                                </td>
                                <th>收入分配</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  " rows="5"
                                                      id="incomeAllocation" name="incomeAllocation" placeholder="请输入收入分配，500字以内" maxlength="500" rows="4">${ m.incomeAllocation }</textarea>
                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td>
                                        <div class="" style="margin-bottom: 0px">
                                            <div class="info-detail">
                                                <input type="hidden" id="fundFiles" name="fundFiles" value="${ m.fundFiles}">
                                                <div class="uploader-list">
                                                    <ul id="thelist_fundFiles" class="file-list" style="margin: 0 0 10px 0" ></ul>
                                                </div>
                                                <div id="thelist_fundFiles_items" style="display: none;">
                                                    <c:forEach var="item" items="${ m.fundFilesList}">
                                                        <span id="${ item.id}" fileUseId="${ item.id}" accessUrl="${ item.accessUrl}" fileEngine="${ item.fileEngine}" fileSize="${ item.fileSize}" showName="${ item.showName}" businessId="${ item.businessId}"   />
                                                    </c:forEach>
                                                </div>

                                                <div class="btns">
                                                    <div id="uploadFile_fundFiles" title='附件' class="webuploader-container" style="width: 80px" data-options="viewAreaId:'#thelist_fundFiles',  businessFileType:'fundFiles'  ,businessTempId: '${ m.fundFiles}' ">
                                                        <i class="fa fa-upload"></i>
                                                        <span>上传附件</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>


                                </td>
                                <th>备注</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  " rows="5"
                                                      id="remark" name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="4">${ m.remark }</textarea>
                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>部门</th>
                                <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&depId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="depName"  id="depName" value="${ m.depName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&depId=') <0  }">
                                            <c:if test="${ m.depId != null}">
                                                <input type="hidden" name="depId" id="depId" value="${ m.depId }">
                                                <input type="text" name="depName" id="depName" value="${ m.depName }" required="required" class="form-control input-sm " readonly="readonly">
                                            </c:if>
                                            <c:if test="${ m.depId == null}">
                                                <div class="input-group">
                                                    <input type="hidden" name="depId" id="depId" value="${ m.depId }">
                                                    <input type="text" name="depName" id="depName" value="${ m.depName }"  class="form-control input-sm depName " placeholder="请选择部门" style="cursor: pointer;" readonly="readonly">
                                                    <div class="input-group-btn" >
                                                        <button type="button"
                                                                class="btn btn-primary btn-sm depName">
                                                            &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                        </button>
                                                        <button type="button" id="clearDepId"
                                                                class="btn btn-primary btn-sm">
                                                            &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                        </button>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:if>
                                </td>
                            </tr>

                        </tbody>
                    </table>



                            <input type="hidden" id="tempFundmanageBank" />
                            <input type="hidden" id="tempSystemUser" />


                        <div class="block-each block-each-another">

                                <div class="block-tit">
                                    &nbsp;<i class="fa fa-th-list"></i>&nbsp;基金账户
                                </div>




                                    <div class="fundmanageFundaccount" style="width: 100%">
                                        <table id='tableData-fundmanageFundaccount' class='easyui-datagrid' singleSelect="true" scrollbarSize="0"   method='post' fit='false'  fitColumns="true" border='true'>
                                            <thead>
                                            <tr>
                                                <th field="id" align="left" hidden="true">id</th>
                                                            <th field='fundAccountTypeName' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_fundAccountTypeNameFmt"  >基金账户类型</th>
                                                            <th field='accountName' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_accountNameFmt"  >户名</th>
                                                            <th field='bankName' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_bankNameFmt"  >开户行</th>
                                                            <th field='accountNo' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_accountNoFmt"  >账号</th>
                                                            <th field='startDate' align="center" width="1" sortable='false' formatter="fundmanageFundaccount_startDateFmt"  >开始日期</th>
                                                            <th field='otherBankName' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_otherBankNameFmt"  >其他行</th>
                                                            <th field='userName' align="left" width="1" sortable='false' formatter="fundmanageFundaccount_userNameFmt"  >账户处理人</th>
                                                <th field="option" align="left" hidden="true" formatter="markFmtFundAccount">操作</th>
                                            </tr>
                                            </thead>
                                        </table>
                                        <div class="show-area" style="text-align: center;margin: 5px">
                                            <button type="button" class="btn btn-primary btn-sm" onclick="doAddFundAccount()">
                                               <i class="fa fa-plus"></i>
                                                <span>添 加</span>
                                            </button>
                                        </div>
                                    </div>



                                <div class="block-tit">
                                    &nbsp;<i class="fa fa-th-list"></i>&nbsp;基金备案
                                </div>

                                    <input type="hidden" name="fundRecordBO.id" id="fundRecordBO_id" value="${ m.fundRecordBO.id }">
                                    <table class="info-table hide-area">
                                        <colgroup>
                                            <col style="width: 15%" />
                                            <col style="width: 35%" />
                                            <col style="width: 15%" />
                                            <col style="width: 35%" />
                                        </colgroup>

                                        <tbody>

                                                <tr>

                                                        <th>备案日期<font color="red">*</font></th>
                                                        <td class="fd_fundRecordBOrecordDate">
                                                                <fmt:formatDate value="${ m.fundRecordBO.recordDate }" pattern="yyyy-MM-dd" />
                                                        </td>
                                                </tr>

                                                <tr>
                                                    <th>备案地点<font color="red">*</font></th>
                                                    <td class="fd_fundRecordBOrecordAddr">
                                                            <c:out value="${ m.fundRecordBO.recordAddr }" escapeXml="true"/>
                                                    </td>

                                                        <th>开户行<font color="red">*</font></th>
                                                        <td class="fd_fundRecordBObankName">
                                                                <c:out value="${ m.fundRecordBO.bankName }" escapeXml="true"/>
                                                        </td>
                                                </tr>

                                                <tr>
                                                    <th>证件类型</th>
                                                    <td class="fd_fundRecordBOcardTypeName">
                                                            ${ m.fundRecordBO.cardTypeName }
                                                    </td>

                                                        <th>备案人</th>
                                                        <td class="fd_fundRecordBOrecordUserName">
                                                                <c:out value="${ m.fundRecordBO.recordUserName }" escapeXml="true"/>
                                                        </td>
                                                </tr>


                                        </tbody>


                                    </table>






                                    <table class="info-table show-area">
                                        <colgroup>
                                            <col style="width: 15%" />
                                            <col style="width: 35%" />
                                            <col style="width: 15%" />
                                            <col style="width: 35%" />
                                        </colgroup>

                                        <tbody>


                                            <tr>

                                                        <th>备案日期<font color="red">*</font></th>
                                                        <td>

                                                                    <input type="text" required="required" class="form-control input-sm Wdate required"
                                                                           placeholder="请输入备案日期" autocomplete="off"
                                                                           onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'fundRecordBO_recordDate'})"
                                                                           value='<fmt:formatDate value="${ m.fundRecordBO.recordDate }" pattern="yyyy-MM-dd" />' id="fundRecordBO_recordDate" name="fundRecordBO.recordDate" readonly   />
                                                        </td>


                                            </tr>
                                            <tr>
                                                    <th>备案地点<font color="red">*</font></th>
                                                    <td>
                                                                <input type="text" required="required" class="form-control input-sm required"
                                                                       placeholder="请输入备案地点" autocomplete="off"
                                                                       value="${ m.fundRecordBO.recordAddr }" id="fundRecordBO_recordAddr" name="fundRecordBO.recordAddr"
                                                                           maxlength="200"  />
                                                    </td>

                                                        <th>开户行<font color="red">*</font></th>
                                                        <td>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&bankId=') >= 0 }">
                                                                        <input type="text" class="form-control input-sm" name="fundRecordBO.bankName" id="fundRecordBO_bankName"  value="${ m.fundRecordBO.bankName }" readonly>
                                                                    </c:if>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&bankId=') < 0 }">
                                                                        <c:if test="${ m.fundRecordBO.bankId != null}">
                                                                            <input type="hidden" name="fundRecordBO.bankId" id="fundRecordBO_bankId" value="${ m.fundRecordBO.bankId }">
                                                                            <input type="text" name="fundRecordBO.bankName" id="fundRecordBO_bankName" value="${ m.fundRecordBO.bankName }" required="required" class="form-control input-sm fundRecordBO_bankName "  readonly="readonly">
                                                                        </c:if>
                                                                        <c:if test="${ m.fundRecordBO.bankId == null}">
                                                                            <div class="input-group">
                                                                                <input type="hidden" name="fundRecordBO.bankId" id="fundRecordBO_bankId" value="${ m.fundRecordBO.bankId }" >
                                                                                <input type="text" name="fundRecordBO.bankName" id="fundRecordBO_bankName" value="${ m.fundRecordBO.bankName }" required="required" class="form-control input-sm fundRecordBO_bankName " placeholder="请选择开户行" style="cursor: pointer;" readonly="readonly">
                                                                                <div class="input-group-btn">
                                                                                    <button type="button"  class="btn btn-primary btn-sm fundRecordBO_bankName">
                                                                                        &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                                                    </button>
                                                                                    <button type="button" id="clearfundRecordBO_BankId"   class="btn btn-primary btn-sm">
                                                                                        &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                                                    </button>
                                                                                </div>
                                                                            </div>
                                                                        </c:if>
                                                                    </c:if>
                                                        </td>


                                            </tr>
                                            <tr>
                                                    <th>证件类型</th>
                                                    <td>
                                                                <select id="fundRecordBO_cardType"  name="fundRecordBO.cardType"  style="width:98%">
                                                                    <option value="" ></option>
                                                                    <c:forEach items="${ card_type_dicts }" var="dict">
                                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundRecordBO.cardType }">selected</c:if>>${ dict.dictName  }</option>
                                                                    </c:forEach>
                                                                </select>
                                                    </td>

                                                        <th>备案人</th>
                                                        <td>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&recordUserId=') >= 0 }">
                                                                        <input type="text" class="form-control input-sm" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName"  value="${ m.fundRecordBO.recordUserName }" readonly>
                                                                    </c:if>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&recordUserId=') < 0 }">
                                                                        <c:if test="${ m.fundRecordBO.recordUserId != null}">
                                                                            <input type="hidden" name="fundRecordBO.recordUserId" id="fundRecordBO_recordUserId" value="${ m.fundRecordBO.recordUserId }">
                                                                            <input type="text" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName" value="${ m.fundRecordBO.recordUserName }"  class="form-control input-sm fundRecordBO_recordUserName "  readonly="readonly">
                                                                        </c:if>
                                                                        <c:if test="${ m.fundRecordBO.recordUserId == null}">
                                                                            <div class="input-group">
                                                                                <input type="hidden" name="fundRecordBO.recordUserId" id="fundRecordBO_recordUserId" value="${ m.fundRecordBO.recordUserId }" >
                                                                                <input type="text" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName" value="${ m.fundRecordBO.recordUserName }"  class="form-control input-sm fundRecordBO_recordUserName " placeholder="请选择备案人" style="cursor: pointer;" readonly="readonly">
                                                                                <div class="input-group-btn">
                                                                                    <button type="button"  class="btn btn-primary btn-sm fundRecordBO_recordUserName">
                                                                                        &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                                                    </button>
                                                                                    <button type="button" id="clearfundRecordBO_RecordUserId"   class="btn btn-primary btn-sm">
                                                                                        &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                                                    </button>
                                                                                </div>
                                                                            </div>
                                                                        </c:if>
                                                                    </c:if>
                                                        </td>


                                            </tr>
                                        </tbody>

                                    </table>

                        </div>








                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="fundmanage.fund:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="fundmanage.fund:update">
                    <button type="button" class="btn btn-primary btn-sm show-area" onclick="doUpdate()">
                        <i class="fa fa-save"></i>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm show-area" onclick="cancelEdit()">
                    <i class="fa fa-close"></i>
                    <span>取 消</span>
                </button>

            </div>
        </div>
    </div>
</div>

<script>
    var inAllPage = "${ inAllPage }";
    var queryString = "${ queryString }";
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/js/project/common-upload.js"></script>

<script src="${ staticUrl }/statics2/business-js/fundmanage/bank/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>

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

        $(".fundRecordBO_bankName").OpenFundmanageBankSelectWin({
            title: "开户行",
            selectType: "d1",
            callId: "fundRecordBO_bankId",
            callName: "fundRecordBO_bankName",
            clearId: "clearfundRecordBO_BankId"
        });
        $(".fundRecordBO_recordUserName").OpenSystemUserSelectWin({
            title: "备案人",
            selectType: "d1",
            callId: "fundRecordBO_recordUserId",
            callName: "fundRecordBO_recordUserName",
            clearId: "clearfundRecordBO_RecordUserId"
        });




        $("#tempFundmanageBank").OpenFundmanageBankSelectWin({
            title: "银行信息",
            selectType: "d1",
            callId: "",
            callName: "",
            clearId: ""
        },function(id,name,row){
            $(tempFundmanageBank).val(row.bankName);
            $(tempFundmanageBank).prev().val(row.id);

            costTableRows(tableId , tableJavaName , tempFundmanageBankIndex);

        });
        $("#tempSystemUser").OpenSystemUserSelectWin({
            title: "用户",
            selectType: "d1",
            callId: "",
            callName: "",
            clearId: ""
        },function(id,name,row){
            $(tempSystemUser).val(row.userName);
            $(tempSystemUser).prev().val(row.id);

            costTableRows(tableId , tableJavaName , tempSystemUserIndex);

        });

        $('#tableData-fundmanageFundaccount').datagrid({
            url : $AppContext+dataUrl+"/fundAccount/list?fundId=${ m.id }",
            onLoadSuccess : function(data){
                if(data.rows!=null){
                    $('#tableData-fundmanageFundaccount').datagrid("resize", {height: (data.rows.length + 1) * tableHeight});
                    $(".fd-decimal2").inputDecimal(2);
                }
            }
        });
    });


    var tableId , tableJavaName;

    var tempFundmanageBank  , tempFundmanageBankIndex ;
    var tempSystemUser  , tempSystemUserIndex ;


    function fund_account_type_dicts() {
        var html = "<option value=''>请选择</option>";
    <c:forEach items="${ fund_account_type_dicts }" var="dict">
        html += "<option value='${ dict.dictVal }'>${ dict.dictName }</option>";
    </c:forEach>
        return html;
    }



    function openFundmanageBank(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined) {
            tempFundmanageBankIndex = index;
            tempFundmanageBank = obj[0];
            if(tempFundmanageBank == null){
                tempFundmanageBank = obj;
            }


            tableId = theTabelId;
            tableJavaName = theTableJavaName;

            $("#tempFundmanageBank").click();
        }
    }
    function clearFundmanageBank(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined){
            tempFundmanageBankIndex = index;
            tempFundmanageBank = obj[0];
            if(tempFundmanageBank == null){
                tempFundmanageBank = obj;
            }

            tableId = theTabelId
            tableJavaName = theTableJavaName
            $(tempFundmanageBank).val("");
            $(tempFundmanageBank).prev().val("");

            costTableRows(tableId , tableJavaName , tempFundmanageBankIndex);
        }
    }
    function openSystemUser(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined) {
            tempSystemUserIndex = index;
            tempSystemUser = obj[0];
            if(tempSystemUser == null){
                tempSystemUser = obj;
            }


            tableId = theTabelId;
            tableJavaName = theTableJavaName;

            $("#tempSystemUser").click();
        }
    }
    function clearSystemUser(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined){
            tempSystemUserIndex = index;
            tempSystemUser = obj[0];
            if(tempSystemUser == null){
                tempSystemUser = obj;
            }

            tableId = theTabelId
            tableJavaName = theTableJavaName
            $(tempSystemUser).val("");
            $(tempSystemUser).prev().val("");

            costTableRows(tableId , tableJavaName , tempSystemUserIndex);
        }
    }







    function fundmanageFundaccount_fundAccountTypeNameFmt(val, row,index){
        var html = "<select name='fundAccountBOList["+index+"].fundAccountType' id='fundAccountBOList_"+index+"_fundAccountType' onblur='costTableRows(\"tableData-fundmanageFundaccount\" , \"fundAccountBOList\" , "+index+")' class='form-control input-sm show-area required'>" ;
        html += checkedOption(fund_account_type_dicts() , row.fundAccountType);
        html += "</select>";
        html += "<div class='hide-area'>"+row.fundAccountTypeName+"</div>";
        return html;
    }


    function fundmanageFundaccount_accountNameFmt(val, row,index){

        var html = '<input type="text" required="required" class="form-control input-sm show-area required"'+
            'placeholder="请输入户名" autocomplete="off" '+ ' onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
            'value="'+val+'" id="fundAccountBOList_'+index+'_accountName" name="fundAccountBOList['+index+'].accountName"'+
            '   maxlength="100"  />';

        html += "<div class='hide-area' >"+val+"</div>" ;
        return html;

    }


    function fundmanageFundaccount_bankNameFmt(val, row,index){

        var html = '<div class="input-group show-area">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].bankId" id="fundAccountBOList_'+index+'_bankId" value="'+row.bankId+'" >';
        html += '<input type="text"  class="form-control input-sm openwindow bankName" onclick="openFundmanageBank(\'tableData-fundmanageFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.bankName+'" id="fundAccountBOList_'+index+'_bankName"  name="fundAccountBOList['+index+'].bankName"  onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择开户行" readonly >';
        html += '<div class="input-group-btn" style="float:left">';
        html += '<div class="btn btn-primary btn-sm" onclick="openFundmanageBank(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_bankName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearFundmanageBank(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_bankName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';


        html += "<div class='hide-area' >"+row.bankName+"</div>" ;

        return html;
    }


    function fundmanageFundaccount_accountNoFmt(val, row,index){

        var html = '<input type="text" required="required" class="form-control input-sm show-area required"'+
            'placeholder="请输入账号" autocomplete="off" '+ ' onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
            'value="'+val+'" id="fundAccountBOList_'+index+'_accountNo" name="fundAccountBOList['+index+'].accountNo"'+
            '   maxlength="50"  />';

        html += "<div class='hide-area' >"+val+"</div>" ;
        return html;

    }


    function fundmanageFundaccount_startDateFmt(val, row,index){

        var dd = "";
        if(val != undefined && val != null && val != 0){
            dd = changeDateFormat(val);
        }
        var html = '<input type="text"  class="form-control input-sm show-area Wdate  "'+
            'placeholder="请输入开始日期" autocomplete="off"'+ ' onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
            'onclick="WdatePicker({dateFmt: \'yyyy-MM-dd\', el: \'fundAccountBOList_'+index+'_startDate\'})"'+
            'value="'+dd+'" id="fundAccountBOList_'+index+'_startDate" name="fundAccountBOList['+index+'].startDate" readonly   />';
        html += "<div class='hide-area' >"+dd+"</div>" ;
        return html;

    }


    function fundmanageFundaccount_otherBankNameFmt(val, row,index){

        var html = '<div class="input-group show-area">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].otherBankId" id="fundAccountBOList_'+index+'_otherBankId" value="'+row.otherBankId+'" >';
        html += '<input type="text"  class="form-control input-sm openwindow otherBankName" onclick="openFundmanageBank(\'tableData-fundmanageFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.otherBankName+'" id="fundAccountBOList_'+index+'_otherBankName"  name="fundAccountBOList['+index+'].otherBankName"  onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择其他行" readonly >';
        html += '<div class="input-group-btn" style="float:left">';
        html += '<div class="btn btn-primary btn-sm" onclick="openFundmanageBank(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_otherBankName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearFundmanageBank(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_otherBankName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';


        html += "<div class='hide-area' >"+row.otherBankName+"</div>" ;

        return html;
    }


    function fundmanageFundaccount_userNameFmt(val, row,index){

        var html = '<div class="input-group show-area">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].userId" id="fundAccountBOList_'+index+'_userId" value="'+row.userId+'" >';
        html += '<input type="text"  class="form-control input-sm openwindow userName" onclick="openSystemUser(\'tableData-fundmanageFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.userName+'" id="fundAccountBOList_'+index+'_userName"  name="fundAccountBOList['+index+'].userName"  onblur="costTableRows(\'tableData-fundmanageFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择账户处理人" readonly >';
        html += '<div class="input-group-btn" style="float:left">';
        html += '<div class="btn btn-primary btn-sm" onclick="openSystemUser(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_userName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearSystemUser(\'tableData-fundmanageFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_userName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';


        html += "<div class='hide-area' >"+row.userName+"</div>" ;

        return html;
    }
    function markFmtFundAccount(val, r,index){
        var html =	'<div class="grid-column-option">';
        html+=	'<a href="javascript: doDelFundAccount('+ index + ');" title="删除"><i class="fa fa-trash"></i></a>';
        html+=	'</div>';
        return html;
    }


    function doDelFundAccount(index){
        $('#tableData-fundmanageFundaccount').datagrid("deleteRow" , index);
        var rows = $('#tableData-fundmanageFundaccount').datagrid("getRows");
        $('#tableData-fundmanageFundaccount').datagrid("loadData",rows);
        openEdit();
    }

    function doAddFundAccount() {
        var rows = $('#tableData-fundmanageFundaccount').datagrid("getRows");
        rows.push({ id : "" ,fundId : "" ,fundName : "" ,fundAccountType : "" ,fundAccountTypeName : "" ,accountName : "" ,bankId : "" ,bankName : "" ,accountNo : "" ,startDate : "" ,otherBankId : "" ,otherBankName : "" ,userId : "" ,userName : ""  });
        $('#tableData-fundmanageFundaccount').datagrid("loadData",rows);
        openEdit();
    }


</script>


<bms:contentFooter />