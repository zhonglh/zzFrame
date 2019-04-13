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


                <form id="editForm" action="" method="post">
                    <table class="info-table">
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
                                    <td>
                                        <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')>=0 }">
                                            <input type="text" class="form-control input-sm" name="leadUserName" id="leadUserName" value="${ m.leadUserName }" readonly>
                                        </c:if>
                                        <c:if test="${ fn:indexOf(allQueryString,'&leadUserId=')<0 }">
                                        <div class="input-group">
                                            <input type="hidden" name="leadUserId" id="leadUserId" value="${ m.leadUserId }" >
                                            <input type="text" name="leadUserName" id="leadUserName" value="${ m.leadUserName }" class="form-control input-sm leadUserName " placeholder="请选择负责人" style=" cursor: pointer;" readonly="readonly">
                                            <div class="input-group-btn">
                                                <button type="button"  class="btn btn-primary btn-sm leadUserName">
                                                    <svg class="icon" aria-hidden="true">
                                                        <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                             xlink:href="#icon-sousuo">
                                                        </use>
                                                    </svg>
                                                </button>
                                                <button type="button" id="clearLeadUserId"   class="btn btn-primary btn-sm">
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

                                    <th>机构地址</th>
                                    <td>
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
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearPid"   class="btn btn-primary btn-sm">
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
                                    <th>备注</th>
                                    <td colspan="3">

                                        <div class="info-detail">
                                            <textarea required="required" class="form-control input-sm required " maxlength="200" rows="6"
                                                      id="remark" name="remark" placeholder="请输入消息内容，200字以内" ><c:out value="${m.remark}" escapeXml="true"/></textarea>
                                        </div>


                                    </td>
                                </tr>
                        </tbody>
                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" id="toolBar">
                <shiro:hasPermission name="system.user:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doSave()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>
                <button type="button" class="btn  btn-warning btn-sm" onclick="closeWindow()">
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
            clearId: "clearPid"
        });
    });

</script>

<bms:contentFooter />