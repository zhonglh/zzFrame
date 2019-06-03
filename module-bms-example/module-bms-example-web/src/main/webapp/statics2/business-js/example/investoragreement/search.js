
/**
* 打开投资协议选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openExampleInvestoragreementWin(config, callBack)
{

    var url = config.url || $AppContext + '/example/investoragreement/list';
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
    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="agreementName" sortOrder="asc"></table>'
    + '</div>';

    var options = config || {};
    options.id = "_ExampleInvestoragreementListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
    {field:"id", checkbox: true, width: 40},
        {field:"agreementName", title:"协议名称", width: 150, align:"left" ,},
        {field:"agreementCode", title:"协议代码", width: 150, align:"left" ,},
        {field:"fundName", title:"认购基金", width: 150, align:"left" ,},
        {field:"investorName", title:"投资人", width: 150, align:"left" ,},
        {field:"amount", title:"认购金额", width: 150, align:"right" ,},
        {field:"actualAmount", title:"实际出资金额", width: 150, align:"right" ,},
        {field:"signDepName", title:"部门", width: 150, align:"left" ,},
        {field:"signOrganId", title:"机构", width: 150, align:"left" ,},
        {field:"signUserName", title:"签订人", width: 150, align:"left" ,},
        {field:"signDate", title:"签订日期", width: 150, align:"center" ,formatter:dateFmt}
    ]];
    options.sampleData = {id: "id", name: "agreementName"};
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


//投资协议选择控件
$.fn.OpenExampleInvestoragreementSelectWin = function(config, callBack){
    var win = openExampleInvestoragreementWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
