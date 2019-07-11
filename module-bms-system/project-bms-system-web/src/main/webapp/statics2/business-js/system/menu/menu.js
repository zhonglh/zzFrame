
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
                content: $('#iconsDiv')[0], effect: 'i-super-scale', width: 600, lock: true,
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

                                    $("#menuIcon").val($("#icon").val())

                                }
                            },
                        cancle: {val: '取消'}
                    }
            });


    }
    iconDialog.show();
}