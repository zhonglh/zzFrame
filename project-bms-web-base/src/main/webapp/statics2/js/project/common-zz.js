


/**
 * 判断是否在AllPage 页面上
 * @returns {boolean}
 */
function isInAllPage(){
    try{
        if(inAllPage == undefined || inAllPage == null || inAllPage == ""){
            return false;
        }else {
            return true;
        }
    }catch(e){
        return false;
    }
}


function getSimpleQueryString(queryString){
    if(queryString != undefined && queryString != null && queryString != ""){
        var simpleQueryString = queryString;
        if(queryString.startsWith("inAllPage=1")){
            simpleQueryString = simpleQueryString.substring(11,simpleQueryString.length);
        }
        if(simpleQueryString.indexOf("inAllPage=1")!=-1){
            var index = simpleQueryString.indexOf("inAllPage=1");
            simpleQueryString=simpleQueryString.substr(0,index) + simpleQueryString.substr(index+11 , simpleQueryString.length);
        }
        return simpleQueryString;
    }else {
        return "";
    }
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
    if( typeof(val) === "number"){
        return changeDateFormat(val);
    }else {
        return val.substring(0, 10);
    }
}



function changeDateFormat(cellval) {
    var dateVal = cellval + "";
    if (cellval != null) {
        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

        return date.getFullYear() + "-" + month + "-" + currentDate ;
    }
}


function datetimeFmt(val,row){
    if(null==val||""==val){
        return "";
    }
    if( typeof(val) === "number"){
        return changeDatetimeFormat(val);
    }else {
        return val.substring(0, 19);
    }
}



function changeDatetimeFormat(cellval) {
    var dateVal = cellval + "";
    if (cellval != null) {
        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
    }
}


/**
 * 金额格式化
 * @param val
 * @param r
 * @returns {String}
 */
function moneyFmt(val, r){
    return FormatMoney(val,2,true);
}


/**
 * 金额格式化
 * @param val
 * @param r
 * @returns {String}
 */
function money4Fmt(val, r){
    return FormatMoney(val,4,true);
}

//设置选中项
function checkedOption(str,val){
    if(val == undefined || val == null || val == ""){
        return str;
    }
    var serachStr = "'"+val+"'";
    var index = str.indexOf(serachStr);
    if(""!=val && -1!=index){
        index += serachStr.length;
        var before = str.substring(0,index);
        var after = str.substring(index,str.length);
        return before +" selected " +after;
    }
    return str;
}


/**
 * 将值放入到table.row里
 * @param index
 */
function costTableRows(easyuiTableId , tableJavaName , index){
    var row = $('#'+easyuiTableId).datagrid("getRows")[index];

    for(var item in row){
        var val = $("#"+tableJavaName+"_"+index+"_"+item).val();
        if(val == undefined || val == null){
            val = "";
        }
        var e = "row."+item + "= '" +val+ "'";
        try {
            eval(e);
        }catch(e){}
    }

}


/**
 * 去掉字符中所有的逗号
 * @param str
 * @returns {*}
 */
function clearComma(str) {
    return str.replace(/,/g, "");
}

/**
 * 将输入框中的数据转换为数字， 如果不是数字返回0
 */
function changeDouble(val){
    if(val == undefined || val == "" || val == null){
        return 0;
    }

    var thisVal = 0.0;
    try{
        thisVal = parseFloat(val);
        thisVal = fixed(thisVal);
    }catch(e){
        thisVal = 0.0;
    }
    if(isNaN( thisVal )) thisVal = 0;
    return thisVal;
}

/**
 * 四舍五入
 * @param result
 */
function fixed(result){
    result = parseFloat(result).toFixed(10);
    result = parseFloat(result);
    return parseFloat(tofixed1(result,2));
}

/**
 * 真正四舍五入
 * @param result
 * @param fractionDigits
 * @returns
 */
function tofixed1(result,fractionDigits){
    try{
        with(Math){
            return parseFloat(round(this*pow(10,d)))/pow(10,d);
        }
    }catch(e){
    }

    return result.toFixed(fractionDigits);
}




// 格式化时间
/*
Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "H+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}*/
