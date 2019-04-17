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


                <div id="detailInfo" class="detailInfo">
                    <table class="info-table">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                                <tr>
                                    <th>企业名称<font color="red">*</font></th>
                                    <td class="fd_tenantName">
                                        <c:out value="${ m.tenantName }" escapeXml="true"/>
                                    </td>
                                    <th>企业编号<font color="red">*</font></th>
                                    <td class="fd_tenantCode">
                                        <c:out value="${ m.tenantCode }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>企业地址</th>
                                    <td class="fd_tenantAddr">
                                        <c:out value="${ m.tenantAddr }" escapeXml="true"/>
                                    </td>
                                    <th>联系电话</th>
                                    <td class="fd_linkTel">
                                        <c:out value="${ m.linkTel }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>法人姓名</th>
                                    <td class="fd_leadUserName">
                                        <c:out value="${ m.leadUserName }" escapeXml="true"/>
                                    </td>
                                    <th>LOGO</th>
                                    <td class="fd_logoFile">
                                        <c:out value="${ m.logoFile }" escapeXml="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th>官网</th>
                                    <td class="fd_website">
                                        <c:out value="${ m.website }" escapeXml="true"/>
                                    </td>
                                    <th>说明</th>
                                    <td class="fd_remark">
                                        <c:out value="${ m.remark }" escapeXml="true"/>
                                    </td>
                                </tr>

                        </tbody>
                    </table>
                </div>


                <form action="" method="post" class="form-auto-fill hide editForm" id="editForm" viewId="detailInfo" formId="editForm">
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
                                    <th>企业名称<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入企业名称" autocomplete="off"
                                                   value="${ m.tenantName }" id="tenantName" name="tenantName"
                                                       maxlength="150"  />
                                    </td>
                                    <th>企业编号<font color="red">*</font></th>
                                    <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入企业编号" autocomplete="off"
                                                   value="${ m.tenantCode }" id="tenantCode" name="tenantCode"
                                                       maxlength="4"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>企业地址</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入企业地址" autocomplete="off"
                                                   value="${ m.tenantAddr }" id="tenantAddr" name="tenantAddr"
                                                       maxlength="200"  />
                                    </td>
                                    <th>联系电话</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入联系电话" autocomplete="off"
                                                   value="${ m.linkTel }" id="linkTel" name="linkTel"
                                                       maxlength="20"  />
                                    </td>
                                </tr>

                                <tr>
                                    <th>法人姓名</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入法人姓名" autocomplete="off"
                                                   value="${ m.leadUserName }" id="leadUserName" name="leadUserName"
                                                       maxlength="50"  />
                                    </td>
                                    <th>LOGO</th>
                                    <td>
                                    </td>
                                </tr>

                                <tr>
                                    <th>官网</th>
                                    <td>
                                            <input type="text"  class="form-control input-sm "
                                                   placeholder="请输入官网" autocomplete="off"
                                                   value="${ m.website }" id="website" name="website"
                                                       maxlength="200"  />
                                    </td>
                                    <th>说明</th>
                                    <td>
                                            <div class="info-detail">
                                                <textarea  class="form-control input-sm  "
                                                  name="remark" placeholder="请输入说明，2000字以内" maxlength="2000" rows="4">${ m.remark }</textarea>
                                            </div>
                                    </td>
                                </tr>

                        </tbody>
                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

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
    var inAllPage = "${inAllPage}";
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


<script language="JavaScript">

    $(function() {
    });

</script>

<bms:contentFooter />