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
                                <th>投资人名称<font color="red">*</font></th>
                                <td class="fd_investorName">
                                    <c:out value="${ m.investorName }" escapeXml="true"/>
                                </td>
                                <th>投资人代码<font color="red">*</font></th>
                                <td class="fd_investorCode">
                                    <c:out value="${ m.investorCode }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>投资人类型<font color="red">*</font></th>
                                <td class="fd_investorTypeName">
                                    ${ m.investorTypeName }
                                </td>
                                <th>投资经理<font color="red">*</font></th>
                                <td class="fd_manageUserName">
                                    <c:out value="${ m.manageUserName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>证件类型</th>
                                <td class="fd_cardTypeName">
                                    ${ m.cardTypeName }
                                </td>
                                <th>证件号码</th>
                                <td class="fd_cardNo">
                                    <c:out value="${ m.cardNo }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td class="fd_uploadFile_investorFiles">

                                    <ul style="margin: 0 0 10px 0">
                                        <c:forEach var="item" items="${m.investorFilesList}">
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
                                                <input type="text" class="form-control input-sm" name="manageUserName" id="manageUserName" value="${ m.manageUserName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&manageUserId=') < 0 }">

                                                <c:if test="${ m.manageUserId != null}">
                                                    <input type="hidden" name="manageUserId" id="manageUserId" value="${ m.manageUserId }">
                                                    <input type="text" name="manageUserName" id="manageUserName" value="${ m.manageUserName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.manageUserId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="manageUserId" id="manageUserId" value="${ m.manageUserId }" >
                                                        <input type="text" name="manageUserName" id="manageUserName" value="${ m.manageUserName }" required="required" class="form-control input-sm manageUserName " placeholder="请选择投资经理" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn" >
                                                            <button type="button"  class="btn btn-primary btn-sm manageUserName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearManageUserId"   class="btn btn-primary btn-sm">
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
                                        <div class="" style="margin-bottom: 0px">
                                            <div class="info-detail">
                                                <input type="hidden" id="investorFiles" name="investorFiles" value="${ m.investorFiles}">
                                                <div class="uploader-list">
                                                    <ul id="thelist_investorFiles" class="file-list" style="margin: 0 0 10px 0" ></ul>
                                                </div>
                                                <div id="thelist_investorFiles_items" style="display: none;">
                                                    <c:forEach var="item" items="${ m.investorFilesList}">
                                                        <span id="${ item.id}" fileUseId="${ item.id}" accessUrl="${ item.accessUrl}" fileEngine="${ item.fileEngine}" fileSize="${ item.fileSize}" showName="${ item.showName}" businessId="${ item.businessId}"   />
                                                    </c:forEach>
                                                </div>

                                                <div class="btns">
                                                    <div id="uploadFile_investorFiles" title='附件' class="webuploader-container" style="width: 80px" data-options="viewAreaId:'#thelist_investorFiles',  businessFileType:'investorFiles'  ,businessTempId: '${ m.investorFiles}' ">
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

                <shiro:hasPermission name="fundmanage.investor:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="fundmanage.investor:update">
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