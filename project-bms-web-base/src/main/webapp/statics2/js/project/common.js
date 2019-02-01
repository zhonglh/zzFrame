

// 移动端User Agent
var MobileUserAgents = ["Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod"];
// Html特殊字符
var HtmlSpecialChar = [{html: '&amp;', text: '&'}, {html: '<br/>', text: '\r\n'}, {html: '<br/>', text: '\r\n'}, {html: '&quot;', text: '"'}, {html: '&acute;', text: '\''}];


/**
 * 弹出iframe层对话框
 *
 * @param title		        弹层title
 * @param url		        内容区域iframe的地址
 * @param closeCallback		关闭iframe层对话框回调函数
 * @param initCallback		弹出iframe层对话框回调函数
 */
function showIframeWindow(title, url, closeCallback, initCallback)
{
    var fullScreenMask = '\
	<div class="fullScreenMask">\
		<div class="navigation">\
			<span class="words"></span>\
			<a href="javascript:;" class="close-mask">\
				<svg class="icon" aria-hidden="true">\
				    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>\
				</svg>\
    		</a>\
		</div>\
		<div class="autoScrollContainer">\
			<iframe src=""></iframe>\
		</div>\
	</div>';

    var $fullScreenMask = $(fullScreenMask),
        $words = $fullScreenMask.find(".words"),
        $iframe = $fullScreenMask.find("iframe"),
        $close = $fullScreenMask.find(".close-mask");
    if ($.trim(title).length > 0) {
        $words.html(title);
    }else {
        $words.remove();
    }
    $iframe.attr("src",url);
    $close.on('click',function()
    {
        if(typeof(closeCallback) == "function")
        {
            closeCallback.call(this);
        }
        $fullScreenMask.remove();
    });

    // if ($(document.body).find('.fullScreenMask').length > 0)
    //	$(document.body).find('.fullScreenMask').remove();

    $(document.body).append($fullScreenMask);
    if(typeof(initCallback) == "function")
    {
        $fullScreenMask.show(function(){
            initCallback.call(this);
        });
    }
    else{
        $fullScreenMask.show();
    }
}

/**
 * 关闭iframe层对话框
 */
function closeIframeWindow(callback)
{
    if(typeof(callback) == "function")
    {
        callback.call(this);
    }

    // 关闭当前层
    $(window.frameElement.parentElement.parentElement).remove();
}



/**
 * 弹出iframe层对话框（带动画和切换）
 *
 * @param title				弹层title
 * @param url				内容区域iframe的地址
 * @param leftPadding		滑出时距左边的像素值，传整数即可
 * @param closeCallback		关闭iframe层对话框回调函数
 * @param initCallback		弹出iframe层对话框回调函数
 */
function slideIframeWindow(title, url, leftPadding, closeCallback, initCallback)
{
    var $fullScreenMask = $(document.body).find('.fullScreenMask');
    var $subMask = $(document.body).find('.subMask');
    if (0 == $subMask.length)
    {
        var i = 0;
        var fullScreenMask = '\
		<div class="fullScreenMask subMask">\
			<div class="navigation">\
				<span class="words"></span>\
				<a href="javascript:;" class="close-mask">\
					<svg class="icon" aria-hidden="true">\
						<use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>\
					</svg>\
				</a>\
			</div>\
			<div class="autoScrollContainer">\
				<iframe src=""></iframe>\
			</div>\
		</div>';

        $fullScreenMask = $(fullScreenMask),
            $words = $fullScreenMask.find(".words"),
            $iframe = $fullScreenMask.find("iframe"),
            $close = $fullScreenMask.find(".close-mask");
        if ($.trim(title).length > 0) {
            $words.html(title);
        }else {
            $words.remove();
        }

        $close.on('click',function()
        {
            if(typeof(closeCallback) == "function")
            {
                closeCallback.call(this);
            }
            $fullScreenMask.animate({left: "100%"}, function()
            {
                console.log($fullScreenMask);
                $fullScreenMask.remove();
                i--;
            });
        });

        $(document.body).append($fullScreenMask);
        i++;
        if(typeof(initCallback) == "function")
        {
            $fullScreenMask.show(function(){
                initCallback.call(this);
            });
        }
        else
        {
            $fullScreenMask.show();
        }
        $fullScreenMask.animate({left: (leftPadding ? leftPadding : '600px')});
        $fullScreenMask.find("iframe").attr("src", url);
    }

    // TODO change title
    $subMask.find("iframe").attr("src", url);
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
 * 侧滑层
 * @param url
 * @param pHeight
 * @param pWidth
 * @returns
 */
function showPanel(url,pHeight,pWidth){
    pHeight = pHeight?pHeight:'100%';
    pWidth = pWidth?pWidth:'80%'
    if($("body").find("#shadePanel").length==0){
        var html = '<style>';
        html += '#shadePanel {position:absolute;top:0;padding-top:10px;right:-50%;width:'+pWidth+';height:'+pHeight+';background:#fff;z-index:15;opacity:0;transition:all 1s;-moz-transition:all 1s;-webkit-transition:all 1s;-o-transition:all 1;}';
        html += '</style>';
        html += '<div class="shade" id="viewShade" onclick="closePanel(0)" style="display:none" ><div class="shade-img"> <img src="'+$AppContext+'/image/packup.png"></div></div>';
        html += '<iframe  frameborder="0" id="shadePanel" ></iframe>';
        html += '<script>'
        html += 'function closePanel(type){if(type==0){confirm("确定关闭页面吗?",function(){';
        html += '$("#shadePanel").css({right:-window.screen.availWidth,opacity:0});$("#viewShade").hide();})';
        html += '}else{$("#shadePanel").css({right:-window.screen.availWidth,opacity:0});$("#viewShade").hide();}}';
        html += '';
        html += '<\/script>';
        $("body").append(html);
    }
    $("#shadePanel").attr("src",url)
    $("#viewShade").show();
    $("#shadePanel").css({right:"0",opacity:1})
}

/**
 * 打开项目文档
 * @returns
 */
function openDocumentView(url)
{
    if (window.plus)
    {
        // App端下载
        plus.runtime.openURL(JSON.parse(plus.storage.getItem("forp_server_url")) + url);
    }
    else
    {
        if(type <= 1)
        {
            // 项目文档
            window.open($AppContext + url);
        }
        else
        {
            // 其他业务文档
            window.open($AppContext + url);
        }
    }
}



/**
 * 禁止空格输入
 */
function banInputSapce(e){
    var keynum;
    if(window.event){
        keynum = e.keyCode
    }else if(e.which){
        keynum = e.which
    }
    if(keynum == 32){
        return false;
    }
    return true;
}

/**
 * 获取请求地址参数
 * @param name
 * @returns
 */
function GetScriptParam(name)
{
    var val = "";
    for(var m=0; m<document.scripts.length; m++){
        var src = document.scripts[m].src;
        var args = src.substr(src.indexOf("?") + 1).split("&");
        for ( var i = 0; i < args.length; i++) {
            var j = args[i].indexOf("=");
            if (j > -1 && args[i].substr(0, j) == name) {
                val = args[i].substr(j + 1);
            }
        }
    }

    return val;
}


/**
 * 动态加载css 和 js
 */
var dynamicLoading = {
    css: function(path){
        if(!path || path.length === 0){
            throw new Error('argument "path" is required !');
        }
        var head = document.getElementsByTagName('head')[0];
        var link = document.createElement('link');
        link.href = path;
        link.rel = 'stylesheet';
        link.type = 'text/css';
        head.appendChild(link);
    },
    js: function(path){
        if(!path || path.length === 0){
            throw new Error('argument "path" is required !');
        }
        var head = document.getElementsByTagName('head')[0];
        var script = document.createElement('script');
        script.src = path;
        script.type = 'text/javascript';
        head.appendChild(script);
    }
}


/**
 * 获取用户的头像图片URL
 *
 * @param avatar			头像文件名称
 * @param domainId		域ID
 */
function getUserAvatarUrl(avatar, domainId)
{
    if ('file' == $AttachmentEngine)
        return $AppContext + '/statics2/image/' + ('default.png' == avatar ? '' : domainId + '/') + avatar;
    else
    if ('mongodb' == $AttachmentEngine)
    {
        if ('default.png' == avatar)
            return $AppContext + '/statics2/image/default.png';
        else
            return $AppContext + '/third/mongodb/' + avatar;
    }
    else
    if ('alibaba' == $AttachmentEngine)
        return 'http://' + $AlibabaMediaNameSpace + '.image.alimmdn.com/user-avatar/' + avatar;

    return '';
}



/**
 * 加载富文本html内容
 *
 * @param type			业务类别编号（查看“研发部\技术规范\上传文件编号规则.xlsx”）
 * @param id				业务ID
 * @param callback		回调方法
 */
function loadRichTextContent(type, id, callback)
{
    Ext.Ajax.request(
        {
            url: $AppContext + '/platform/thirdManager!loadRichTextContent.do?type=' + type + '&id=' + id, failure: handleAjaxFailure, success: function(response, opts)
        {
            var json = Ext.decode(response.responseText);
            if (json.success)
                callback.call(this, json.html);
            else
                error(json.msg);
        }
        });
}

