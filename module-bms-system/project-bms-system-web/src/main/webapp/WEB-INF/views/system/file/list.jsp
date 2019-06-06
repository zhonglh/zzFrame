<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />

<div region='north'>
    <div class="navigation">
        <c:if test="${breadcrumb != ''}"><span class="words"><a>${ breadcrumb }</a></span></c:if>
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
            <th field='accessUrlPrefix' align="left" width="1" sortable='false' formatter='titleAllFmt' >访问路径前缀</th>
            <th field='accessUrl' align="left" width="1" sortable='false'  >访问路径</th>
            <th field='fileHost' align="left" width="1" sortable='false'  >文件所在主机</th>
            <th field='fileBasePath' align="left" width="1" sortable='false'  >FILE_BASE_PATH</th>
            <th field='filePath' align="left" width="1" sortable='false'  >文件路径</th>
            <th field='fileName' align="left" width="1" sortable='false' formatter='titleAllFmt' >文件名</th>
            <th field='fileSize' align="right" width="1" sortable='true'  >文件大小</th>
            <th field='fileSuffix' align="left" width="1" sortable='false'  >文件后缀</th>
            <th field='fileEngineName' align="left" width="1" sortable='false'  >文件引擎</th>
            <th field='md5' align="left" width="1" sortable='false'  >MD5码</th>
            <th field='contentType' align="left" width="1" sortable='false'  >文件类型</th>
            <th field='useFrequency' align="right" width="1" sortable='true'  >使用次数</th>
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

<shiro:hasPermission name="system.file:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>


<script language="JavaScript">


    $(function() {


    });





</script>

<bms:contentFooter />

