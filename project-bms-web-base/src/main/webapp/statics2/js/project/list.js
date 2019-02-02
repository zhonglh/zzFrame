//初始化加载
$(function(){
    /* 更多筛选条件 */
    $("#showMore").click(function() {
        if($(".more-conditions").hasClass("hidden")){
            $("#showMore").addClass("unfold");
            $(".more-conditions").removeClass("hidden");
        }else{
            $("#showMore").removeClass("unfold");
            $(".more-conditions").addClass("hidden");
        }
        $('#content-all').layout('panel', 'north').panel('resize',{height:$("#content-sec").height() + 50});
        $('#content-all').layout('resize');
    });


    $(".export").click(function() {
        var $this = $(this);
        var title = $this.attr("title");
        var url = $this.attr("href");

        if (title) {
            confirm(title, function()
            {
                _doExport( url );
            });
        } else {_doExport( url );}

        event.preventDefault();

    });



    initPage();
});


/**
 * 导出Excel
 * @param url
 * @private
 */
function _doExport(url){
    var $form = $("#searchForm");
    window.location = url+(url.indexOf('?') == -1 ? "?" : "&")+$form.serialize();
}


/**
 * 设置选中类型 , 分类查询
 * @param obj
 * @param value
 * @param filed
 */
function isChecked(obj, value ,filed){
    /* 谁被选中谁显示蓝色底框 */
    $(obj).siblings().removeClass('active');
    $(obj).addClass('active');
    $('input[name="'+filed+'"]').val(value);
    search();
}


/**
 * 初始化 easyUI 列表
 */
function initPage() {
    //加载table列表数据
    $('#'+tableid).datagrid({
        url : ctx+dataUrl+"/list",
        queryParams: getQueryParams(),
        emptyMsg: '<img style="margin-top:50px;" src="'+staticUrl+'/statics2/image/empty.png">',
        onDblClickRow: function(index, row){
            toUpdate(row.id)
        }
    });
}


/**
 * 组合查询条件
 * 先找界面上id为searchForm的值，
 * 如果没有， 使用界面上定义好的变量(searchData)
 * 上述两种都没有， 返回一个空的对象
 * @returns {*}
 */
function getQueryParams(){
    try {
        var sData ;
        var searchForm = $("#searchForm");
        if (searchForm.length == 1) {
             sData = searchForm.serializeJson();
            return sData;
        }else {
            sData = searchData;
            return sData;
        }
    }catch(e) {
        return searchData || {};
    }
}

/**
 * 查询
 */
function search(){
    initPage();
}


function IframePath(title)
{
    $("#iframePath").parent().html(title);
}

/**
 * 日期格式化
 * @param val
 * @param row
 * @returns {*}
 */
function dateFmt(val,row){
    if(null==val||""==val){
        return "";
    }
    return val.substring(0,10);
}

/**
 * 标题格式化
 * @param val
 * @param row
 * @returns {string}
 */
function titleFmt(val, row){
    var html ='<a href="javascript: toUpdate(\'' + row.id + '\')"; title="'+val+'">'+val+'</a>';
    return html;
}

/**
 * 金额格式化
 * @param val
 * @param r
 * @returns {String}
 */
function moneyFmt(val, r){
    return FormatMoney(val,4,true);
}

/**
 * 点击日期选择的×号按钮
 * @param time
 */
function clearTime(time){
    $(time).val('');
}


/**
 * 操作
 * @param val
 * @param r
 * @param index
 * @returns {string}
 */
function makesFmt (val, r, index)
{
    // 操作栏为图标
    var html = '';
    html += '<div class="grid-column-option">';


    //删除按钮，绑定名称和id
    html += '<a href="javascript:;"'
        + '" name="'
        + r.userName
        + '" id="'
        + r.id
        + '" onclick="deleteOne(this);" title="删除">' +
        '<svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use></svg></a>';


    html += '</div>';
    return html;
}


/**
 * 点击删除图标删除
 * @param obj
 */
function deleteOne (obj)
{
    var $Obj = $ (obj);
    //获取名称和Id
    var names = $Obj.attr ('name');
    var id = $Obj.attr ('id');
    confirm ('您确定要删除吗？', function ()
    {
        $.ajax (
            {
                url : ctx+dataUrl+"/"+id+"/delete",
                type : 'POST',
                traditional : true,//阻止JQuery深度序列化数据

                success : function (rsp, status)
                {
                    if (rsp.success)
                    {
                        search();
                        info('删除成功！');
                    }else{
                        warn(rsp.msg);
                    }
                }
            });
    });
}

/**
 * 打开新建界面
 */
function toAdd(){
    showIframeWindow('<a>'+breadcrumb+'</a> ＞ <a>新建</a>', ctx+dataUrl+"/create");
}


/**
 * 打开编辑界面
 * @param id
 */
function toUpdate(id){
    var title = '<a id="iframePath">'+breadcrumb+'</a>＞<a>详情</a>';
    showIframeWindow(title,     ctx+dataUrl+"/"+id+"/update");
}


/**
 * 删除
 * @returns {boolean}
 */
function doDel(){
    var idArray = new Array();
    var toDel = true;

    var r = $('#'+tableid).datagrid('getSelections');
    if (r.length==0){
        warn('请先选择您要删除的数据！');
        return false;
    }else{
        $(r).each(function(){

            if(this.checkStatus != undefined && this.checkStatus != null && this.checkStatus != '0'){
                warn('【' + this.userName + '】已审核，不能删除!');
                return false;
            }

            idArray.push(this.id);
        })
    }

    if(toDel){
        //执行ajax删除
        confirm('您确定要删除选中的信息吗？', function() {
            $.ajax({
                url: ctx+dataUrl+"/batch/delete"+'?ids='+idArray.join(","),
                type: 'DELETE',
                success: function(rsp, status){
                    if (rsp.success){
                        search();
                        info(rsp.msg);
                    }else{
                        warn(rsp.msg);
                    }
                }
            });
        });
    }else{
        warn("已提交审核单据不能进行删除操作!")
    }
}


