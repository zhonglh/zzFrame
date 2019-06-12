<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />




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
                                <th>协议<font color="red">*</font></th>
                                <td class="fd_investorAgreementName">
                                    <c:out value="${ m.investorAgreementName }" escapeXml="true"/>
                                </td>
                                <th>基金<font color="red">*</font></th>
                                <td class="fd_fundName">
                                    <c:out value="${ m.fundName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>投资人<font color="red">*</font></th>
                                <td class="fd_investorName">
                                    <c:out value="${ m.investorName }" escapeXml="true"/>
                                </td>
                                <th>实际出资金额</th>
                                <td class="fd_actualAmount">
                                    <c:out value="${ m.actualAmount }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>部门<font color="red">*</font></th>
                                <td class="fd_handleDepName">
                                    <c:out value="${ m.handleDepName }" escapeXml="true"/>
                                </td>
                                <th>机构</th>
                                <td class="fd_handleOrganId">
                                    <c:out value="${ m.handleOrganId }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>经办人<font color="red">*</font></th>
                                <td class="fd_handleUserName">
                                    <c:out value="${ m.handleUserName }" escapeXml="true"/>
                                </td>
                                <th>到账日期<font color="red">*</font></th>
                                <td class="fd_arrivalAccountDate">
                                    <fmt:formatDate value="${ m.arrivalAccountDate }" pattern="yyyy-MM-dd" />
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td class="fd_uploadFile_outMoneyFiles">

                                    <ul style="margin: 0 0 10px 0">
                                        <c:forEach var="item" items="${m.outMoneyFilesList}">
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
                                <th>协议<font color="red">*</font></th>
                                <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&investorAgreementId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="investorAgreementName"  id="investorAgreementName" value="${ m.investorAgreementName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&investorAgreementId=') <0  }">
                                        <div class="input-group">
                                            <input type="hidden" name="investorAgreementId" id="investorAgreementId" value="${ m.investorAgreementId }">
                                            <input type="text" name="investorAgreementName" id="investorAgreementName" value="${ m.investorAgreementName }" required="required" class="form-control input-sm investorAgreementName " placeholder="请选择协议" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm investorAgreementName">
                                                    &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                </button>
                                                <button type="button" id="clearInvestorAgreementId"
                                                        class="btn btn-primary btn-sm">
                                                    &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                </button>
                                            </div>
                                        </div>
                                        </c:if>
                                </td>
                                <th>基金<font color="red">*</font></th>
                                <td>
                                            <c:if test="${ fn:indexOf(allQueryString,'&fundId=') >= 0 }">
                                                <input type="text" class="form-control input-sm" name="fundName" id="fundName" value="${ m.fundName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&fundId=') < 0 }">
                                            <div class="input-group">
                                                <input type="hidden" name="fundId" id="fundId" value="${ m.fundId }" >
                                                <input type="text" name="fundName" id="fundName" value="${ m.fundName }" required="required" class="form-control input-sm fundName " placeholder="请选择基金" style="cursor: pointer;" readonly="readonly">
                                                <div class="input-group-btn">
                                                    <button type="button"  class="btn btn-primary btn-sm fundName">
                                                        &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                    </button>
                                                    <button type="button" id="clearFundId"   class="btn btn-primary btn-sm">
                                                        &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                    </button>
                                                </div>
                                            </div>
                                            </c:if>
                                </td>
                            </tr>

                            <tr>
                                <th>投资人<font color="red">*</font></th>
                                <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&investorId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="investorName"  id="investorName" value="${ m.investorName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&investorId=') <0  }">
                                        <div class="input-group">
                                            <input type="hidden" name="investorId" id="investorId" value="${ m.investorId }">
                                            <input type="text" name="investorName" id="investorName" value="${ m.investorName }" required="required" class="form-control input-sm investorName " placeholder="请选择投资人" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm investorName">
                                                    &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                </button>
                                                <button type="button" id="clearInvestorId"
                                                        class="btn btn-primary btn-sm">
                                                    &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                </button>
                                            </div>
                                        </div>
                                        </c:if>
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
                                <th>部门<font color="red">*</font></th>
                                <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&handleDepId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="handleDepName"  id="handleDepName" value="${ m.handleDepName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&handleDepId=') <0  }">
                                        <div class="input-group">
                                            <input type="hidden" name="handleDepId" id="handleDepId" value="${ m.handleDepId }">
                                            <input type="text" name="handleDepName" id="handleDepName" value="${ m.handleDepName }" required="required" class="form-control input-sm handleDepName " placeholder="请选择部门" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm handleDepName">
                                                    &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                </button>
                                                <button type="button" id="clearHandleDepId"
                                                        class="btn btn-primary btn-sm">
                                                    &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                </button>
                                            </div>
                                        </div>
                                        </c:if>
                                </td>
                                <th>机构</th>
                                <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入机构" autocomplete="off"
                                               value="${ m.handleOrganId }" id="handleOrganId" name="handleOrganId"
                                                   maxlength="32"  />
                                </td>
                            </tr>

                            <tr>
                                <th>经办人<font color="red">*</font></th>
                                <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&handleUserId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="handleUserName"  id="handleUserName" value="${ m.handleUserName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&handleUserId=') <0  }">
                                        <div class="input-group">
                                            <input type="hidden" name="handleUserId" id="handleUserId" value="${ m.handleUserId }">
                                            <input type="text" name="handleUserName" id="handleUserName" value="${ m.handleUserName }" required="required" class="form-control input-sm handleUserName " placeholder="请选择经办人" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm handleUserName">
                                                    &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                </button>
                                                <button type="button" id="clearHandleUserId"
                                                        class="btn btn-primary btn-sm">
                                                    &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                </button>
                                            </div>
                                        </div>
                                        </c:if>
                                </td>
                                <th>到账日期<font color="red">*</font></th>
                                <td>
                                            <input type="text" required="required" class="form-control input-sm Wdate required"
                                                   placeholder="请输入到账日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'arrivalAccountDate'})"
                                                           value='<fmt:formatDate value="${ m.arrivalAccountDate }" pattern="yyyy-MM-dd" />' id="arrivalAccountDate" name="arrivalAccountDate" readonly   />

                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td>
                                        <div class="" style="margin-bottom: 0px">
                                            <div class="info-detail">
                                                <input type="hidden" id="outMoneyFiles" name="outMoneyFiles" value="${ m.outMoneyFiles}">
                                                <div class="uploader-list">
                                                    <ul id="thelist_outMoneyFiles" class="file-list" style="margin: 0 0 10px 0" ></ul>
                                                </div>
                                                <div id="thelist_outMoneyFiles_items" style="display: none;">
                                                    <c:forEach var="item" items="${ m.outMoneyFilesList}">
                                                        <span id="${ item.id}" fileUseId="${ item.id}" accessUrl="${ item.accessUrl}" fileEngine="${ item.fileEngine}" fileSize="${ item.fileSize}" showName="${ item.showName}" businessId="${ item.businessId}"   />
                                                    </c:forEach>
                                                </div>

                                                <div class="btns">
                                                    <div id="uploadFile_outMoneyFiles" title='附件' class="webuploader-container" style="width: 80px" data-options="viewAreaId:'#thelist_outMoneyFiles', businessFileType:'outMoneyFiles'  ,businessTempId: '${ m.outMoneyFiles}' ">
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

                        </tbody>
                    </table>













                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="example.outmoney:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="example.outmoney:update">
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
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/js/project/common-upload.js"></script>


<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/example/investoragreement/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/example/fund/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/example/investor/search.js"></script>



<script language="JavaScript">
    $(function() {


        //选择协议
        $(".investorAgreementName").OpenExampleInvestoragreementSelectWin({
            title: "协议",
            selectType: "d1",
            callId: "investorAgreementId",
            callName: "investorAgreementName",
            clearId: "clearInvestorAgreementId"
        });

        //选择基金
        $(".fundName").OpenExampleFundSelectWin({
            title: "基金",
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

        //选择部门
        $(".handleDepName").OpenSystemDepSelectWin({
            title: "部门",
            selectType: "t1",
            callId: "handleDepId",
            callName: "handleDepName",
            clearId: "clearHandleDepId"
        });

        //选择经办人
        $(".handleUserName").OpenSystemUserSelectWin({
            title: "经办人",
            selectType: "d1",
            callId: "handleUserId",
            callName: "handleUserName",
            clearId: "clearHandleUserId"
        });






    });


    var tableId , tableJavaName;












</script>


<bms:contentFooter />