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
        $("#editForm").removeClass("hide");
        $("#detailForm").addClass("hide");


        $("#editForm").clearValidate();
        $("#editForm").validate();

        $("#editForm").tform().showEdit();

        showMode = "eidt"

    }else {
        $("#editForm").addClass("hide");
        $("#detailForm").removeClass("hide");

        showMode = "detail"
    }





}


//保存方法
function doSave() {
    $("#editForm").validate();
    // 校验数据规则
    if(!$("#editForm").valid()) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("#editForm").serializeToString() ,
        success: function(rsp, status) {
            if(rsp.success) {
                info(rsp.msg);
                parent.search();
                parent.toUpdate(rsp.id);
                closeWindow();
            }else{
                warn(rsp.msg);
            }
        }
    });
}



//修改方法
function doUpdate() {
    $("#editForm").validate();
    // 校验数据规则
    if(!$("editForm").valid()) {
        warn('更新失败：表单信息填写不完整！');
        return false;
    }

    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("#editForm").serializeToString() ,
        success: function(rsp, status) {
            if(rsp.success) {
                parent.search();
                switchEditDetail();
                debugger;
                $("#editForm").tform().showDetail(true);
                info(rsp.msg);
            }else{
                warn(rsp.msg);
            }
        }
    });
}

