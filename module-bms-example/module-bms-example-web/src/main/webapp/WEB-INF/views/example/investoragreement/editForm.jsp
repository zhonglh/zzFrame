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
                                <th>协议名称<font color="red">*</font></th>
                                <td class="fd_agreementName">
                                    <c:out value="${ m.agreementName }" escapeXml="true"/>
                                </td>
                                <th>协议代码<font color="red">*</font></th>
                                <td class="fd_agreementCode">
                                    <c:out value="${ m.agreementCode }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>认购基金<font color="red">*</font></th>
                                <td class="fd_fundName">
                                    <c:out value="${ m.fundName }" escapeXml="true"/>
                                </td>
                                <th>投资人<font color="red">*</font></th>
                                <td class="fd_investorName">
                                    <c:out value="${ m.investorName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>认购金额<font color="red">*</font></th>
                                <td class="fd_amount">
                                    <c:out value="${ m.amount }" escapeXml="true"/>
                                </td>
                                <th>实际出资金额</th>
                                <td class="fd_actualAmount">
                                    <c:out value="${ m.actualAmount }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>协议简述</th>
                                <td class="fd_sketch">
                                    <c:out value="${ m.sketch }" escapeXml="true"/>
                                </td>
                                <th>部门</th>
                                <td class="fd_signDepName">
                                    <c:out value="${ m.signDepName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>机构</th>
                                <td class="fd_signOrganId">
                                    <c:out value="${ m.signOrganId }" escapeXml="true"/>
                                </td>
                                <th>签订人<font color="red">*</font></th>
                                <td class="fd_signUserName">
                                    <c:out value="${ m.signUserName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>签订日期<font color="red">*</font></th>
                                <td class="fd_signDate">
                                    <fmt:formatDate value="${ m.signDate }" pattern="yyyy-MM-dd" />
                                </td>
                                <th>附件</th>
                                <td class="fd_uploadFile_agreementFiles">

                                    <ul style="margin: 0 0 10px 0">
                                        <c:forEach var="item" items="${m.agreementFilesList}">
                                            <li>
                                                <a href="<c:if test="${item.fileEngine == '1'}">javascript:viewFile('${item.id}');</c:if><c:if test="${item.fileEngine != '1'}">${item.accessUrl}</c:if>" class="file-text" title="${item.showName}" style="float:left;">
                                                <span style="float:left;">${ item.showName }</span>
                                                <span style="float:right;" class="fileSize" fileSize="${item.fileSize}">(${item.fileSize})</span>
                                                </a>

                                                <a href="javascript:downloadFile('${item.id}');" class="file-operate" style="float:right;"><i class="fa fa-download"></i></a>

                                                <div style="clear: both;"></div>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </td>
                            </tr>

                            <tr>
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
                                        <c:if test="${ fn:indexOf(allQueryString,'&fundId=') >= 0 }">
                                            <input type="text" class="form-control input-sm" name="fundName"  id="fundName" value="${ m.fundName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&fundId=') <0  }">
                                            <c:if test="${ m.fundId != null}">
                                                <input type="hidden" name="fundId" id="fundId" value="${ m.fundId }">
                                                <input type="text" name="fundName" id="fundName" value="${ m.fundName }" required="required" class="form-control input-sm " readonly="readonly">
                                            </c:if>
                                            <c:if test="${ m.fundId == null}">
                                                <div class="input-group">
                                                    <input type="hidden" name="fundId" id="fundId" value="${ m.fundId }">
                                                    <input type="text" name="fundName" id="fundName" value="${ m.fundName }" required="required" class="form-control input-sm fundName " placeholder="请选择认购基金" style="cursor: pointer;" readonly="readonly">
                                                    <div class="input-group-btn" >
                                                        <button type="button"
                                                                class="btn btn-primary btn-sm fundName">
                                                            &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                        </button>
                                                        <button type="button" id="clearFundId"
                                                                class="btn btn-primary btn-sm">
                                                            &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                        </button>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:if>
                                </td>
                                <th>投资人<font color="red">*</font></th>
                                <td>
                                            <c:if test="${ fn:indexOf(allQueryString,'&investorId=') >= 0 }">
                                                <input type="text" class="form-control input-sm" name="investorName" id="investorName" value="${ m.investorName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&investorId=') < 0 }">

                                                <c:if test="${ m.investorId != null}">
                                                    <input type="hidden" name="investorId" id="investorId" value="${ m.investorId }">
                                                    <input type="text" name="investorName" id="investorName" value="${ m.investorName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.investorId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="investorId" id="investorId" value="${ m.investorId }" >
                                                        <input type="text" name="investorName" id="investorName" value="${ m.investorName }" required="required" class="form-control input-sm investorName " placeholder="请选择投资人" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn" >
                                                            <button type="button"  class="btn btn-primary btn-sm investorName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearInvestorId"   class="btn btn-primary btn-sm">
                                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                            </button>
                                                        </div>
                                                    </div>
                                                </c:if>
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
                                                      name="sketch" id="sketch"  placeholder="请输入协议简述，500字以内" maxlength="500" rows="5"><c:out value="${ m.sketch }" escapeXml="true"/></textarea>
                                        </div>
                                </td>
                                <th>部门</th>
                                <td>
                                            <c:if test="${ fn:indexOf(allQueryString,'&signDepId=') >= 0 }">
                                                <input type="text" class="form-control input-sm" name="signDepName" id="signDepName" value="${ m.signDepName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&signDepId=') < 0 }">

                                                <c:if test="${ m.signDepId != null}">
                                                    <input type="hidden" name="signDepId" id="signDepId" value="${ m.signDepId }">
                                                    <input type="text" name="signDepName" id="signDepName" value="${ m.signDepName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.signDepId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="signDepId" id="signDepId" value="${ m.signDepId }" >
                                                        <input type="text" name="signDepName" id="signDepName" value="${ m.signDepName }"  class="form-control input-sm signDepName " placeholder="请选择部门" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn" >
                                                            <button type="button"  class="btn btn-primary btn-sm signDepName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearSignDepId"   class="btn btn-primary btn-sm">
                                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                            </button>
                                                        </div>
                                                    </div>
                                                </c:if>
                                            </c:if>
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
                                            <c:if test="${ fn:indexOf(allQueryString,'&signUserId=') >= 0 }">
                                                <input type="text" class="form-control input-sm" name="signUserName" id="signUserName" value="${ m.signUserName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&signUserId=') < 0 }">

                                                <c:if test="${ m.signUserId != null}">
                                                    <input type="hidden" name="signUserId" id="signUserId" value="${ m.signUserId }">
                                                    <input type="text" name="signUserName" id="signUserName" value="${ m.signUserName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.signUserId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="signUserId" id="signUserId" value="${ m.signUserId }" >
                                                        <input type="text" name="signUserName" id="signUserName" value="${ m.signUserName }" required="required" class="form-control input-sm signUserName " placeholder="请选择签订人" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn" >
                                                            <button type="button"  class="btn btn-primary btn-sm signUserName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearSignUserId"   class="btn btn-primary btn-sm">
                                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                            </button>
                                                        </div>
                                                    </div>
                                                </c:if>
                                            </c:if>
                                </td>
                            </tr>

                            <tr>
                                <th>签订日期<font color="red">*</font></th>
                                <td>

                                            <input type="text" required="required" class="form-control input-sm Wdate required"
                                                   placeholder="请输入签订日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'signDate'})"
                                                   value='<fmt:formatDate value="${ m.signDate }" pattern="yyyy-MM-dd" />' id="signDate" name="signDate" readonly   />

                                </td>
                                <th>附件</th>
                                <td>
                                        <div class="" style="margin-bottom: 0px">
                                            <div class="info-detail">
                                                <input type="hidden" id="agreementFiles" name="agreementFiles" value="${ m.agreementFiles}">
                                                <div class="uploader-list">
                                                    <ul id="thelist_agreementFiles" class="file-list" style="margin: 0 0 10px 0" ></ul>
                                                </div>
                                                <div id="thelist_agreementFiles_items" style="display: none;">
                                                    <c:forEach var="item" items="${ m.agreementFilesList}">
                                                        <span id="${ item.id}" fileUseId="${ item.id}" accessUrl="${ item.accessUrl}" fileEngine="${ item.fileEngine}" fileSize="${ item.fileSize}" showName="${ item.showName}" businessId="${ item.businessId}"   />
                                                    </c:forEach>
                                                </div>

                                                <div class="btns">
                                                    <div id="uploadFile_agreementFiles" title='附件' class="webuploader-container" style="width: 80px" data-options="viewAreaId:'#thelist_agreementFiles',  businessFileType:'agreementFiles'  ,businessTempId: '${ m.agreementFiles}' ">
                                                        <i class="fa fa-upload"></i>
                                                        <span>上传附件</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>


                                </td>
                            </tr>

                            <tr>
                                <th>备注</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="remark" id="remark"  placeholder="请输入备注，500字以内" maxlength="500" rows="5"><c:out value="${ m.remark }" escapeXml="true"/></textarea>
                                        </div>
                                </td>
                            </tr>

                        </tbody>
                    </table>













                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="fundmanage.investoragreement:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="fundmanage.investoragreement:update">
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


<script src="${ staticUrl }/statics2/business-js/fundmanage/fund/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/fundmanage/investor/search.js"></script>



<script language="JavaScript">
    $(function() {


        //选择认购基金
        $(".fundName").OpenFundmanageFundSelectWin({
            title: "认购基金",
            selectType: "d1",
            callId: "fundId",
            callName: "fundName",
            clearId: "clearFundId"
        });

        //选择投资人
        $(".investorName").OpenFundmanageInvestorSelectWin({
            title: "投资人",
            selectType: "d1",
            callId: "investorId",
            callName: "investorName",
            clearId: "clearInvestorId"
        });

        //选择部门
        $(".signDepName").OpenSystemDepSelectWin({
            title: "部门",
            selectType: "t1",
            callId: "signDepId",
            callName: "signDepName",
            clearId: "clearSignDepId"
        });

        //选择签订人
        $(".signUserName").OpenSystemUserSelectWin({
            title: "签订人",
            selectType: "d1",
            callId: "signUserId",
            callName: "signUserName",
            clearId: "clearSignUserId"
        });






    });


    var tableId , tableJavaName;












</script>


<bms:contentFooter />