<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />

<div region='north'>

    <c:if test="${inAllPage == null || inAllPage != '1'}">
    <div class="navigation">
        <span class="words"><a>${ breadcrumb }</a></span>
    </div>
    </c:if>
    
    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >

        </form>

        <div class="btn-bar" style="margin-left: -10px;">

            <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                <i class="fa fa-plus"></i>
                <span>新增 </span>
            </button>

            <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                <i class="fa fa-trash"></i>
                <span>删除 </span>
            </button>
        </div>
    </div>
</div>



<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-${ tableId }' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>
            <c:if test="${ fn:indexOf(allQueryString,'&userId=')<0 }">
            <th field='userName' align="left" width="1" sortable='false' formatter='titleFmt' >用户名</th>
            <th field='userPhone' align="left" width="1" sortable='false' >手机号</th>
            <th field='userEmail' align="left" width="1" sortable='false' >邮箱</th>
            </c:if>

            <c:if test="${ fn:indexOf(allQueryString,'&roleId=')<0  }">
            <th field='roleName' align="left" width="1" sortable='false'  formatter='titleFmt'>角色名</th>
            <th field='roleCode' align="left" width="1" sortable='false'  >角色编码</th>
            </c:if>
        </tr>
        </thead>
    </table>
</div>

<script>
    var tableid = "tableData-${ tableId }";

    var inAllPage = "${inAllPage}";
    var queryString = "${ queryString }";
    var listUrl = "";


</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/listCommon.js"></script>
<script src="${ staticUrl }/statics2/js/project/list.js"></script>

<shiro:hasPermission name="system.userrole:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/role/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>

<script language="JavaScript">


    $(function() {


    });





</script>

<bms:contentFooter />

