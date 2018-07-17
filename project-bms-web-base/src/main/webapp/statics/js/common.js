








//------------------------------------------------------------------------------------------
//		Global
//------------------------------------------------------------------------------------------

// 文件尺寸
var KB = 1024;
var MB = KB * 1024;
var GB = MB * 1024;
// 移动端User Agent
var MobileUserAgents = ["Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod"];
// Html特殊字符
var HtmlSpecialChar = [{html: '&amp;', text: '&'}, {html: '<br/>', text: '\r\n'}, {html: '<br/>', text: '\r\n'}, {html: '&quot;', text: '"'}, {html: '&acute;', text: '\''}];

//------------------------------------------------------------------------------------------
//		站点统计
//------------------------------------------------------------------------------------------

// 百度统计
/*
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fe08f6c3d8f29e2802c48ac0c3082ce0a' type='text/javascript'%3E%3C/script%3E"));
*/

// Google统计
/*
var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-37266007-1']);
_gaq.push(['_trackPageview']);

(function()
{
	var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
*/

//------------------------------------------------------------------------------------------
//		JS Object
//------------------------------------------------------------------------------------------

// 除去两边空白
/**
 * String类添加 isNumeric 方法 ,是否是数字
 */
String.prototype.trim = function() {
    return this.replace(/(^s+)|(s+$)/g, "");
}

/**
 * String类添加 isNumeric 方法 ,是否是数字
 */
String.prototype.isNumeric = function() {
    var tmpFloat = parseFloat(this);
    if (isNaN(tmpFloat))
        return false;
    var tmpLen = this.length - tmpFloat.toString().length;
    return tmpFloat + "0".Repeat(tmpLen) == this;
}

/**
 * String类添加 isInt 方法 ,是否是整数
 */
String.prototype.isInt = function() {
    if (this == "NaN")
        return false;
    return this == parseInt(this).toString();
}

/**
 * String类添加reverse方法 ,逆序
 */
String.prototype.reverse = function() {
    return this.split("").reverse().join("");
}

/**
 * String类添加startsWith方法
 */
String.prototype.startsWith = function(val)
{
	return (this.match('^' + val) == val);
}

/**
 * String类添加endsWith方法
 */
String.prototype.endsWith = function(val)
{
	return (this.match(val + '$') == val);
}

/**
 * String类添加replaceAll方法
 */
String.prototype.replaceAll = function(searchValue, newValue)
{
	return this.replace(new RegExp(searchValue, "gm"), newValue);
}

/** 
 * Date类添加format方法
 */  
Date.prototype.format = function(format)
{
	/**
	 * eg:format="yyyy-MM-dd hh:mm:ss"; 
	 */  
	var o =
	{
		"M+" : this.getMonth() + 1, // month  
		"d+" : this.getDate(), // day  
		"h+" : this.getHours(), // hour  
		"m+" : this.getMinutes(), // minute  
		"s+" : this.getSeconds(), // second  
		"q+" : Math.floor((this.getMonth() + 3) / 3), // quarter  
		"S" : this.getMilliseconds()  
		// millisecond  
	}

	if (/(y+)/.test(format))
		format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4	- RegExp.$1.length));  

	for (var k in o)
	{
		if (new RegExp("(" + k + ")").test(format))
			format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
  }

	return format;
}

/**
 * 判断数组中是否包含指定元素
 *
 * @param {Object} needle
 */
Array.prototype.contains = function(needle) 
{
  for (i in this)
	{
    if (this[i] == needle)
		{
			return true;
		}
  }

	return false;
}

/**
 * 通过js生成唯一的UUID
 */
function uuid()
{
	return ('xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c)
	{
		var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
		return v.toString(16);
	}));
}

//------------------------------------------------------------------------------------------
//		jQuery
//------------------------------------------------------------------------------------------

// Global settings
$.ajaxSetup(
{
	type: 'POST', dataType: 'json', headers: {'Powered-By': 'FORP'}, complete: function(request, textStatus)
	{
		if (request.responseJSON)
		{
			if (401 == request.responseJSON.code)
			{
				top.warn('您长时间没有操作，需要重新验证您的账号安全。<br/>请重新登录系统！', function()
				{
					top.location.href = $AppContext + '/';
				});
			}
			else if (500 == request.responseJSON.code ) //|| 210 == request.responseJSON.code
			{
				top.warn('系统繁忙，请稍后再试（500）');
				// top.warn(request.responseJSON.msg);
			}
			//兼容PC端 ajax请求返回格式数据   {success:false,msg:'',data:{}}
//			else if((typeof request.responseJSON.success != 'undefined') && !request.responseJSON.success)
//			{
//				top.warn(request.responseJSON.msg);
//			}
		}
	}
});

//------------------------------------------------------------------------------------------
//		Loading
//------------------------------------------------------------------------------------------

var $RequestCount = 0;
var $Loading = $(".interruption", top.document);
// 默认关闭，避免上一个页面状态影响
// $Loading.hide();

// TODO 弹出层双击关闭（避免异常情况发生后页面无法点击操作的问题）
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
	// $.fn.pagination.defaults.pageList = [20, 50, 100, 200];
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
//		HighCharts
//------------------------------------------------------------------------------------------

if (typeof Highcharts != 'undefined')
{
	// 设置Highcharts默认属性
	Highcharts.setOptions(
	{
		// 不显示credits信息
		credits: {enabled: false, href: '', text: ''}
	});
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

//------------------------------------------------------------------------------------------
//		通用方法区
//------------------------------------------------------------------------------------------

/**
 * 还原Html特殊字符（&, \n, "，'）
 */
function decodeHtml(value)
{
	if (value && 'string' == typeof value)
	{
		var newValue = value;
		$.each(HtmlSpecialChar, function(idx, r)
		{
			if (-1 != newValue.indexOf(r.html))
			{
				newValue = newValue.replace(new RegExp(r.html, "gm"), r.text);
				//console.log(i + "：" + newValue);
			}
		});

		return newValue;
	}
	else
		return value;
}

/**
 * 计算Unicode文字的实际长度
 */
function getUnicodeLength(value)
{
	if ('string' == typeof(value))
		return value.replace(/[^\x00-\xff]/g,"**").length;
	else
		return 0;
}

/**
 * 智能格式化文件尺寸大小
 */
function getNiceFileSize(value)
{
	var fileSizeByte = 0;
	if (typeof (fileSizeByte) == "string")
		fileSizeByte = parseInt(value);
	else
		fileSizeByte = value;

	if (fileSizeByte < GB)
	{
		if (fileSizeByte < MB)
		{
			if (fileSizeByte < KB)
				return fileSizeByte + ' B';
			else
				return Math.ceil(fileSizeByte / KB) + ' KB';
		}
		else
			return Math.ceil(100 * fileSizeByte / MB) / 100 + ' MB';
	}
	else
		return Math.ceil(100 * fileSizeByte / GB) / 100 + ' GB';
}

/**
 * jQuery ajax 错误handler函数
 */
function showjQueryError(request, textStatus, error)
{
	alert("Ajax request failed: " + error);
}

/**
 * 拼装下拉框option选项
 */
function getSelectOptions(rows, defaultValue)
{
	var opt = '';
	$.each(rows, function(index, r)
	{
		opt += '<option value="' + r[0] + '"' + (r[0] == defaultValue ? ' selected' : '') + '>' + r[1] + '</option>';
	});

	return opt;
}

/**
 * 回填Form表单数据（触发元素事件）
 *
 * @param form	Form ID
 * @param json	Form数据
 */
function fillFormData(form, json)
{
	var form = $('form[id=' + form + ']');
	if (form && json)
	{
		var thisInput = null;
		var inputs = form.find('input,select,radio,checkbox,textarea');
		for (var i = 0; i < inputs.length; i++)
		{
			thisInput = $(inputs[i]);
			if (json.hasOwnProperty(thisInput.prop('name')))
			{
                // 复选框 || 单选按钮
				if ('checkbox' == thisInput.context.type || 'radio' == thisInput.context.type)
				{
					// 值完全相等 || 多个Checkbox命名相同
					if (thisInput.val() == json[thisInput.prop('name')] || -1 != (',' + json[thisInput.prop('name')] + ',').indexOf(',' + thisInput.val() + ','))
					{
						thisInput.attr("checked","checked").trigger("change");
					}
				}
				// 下拉框
				else if ('select-one' == thisInput.context.type) {
					thisInput.find("option").each(function(){
                        if($(this).attr("value") == json[thisInput.prop('name')]){
                            $(this).attr("selected",true);
                            $(this).siblings().removeAttr("selected");
                        }
                    });
                }
				else
				{
					// 普通字段：还原html特殊字符
					thisInput.val(decodeHtml(json[thisInput.prop('name')])).trigger("change");
				}
			}
		}

		if (isPC())
		{
			$(inputs[0]).focus();
		}
	}
	else
		warn('表单数据回填失败：' + form, function(){});
}

/**
 * 通过JS语句判断访问端是电脑还是手机
 */
function isPC() 
{
	var flag = true;
	var ua = navigator.userAgent;

	for (var v = 0; v < MobileUserAgents.length; v++)
	{
		if (ua.indexOf(MobileUserAgents[v]) > 0)
		{
			flag = false;
			break;
		}
	}

	return flag;
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
function infoTip(message, callback)
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
function warnTip(message, callback)
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
function errorTip(message, callback)
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
function confirmTip(message, confirmCallback, cancelCallback)
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

//------------------------------------------------------------------------------------------
//		Table列Formatter
//------------------------------------------------------------------------------------------

/**
 * 日期列格式化
 */
function commDateColumnFormatter(val, r)
{
	if (null != val && val.length > 10)
		return val.substr(0, 10)
	else
		return val;
}

/**
 * 多行文本列格式化
 */
function commRemarkColumnFormatter(val, r)
{
	if (val)
		return decodeHtml(val);
	else
		return val;
}

//------------------------------------------------------------------------------------------
//		小数精确计算方法
//------------------------------------------------------------------------------------------

/**
 * Float四则运算
 */
function demicalFloat(numberA, numberB, type)
{
	if(numberA == null || numberB == null)
	{
		return "";
	} else if((numberA == 0 || numberB == 0) && type == "/")
	{
		return "";
	}
	numberA = numberA.toString().replaceAll(",", "");
	numberB = numberB.toString().replaceAll(",", "");
	var h = (type == "*") ? "+" : "-";
	var c = [get(numberA), get(numberB)];
	var A = c[0][1]; //numberA 的數字
	var B = c[1][1]; //numberB 的數字
	var pointA = c[0][0]; //numberA 的小數位數
	var pointB = c[1][0]; //numberB 的小數位數

	if (type == "*" || type=="/")
	{
		var k1 = eval("numberA" + type + "numberB");
		var k2 = eval("(A" + type + "B)");

		if (get(k1)[1] == k2)
			return k1;
		else
			return (pointA + pointB == 0 ? k1 : eval(k2 + "/Math.pow(10,pointA" + h + "pointB)"));
}
else
	if (type == "+" || type == "-")
	{
		var pointL=pointA;

		if (pointA < pointB)
			pointL=pointB;

		numberA = demicalFloat(numberA, Math.pow(10, pointL), "*");
		numberB = demicalFloat(numberB, Math.pow(10, pointL), "*");

		return eval("numberA" + type + "numberB")/Math.pow(10,pointL);
	}
	else
		return "[ Can't calculate! ]";
}

/**
 * 转换数字格式
 */
function get(number)
{
	number = "" + number;

	if (number.indexOf(".") == -1)
		return [0, parseInt(number)];

	//小數位數
	var po = number.split(".")[1].length;
	//轉成整數 4.1 --＞ 41 ， 4.33 --＞ 433

	var st = number.split(".").join("");

	//將前置 0 拿掉
	for (var i = 0; i < st.length; i++)
	{
		if (st.charAt(0) == "0")
			st = st.substr(1, st.length);
	}

	//傳回一個陣列，陣列 0 存小數位數， 陣列 1 存數字
	return [po,parseInt(st)];
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
$(document).ready(function () {//为了保证能在img元素加载之后，才为这些元素设置error事件  
    /*$("img").error(function () {
        $(this).attr("src", $AppContext + "/statics2/image/no-image.png");//JSP页面
    });*/
});  