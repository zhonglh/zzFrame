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



                <shiro:hasPermission name="system.dict:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                        </svg>
                        <span>新增 </span>
                    </button>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.dict:delete">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use>
                        </svg>
                        <span>删除 </span>
                    </button>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.dict:detail">
                    <button type="button" class="btn btn-primary btn-sm" onclick="toDetail()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href=""></use>
                        </svg>
                        <span>查看 </span>
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

            <th field='dictTypeName' align="left" width="1" sortable='false' formatter='titleFmt' >字典类型</th>
            <th field='dictName' align="left" width="1" sortable='false'  >字典名</th>
            <th field='dictI18n' align="left" width="1" sortable='false'  >名称国际化</th>
            <th field='dictReg' align="left" width="1" sortable='false'  >字典限制正则</th>
            <th field='orderby' align="right" width="1" sortable='true'  >顺序</th>



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

<shiro:hasPermission name="system.dict:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/dicttype/search.js"></script>

<script language="JavaScript">


    $(function() {


    });





</script>

<bms:contentFooter />

