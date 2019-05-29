<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>



<div region='north'>
    <div class="btn-bar" style="margin-left: -10px;">

        <shiro:hasPermission name="system.dict:add">
            <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                <i class="fa fa-plus"></i>
                <span>新增 </span>
            </button>
        </shiro:hasPermission>




        <shiro:hasPermission name="system.dict:delete">
            <button type="button" class="btn btn-primary btn-sm" onclick="doDelete()">
                <i class="fa fa-trash"></i>
                <span>删除 </span>
            </button>
        </shiro:hasPermission>

    </div>

    <div style="height: 482px">
        <table id='tableData-${tableId}' class='easyui-datagrid'  method='post' fit='true' pagination='true' fitColumns="true"  border='true' sortName="id" sortOrder="desc" style="width: 100%;height: 100%">
            <thead>
            <tr>
                <th field="ck" checkbox="true"></th>
                <th field="dictName" align="left" width="1" sortable="false"  formatter="titleFmt">字典名称</th>
                <th field="dictVal" align="left" width="1" sortable="false" >字典值</th>
                <th field="dictReg"  align="left" width="2" sortable="false">字典规则</th>
                <th field="orderby" align="right" width="1" sortable="false">排序</th>
            </tr>
            </thead>
        </table>
    </div>
</div>





