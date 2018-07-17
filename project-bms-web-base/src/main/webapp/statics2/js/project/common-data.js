
//数据处理



// 文件尺寸
var KB = 1024;
var MB = KB * 1024;
var GB = MB * 1024;




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
 * 格式化文件尺寸大小
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


function decimalCheck(that, n)
{
	n = n || that.attr("precision");
	n = n || 0;
	$(that).unbind("input");
	$(that).bind("input", function(e){
		var obj = that[0];
		var oldValue = obj.value;
		if(!oldValue){
			return;
		}
		var selectStart = obj.selectionStart;
		
		//清除“数字”和“.”以外的字符 
		obj.value = obj.value.replace(/^\./g, "");
		obj.value = obj.value.replace(/[^\d.-]/g, ""); 

		//只保留第一个. 清除多余的  
		obj.value = obj.value.replace(/\.{2,}/g, ".");
		obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", "."); 
		eval("var re = \/^(\\-)*(\\d+)\\.(\\d{" + n + "}).*$/");

		//只能输入两个小数  
		obj.value = obj.value.replace(re, '$1$2.$3');
		
		if(obj.value.length > 0){
			// 以上已经过滤，此处控制的是如果没有小数点，首位不能为类似于 01、02的金额 
			obj.value = obj.value.replace(/^0{2}/g, "0");
			obj.value = obj.value.substring(0, 1) + obj.value.substring(1).replace(/\-/g, "");
		}
		
		if(n == 0){
			obj.value = obj.value.replace(/\./g, "");
		}
		var isFormat = $(this).attr("isFormat") || "true";
		if(isFormat == "true")
		{
			// 格式化金额
			obj.value = formatNumber(obj.value);
		}
		
		var endIndex = oldValue.length - selectStart;
		endIndex = endIndex < 0? 0: endIndex;
		endIndex = obj.value.length - endIndex;
		endIndex = endIndex < 0? 0: endIndex;
		obj.selectionStart = endIndex;
		obj.selectionEnd = endIndex;
	});

	var maxNumber = 99999999999999999999.9999;
	$(that).bind("keydown", function(e){
		e = e ? e : event;
		if((e.keyCode >= 48 && e.keyCode <= 57) || (e.keyCode >= 96 && e.keyCode <= 105))
		{
			var val = this.value.replaceAll(",", "").split(".")[0];
			if(val > maxNumber)
			{
				return false;
			}
		}
		return true;
	});
	
	function formatNumber(val)
	{
		if(val.length > 0 && val != "-")
		{
			var sign = (val == Math.abs(val));
			var numxy = val.toString().split(".");
			var numx = Math.abs(numxy[0]).toString();
			for (var i = 0; i < Math.floor((numx.length - (1 + i)) / 3); i++){
				var index = (4 * i + 3);
				numx = numx.substring(0, numx.length - index) + ',' + numx.substring(numx.length - index);
			}
			
			if(val.toString().indexOf('.') >= 0)
			{
				val = "." + ((numxy.length > 1)?numxy[1]:"");
			}
			else
			{
				val = "";
			}
			val = numx + val;
			val = (sign?'':'-') + val;
		}
		return val;
	}
}

/**
 * 将数值四舍五入后格式化.
 * 
 * @param num 			数值(Number或者String)
 * @param cent 			要保留的小数位(Number)
 * @param isThousand 	是否需要千分位, ;
 * @return 格式的字符串,如'1,234,567.45'
 * @type String
 */
function FormatMoney (num, cent, isThousand)
{
	 // 检查传入数值为数值类型
	 if(null == num){
		 num = "0";
	 }
	 num = num.toString().replace(/\$|\,/g,'');
	 num = isNaN(num)?"0":num;
	 
	 // 获取符号(正/负数)
	 sign = (num == (num = Math.abs(num)));

	 num = Math.floor(num * Math.pow(10, cent) + 0.50000000001); // 把指定的小数位先转换成整数.多余的小数位四舍五入
	 cents = num % Math.pow(10, cent);       // 求出小数位数值
	 num = Math.floor(num / Math.pow(10, cent)).toString();  // 求出整数位数值
	 cents = cents.toString();        // 把小数位转换成字符串,以便求小数位长度

	 // 补足小数位到指定的位数
	 while(cents.length < cent){
		 cents = "0" + cents;
	 }
	 
	 if(isThousand != false && (isThousand == null || isThousand)) {
		 // 对整数部分进行千分位格式化.
		 for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++){
			 num = num.substring(0, num.length - (4 * i + 3)) + ',' + num.substring(num.length - (4 * i + 3));
		 }
	 }

	 if (cent > 0){
		 return (((sign)?'':'-') + num + '.' + cents);
	 }
	 return (((sign)?'':'-') + num);
}

/**
 * 金额转大写
 * @param n
 * @returns
 */
function MoneyToCny(n)
{
	if(n == null || n == ''){
		return '';
	}
	var fraction = ['角', '分'];  
    var digit = [  
        '零', '壹', '贰', '叁', '肆',  
        '伍', '陆', '柒', '捌', '玖'  
    ];  
    var unit = [  
        ['元', '万', '亿'],  
        ['', '拾', '佰', '仟']  
    ];  
    var head = n < 0 ? '欠' : '';  
    n = Math.abs(n);  
    var s = '';  
    for (var i = 0; i < fraction.length; i++) {  
        s += (digit[Math.floor(n * 10 * Math.pow(10, i)) % 10] + fraction[i]).replace(/零./, '');  
    }  
    s = s || '整';  
    n = Math.floor(n);  
    for (var i = 0; i < unit[0].length && n > 0; i++) {  
        var p = '';  
        for (var j = 0; j < unit[1].length && n > 0; j++) {  
            p = digit[n % 10] + unit[1][j] + p;  
            n = Math.floor(n / 10);  
        }  
        s = p.replace(/(零.)*零$/, '').replace(/^$/, '零') + unit[0][i] + s;  
    }  
    return head + s.replace(/(零.)*零元/, '元').replace(/(零.)+/g, '零').replace(/^整$/, '零元整');  
}




/**
 * 获取年份列表（从今年算起）
 *
 * @param years	年数
 */
function getYearArray(years)
{
    var ya = [], count = 0, y = 0;
    var thisYear = (new Date).getFullYear();
    while (count < years)
    {
        y = thisYear - count;
        ya.push([y, y + ' 年']);

        count++;
    }

    return ya;
}

/**
 * 格式化文件大小显示
 * @param fileSize	文件大小，单位B
 * @returns
 */
function getFileSize(fileSize)
{
	if(fileSize < 1024){
		return fileSize + "B";
	}else if(fileSize < (1024 * 1024)){
		return (fileSize/1024).toFixed(2) + "KB";
	}else if(fileSize < (1024 * 1024 * 1024)){
		return (fileSize/1024/1024).toFixed(2) + "M";
	}else{
		return (fileSize/1024/1024/1024).toFixed(2) + "G";
	}
};

/**
 * 解析参数
 * @param options JSON字符串
 * @returns
 */
function stringToJson(options)
{
	var jsonObj = {};
	if(options == null)
	{
		return jsonObj;
	}
	var params = options.split(",");
	for(var i=0; i<params.length; i++)
	{
		var item = params[i];
		if(item.split(":").length == 2)
		{
			var reg1 = new RegExp('"',"g");
			var reg2 = new RegExp('\'',"g");
			var key = $.trim(item.split(":")[0]).replace(reg1, "").replace(reg2, "");
			var val = $.trim(item.split(":")[1]).replace(reg1, "").replace(reg2, "");
			jsonObj[key] = val;
		}
	}
	return jsonObj;
}


