<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader  />

<div region='north'>


    <c:if test="${ inAllPage == null || inAllPage != '1' }">
    <div class="navigation">
        <span class="words"><a>${ breadcrumb }</a></span>
    </div>
    </c:if>

    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >
            <div id='toolbar' style='height: 40px;     border-bottom: 2px solid #0896ba; '>
                <div class="form-inline" role="form">

                    <div class="form-group"    style='margin-left: -15px;'  >
                        <input type="text"  class="form-control input-sm" style='width: 200px;' id="fundName_LIKE" name='fundName_LIKE'  placeholder='基金名称' onkeydown='enterKeySearch(event, search);'>
                    </div>


                    <div class="form-group"     >
                        <input type="text"  class="form-control input-sm" style='width: 200px;' id="fundCode_LIKE" name='fundCode_LIKE'  placeholder='基金代码' onkeydown='enterKeySearch(event, search);'>
                    </div>

                    <div class="form-group"     >
                        <select id="fundType" name='fundType'   class="form-control input-sm" onChange='search();'  >
                            <option value="" >基金类型</option>
                            <c:forEach items="${ fund_type_dicts }" var="dict">
                                <option value="${ dict.dictVal }">${ dict.dictName }</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group"     >
                        <select id="fundDirection" name='fundDirection'   class="form-control input-sm" onChange='search();'  >
                            <option value="" >基金投向</option>
                            <c:forEach items="${ fund_direction_dicts }" var="dict">
                                <option value="${ dict.dictVal }">${ dict.dictName }</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="input-group"    >
                        <c:if test="${ fn.indexOf(queryString,'managerUserId') }">
                            <input type="text" class="form-control input-sm" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" readonly>
                        </c:if>

                        <c:if test="${ !fn.indexOf(queryString,'managerUserId') }">
                            <input type="hidden" name="managerUserId" id="managerUserId">
                            <input type="text" name="managerUserName" id="managerUserName" class="form-control input-sm managerUserName" placeholder="基金经理" style="width: 150px; cursor: pointer;" readonly="readonly">

                            <div class="input-group-btn">
                                <button type="button" class="btn btn-primary btn-sm managerUserName">
                                    <i class="fa fa-search-plus"></i>
                                </button>
                                <button type="button" id="clearmanagerUserName" class="btn btn-primary btn-sm">
                                    <i class="fa fa-close"></i>
                                </button>
                            </div>
                        </c:if>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-success btn-sm" onclick='search();'><i class="fa fa-search"></i>&nbsp;查询</button>
                    </div>
                </div>
            </div>


        </form>

        <div class="btn-bar" style="margin-left: -10px;">
                <shiro:hasPermission name="example.fund:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                       <i class="fa fa-plus"></i>
                        <span>新增 </span>
                    </button>
                </shiro:hasPermission>
                <shiro:hasPermission name="example.fund:delete">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                        <i class="fa fa-trash"></i>
                        <span>删除 </span>
                    </button>
                </shiro:hasPermission>


                <shiro:hasPermission name="example.fund:importExcel">
                    <div type="button" id="importExcel" class="btn btn-primary btn-sm" >
                        <i class="fa fa-upload"></i>
                        <span>导入</span>
                    </div>
                </shiro:hasPermission>

                <div class="btn-group">
                    <button type="button" id="exportTemplet" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-download"></i>
                        模板 <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/hssf/download" class="export">
                                <i class="fa fa-download"></i>下载模板(Excel2003)
                            </a>
                        </li>

                        <li>
                            <a href="${ ctx }/${ currParentUrl }/sxssf/download" class="export">
                                <i class="fa fa-download"></i>下载模板(Excel2007)
                            </a>
                        </li>
                    </ul>
                </div>


                <shiro:hasPermission name="example.fund:exportExcel">
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

            <th field='fundName' align="left" width="2" sortable='false' formatter='titleAllFmt' >基金名称</th>
            <th field='fundCode' align="left" width="1" sortable='false'  >基金代码</th>
            <th field='fundTypeName' align="left" width="1" sortable='false'  >基金类型</th>
            <th field='fundDirectionName' align="left" width="1" sortable='false'  >基金投向</th>
            <th field='startMoney' align="right" width="1" sortable='true'  >起购金额</th>
            <th field='managTypeName' align="left" width="1" sortable='false'  >管理类型</th>
            <th field='fundScale' align="right" width="1" sortable='true'  >基金规模</th>
            <th field='managerUserName' align="left" width="1" sortable='false'  >基金经理</th>
            <th field='startDate' align="center" width="1" sortable='true' formatter='dateFmt' >成立日期</th>
            <th field='endDate' align="center" width="1" sortable='true' formatter='dateFmt' >到期日期</th>


        </tr>
        </thead>
    </table>
</div>


<bms:openPanel />



<script>
    var tableid = "tableData-${ tableId }";

    var inAllPage = "${ inAllPage }";
    var queryString = "${ queryString }";
    var listUrl = "";
</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/listCommon.js"></script>
<script src="${ staticUrl }/statics2/js/project/list.js"></script>

<shiro:hasPermission name="example.fund:importExcel">
<script src="${ staticUrl }/statics2/js/project/common-import-excel.js"></script>
</shiro:hasPermission>

<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>

<script language="JavaScript">


    $(function() {

        //基金经理
        $(".managerUserName").OpenSystemUserSelectWin({
            title: "基金经理",
            selectType: "d1",
            callId: "managerUserId",
            callName: "managerUserName",
            clearId: "clearmanagerUserName"
        } ,function(val , name , row){

            search();
        });

    });





</script>

<bms:contentFooter />

