



/**
 * 初始化 easyUI 列表
 */
function initPage() {

    var initUrl =  ctx+dataUrl+"/tree?"+queryString;
    var ajaxUrl = initUrl;
    if(treeUrl != undefined && treeUrl.length > 0){
        ajaxUrl = treeUrl;
    }

    //加载table列表数据
    $('#'+tableid).treegrid({
        url : ajaxUrl ,
        idField:id_field,
        treeField:tree_field,

        queryParams: getQueryParams(),
        emptyMsg: '<img style="margin-top:50px;" src="'+staticUrl+'/statics2/image/empty.png">',
        onDblClickRow: function(index, row){
            toUpdate(row.id)
        }
    });
}





