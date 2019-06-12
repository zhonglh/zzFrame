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
                                <th>机构名称<font color="red">*</font></th>
                                <td class="fd_organName">
                                    <c:out value="${ m.organName }" escapeXml="true"/>
                                </td>
                                <th>机构代码<font color="red">*</font></th>
                                <td class="fd_organCode">
                                    <c:out value="${ m.organCode }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>机构类型</th>
                                <td class="fd_organTypeName">
                                    ${ m.organTypeName }
                                </td>

                                <th>负责人</th>
                                <td class="fd_leadUserName">
                                    <c:out value="${ m.leadUserName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>

                                <th>机构地址</th>
                                <td class="fd_organAddr" >
                                    <c:out value="${ m.organAddr }" escapeXml="true"/>
                                </td>

                                <th>上级机构</th>
                                <td class="fd_pname" >
                                    <c:out value="${ m.pname }" escapeXml="true"/>
                                </td>

                            </tr>

                            <tr>
                                <th>备注</th>
                                <td class="fd_remark" colspan="3">
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
                                <th>机构名称<font color="red">*</font></th>
                                <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入机构名称" autocomplete="off"
                                               value="${ m.organName }" id="organName" name="organName"
                                                   maxlength="100"  />
                                </td>
                                <th>机构代码<font color="red">*</font></th>
                                <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入机构代码" autocomplete="off"
                                               value="${ m.organCode }" id="organCode" name="organCode"
                                                   maxlength="20"  />
                                </td>
                            </tr>

                            <tr>
                                <th>机构类型</th>
                                <td>
                                        <select id="organType"  name="organType"  style="width:98%">
                                            <option value="" ></option>
                                            <c:forEach items="${ organ_type_dicts }" var="dict">
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.organType }">selected</c:if>>${ dict.dictName  }</option>
                                            </c:forEach>
                                        </select>
                                </td>


                                <th>负责人</th>
                                <td >
                                    <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')>=0 }">
                                        <input type="text" class="form-control input-sm" name="leadUserName" value="${ m.leadUserName }" readonly>
                                    </c:if>
                                    <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')<0 }">
                                    <div class="input-group">
                                        <input type="hidden" name="leadUserId" id="leadUserId" value="${ m.leadUserId }" >
                                        <input type="text" name="leadUserName" id="leadUserName" value="${ m.leadUserName }" class="form-control input-sm leadUserName " placeholder="请选择负责人" style="cursor: pointer;" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button"  class="btn btn-primary btn-sm leadUserName">
                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                            </button>
                                            <button type="button" id="clearLeadUserId"   class="btn btn-primary btn-sm">
                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                            </button>
                                        </div>
                                    </div>
                                    </c:if>
                                </td>
                            </tr>

                            <tr>
                                <th>机构地址</th>
                                <td colspan="1">
                                    <input type="text"  class="form-control input-sm "
                                           placeholder="请输入机构地址" autocomplete="off"
                                           value="${ m.organAddr }" id="organAddr" name="organAddr"
                                           maxlength="200"  />
                                </td>

                                <th>上级机构</th>
                                <td>
                                    <c:if test="${ fn:indexOf(allQueryString,'&pid=')>=0 }">
                                        <input type="text" class="form-control input-sm" name="pname" id="pname" value="${ m.pname }" readonly>
                                    </c:if>
                                    <c:if test="${ fn:indexOf(allQueryString,'&pid=')<0 }">
                                    <div class="input-group">
                                        <input type="hidden" name="pid" id="pid" value="${ m.pid }" >
                                        <input type="text" name="pname" id="pname" value="${ m.pname }"  class="form-control input-sm pname " placeholder="请选择上级机构" style="cursor: pointer;" readonly="readonly">
                                        <div class="input-group-btn">
                                            <button type="button"  class="btn btn-primary btn-sm pname">
                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                            </button>
                                            <button type="button" id="clearPid"   class="btn btn-primary btn-sm">
                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                            </button>
                                        </div>
                                    </div>
                                    </c:if>
                                </td>

                            </tr>


                            <tr>
                                <th>备注</th>
                                <td colspan="3">
                                    <div class="info-detail">
                                        <textarea  class="form-control input-sm " maxlength="200" rows="4"
                                                  id="remark" name="remark" placeholder="请输入消息内容，200字以内" ><c:out value="${m.remark}" escapeXml="true"/></textarea>
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
<script src="${ staticUrl }/statics2/business-js/system/organ/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>


<script language="JavaScript">

    $(function() {
        //选择负责人
        $(".leadUserName").OpenSystemUserSelectWin({
            title: "负责人",
            selectType: "d1",
            callId: "leadUserId",
            callName: "leadUserName",
            clearId: "clearLeadUserId"
        });

        //选择机构
        $(".pname").OpenSystemOrganSelectWin({
            title: "上级机构",
            selectType: "t1",
            callId: "pid",
            callName: "pname",
            clearId: "clearPid",
            url : $AppContext + '/system/organ/tree?id_NE='+'${m.id}'
        });


    });

</script>

<bms:contentFooter />