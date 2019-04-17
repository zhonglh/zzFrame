<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />


<div style="padding: 0 10px">
    <div class="row">

        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>用户角色信息
                </div>


                <form id="from1" action="">
                    <table id='tableData-${ tableId }'  class='easyui-datagrid' method='post' fit='false' pagination='false' fitColumns="true" border='true' singleSelect="true">
                        <thead>
                            <tr>
                                <th field="id" hidden="true" ></th>
                                <c:if test="${ fn:indexOf(allQueryString,'&userId=')<0 }">
                                    <th field='userName' align="left" width="1" sortable='false'  >用户名</th>
                                    <th field='userPhone' align="left" width="1" sortable='false' >手机号</th>
                                    <th field='userEmail' align="left" width="1" sortable='false' >邮箱</th>
                                    <th field='userId' align="left" width="0" sortable='false'  hidden="true">用户ID</th>
                                </c:if>

                                <c:if test="${ fn:indexOf(allQueryString,'&roleId=')<0  }">
                                    <th field='roleName' align="left" width="1" sortable='false' >角色名</th>
                                    <th field='roleCode' align="left" width="1" sortable='false'  >角色编码</th>
                                    <th field='roleId' align="left" width="0" sortable='false'  hidden="true">用户ID</th>
                                </c:if>

                                <th hidden="true" field="option" align="left" formatter="markFmt">操作</th>

                            </tr>
                        </thead>
                    </table>

                    <div style="text-align: center; margin-top: 15px" class="toolBar">



                        <c:if test="${ fn:indexOf(allQueryString,'&userId=')>=0 || fn:indexOf(allQueryString,'&roleId=')>=0}">
                            <c:if test="${ fn:indexOf(allQueryString,'&userId=')>=0 }">
                            <button type="button" id="addBtn" class="btn btn-primary btn-sm hide" onclick="clkSystemRole()" >
                                <svg class="icon" aria-hidden="true">
                                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                                </svg>
                                <span>添 加</span>
                            </button>
                            </c:if>
                            <c:if test="${ fn:indexOf(allQueryString,'&roleId=')>=0 }">
                                <button type="button" id="addBtn" class="btn btn-primary btn-sm hide" onclick="clkSystemUser()" >
                                    <svg class="icon" aria-hidden="true">
                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                                    </svg>
                                    <span>添 加</span>
                                </button>
                            </c:if>
                        </c:if>

                        <input class="userIds"  class="userIds" type="hidden"/>
                        <input class="userNames"  class="userNames" type="hidden"/>
                        <input class="roleIds"  class="roleIds" type="hidden"/>
                        <input class="roleNames" class="roleNames" type="hidden"/>
                    </div>

                </form>

            </div>


            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm btn-showEdit" onclick="switchEditDetail()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                        </svg>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm btn-showEdit" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide" onclick="saveRelevanceList()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide" onclick="switchEditDetail()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                    </svg>
                    <span>取 消</span>
                </button>

            </div>



        </div>
    </div>
</div>

<script>
    var tableid = "tableData-${ tableId }";

    var inAllPage = "${inAllPage}";
    var queryString = "${ queryString }";
    var listUrl = "";


    var showMode = "detail";


</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/js/project/list.js"></script>
<script src="${ staticUrl }/statics2/js/project/listCommon.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/role/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>

<script language="JavaScript">


    function userIdFmt(val, r,index){
        var html = '<input type="hidden" name="ms['+index+'].userId" id=“userId'+index+'”>';
        return html;
    }

    function roleIdFmt(val, r,index){
        var html = '<input type="hidden" name="ms['+index+'].roleId" id=“roleId'+index+'”>';
        return html;
    }


    function saveRelevanceList() {

        var actionUrl = ctx+dataUrl + "/saveRelevanceList?"+queryString;

        var rows = $('#'+tableid).datagrid("getRows");



        //提交表单
        $.ajax({
            url: actionUrl,
            type: 'POST',
            dataType:"json",
            contentType: "application/json; charset=utf-8",
            cache:false,
            data: JSON.stringify(rows),
            success: function (rsp, status) {
                updateSuccess(rsp, status);
            }
        });
    }


    function markFmt(val, r,index){
        var html =	'<div class="grid-column-option">';
        html+=	'<a href="javascript: doDelUserRole('+ index + ');" title="删除"><svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use></svg></a>';
        html+=	'</div>';
        return html;
    }

    function doDelUserRole(index){
        $('#'+tableid).datagrid("deleteRow" , index);
        var rows = $('#'+tableid).datagrid("getRows");
        $('#'+tableid).datagrid("loadData",rows);

    }




    function clkSystemRole(){
        openSystemRole();
        $(".roleNames").click();
    }


    var systemRoleWindow = null;
    function openSystemRole(){
        if(systemRoleWindow != null){
            systemRoleWindow.remove();
        }
        //获取当前列表包含的协议
        var rows=$('#'+tableid).datagrid("getRows");
        var roleIds =rows.map(n=>n.roleId);

        roleIds = roleIds.join(',');

        systemRoleWindow = $(".roleNames").OpenSystemRoleSelectWin(
            {
                title:"角色(多选)",
                selectType: 'd2',
                callId:"roldIds",
                callName:"roleNames",
                params:{ "id_NOTIN":roleIds}
            },
            function(ids,names,rows){

                var datarow = $('#'+tableid).datagrid("getRows");
                var newRows = [];
                $.each(datarow,function(){
                        newRows.push(this);
                });

                $.each(rows,function(i,sub){
                    newRows.push({
                        id:'',
                        userId:'${m.userId}',
                        userName:'${m.userName}',
                        userPhone:'${m.userPhone}',
                        userEmail:'${m.userEmail}',
                        roleId:sub.id,
                        roleName:sub.roleName,
                        roleCode:sub.roleCode
                    });
                });
                var data = {rows:newRows};
                $('#'+tableid).datagrid("loadData",data);

            });
    }






    function clkSystemUser(){
        openSystemUser();
        $(".userNames").click();
    }


    var systemUserWindow = null;
    function openSystemUser(){
        if(systemUserWindow != null){
            systemUserWindow.remove();
        }
        //获取当前列表包含的协议
        var rows=$('#'+tableid).datagrid("getRows");
        var userIds =rows.map(n=>n.userId);

        userIds = userIds.join(',');

        systemUserWindow = $(".userNames").OpenSystemUserSelectWin(
            {
                title:"用户(多选)",
                selectType: 'd2',
                callId:"userIds",
                callName:"userNames",
                params:{ "id_NOTIN":userIds , "userStatus":"1" , "systemAdmin":"0"}
            },
            function(ids,names,rows){

                var datarow = $('#'+tableid).datagrid("getRows");
                var newRows = [];
                $.each(datarow,function(){
                    newRows.push(this);
                });

                $.each(rows,function(i,sub){
                    newRows.push({
                        id:'',
                        userId:sub.id,
                        userName:sub.userName,
                        userPhone:sub.phone,
                        userEmail:sub.email,
                        roleId:'${m.roleId}',
                        roleName:'${m.roleName}',
                        roleCode:'${m.roleCode}'
                    });
                });
                var data = {rows:newRows};
                $('#'+tableid).datagrid("loadData",data);

            });
    }

</script>

<bms:contentFooter />

