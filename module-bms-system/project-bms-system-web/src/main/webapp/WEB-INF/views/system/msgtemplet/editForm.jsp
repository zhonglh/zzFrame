<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />




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


                        <tr>

                            <th>消息模板名称<font color="red">*</font></th>

                            <td class="fd_msgTempletName">
                                    ${ m.msgTempletName }


                            </td>

                            <th>消息模板类型<font color="red">*</font></th>

                            <td class="fd_msgTempletTypeName">
                                    ${ m.msgTempletTypeName }
                            </td>


                        </tr>




                        <tr>
                            <th>消息标题</th>

                            <td class="fd_msgTitle">
                                ${ m.msgTitle }
                            </td>

                            <th>语言</th>

                            <td class="fd_msgLanguageName">
                                    ${ m.msgLanguageName }
                            </td>

                        </tr>

                        <tr>


                            <th>消息内容<font color="red">*</font></th>

                            <td colspan="3" class="fd_msgContent">
                                <c:out value="${m.msgContent}" escapeXml="true"/>
                            </td>


                        </tr>

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

                                <th>消息模板名称<font color="red">*</font></th>

                                <td>
                                    <input type="text" required="required" class="form-control input-sm required"
                                           placeholder="请输入消息模板名称" autocomplete="off"
                                           value="${ m.msgTempletName }" id="msgTempletName" name="msgTempletName"
                                               maxlength="50"  />
                                </td>
                                <th>消息模板类型<font color="red">*</font></th>
                                <td>
                                            <select id="msgTempletType"  name="msgTempletType" required="required" style="width:98%">
                                                <option value="" ></option>
                                                <c:forEach items="${ msg_templet_type_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.msgTempletType }">selected</c:if>>${  dict.dictName }</option>
                                                </c:forEach>
                                            </select>
                                </td>
                            </tr>

                            <tr>
                                <th>消息标题</th>
                                <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入消息标题" autocomplete="off"
                                                   value="${ m.msgTitle }" id="msgTitle" name="msgTitle"
                                                       maxlength="200"  />
                                </td>

                                <th>语言</th>
                                <td>
                                            <select id="msgLanguage"  name="msgLanguage"  style="width:98%" >
                                                <option value="" ></option>
                                                <c:forEach items="${ msg_language_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.msgLanguage }">selected</c:if>>${ dict.dictName}</option>
                                                </c:forEach>
                                            </select>
                                </td>




                            </tr>



                            <tr>



                                <th>消息内容<font color="red">*</font></th>
                                <td colspan="3">
                                    <div class="info-detail">
                                            <textarea required="required" class="form-control input-sm required " maxlength="5000" rows="6"
                                                      name="msgContent" placeholder="请输入消息内容，5000字以内" ><c:out value="${m.msgContent}" escapeXml="true"/></textarea>
                                    </div>
                                </td>

                            </tr>


                        </tbody>


                    </table>
                </form>
            </div>


            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="system.user:update">
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


                <shiro:hasPermission name="system.user:update">
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

    var inAllPage = "${inAllPage}";
</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


    <script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>



<script language="JavaScript">


    $(function() {

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