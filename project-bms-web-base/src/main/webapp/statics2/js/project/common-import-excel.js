


$.fn.UploadFile = function(config){
    var options = $(this).attr("data-options");
    options = stringToJson(options);
    options.id =  $(this).attr("id");
    options = $.extend(options, config || {});

    var uploadFile = null;

    if(uploadFile == null){
        options.html = $(this).html();
        uploadFile = new UploadFile(options);
    }
    return uploadFile;
};



// 给含有 webuploader-container 样式的元素绑定上传事件
$(".webuploader-container").each(function(){
    if(GetScriptParam("source") == "1"){
        // 表单来源，不初始化组件
        return;
    }
    // 获取参数
    var options = $(this).attr("data-options");
    options = stringToJson(options);
    var isInit = options.init||true;
    if(isInit == true){
        $(this).UploadFile();
    }
});




/**
 * 文件导入
 * options{
	 * 		id: 绑定上传事件控件ID
	 * 		maxFileSize: 单个文件大小限制，默认为50 * 1024 * 1024
	 * 		uploadUrl: 文件上传地址
	 * 		deleteUrl: 文件删除地址
	 * 		viewAreaId: 上传完成后，文件显示区域
	 * 		dataId: 关联数据的ID
	 * 		maxCount: 最大上传文件数量，如果小于大于0，则没有限制，默认0.
	 * 		isDelServerFile: 是否删除服务器中的文件内容.
	 * }
 */
function UploadFile(options)
{
    var that = this;
    that.id = options.id;
    // 是否删除服务器中的文件内容
    options.isDelServerFile = options.isDelServerFile || true;
    // 最大上传文件数量
    options.maxCount = options.maxCount || 0;
    // 关联数据的ID
    options.dataId = options.dataId || "";
    // 单个文件大小限制
    options.maxFileSize = options.maxFileSize || (50 * 1024 * 1024);
    // 默认上传地址
    options.uploadUrl = options.uploadUrl || ($AppContext + dataUrl+"/doExcel" );
    // 上传之前回调函数
    options.beforeUpload = options.beforeUpload || function(){return true;};
    that.options = options;

    // 创建文件上传
    var uploader = WebUploader.create({
        auto: true,
        swf: $AppContext + '/js/webuploader/Uploader.swf',
        server: options.uploadUrl,
        pick: {id: ('#' + options.id)},
        fileNumLimit: (options.maxCount == 1?null:options.maxCount),
        // 验证单个文件大小是否超出限制, 超出则不允许加入队列。
        fileSingleSizeLimit: options.maxFileSize,
        //去重， 根据文件名字、文件大小和最后修改时间来生成hash Key.
        duplicate: false,
        //是否禁掉整个页面的拖拽功能，如果不禁用，图片拖进来的时候会默认被浏览器打开。
        disableGlobalDnd: true
    });


    // 验证通过后，将文件添加到上传队列中
    uploader.on('beforeFileQueued', function (file) {
        if(file.size > options.maxFileSize){
            error("附件不能大于50M。");
            return false;
        }

        var bl = false;
        if(typeof options.beforeUpload == "function")
        {
            bl = options.beforeUpload(file);
        }
        else
        {
            bl = eval(options.beforeUpload + "(file);");
        }

        if(bl == true)
        {
            $Loading.show();
        }
    });


    // 上传成功
    uploader.on('uploadSuccess', function (file, response)
    {
        $Loading.fadeOut(500);
        var data = response.data;
        var id = "file-" + data.fileId;
        //todo 处理成功后的逻辑


    });

    // 上传失败回调函数
    uploader.on('uploadError', function (file, reason)
    {
        $Loading.fadeOut(500);
        error("导入失败。");
    });

    // 当validate不通过时，会以派送错误事件的形式通知调用者
    uploader.on('error', function (reason)
    {
        $Loading.fadeOut(500);
        error("导入失败。");
    });

}

