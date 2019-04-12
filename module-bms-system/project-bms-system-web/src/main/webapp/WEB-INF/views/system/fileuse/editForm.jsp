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


                <div id="detailForm" class="detailForm">
                    <table class="info-table">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                                <tr>
                                    <th>文件<font color="red">*</font></th>
                                    <td class="fd_fileName">
                                        <c:out value="${ m.fileName }" escapeXml="true"/>
                                    </td>
                                    <th>显示名称<font color="red">*</font></th>
                                    <td class="fd_showName">
                                        <c:out value="${ m.showName }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>业务类型<font color="red">*</font></th>
                                    <td class="fd_businessType">
                                        <c:out value="${ m.businessType }" escapeXml="true"/>
                                    </td>
                                    <th>业务ID</th>
                                    <td class="fd_businessId">
                                        <c:out value="${ m.businessId }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>业务文件类型<font color="red">*</font></th>
                                    <td class="fd_businessFileType">
                                        <c:out value="${ m.businessFileType }" escapeXml="true"/>
                                    </td>
                                    <th>业务临时ID<font color="red">*</font></th>
                                    <td class="fd_businessTempId">
                                        <c:out value="${ m.businessTempId }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>顺序<font color="red">*</font></th>
                                    <td class="fd_fileOrder">
                                        <c:out value="${ m.fileOrder }" escapeXml="true"/>
                                    </td>
                                    <th>备注</th>
                                    <td class="fd_remark">
                                        <c:out value="${ m.remark }" escapeXml="true"/>
                                    </td>
                                </tr>

                        </tbody>
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
                                    <th>文件<font color="red">*</font></th>
                                    <td>
                                        <div class="input-group">
                                            <c:if test="${ fn.indexOf(queryString,'fileId') }">
                                                <input type="text" class="form-control input-sm" name="fileName" id="fileName" value="${ m.fileName }" readonly>
                                            </c:if>
                                            <c:if test="${ !fn.indexOf(queryString,'fileId') }">
                                            <input type="hidden" name="fileId" id="fileId" value="${ m.fileId }">
                                            <input type="text" name="fileName" id="fileName" value="${ m.fileName }" required="required" class="form-control input-sm fileName " placeholder="请选择文件" style="cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"
                                                        class="btn btn-primary btn-sm fileName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearFileId"
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
                                    <th>显示名称<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入显示名称" autocomplete="off"
                                                   value="${ m.showName }" id="showName" name="showName"
                                                       maxlength="256"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>业务类型<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入业务类型" autocomplete="off"
                                                   value="${ m.businessType }" id="businessType" name="businessType"
                                                       maxlength="100"  />
                                    </td>
                                    <th>业务ID</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入业务ID" autocomplete="off"
                                                   value="${ m.businessId }" id="businessId" name="businessId"
                                                       maxlength="32"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>业务文件类型<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入业务文件类型" autocomplete="off"
                                                   value="${ m.businessFileType }" id="businessFileType" name="businessFileType"
                                                       maxlength="100"  />
                                    </td>
                                    <th>业务临时ID<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入业务临时ID" autocomplete="off"
                                                   value="${ m.businessTempId }" id="businessTempId" name="businessTempId"
                                                       maxlength="32"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>顺序<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入顺序" autocomplete="off"
                                                   value="${ m.fileOrder }" id="fileOrder" name="fileOrder"
                                                       maxlength="10"  />
                                    </td>
                                    <th>备注</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入备注" autocomplete="off"
                                                   value="${ m.remark }" id="remark" name="remark"
                                                       maxlength="200"  />
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
<script src="${ staticUrl }/statics2/business-js/system/file/search.js"></script>


<script language="JavaScript">

    $(function() {
        //选择文件
        $(".fileName").OpenSystemFileSelectWin({
            title: "文件",
            selectType: "d1",
            callId: "fileId",
            callName: "fileName",
            clearId: "clearFileId"
        });
    });

</script>

<bms:contentFooter />