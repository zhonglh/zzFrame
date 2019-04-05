// jQuery初始化
$(function() {
    //开启验证
    $("form").validate();


});


//点击日期选择的×号按钮
function clearTime(time) {
    $(time).val('');
}


//关闭窗口
function closeWindow() {
    closeIframeWindow();
}


/**
 * 切换 编辑 和 明细 模式
 */
function switchEditDetail() {
    $("#toolBar").find("button").each(function(){
        if($(this).hasClass("hide")){
            $(this).removeClass("hide");
        }else{
            $(this).addClass("hide");
        }
    });

    if(showMode === "detail"){
        // 转为编辑模式
        $(".editForm").removeClass("hide");
        $(".detailForm").addClass("hide");


        $(".editForm").clearValidate();
        $(".editForm").validate();

        $(".editForm").tform().showEdit();

        showMode = "eidt"

    }else {
        $(".editForm").addClass("hide");
        $(".detailForm").removeClass("hide");

        showMode = "detail"
    }





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
        parent.search();
        //parent.toUpdate(rsp.id);
        closeWindow();
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
        //切换到显示界面
        //switchEditDetail();
        //$(".editForm").tform().showDetail(true);
        info(rsp.msg);
        parent.search();
        closeWindow();
    }else{
        warn(rsp.msg);
    }
}

