
/**
 * 判断是否在AllPage 页面上
 * @returns {boolean}
 */
function isInAllPage(){
    return true;
    //return $(".easyui-tabs" , parent.window).length > 0;
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
 * 金额格式化
 * @param val
 * @param r
 * @returns {String}
 */
function moneyFmt(val, r){
    return FormatMoney(val,4,true);
}