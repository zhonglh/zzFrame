
/**
* 打开基金选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openExampleFundWin(config, callBack)
{

    var url = config.url || $AppContext + '/example/fund/list';
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
    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="fundName" sortOrder="asc"></table>'
    + '</div>';

    var options = config || {};
    options.id = "_ExampleFundListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
    {field:"id", checkbox: true, width: 40},
        {field:"fundName", title:"基金名称", width: 150, align:"left" ,},
        {field:"fundCode", title:"基金代码", width: 150, align:"left" ,},
        {field:"fundTypeName", title:"基金类型", width: 150, align:"left" ,},
        {field:"fundDirectionName", title:"基金投向", width: 150, align:"left" ,},
        {field:"startMoney", title:"起购金额", width: 150, align:"right" ,},
        {field:"managTypeName", title:"管理类型", width: 150, align:"left" ,},
        {field:"fundScale", title:"基金规模", width: 150, align:"right" ,},
        {field:"managerUserName", title:"基金经理", width: 150, align:"left" ,},
        {field:"startDate", title:"成立日期", width: 150, align:"center" ,formatter:dateFmt},
        {field:"endDate", title:"到期日期", width: 150, align:"center" ,formatter:dateFmt},
        {field:"depName", title:"部门", width: 150, align:"left" ,},
        {field:"organId", title:"机构", width: 150, align:"left" ,}
    ]];
    options.sampleData = {id: "id", name: "fundName"};
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



            params["fundType"] = dialog.tableTemple.find('select[name="fundType"]').val();
            params["managType"] = dialog.tableTemple.find('select[name="managType"]').val();


        // 调用查询方法
        dialog.tableTemple.search(params);
        }
    };

    var dialog = DialogTools.getDialog(options);

    return dialog;


};


//基金选择控件
$.fn.OpenExampleFundSelectWin = function(config, callBack){
    var win = openExampleFundWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
