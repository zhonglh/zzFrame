<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz后台管理系统" />



<div region='north'>
    <div class="navigation">


        <span class="words"><a>${breadcrumb}</a></span>


    </div>
    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >

            <div id='toolbar' style='height: 40px;     border-bottom: 2px solid #0896ba; '>
                <div class="form-inline" role="form">


                    <div class="form-group" style='margin-left: -15px;'>
                        <select name="userStatus" id="userStatus" class="form-control input-sm" onChange='search();' placeholder='状态' title='状态'>
                            <option value="" selected>状态</option>
                            <option value="1">正常</option>
                            <option value="0">禁用</option>
                        </select>
                    </div>


                    <div class="input-group">
                        <input type="hidden" id="depId" name="depId" value="">
                        <input name='depName' id='depName' class="form-control input-sm" placeholder='部门' title='点击选择部门'
                               style='width: 150px; cursor: pointer;' readonly="readonly" onclick="showSysDepWindow()">
                        <div class="input-group-addon" title='清除' onclick="clearSysDep()"><i class="fa fa-remove"></i></div>
                    </div>

                    <div class="form-group">
                        <input  class="form-control input-sm" style='width: 300px;'
                                id="keyword" name='keyword' placeholder='用户姓名/手机号/邮件/登录名' onkeydown='enterKeySearch(event, search);'>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-success btn-sm" onclick='search();'><i class="fa fa-search"></i>&nbsp;查询</button>
                    </div>




                </div>
            </div>

        </form>
        <div class="btn-bar" style="margin-left: -10px;">
            <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                </svg>
                <span>新建 </span>
            </button>
            <button type="button" class="btn btn-primary btn-sm" url="" onclick="doDel('url')">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use>
                </svg>
                <span>删除 </span>
            </button>
<%--
            <button type="button" class="btn btn-primary btn-sm" onclick="explor();">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-daochu"></use>
                </svg>
                <span>导出</span>
                <a class="btn no-disabled dropdown-toggle" data-toggle="dropdown">
                    <i class="icon-laptop"></i>
                    Excel导入/导出
                    <i class="caret"></i>
                </a>
            </button>--%>

            <div class="btn-group">
                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Excel导入/导出 <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">

                    <li>
                        <a href="#" onclick="return false;" class="webuploader-container">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-daoru"></use>
                            </svg>导入
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-download"></use>
                            </svg>下载模板(Excel2003)
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-download"></use>
                            </svg>下载模板(Excel2007)
                        </a>
                    </li>

                    <li role="separator" class="divider"></li>

                    <li>
                        <a href="${ctx}/${currParentUrl}/cvs/export" class="export" >
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-daochu"></use>
                            </svg>导出CVS
                        </a>
                    </li>
                    <li>
                        <a href="${ctx}/${currParentUrl}/hssf/export" class="export" >
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-daochu"></use>
                            </svg>导出Excel2003
                        </a>
                    </li>

                    <li>
                        <a href="${ctx}/${currParentUrl}/sxssf/export" class="export" >
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-daochu"></use>
                            </svg>导出Excel2007
                        </a>
                    </li>
                </ul>
            </div>





        </div>
    </div>
    <!-- 筛选条div结束 -->
</div>

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableData-${tableId}' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true"
           border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>
            <th field='userName' align="left" width="2" sortable='false' formatter='titleFmt'>用户名称</th>
            <th field='loginName' align="left" width="2" sortable='false' >用户登录名</th>
            <th field='userStatusName' align="left" width="1" sortable='false'>状态</th>
            <th field='phone' align="left" width="2" sortable='false'>手机</th>
            <th field='email' align="left" width="2" sortable='false'>邮箱</th>
            <th field='depName' align="left" width="2" sortable='false'>部门</th>
            <th field='makes' align="center" formatter='makesFmt'>操作</th>


        </tr>
        </thead>
    </table>
</div>




<script>
    var tableid = "tableData-${tableId}";
</script>



<bms:contentJS />

<script src="${staticUrl}/statics2/js/project/list.js"></script>
<script src="${staticUrl}/statics2/js/project/common-import-excel.js"></script>
<script src="${staticUrl}/statics2/business-js/system/user.js"></script>
<script src="${staticUrl}/statics2/business-js/system/dep.js"></script>

<script language="JavaScript">
    /**
     * 选择模板
     */
    function showSysDepWindow()
    {
        openDeptWin(function(dep)
        {
            $('#depId').val(dep.id);
            $('#depName').val(dep.depName);
            // 刷新
            search();
        });
    }
    /**
     * 清除模板查询条件
     */
    function clearSysDep()
    {
        $('#depId').val('');
        $('#depName').val('');
        waitOperateDG.datagrid('reload',getQueryParams());
    }





</script>

<bms:contentFooter />

