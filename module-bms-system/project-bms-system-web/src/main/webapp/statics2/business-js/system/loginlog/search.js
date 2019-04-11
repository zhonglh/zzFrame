
/**
* 打开登陆日志选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openSystemLoginlogWin(config, callBack)
{

    var url = config.url || $AppContext + '/system/loginlog/list';
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
    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="operationUserName" sortOrder="asc"></table>'
    + '</div>';

    var options = config || {};
    options.id = "_SystemLoginlogListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
    {field:"id", checkbox: true, width: 40},
        {field:"operationTypeName", title:"操作类型", width: 150, align:"left" ,},
        {field:"operationlogName", title:"操作说明", width: 150, align:"left" ,},
        {field:"depName", title:"部门", width: 150, align:"left" ,},
        {field:"organId", title:"机构", width: 150, align:"left" ,},
        {field:"operationIp", title:"操作人IP", width: 150, align:"left" ,},
        {field:"operationUserName", title:"操作人名称", width: 150, align:"left" ,},
        {field:"operationTime", title:"操作时间", width: 150, align:"center" ,formatter='dateFmt'}
    ]];
    options.sampleData = {id: "id", name: "operationUserName"};
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



//登陆日志选择控件
$.fn.OpenSystemLoginlogSelectWin = function(config, callBack){
    var win = openSystemLoginlogWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
