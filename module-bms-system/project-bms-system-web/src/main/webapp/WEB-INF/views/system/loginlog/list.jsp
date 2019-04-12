<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />



<div region='north'>
    <div class="navigation">


        <span class="words"><a>${ breadcrumb }</a></span>


    </div>
    <div id="content-sec" style="padding: 1px 1px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >









        </form>




        <div class="btn-bar" style="margin-left: -10px;">



                <shiro:hasPermission name="system.loginlog:delete">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use>
                        </svg>
                        <span>删除 </span>
                    </button>
                </shiro:hasPermission>






        </div>



    </div>

</div>

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-${ tableId }' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>

            <th field='operationUserName' align="left" width="1" sortable='false'  >操作人名称</th>
            <th field='operationTypeName' align="left" width="1" sortable='false' >操作类型</th>
            <th field='depName' align="left" width="1" sortable='false'  >部门</th>
            <th field='operationIp' align="left" width="1" sortable='false'  >操作人IP</th>
            <th field='operationTime' align="center" width="1" sortable='true' formatter='dateFmt' >操作时间</th>



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

<shiro:hasPermission name="system.loginlog:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>

<script language="JavaScript">


    $(function() {


            //部门
            $("#depName").OpenSystemDepSelectWin({
                title: "部门",
                selectType: "t1",
                callId: "depId",
                callName: "depName",
                clearId: "cleardepName"
            });


    });





</script>

<bms:contentFooter />

