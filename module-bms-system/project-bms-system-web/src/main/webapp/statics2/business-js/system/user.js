
/**
 * 打开用户选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openSystemUserWin(config, callBack)
{
    var url = config.url || $AppContext + '/system/user/list';
    var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 605px;height:450px;">'
        + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
        + '<tr style="height: 40px;">'
        + '<td>'
        + '<div class="form-inline" role="form" >'
        + '<select name="_userStatus" class="form-control input-sm" placeholder="状态" title="状态" style="margin-left: -15px; width: 80px;">'
        + '<option value="" selected>状态</option>'
        + '<option value="1">正常</option>'
        + '<option value="0">禁用</option>'
        + '</select>&nbsp;&nbsp;'
        + '<input name="_userName" class="form-control input-sm" placeholder="请输入姓名" title="请输入姓名" style="width: 300px;">&nbsp;&nbsp;'
        + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
        + '</div>'
        + '</td>'
        + '</tr>'
        + '</table>'
        + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="orderIndex" sortOrder="asc"></table>'
        + '</div>';

    var options = config || {};
    options.id = "_SystemUserListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
        {field:"id", checkbox: true, width: 40},
        {field:"userName", title:"姓名", width: 170, align:"left"},
        {field:"loginName", title:"登录名", width: 145, align:"left"},
        {field:"deptName", title:"部门", width: 170, align:"left"},
        {field:'userStatusName', title: "状态", width: 100, align:"left"}
    ]];
    options.sampleData = {id: "id", name: "userName"};
    options.htmlTemple = tableTemple;
    options.compiledSuccess = function(){
        // 查询按钮事件
        dialog.tableTemple.find("button").bind("click", function(){
            search();
        });

        dialog.tableTemple.find('input').keydown(function(e){
            if(e.keyCode==13){
                search();
            }
        });

        // 状态发生改变查询
        dialog.tableTemple.find("select").bind("change", function(){
            search();
        });

        function search(){
            // 获取查询参数
            var params = options.params || {};
            params["userStatus"] = dialog.tableTemple.find('select[name="_userStatus"]').val();
            params["userName"] = dialog.tableTemple.find('input[name="_userName"]').val();

            // 调用查询方法
            dialog.tableTemple.search(params);
        }
    };

    var dialog = DialogTools.getDialog(options);

    return dialog;
};



// 用户选择控件
$.fn.OpenSystemUserSelectWin = function(config, callBack){
    var win = openSystemUserWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
