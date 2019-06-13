<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />



<div region='north'>
    <c:if test="${breadcrumb != ''}"><div class="navigation"><span class="words"><a>${ breadcrumb }</a></span></div></c:if>
    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >


        </form>




        <div class="btn-bar" style="margin-left: -10px;">



                <shiro:hasPermission name="system.organ:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                        <i class="fa fa-plus"></i>
                        <span>新增 </span>
                    </button>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.organ:delete">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                        <i class="fa fa-trash"></i>
                        <span>删除 </span>
                    </button>
                </shiro:hasPermission>







                <shiro:hasPermission name="system.organ:importExcel">
                    <div type="button" id="importExcel" class="btn btn-primary btn-sm" >
                        <i class="fa fa-upload"></i>
                        <span>导入</span>
                    </div>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.organ:exportExcel">
                <div class="btn-group">
                    <button type="button" id="exportExcel" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-download"></i>
                        导出 <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/csv/export" class="export" >
                                <i class="fa fa-download"></i>导出CSV
                            </a>
                        </li>
                        <li>
                            <a href="${ ctx }/${ currParentUrl }/hssf/export" class="export" >
                                <i class="fa fa-download"></i>导出Excel2003
                            </a>
                        </li>

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/sxssf/export" class="export" >
                                <i class="fa fa-download"></i>导出Excel2007
                            </a>
                        </li>
                    </ul>
                </div>
                </shiro:hasPermission>



        </div>



    </div>

</div>

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-${ tableId }' class='easyui-treegrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field='organName' align="left" width="5" sortable='false' formatter='titleFmt' >机构名称</th>
            <th field='organCode' align="left" width="2" sortable='false'  >机构代码</th>
            <th field='organTypeName' align="left" width="1" sortable='false'  >机构类型</th>
            <th field='organAddr' align="left" width="3" sortable='false'  >机构地址</th>
            <th field='leadUserName' align="left" width="1" sortable='false'  >负责人</th>



        </tr>
        </thead>
    </table>
</div>




<script>
    var tableid = "tableData-${ tableId }";
    var tree_field = "organName";
    var id_field = "id";

    var inAllPage = "${inAllPage}";
    var queryString = "${ queryString }";
    var treeUrl = "";

</script>



<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/listCommon.js"></script>
<script src="${ staticUrl }/statics2/js/project/tree.js"></script>

<shiro:hasPermission name="system.organ:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>



<script language="JavaScript">




</script>

<bms:contentFooter />

