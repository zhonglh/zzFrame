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
            <th field='fileName' align="left" width="1" sortable='false' formatter='titleFmt' >文件</th>
            <th field='showName' align="left" width="1" sortable='false' formatter='titleFmt' >显示名称</th>
            <th field='businessType' align="left" width="1" sortable='false'  >业务类型</th>
            <th field='businessId' align="left" width="1" sortable='false'  >业务ID</th>
            <th field='businessFileType' align="left" width="1" sortable='false'  >业务文件类型</th>
            <th field='businessTempId' align="left" width="1" sortable='false'  >业务临时ID</th>
            <th field='fileOrder' align="right" width="1" sortable='true'  >顺序</th>
            <th field='remark' align="left" width="1" sortable='false'  >备注</th>
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

<shiro:hasPermission name="system.fileuse:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/file/search.js"></script>

<script language="JavaScript">


    $(function() {


    });





</script>

<bms:contentFooter />

