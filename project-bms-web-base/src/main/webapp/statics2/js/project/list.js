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
    initPage();
});


//设置选中类型 , 分类查询
function isChecked(obj, value ,filed){
    /* 谁被选中谁显示蓝色底框 */
    $(obj).siblings().removeClass('active');
    $(obj).addClass('active');
    $('input[name="'+filed+'"]').val(value);
    search();
}

function initPage() {
    //加载table列表数据
    $('#'+tableid).datagrid({
        url : ctx+dataUrl+"/list",
        queryParams: getQueryParams(),
        emptyMsg: '<img style="margin-top:50px;" src="'+staticUrl+'/statics2/image/empty.png">',
        onDblClickRow: function(index, row){
            doView(row.id)
        }
    });
}

//组合查询条件
function getQueryParams(){
    return $("#searchForm").serializeJson();
}

//点击查询按钮查询
function search(){
    initPage();
}

//查看页面
function doView(id){
    var title = '<a id="iframePath">项目资源库</a>\><a>项目管理</a>';
    showIframeWindow(title,     ctx+dataUrl+"/"+id+"/view");
}

function IframePath(title)
{
    $("#iframePath").parent().html(title);
}

//日期格式化
function dateFmt(val,row){
    if(null==val||""==val){
        return "";
    }
    return val.substring(0,10);
}

//标题FMT
function titleFmt(val, row){
    var html ='<a href="javascript: doView(' + row.id + ')"; title="'+val+'">'+val+'</a>';
    return html;
}

//金额FMT
function moneyFmt(val, r){
    return FormatMoney(val,4,true);
}

//点击日期选择的×号按钮
function clearTime(time){
    $(time).val('');
}



//点击删除图标删除
function deleteOne (obj)
{
    var project = $ (obj);
    //获取项目名称和Id
    var names = project.attr ('customName');
    var id = project.attr ('id');
    confirm ('您确定要删除吗？', function ()
    {
        //这里与批量删除访问的是同一个路径
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

//新建
function doAdd(){
    showIframeWindow('<a>'+breadcrumb+'</a> ＞ <a>新建</a>', ctx+dataUrl+"/create");
}


//删除
function doDel(){
    var idArray = new Array();
    var toDel = true;

    var r = $('#'+tableid).datagrid('getSelections');
    if (r.length==0){
        warn('请先选择您要删除的数据！');
        return false;
    }else{
        $(r).each(function(){
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


// 导出Excel
function exportExcel(){

}
