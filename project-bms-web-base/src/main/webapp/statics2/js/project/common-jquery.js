
//------------------------------------------------------------------------------------------
//		jQuery
//------------------------------------------------------------------------------------------

// Global settings
$.ajaxSetup(
    {
        type: 'POST', dataType: 'json', headers: {'Powered-By': 'FORP'}, complete: function(request, textStatus)
    {
        if (request.responseJSON)
        {
            if (401 == request.responseJSON.code)
            {
                top.warn('您长时间没有操作，需要重新验证您的账号安全。<br/>请重新登录系统！', function()
                {
                    top.location.href = $AppContext + '/';
                });
            }
            else if (500 == request.responseJSON.code ) //|| 210 == request.responseJSON.code
            {
                //top.warn('系统繁忙，请稍后再试（500）');
                // top.warn(request.responseJSON.msg);
            }
            //兼容PC端 ajax请求返回格式数据   {success:false,msg:'',data:{}}
//			else if((typeof request.responseJSON.success != 'undefined') && !request.responseJSON.success)
//			{
//				top.warn(request.responseJSON.msg);
//			}
        }
    }
    });
