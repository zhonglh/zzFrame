
/**
* 打开文件选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openSystemFileWin(config, callBack)
{

    var url = config.url || $AppContext + '/system/file/list';
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
    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="fileName" sortOrder="asc"></table>'
    + '</div>';

    var options = config || {};
    options.id = "_SystemFileListPanel" + config.callId;
    options.width = 616;
    options.height = 550;
    options.callBack = callBack;
    options.url = url;
    options.columns = [[
    {field:"id", checkbox: true, width: 40},
        {field:"accessUrlPrefix", title:"访问路径前缀", width: 150, align:"left" ,},
        {field:"accessUrl", title:"访问路径", width: 150, align:"left" ,},
        {field:"fileHost", title:"文件所在主机", width: 150, align:"left" ,},
        {field:"fileBasePath", title:"FILE_BASE_PATH", width: 150, align:"left" ,},
        {field:"filePath", title:"文件路径", width: 150, align:"left" ,},
        {field:"fileName", title:"文件名", width: 150, align:"left" ,},
        {field:"fileSize", title:"文件大小", width: 150, align:"right" ,},
        {field:"fileSuffix", title:"文件后缀", width: 150, align:"left" ,},
        {field:"fileEngineName", title:"文件引擎", width: 150, align:"left" ,},
        {field:"md5", title:"MD5码", width: 150, align:"left" ,},
        {field:"contentType", title:"文件类型", width: 150, align:"left" ,},
        {field:"useFrequency", title:"使用次数", width: 150, align:"right" ,}
    ]];
    options.sampleData = {id: "id", name: "fileName"};
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



//文件选择控件
$.fn.OpenSystemFileSelectWin = function(config, callBack){
    var win = openSystemFileWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
