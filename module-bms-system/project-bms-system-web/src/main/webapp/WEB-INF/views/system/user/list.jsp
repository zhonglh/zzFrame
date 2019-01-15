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

            <div id='toolbar' style='height: 40px;'>
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
            <button type="button" class="btn btn-primary btn-sm" onclick="doAdd()">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                </svg>
                <span>新建 </span>
            </button>
            <button type="button" class="btn btn-primary btn-sm" url=""" onclick="doDel('url')">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use>
                </svg>
                <span>删除 </span>
            </button>
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
            <th field='status' align="left" width="1" sortable='false'>状态</th>
            <th field='phone' align="left" width="2" sortable='false'>手机</th>
            <th field='email' align="left" width="2" sortable='false'>邮箱</th>
            <th field='depName' align="left" width="2" sortable='false'>部门</th>
            <th field='makes' align="center" formatter='makesFmt'>操作</th>


        </tr>
        </thead>
    </table>
</div>




<script>
    // Global Const
    var ctx = '${ctx}';
    var staticUrl = '${staticUrl}';
    var $AppContext = ctx ;
    var $PagingSize = 50 || 20;


    var tableid = "tableData-${tableId}";
    var dataUrl = "/${currParentUrl}";
    var breadcrumb = "${breadcrumb}";

</script>

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


    //操作
    function makesFmt (val, r, index)
    {
        // 操作栏为图标
        var html = '';
        html += '<div class="grid-column-option">';


        //删除按钮，绑定名称和id
        html += '<a href="javascript:;"'
            + '" name="'
            + r.userName
            + '" id="'
            + r.id
            + '" onclick="deleteOne(this);" title="删除">' +
            '<svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use></svg></a>';


        html += '</div>';
        return html;
    }




</script>


<bms:contentJS />

<script src="${staticUrl}/statics2/js/project/list.js"></script>
<script src="${staticUrl}/statics2/js/project/common-sys-function.js"></script>


<bms:contentFooter />

