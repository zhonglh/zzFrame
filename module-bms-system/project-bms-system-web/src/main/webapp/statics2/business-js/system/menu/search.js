
/**
* 打开菜单选择窗口
* callId	回显数据ID的控件ID
* callName	回显数据名称的控件ID
* clearId	清空选项的控件ID
* callBack 选择后的回调函数
* @returns
*/
function openSystemMenuWin(config, callBack)
{



    var url = config.url || $AppContext + '/system/menu/tree';
    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden;" class="_w_height">' +
    '<table idField="id" treeField="menuName" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' ;

                tableTemple += '			<th field="menuName" align="left"  >菜单名称</th>' ;
                tableTemple += '			<th field="menuCode" align="left"  >菜单编号</th>' ;
                tableTemple += '			<th field="menuSort" align="right"  >菜单顺序</th>' ;


    tableTemple +='		</tr>'+
        '	</thead>' +
        '</table>' +
    '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_SystemMenuList" + config.callId;
    options.url = url;
    options.callBack = callBack;
    options.sampleData = {id: "id", name: "menuName"};
    options.htmlTemple = tableTemple;
    var dialog = DialogTools.getDialog(options);

    return dialog;

};



//菜单选择控件
$.fn.OpenSystemMenuSelectWin = function(config, callBack){
    var win = openSystemMenuWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};
