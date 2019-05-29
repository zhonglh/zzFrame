<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />




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
                                <th>访问路径前缀</th>
                                <td class="fd_accessUrlPrefix">
                                    <c:out value="${ m.accessUrlPrefix }" escapeXml="true"/>
                                </td>
                                <th>访问路径<font color="red">*</font></th>
                                <td class="fd_accessUrlPrefix">
                                    <c:out value="${ m.accessUrl }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>文件所在主机</th>
                                <td class="fd_fileHost">
                                    <c:out value="${ m.fileHost }" escapeXml="true"/>
                                </td>
                                <th>FILE_BASE_PATH</th>
                                <td class="fd_fileHost">
                                    <c:out value="${ m.fileBasePath }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>文件路径</th>
                                <td class="fd_filePath">
                                    <c:out value="${ m.filePath }" escapeXml="true"/>
                                </td>
                                <th>文件名<font color="red">*</font></th>
                                <td class="fd_filePath">
                                    <c:out value="${ m.fileName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>文件大小<font color="red">*</font></th>
                                <td class="fd_fileSize">
                                    <c:out value="${ m.fileSize }" escapeXml="true"/>
                                </td>
                                <th>文件后缀</th>
                                <td class="fd_fileSize">
                                    <c:out value="${ m.fileSuffix }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>文件引擎<font color="red">*</font></th>
                                <td class="fd_fileEngineName">
                                    ${ m.fileEngineName }
                                </td>
                                <th>MD5码</th>
                                <td class="fd_fileEngineName">
                                    <c:out value="${ m.md5 }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>文件类型</th>
                                <td class="fd_contentType">
                                    <c:out value="${ m.contentType }" escapeXml="true"/>
                                </td>
                                <th>使用次数</th>
                                <td class="fd_contentType">
                                    <c:out value="${ m.useFrequency }" escapeXml="true"/>
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
                                    <th>访问路径前缀</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入访问路径前缀" autocomplete="off"
                                                   value="${ m.accessUrlPrefix }" id="accessUrlPrefix" name="accessUrlPrefix"
                                                       maxlength="50"  />
                                    </td>
                                    <th>访问路径<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入访问路径" autocomplete="off"
                                                   value="${ m.accessUrl }" id="accessUrl" name="accessUrl"
                                                       maxlength="200"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>文件所在主机</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入文件所在主机" autocomplete="off"
                                                   value="${ m.fileHost }" id="fileHost" name="fileHost"
                                                       maxlength="27"  />
                                    </td>
                                    <th>FILE_BASE_PATH</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入FILE_BASE_PATH" autocomplete="off"
                                                   value="${ m.fileBasePath }" id="fileBasePath" name="fileBasePath"
                                                       maxlength="100"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>文件路径</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入文件路径" autocomplete="off"
                                                   value="${ m.filePath }" id="filePath" name="filePath"
                                                       maxlength="200"  />
                                    </td>
                                    <th>文件名<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入文件名" autocomplete="off"
                                                   value="${ m.fileName }" id="fileName" name="fileName"
                                                       maxlength="100"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>文件大小<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入文件大小" autocomplete="off"
                                                   value="${ m.fileSize }" id="fileSize" name="fileSize"
                                                       maxlength="19"  />
                                    </td>
                                    <th>文件后缀</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入文件后缀" autocomplete="off"
                                                   value="${ m.fileSuffix }" id="fileSuffix" name="fileSuffix"
                                                       maxlength="30"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>文件引擎<font color="red">*</font></th>
                                    <td>
                                            <select id="fileEngine"  name="fileEngine" required="required" style="width:98%">
                                                <option value="" ></option>
                                                <c:forEach items="${ file_engine_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fileEngine }">selected</c:if>>${ dict.dictName}  }</option>
                                                </c:forEach>
                                            </select>
                                    </td>
                                    <th>MD5码</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入MD5码" autocomplete="off"
                                                   value="${ m.md5 }" id="md5" name="md5"
                                                       maxlength="128"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>文件类型</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入文件类型" autocomplete="off"
                                                   value="${ m.contentType }" id="contentType" name="contentType"
                                                       maxlength="60"  />
                                    </td>
                                    <th>使用次数</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入使用次数" autocomplete="off"
                                                   value="${ m.useFrequency }" id="useFrequency" name="useFrequency"
                                                       maxlength="10"  />
                                    </td>
                                </tr>

                        </tbody>
                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="system.user:update">
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
    var inAllPage = "${inAllPage}";
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


<script language="JavaScript">

    $(function() {
    });

</script>

<bms:contentFooter />