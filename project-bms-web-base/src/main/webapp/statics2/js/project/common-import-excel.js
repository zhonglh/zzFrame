
var options = {};
// 是否删除服务器中的文件内容
options.isDelServerFile = true;
// 最大上传文件数量
options.maxCount = 1;
// 关联数据的ID
options.dataId = "";
// 单个文件大小限制
options.maxFileSize = (50 * 1024 * 1024);
// 默认上传地址
options.uploadUrl =  ($AppContext + dataUrl+"/doExcel" );
// 上传之前回调函数
options.beforeUpload =  function(){return true;};

// 创建文件上传
var uploader = WebUploader.create({
    auto: true,
    swf: $AppContext + '/statics2/js/webuploader/Uploader.swf',
    server: options.uploadUrl,
    pick: '#importExcel' ,
    fileNumLimit: (options.maxCount == 1?null:options.maxCount),
    // 验证单个文件大小是否超出限制, 超出则不允许加入队列。
    fileSingleSizeLimit: options.maxFileSize,
    //去重， 根据文件名字、文件大小和最后修改时间来生成hash Key.
    duplicate: false,
    //是否禁掉整个页面的拖拽功能，如果不禁用，图片拖进来的时候会默认被浏览器打开。
    disableGlobalDnd: true,
    accept: {
        title: 'Excel文件',
        extensions: 'xls,xlsx,XLS,XLSX',
        mimeTypes: 'application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    },

    // 禁掉分块传输，默认是开起的。
    chunked: false,

    // 禁掉上传前压缩功能
    compress: false
});


// 验证通过后，将文件添加到上传队列中
uploader.on('beforeFileQueued', function (file) {
    debugger;
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
    if(reason == 'F_EXCEED_SIZE'){
        error("附件不能大于50M。");
    }else if(reason == 'Q_TYPE_DENIED'){
        error("上传验证失败。");
    }else {
        error("文件上传失败。");
    }
});
