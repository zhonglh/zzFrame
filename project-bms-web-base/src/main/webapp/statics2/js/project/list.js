
/**
 * 初始化 easyUI 列表
 */
function initPage() {
    //加载table列表数据
    var initUrl =  ctx+dataUrl+"/list?"+queryString;
    var ajaxUrl = initUrl;
    if(listUrl != undefined && listUrl.length > 0){
        ajaxUrl = listUrl;
    }
    $('#'+tableid).datagrid({
        url : ajaxUrl,
        queryParams: getQueryParams(),
        emptyMsg: '<img style="margin-top:50px;" src="'+staticUrl+'/statics2/image/empty.png">',
        onDblClickRow: function(index, row){
            toUpdate(row.id)
        }
    });
}
