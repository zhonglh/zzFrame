<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader  />

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-excel' class='easyui-datagrid' method='post' fit='false' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>

            <th field='errorInfo' align="left" width="2" sortable='false'  >错误信息</th>
            <c:forEach items="${ columns}" var="column">
                <th field='${ column.code}' align="left" width="1" sortable='false'  >${ column.name}</th>
            </c:forEach>
        </tr>
        </thead>
    </table>
</div>

<script>
    var tableid = "tableData-excel";
</script>

<bms:contentJS />


<script language="JavaScript">


    $(function() {
        initPage();
    });

    /**
     * 初始化 easyUI 列表
     */
    function initPage() {

        //加载table列表数据
        var initUrl =  ctx+dataUrl+"/excelList";
        var ajaxUrl = initUrl;
        $('#'+tableid).datagrid({
            height:400,
            url: ajaxUrl,
            emptyMsg: '<img style="margin-top:50px;" src="'+staticUrl+'/statics2/image/empty.png">'
        });
    }



</script>

<bms:contentFooter />
