// jQuery初始化
$(function() {
    //开启验证
    $("#form").validate();

    //绑定区域选择弹窗
    $('.areaInfo').OpenAreaSelectWin({
        title: '省市',
        selectType: 't1',
        callId: 'areaId',
        callName: 'areaName',
        clearId: 'clearAreaInfo',
        isSelectedLeaf: "true",
        checkFun: function(id, name, obj){
            if(obj.parentId <= 1){
                warn('请选择市名称');
                return false;
            }
            return true;
        }
    }, function(id, name, obj){
        $("#areaName").val(obj.parentName + ">" + name);
    });

    //绑定行业选择弹窗
    $('.investTradeInfo').OpenIndustrySelectWin({
        title: '行业',
        selectType: 't1',
        callId: 'investTradeId',
        callName: 'investTradeName',
        clearId: 'clearInvestTradeInfo'});

    //项目经理选择弹窗
    $(".managerInfo").OpenUserSelectWin({title: "基金经理",selectType: "d1",callId: "managerId",callName: "managerName",clearId: "clearManagerInfo"},function(id,name,row){
        $("input[name='deptName']").val(row.deptName);
        $("input[name='deptId']").val(row.deptId);
    });

    //部门选择
    $(".deptInfo").OpenDeptSelectWin({title: "部门",selectType: "t1",callId: "deptId",callName: "deptName",clearId: "clearDeptInfo"});
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
function save(id) {
    $("#form").validate();
    // 校验数据规则
    if(!$("#form").valid()) {
        warn('保存失败：表单信息填写不完整！');
        return false;
    }

    var fileIds = [];
    $("#doc1 li").each(function(){
        var docId = $(this).attr("docId");
        var isDel = $(this).attr("isDel");
        fileIds.push({docId:docId, isDel:isDel});
    });

    //提交表单
    $.ajax({
        url: '/tzcp/prj/project/my-project/'+id,
        type: 'POST',
        data: $("#form").serializeToString() + "&fileIds=" + JSON.stringify(fileIds),
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
