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
                                    <th>模块</th>
                                    <td class="fd_notifyModule">
                                        <c:out value="${ m.notifyModule }" escapeXml="true"/>
                                    </td>
                                    <th>通知标题</th>
                                    <td class="fd_notifyModule">
                                        <c:out value="${ m.title }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>通知内容<font color="red">*</font></th>
                                    <td class="fd_content">
                                        <c:out value="${ m.content }" escapeXml="true"/>
                                    </td>
                                    <th>通知时间<font color="red">*</font></th>
                                    <td class="fd_content">
                                        <fmt:formatDate value="${ m.notifyTime }" pattern="yyyy-MM-dd  HH:mm:ss" />
                                    </td>
                                </tr>

                                <tr>
                                    <th>通知文件</th>
                                    <td class="fd_notifyFiles">
                                        <c:out value="${ m.notifyFiles }" escapeXml="true"/>
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
                                <th>模块</th>
                                <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入模块" autocomplete="off"
                                               value="${ m.notifyModule }" id="notifyModule" name="notifyModule"
                                                   maxlength="100"  />
                                </td>
                                <th>通知标题</th>
                                <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入通知标题" autocomplete="off"
                                               value="${ m.title }" id="title" name="title"
                                                   maxlength="100"  />
                                </td>
                            </tr>

                            <tr>
                                <th>通知内容<font color="red">*</font></th>
                                <td>
                                        <div class="info-detail">
                                            <textarea required="required" class="form-control input-sm required "
                                                      name="content " placeholder="请输入通知内容，65535字以内" maxlength="65535" rows="6"><c:out value="${ m.content $}" escapeXml="true"/></textarea>
                                        </div>
                                </td>
                                <th>通知时间<font color="red">*</font></th>
                                <td>
                                        <div class="input-group">
                                            <input type="text" required="required" class="form-control input-sm Wdate required "
                                                   placeholder="请输入通知时间" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'notifyTime'})"
                                                           value="${ m.notifyTime }" id="notifyTime" name="notifyTime" readonly   />

                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>通知文件</th>
                                <td>
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