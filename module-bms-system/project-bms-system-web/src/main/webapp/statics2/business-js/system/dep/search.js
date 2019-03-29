
/**
 * 打开部门选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openSystemDepWin(config, callBack)
{
    var url = config.url || $AppContext + '/system/dep/tree';

    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden;" class="_w_height">' +
        '<table idField="id" treeField="depName" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' +
        '			<th field="depName" align="left">部门名称</th>' +
        '			<th field="depCode" align="left">部门编号</th>' +
        '			<th field="remark" width=1 align="left">备注</th>' +
        '		</tr>'+
        '	</thead>' +
        '</table>' +
        '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_depList" + config.callId;
    options.url = url;
    options.callBack = callBack;
    options.sampleData = {id: "id", name: "depName"};
    options.htmlTemple = tableTemple;
    var dialog = DialogTools.getDialog(options);

    return dialog;
};



// 部门选择控件
$.fn.OpenSystemDepSelectWin = function(config, callBack){
    var win = openSystemDepWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
