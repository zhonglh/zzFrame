<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz后台管理系统" />


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
                    <input type="hidden" id="id" name="id" value="${m.id}">
                    <table class="info-table">
                        <tr>
                            <th width="15%">用户名称</th>
                            <td>${m.userName}</td>

                            <th width="15%">用户登录名</th>
                            <td>${m.loginName}</td>
                        </tr>
                        <tr>
                            <th>直属领导</th>
                            <td></td>
                            <th>所在部门</th>
                            <td>${m.depName}</td>
                        </tr>

                        <tr>
                            <th width="15%">手机号</th>
                            <td>
                                ${m.phone}
                            </td>

                            <th width="15%">邮箱</th>
                            <td>
                                ${m.email}
                            </td>
                        </tr>
                        <tr>
                            <th >备注</th>
                            <td colspan="3">${m.remark}</td>
                        </tr>

                    </table>
                </form>
            </div>

        </div>
    </div>
</div>







<bms:contentFooter />

