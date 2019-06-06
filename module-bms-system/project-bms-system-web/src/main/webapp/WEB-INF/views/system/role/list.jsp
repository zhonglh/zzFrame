<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />



<div region='north'>
    <c:if test="${breadcrumb != ''}"><div class="navigation"><span class="words"><a>${ breadcrumb }</a></span></div></c:if>
    <div id="content-sec" style="padding: 1px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >





        </form>




        <div class="btn-bar" style="margin-left: -10px;">



                <shiro:hasPermission name="system.role:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                        <i class="fa fa-plus"></i>
                        <span>新增 </span>
                    </button>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.role:delete">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                        <i class="fa fa-trash"></i>
                        <span>删除 </span>
                    </button>
                </shiro:hasPermission>




                <shiro:hasPermission name="system.role:importExcel">
                    <div type="button" id="importExcel" class="btn btn-primary btn-sm" >
                        <i class="fa fa-upload"></i>
                        <span>导入</span>
                    </div>
                </shiro:hasPermission>


            <shiro:hasPermission name="system.role:importExcel">
                <div class="btn-group">
                    <button type="button" id="exportRemplet" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-download"></i>
                        模板下载 <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/hssf/download" class="export">
                                <svg class="icon" aria-hidden="true">
                                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-download"></use>
                                </svg>下载模板(Excel2003)
                            </a>
                        </li>

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/sxssf/download" class="export">
                                <svg class="icon" aria-hidden="true">
                                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-download"></use>
                                </svg>下载模板(Excel2007)
                            </a>
                        </li>
                    </ul>
                </div>
            </shiro:hasPermission>


                <shiro:hasPermission name="system.role:exportExcel">
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
    <table id='tableData-${ tableId }' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>

            <th field='roleName' align="left" width="2" sortable='false' formatter='titleAllFmt' >角色名称</th>
            <th field='roleCode' align="left" width="1" sortable='false'  >角色编号</th>
            <th field='roleTypeName' align="left" width="1" sortable='false'  >角色类型</th>
            <th field='depName' align="left" width="2" sortable='false'  >部门</th>
            <th field='roleStatusName' align="left" width="1" sortable='false'  >角色状态</th>
            <th field='remark' align="left" width="5" sortable='false'  >备注</th>



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

<script src="${staticUrl}/statics2/js/project/listCommon.js"></script>

<script src="${ staticUrl }/statics2/js/project/list.js"></script>

<shiro:hasPermission name="system.role:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>

<script language="JavaScript">


    $(function() {


    });





</script>

<bms:contentFooter />

