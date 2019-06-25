// jQuery初始化
$(function() {
    //开启验证
    $("form").validate();


});

/**
 * 下载文件
 * @param fileUseId
 */
function downloadFile(fileUseId)
{
    location.href = ctx + '/oss/file/download/' + fileUseId;
}


/**
 * 下载文件
 * @param fileUseId
 */
function viewFile(fileUseId)
{
    location.href = ctx + '/oss/file/view/' + fileUseId;
}

//点击日期选择的×号按钮
function clearTime(time) {
    $(time).val('');
}


//关闭窗口
function closeWindow() {
    if(!isInAllPage()) {
        closeIframeWindow();
    }else {
        var win = parent;
        var closePanel = $(".shade-close", parent.document);

        if(closePanel.length == 0){
            closePanel = $(".shade-close", parent.parent.document);
            win = parent.parent;
        }

        if(win.inAllPage == "1") {
            closePanel.click();
        }else{
            closeIframeWindowInAllPage();
        }
    }
}




//显示编辑
function openEdit(){
    $(".form").validate();//开启验证
    $(".show-area").show();
    $(".hide-area").hide();
    $(".easyui-datagrid").datagrid("showColumn","option");
    $(".form").tform().showEdit();
    
    try {
        $(".webuploader-container").UploadFile();

        $(".webuploader-container").each(function () {
            $(this).children().eq(1).width(80);
            $(this).children().eq(1).height(80);
        })
    }catch (e) {
        console.info(e)
    }

}

//取消编辑
function cancelEdit(){
    $(".show-area").hide();
    $(".hide-area").show();
    $('.easyui-datagrid').datagrid("reload");
    $(".easyui-datagrid").datagrid("hideColumn","option");
    $(".form").clearValidate();//清除验证
}




function computeFileSerialize() {
    try {
        var fileSerialize = "";
        $(".file-list").each(function () {

            var $ul = $(this);
            //8为 “thelist_” 的长度
            var fieldName = $ul.attr("id").substring(8) + "List";

            $ul.find("li").each(function (index, li) {
                $li = $(this);
                fileSerialize += "&" + fieldName + "[" + index + "].id=" + $li.attr("fileUseId");
                fileSerialize += "&" + fieldName + "[" + index + "].deleteFlag=" + $li.attr("isDel");
            });
        });
        return fileSerialize;
    } catch (e) {
        console.info(e)
    }
    return "";
}



//保存方法
function doSave() {
    var formCount = $("form").length;
    if(formCount == 0){
        warn('保存失败：没有表单信息！');
    }else if(formCount == 1){
        doSingleFormSave();
    }else {
        doMultiFormSave();
    }
}

function doSingleFormSave() {
    $("form").validate();
    // 校验数据规则
    if(!$("form").valid()) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }

    try{
        //业务上的逻辑校验
        var validateResult = customValidate();
        if(!validateResult){
            return false;
        }
    }catch(e){

    }

    var fileSerialize = "";
    try{
        fileSerialize = computeFileSerialize();
    }catch(e){}

    try{
        //业务上的逻辑处理
        customDoHandle();
    }catch(e){

    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("form").serializeToString() + fileSerialize ,
        success: function(rsp, status) {
            saveSuccess(rsp, status);
        }
    });
}


function doMultiFormSave() {

    $("form").validate();
    // 校验数据规则

    var valid = true;
    var forms = $("form");
    forms.each(function(index,f){
        var check = $(f).valid();
        if(check == false){
            valid = false;
        }
    });
    if(!valid) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }


    try{
        //业务上的逻辑校验
        var validateResult = customValidate();
        if(!validateResult){
            return false;
        }
    }catch(e){

    }


    try{
        //业务上的逻辑处理
        customDoHandle();
    }catch(e){

    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("form").serializeToString() ,
        success: function(rsp, status) {
            saveSuccess(rsp, status);
        }
    });
}

/**
 * 保存成功后的逻辑
 * @param rsp
 * @param status
 */
function saveSuccess(rsp, status){
    if(rsp.success) {
        info(rsp.msg);
        if(isInAllPage()){
            try{
                saveAfter(rsp.id);
            }catch(e){
            }

            try{
                parent.search();
            }catch(e){
                parent.parent.search();
            }
            var h = $AppContext+dataUrl+"/"+rsp.id+"/update?"+queryString;
            location.href = h;
        }else {

            try{
                parent.search();
            }catch(e){
            }

            closeWindow();
        }

    }else{
        warn(rsp.msg);
    }
}






//修改方法
function doUpdate() {
    var formCount = $("form").length;
    if(formCount == 0){
        warn('保存失败：没有表单信息！');
    }else if(formCount == 1){
        doSingleFormUpdate();
    }else {
        doMultiFormUpdate();
    }
}
function doSingleFormUpdate() {
    $("form").validate();
    // 校验数据规则
    if(!$("form").valid()) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }


    try{
        //业务上的逻辑校验
        var validateResult = customValidate();
        if(!validateResult){
            return false;
        }
    }catch(e){

    }





    var fileSerialize = "";
    try{
        fileSerialize = computeFileSerialize();
    }catch(e){}



    try{
        //业务上的逻辑处理
        customDoHandle();
    }catch(e){

    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("form").serializeToString() + fileSerialize,
        success: function(rsp, status) {
            updateSuccess(rsp, status);
        }
    });
}
function doMultiFormUpdate() {

    $("form").validate();
    // 校验数据规则

    var valid = true;
    var forms = $("form");
    forms.each(function(index,f){
        var check = $(f).valid();
        if(check == false){
            valid = false;
        }
    });
    if(!valid) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }



    try{
        //业务上的逻辑校验
        var validateResult = customValidate();
        if(!validateResult){
            return false;
        }
    }catch(e){

    }


    try{
        //业务上的逻辑处理
        customDoHandle();
    }catch(e){

    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("form").serializeToString() ,
        success: function(rsp, status) {
            updateSuccess(rsp, status);
        }
    });
}



/**
 * 修改成功后的处理逻辑
 * @param rsp
 * @param status
 */
function updateSuccess(rsp, status){
    if(rsp.success) {
        info(rsp.msg);
        if(isInAllPage()){
            $("form").tform().showDetail(true);
            try{
                updateAfter();
            }catch(e){
            }

            try{
                parent.search();
            }catch(e){
                parent.parent.search();
            }

            //切换到显示界面
            cancelEdit();
        }else {
            try{
                parent.search();
            }catch(e){
            }
            closeWindow();
        }
    }else{
        warn(rsp.msg);
    }
}



function printWindow(div) {
    $(div).printArea();
}