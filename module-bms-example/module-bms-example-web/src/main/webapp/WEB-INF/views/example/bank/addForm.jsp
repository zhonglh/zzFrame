<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />


<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form id="editForm" action="" method="post">

                    <div class="block-tit">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                        </svg>基本信息
                    </div>

                    <table class="info-table">
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
                <shiro:hasPermission name="example.bank:add">
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
    var inAllPage = "${ inAllPage }";
</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/form.js"></script>

<script language="JavaScript">
    $(function() {

    });

</script>

<bms:contentFooter />