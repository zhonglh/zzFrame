
var iconDialog;
/**
 * 修改个图标
 */
function changeIcon()
{
    if (null == iconDialog)
    {
        iconDialog = iDialog(
            {
                content: $('#iconsDiv')[0], effect: 'i-super-scale', width: 900, height:400 , lock: true,
                btn:
                    {
                        ok:
                            {
                                val: '确定', type: 'green', click: function(btn)
                                {
                                    debugger ;
                                    if ($("#icon").val() == "")
                                    {
                                        warn('请先选择图标！');
                                        return false;
                                    }

                                    $("#menuIcon").val($("#icon").val());
                                    $("#icon-show").removeClass();
                                    $("#icon-show").addClass($("#icon").val());

                                }
                            },
                        cancle: {val: '取消'}
                    }
            });


    }
    iconDialog.show();
}