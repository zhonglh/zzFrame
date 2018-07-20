// jQuery初始化
$(function() {
    //开启验证
    $("form").validate();


});

//取消新增
function cancel() {
    closeIframeWindow();
}

//点击日期选择的×号按钮
function clearTime(time) {
    $(time).val('');
}

//保存方法
function save() {
    $("form").validate();
    // 校验数据规则
    if(!$("form").valid()) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }


    //提交表单
    $.ajax({
        url: '',
        type: 'POST',
        data: $("form").serializeToString() ,
        success: function(rsp, status) {
            if(rsp.success) {
                info(rsp.msg);
                //刷新页面数据
                parent.search();
                cancel();
                parent.doView(rsp.data);
            }else{
                warn(rsp.msg);
            }
        }
    });
}
