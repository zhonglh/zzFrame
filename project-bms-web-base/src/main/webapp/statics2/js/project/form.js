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
    if(!isInAllPage()) {
        closeIframeWindow();
    }else {
        parent.closeIframeWindow();
    }
}


var tableHeight = 37;

//显示编辑
function openEdit(){
    tableHeight = 44;
    $(".form").validate();//开启验证
    $(".easyui-datagrid").datagrid("showColumn","option");
    $(".show-area").show();
    $(".hide-area").hide();

    $.each($(".easyui-datagrid"),function(index,value){
        var rows = $(this).datagrid("getRows");
        $(this).datagrid("resize", {height: (rows.length + 1) * tableHeight});
    });
    $(".form").tform().showEdit();
}

//取消编辑
function cancelEdit(){
    tableHeight = 37;
    $(".show-area").hide();
    $(".hide-area").show();
    $(".easyui-datagrid").datagrid("hideColumn","option");
    $('.easyui-datagrid').datagrid("reload");
    $(".form").clearValidate();//清除验证
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
        if(isInAllPage()){
            try{
                saveAfter(rsp.id);
            }catch(e){
            }

            try{
                parent.parent.search();
            }catch(e){
            }
            var h = $AppContext+dataUrl+"/"+rsp.id+"/update";
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
        info(rsp.msg);
        if(isInAllPage()){
            $("form").tform().showDetail(true);
            try{
                updateAfter();
            }catch(e){
            }

            try{
                parent.parent.search();
            }catch(e){
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

