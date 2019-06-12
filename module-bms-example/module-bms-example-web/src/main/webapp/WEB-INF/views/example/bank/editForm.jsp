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
                                <th>银行全称<font color="red">*</font></th>
                                <td class="fd_bankName">
                                    <c:out value="${ m.bankName }" escapeXml="true"/>
                                </td>
                                <th>银行简称<font color="red">*</font></th>
                                <td class="fd_bankShortName">
                                    <c:out value="${ m.bankShortName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>服务电话</th>
                                <td class="fd_serviceTelephone">
                                    <c:out value="${ m.serviceTelephone }" escapeXml="true"/>
                                </td>
                                <th>官网</th>
                                <td class="fd_officialWebsite">
                                    <c:out value="${ m.officialWebsite }" escapeXml="true"/>
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
                                <th>银行全称<font color="red">*</font></th>
                                <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入银行全称" autocomplete="off"
                                               value="${ m.bankName }" id="bankName" name="bankName"
                                                   maxlength="200"  />
                                </td>
                                <th>银行简称<font color="red">*</font></th>
                                <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入银行简称" autocomplete="off"
                                               value="${ m.bankShortName }" id="bankShortName" name="bankShortName"
                                                   maxlength="20"  />
                                </td>
                            </tr>

                            <tr>
                                <th>服务电话</th>
                                <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入服务电话" autocomplete="off"
                                               value="${ m.serviceTelephone }" id="serviceTelephone" name="serviceTelephone"
                                                   maxlength="20"  />
                                </td>
                                <th>官网</th>
                                <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入官网" autocomplete="off"
                                               value="${ m.officialWebsite }" id="officialWebsite" name="officialWebsite"
                                                   maxlength="200"  />
                                </td>
                            </tr>

                        </tbody>
                    </table>













                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="example.bank:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="example.bank:update">
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





<script language="JavaScript">
    $(function() {







    });


    var tableId , tableJavaName;












</script>


<bms:contentFooter />