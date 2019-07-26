//公共设置


//------------------------------------------------------------------------------------------
//		Loading
//------------------------------------------------------------------------------------------

var $RequestCount = 0;
var $Loading = $(".interruption", top.document);

$(document)
    .ajaxStart(function(event)
    {
        $RequestCount++;
        $Loading.show();
    })
    .ajaxComplete(function()
    {
        $RequestCount--;

        if ($RequestCount <= 0)
        {
            $Loading.fadeOut(500);
        }
    });




function ajaxGet(url , data ,  successFun , failFun){
    ajaxSend(url , data , 'Get' , successFun , failFun);
}

function ajaxPost(url , data ,  successFun , failFun){
    ajaxSend(url , data , 'POST' , successFun , failFun);
}

function ajaxSend(url , data , type, successFun , failFun){
    successFun = successFun || successFunction;
    failFun = failFun || failFunction;
    type = type || "POST";
    $.ajax({url:url, data: data , timeout : 5000 , dataType:'json' ,type : type ,success:successFun , error : failFun});
}

function successFunction(res){

}

function failFunction(xhr,status,error){
    errorTip("请求服务出现错误");
}


//------------------------------------------------------------------------------------------
//		EasyUI
//------------------------------------------------------------------------------------------

// 过滤下拉列表选项
var commFilterOptions = ['equal','notequal','greaterorequal','lessorequal'];

// 分页
if ($.fn.pagination)
{
    $.fn.pagination.defaults.layout = ['first','prev', 'sep', 'links', 'sep', 'next','last', 'sep']
    $.fn.pagination.defaults.displayMsg = '共{total}条记录 [第{from}条-第{to}条]';
    // 分页按钮数量
    // $.fn.pagination.defaults.links = 5;
}

if ($.fn.datagrid)
{
    // 加载提示文字
    $.fn.datagrid.defaults.loadMsg = null;
    // 分页大小
    $.fn.datagrid.defaults.pageSize = $PagingSize;
}

if ($.fn.treegrid)
{
    $.fn.treegrid.defaults.loadMsg = null;
    // 分页大小
    $.fn.treegrid.defaults.pageSize = $PagingSize;
}

// 过滤规则
if ($.fn.datagrid && $.fn.datagrid.defaults && $.fn.datagrid.defaults.operators)
{
    $.fn.datagrid.defaults.operators.nofilter.text = "x [清除]";
    $.fn.datagrid.defaults.operators.contains.text = "包含";
    $.fn.datagrid.defaults.operators.equal.text = "= [等于]";
    $.fn.datagrid.defaults.operators.notequal.text = "≠ [不等于]";
    $.fn.datagrid.defaults.operators.beginwith.text = "头部包含";
    $.fn.datagrid.defaults.operators.endwith.text = "尾部包含";
    $.fn.datagrid.defaults.operators.less.text = "< [小于]";
    $.fn.datagrid.defaults.operators.lessorequal.text = "≤ [小于等于]";
    $.fn.datagrid.defaults.operators.greater.text = "> [大于]";
    $.fn.datagrid.defaults.operators.greaterorequal.text = "≥ [大于等于]";
}

if ($.fn.dialog)
{
    $.fn.dialog.defaults.modal = true;
    $.fn.dialog.defaults.border = 'thin';
    $.fn.dialog.defaults.shadow = true;
    $.fn.dialog.defaults.constrain = true;
}

/**
 * 创建Grid Header右键列选择菜单
 */
function createGridHeaderContextMenu(e, field)
{
    e.preventDefault();

    var grid = $(this);/* grid本身 */
    var headerContextMenu = this.headerContextMenu;/* grid上的列头菜单对象 */
    var okCls = 'tree-checkbox1';// 选中
    var emptyCls = 'tree-checkbox0';// 取消

    if (!headerContextMenu)
    {
        var tmenu = $('<div style="width:100px;"></div>').appendTo('body');
        var fields = grid.datagrid('getColumnFields');
        for (var i = 0; i < fields.length; i++)
        {
            var fildOption = grid.datagrid('getColumnOption', fields[i]);
            if (!fildOption.hidden)
                $('<div iconCls="' + okCls + '" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
            else
                $('<div iconCls="' + emptyCls + '" field="' + fields[i] + '"/>').html(fildOption.title).appendTo(tmenu);
        }

        headerContextMenu = this.headerContextMenu = tmenu.menu(
            {
                onClick : function(item)
                {
                    var field = $(item.target).attr('field');
                    if (item.iconCls == okCls)
                    {
                        grid.datagrid('hideColumn', field);
                        $(this).menu('setIcon', {target: item.target, iconCls: emptyCls});
                    }
                    else
                    {
                        grid.datagrid('showColumn', field);
                        $(this).menu('setIcon', {target: item.target, iconCls: okCls});
                    }
                }
            });
    }

    headerContextMenu.menu('show', {left: e.pageX, top: e.pageY});
}


//------------------------------------------------------------------------------------------
//		Validation
//------------------------------------------------------------------------------------------

if ($.validator)
{
    $.validator.setDefaults(
        {
            /**
             * 重写错误提示方式
             */
            showErrors: function(errorMap, errorList)
            {
                // 清除之前的边框css
                $(this.lastActive).removeClass("input-invalidate");
                // 清除之前的OpenTip
                if (this.lastActive && this.lastActive.name)
                {
                    var tips = $(this.lastActive).data("opentips");
                    if (tips && tips.length > 0)
                    {
                        tips[0].deactivate();
                    }

                    /**
                     var tip = getOpenTipObject(this.lastActive.name);
                     if (tip)
                     {
                         tip.deactivate();
                         // tip.hide();
                     }
                     */
                }

                // 添加新提示信息
                $.each(errorList, function(index, error)
                {
                    // css
                    $(error.element).addClass("input-invalidate");	//.prop('data-ot', error.message);
                    // tip
                    var tips = $(error.element).data("opentips");
                    // tip = getOpenTipObject(error.element.name);
                    if (tips && tips.length > 0)
                    {
                        tips[0].activate();
                        tips[0].setContent(error.message);
                    }
                    else
                        $(error.element).opentip(error.message, {target: false, removeElementsOnHide: true});
                });
            }
        });
}

/**
 * 清除验证信息
 */
$.fn.clearValidate = function()
{
    $('.input-invalidate', this).each(function()
    {
        $(this).removeClass("input-invalidate");
        var tips = $(this).data("opentips");

        if (tips && tips.length > 0)
        {
            tips[0].deactivate();
        }
    });
}


/**
 * jQuery ajax 错误handler函数
 */
function showjQueryError(request, textStatus, error)
{
    alert("Ajax request failed: " + error);
}


/**
 * 回车键执行查询方法 [适用于工具栏中的查询条件回车键直接查询功能]
 *
 * @param event     回车键事件
 * @param searchFn	search function
 */
function enterKeySearch(event, searchFn)
{
    if (13 == event.keyCode)
        searchFn.call(this);
}

//------------------------------------------------------------------------------------------
//		MessageBox
//------------------------------------------------------------------------------------------

/**
 * 提示对话框
 */
function info(message, callback)
{
    if (callback)
    {
        // Dialog
        $.alert(
            {
                title: '注意',  confirmButton: '确定', content: '<span style="color: blue; font-size: 15px;">' + message + '</span>', icon: 'fa fa-info-circle',
                autoClose: callback ? '' : 'confirm|5000', backgroundDismiss: callback ? false : true,
                confirm: function()
                {
                    callback.call(this);
                }
            });
    }
    else
    {
        // Toast
        toastr.options = {closeButton: true, debug: false, newestOnTop: true, progressBar: true, positionClass: "toast-top-center", preventDuplicates: true, onclick: null};
        toastr["success"](message);
        // $().toastmessage('showToast', {text: message, sticky: false, position: 'top-center', type: 'notice'});
    }
}

/**
 * 警告对话框
 */
function warn(message, callback)
{
    $.alert(
        {
            title: '警告',  confirmButton: '确定', content: '<span style="color: orange; font-size: 15px;">' + message + '</span>', icon: 'fa fa-exclamation-triangle', backgroundDismiss: false,
            confirm: function()
            {
                if (callback)
                    callback.call(this);
            }
        });
}

/**
 * 错误对话框
 */
function error(message, callback)
{
    $.alert(
        {
            title: '错误',  confirmButton: '确定', content: '<span style="color: #ff0000; font-size: 15px;">' + message + '</span>', icon: 'fa fa-times-circle', backgroundDismiss: false,
            confirm: function()
            {
                if (callback)
                    callback.call(this);
            }
        });
}

/**
 * 确认对话框
 *
 * @param	message						对话框提示信息
 * @param	confirmCallback		确定按钮点击回调function
 * @param	cancelCallback		取消按钮点击回调function
 */
function confirm(message, confirmCallback, cancelCallback)
{
    $.confirm(
        {
            title: '注意',  confirmButton: '确定', cancelButton: '取消', content: '<span style="color: #ff8000; font-size: 15px;">' + message + '</span>', icon: 'fa fa-question-circle', backgroundDismiss: false,
            confirm: function()
            {
                if (confirmCallback)
                {
                    confirmCallback.call(this);
                }
            },
            cancel: function()
            {
                if (cancelCallback)
                {
                    cancelCallback.call(this);
                }
            }
        });
}


//处理键盘事件 禁止后退键（Backspace）密码或单行、多行文本框除外
function banBackSpace(e)
{
    var ev = e || window.event;//获取event对象
    if(ev.keyCode != 8){
        return true;
    }
    var obj = ev.target || ev.srcElement;//获取事件源
    var t = obj.type || obj.getAttribute('type');//获取事件源类型
    //获取作为判断条件的事件类型
    var vReadOnly = obj.getAttribute('readonly');
    //处理null值情况
    vReadOnly = (vReadOnly == "") ? false : vReadOnly;
    //当敲Backspace键时，事件源类型为密码或单行、多行文本的，
    //并且readonly属性为true或enabled属性为false的，则退格键失效
    var flag1 = (ev.keyCode == 8
        && (t == "password" || t == "text" || t == "textarea") && vReadOnly == "readonly") ? true
        : false;
    //当敲Backspace键时，事件源类型非密码或单行、多行文本的，则退格键失效
    var flag2 = (ev.keyCode == 8 && t != "password" && t != "text" && t != "textarea") ? true
        : false;

    //判断
    if (flag2) {
        return false;
    }
    if (flag1) {
        return false;
    }
}

// 公共idialog的弹出尺寸调整
/**
 * @param  idialogObj  传入当前idialog对象
 */
function resizeIdialogHeight(idialogObj)
{
    /* 由于页面resize之后计算i-target的高度为-1, 导致 */
    var dlgHeight = parseInt($(window).height()*0.8) - 95;
    if($(window).height() > 650)
    {
        idialogObj.height = '500px';
        $(idialogObj._content).css("height",'405px');
        idialogObj.top = ($(window).height()-500)/2 + 'px';
    }
    else
    {
        idialogObj.height = $(window).height()*0.8 + 'px';
        $(idialogObj._content).css("height",dlgHeight + 'px');
        idialogObj.top = $(window).height()*0.1 + 'px';
    }
    idialogObj.left = ($(window).width() - idialogObj.width)/2 + 'px';
}
$(document).ready(function () {
    $("img").error(function () {
        try {
            $(this).attr("src", $AppContext + "/statics2/image/no-image.png");
        }catch (e){

        }
    });
});