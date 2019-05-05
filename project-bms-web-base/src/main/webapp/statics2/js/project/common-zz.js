


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
    if(queryString != undefined && queryString != ""){
        var simpleQueryString = queryString;
        if(queryString.startsWith("inAllPage=1&")){
            simpleQueryString = simpleQueryString.substring(12,simpleQueryString.length);
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
        eval(e);
    }

}