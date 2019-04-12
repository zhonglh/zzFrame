<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />

<div region='north'>
    <div class="navigation">
        <span class="words"><a>${ breadcrumb }</a></span>
    </div>
    
    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >

        </form>

        <div class="btn-bar" style="margin-left: -10px;">
        </div>
    </div>
</div>

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-${ tableId }' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>
            <th field='tenantName' align="left" width="1" sortable='false' formatter='titleFmt' >企业名称</th>
            <th field='tenantCode' align="left" width="1" sortable='false'  >企业编号</th>
            <th field='tenantAddr' align="left" width="1" sortable='false'  >企业地址</th>
            <th field='linkTel' align="left" width="1" sortable='false'  >联系电话</th>
            <th field='leadUserName' align="left" width="1" sortable='false'  >法人姓名</th>
            <th field='website' align="left" width="1" sortable='false'  >官网</th>
        </tr>
        </thead>
    </table>
</div>


<script>
    var tableid = "tableData-${ tableId }";
    var queryString = "${ queryString }";
    var listUrl = "";
</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/listCommon.js"></script>
<script src="${ staticUrl }/statics2/js/project/list.js"></script>

<shiro:hasPermission name="system.tenant:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>


<script language="JavaScript">


    $(function() {


    });



</script>

<bms:contentFooter />

