
/**
* 打开企业选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openSystemTenantWin(config, callBack)
{

    var url = config.url || $AppContext + '/system/tenant/list';
    var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 605px;height:450px;">'
    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
        + '<tr style="height: 40px;">'
            + '<td>'
                + '<div class="form-inline" role="form" >';




            tableTemple += '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
            + '</div>'
        + '</td>'
    + '</tr>'
    + '</table>'
    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="tenantName" sortOrder="asc"></table>'
    + '</div>';

    var options = config || {};
    options.id = "_SystemTenantListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
    {field:"id", checkbox: true, width: 40},
        {field:"tenantName", title:"企业名称", width: 150, align:"left" ,},
        {field:"tenantCode", title:"企业编号", width: 150, align:"left" ,},
        {field:"tenantAddr", title:"企业地址", width: 150, align:"left" ,},
        {field:"linkTel", title:"联系电话", width: 150, align:"left" ,},
        {field:"leadUserName", title:"法人姓名", width: 150, align:"left" ,},
        {field:"website", title:"官网", width: 150, align:"left" ,}
    ]];
    options.sampleData = {id: "id", name: "tenantName"};
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





        // 调用查询方法
        dialog.tableTemple.search(params);
        }
    };

    var dialog = DialogTools.getDialog(options);

    return dialog;


};



//企业选择控件
$.fn.OpenSystemTenantSelectWin = function(config, callBack){
    var win = openSystemTenantWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
