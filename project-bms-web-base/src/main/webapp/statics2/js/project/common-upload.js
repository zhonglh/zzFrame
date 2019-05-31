
$(function(){

var uploadFileList = [];
$.fn.UploadFile = function(config){
    var options = $(this).attr("data-options");
    options = stringToJson(options);
    options.id =  $(this).attr("id");
    options = $.extend(options, config || {});

    var uploadFile = null;
    for(var i=0; i<uploadFileList.length; i++){
        if(uploadFileList[i].id == options.id){
            uploadFile = uploadFileList[i];
        }
    }
    if(uploadFile == null){
        options.html = $(this).html();
        uploadFile = new UploadFile(options);
        uploadFileList.push(uploadFile);
    }

    uploadFile.remove = function(){
        // 删除附件
        for(var i=0; i<uploadFileList.length; i++){
            if(uploadFileList[i].id == this.id){
                uploadFileList.splice(i, 1);
                $("#" + this.id).html(this.options.html);
            }
        }
    }
    return uploadFile;
};



// 给含有 webuploader-container 样式的元素绑定上传事件
$(".webuploader-container").each(function(){
    debugger;
    if(GetScriptParam("source") == "1"){
        // 表单来源，不初始化组件
        return;
    }
    // 获取参数
    var options = $(this).attr("data-options");
    options = stringToJson(options);
    var isInit = options.init||true;
    if(Boolean(isInit) == true){
        $(this).UploadFile();
    }
});




/**
 * 文件上传
 * options{
	 * 		id: 绑定上传事件控件ID
	 * 		maxFileSize: 单个文件大小限制，默认为50 * 1024 * 1024
	 * 		uploadUrl: 文件上传地址
	 * 		deleteUrl: 文件删除地址
	 * 		viewAreaId: 上传完成后，文件显示区域
	 * 		dataId: 关联数据的ID
	 * 		maxCount: 最大上传文件数量，如果小于等于0，则没有限制，默认0.
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
    options.uploadUrl = options.uploadUrl || ($AppContext + "/base/file/upload?dataId=" + options.dataId );
    // 默认删除地址
    options.deleteUrl = options.deleteUrl || $AppContext + "/base/file/delete/";
    // 文件发生变化（新增、删除）
    options.fileChange = options.fileChange || function(){};
    // 上传之前回调函数
    options.beforeUpload = options.beforeUpload || function(){return true;};
    that.options = options;

    // 文件显示区域
    var vewArea =  $(options.viewAreaId);
    // 创建文件上传
    var uploader = WebUploader.create({
        auto: true,
        swf: $AppContext + '/statics2/js/webuploader/Uploader.swf',
        server: options.uploadUrl,
        pick: {id: ('#' + options.id)},
        fileNumLimit: (options.maxCount == 1?null:options.maxCount),
        fileSingleSizeLimit: options.maxFileSize, // 验证单个文件大小是否超出限制, 超出则不允许加入队列。
        duplicate: true,//去重， 根据文件名字、文件大小和最后修改时间来生成hash Key.
        disableGlobalDnd: true  //是否禁掉整个页面的拖拽功能，如果不禁用，图片拖进来的时候会默认被浏览器打开。
    });


    // 验证通过后，将文件添加到上传队列中
    uploader.on('beforeFileQueued', function (file) {
        if(file.size > options.maxFileSize){
            error("附件不能大于30M。");
            return false;
        }
        if(file.name.length > 200){
            error("文件名称长度不能大于200字。");
            return false;
        }
        if(options.maxCount == 1){
            vewArea.find("li").remove();
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
            vewArea.append(getFileTemp(file.id, "" ,"", file.name, file.size));
            $Loading.show();
        }
    });

    // 文件派送
    uploader.on('uploadProgress', function (file, percentage)
    {
        var $li = vewArea.find('#' + file.id),
            $percent = $li.find('.progress .progress-bar');

        // 避免重复创建
        if (!$percent.length) {
            var html = '<div class="progress progress-striped active" style="margin-top: 2px; margin-bottom: 5px; height: 5px; border-radius: 3px;">' +
                '	<div class="progress-bar" role="progressbar" style="width: 0%"></div>' +
                '</div>';
            $percent = $(html).appendTo($li).find('.progress-bar');
        }
        $percent.css('width', percentage * 100 + '%');
    });

    // 上传成功
    uploader.on('uploadSuccess', function (file, response)
    {
        $Loading.fadeOut(500);
        var data = response.data;
        var fileQueued = vewArea.find('#' + file.id);
        fileQueued.attr("id", file.id);
        fileQueued.find('.progress').remove();
        fileQueued.attr("showName", data.showName);
        fileQueued.attr("fileUseId", data.id);
        fileQueued.attr("accessUrl", data.accessUrl);
        fileQueued.attr("size", data.size);
        fileQueued.find(".file-remove").removeClass("hidden");
        // 文件容器发生变化
        fileChangeEvent(file.id, {id:id, showName:data.showName, accessUrl:data.accessUrl, size:getFileSize(data.size) ,deleteFlag:0} );
        new DeleteFile(file.id, '', file.name, data.accessUrl,  file.size  , file);
    });

    // 上传失败回调函数
    uploader.on('uploadError', function (file, reason)
    {
        $Loading.fadeOut(500);
        error("上传失败。", function(){
            if(file != null){
                vewArea.find('#' + file.id).remove();
                uploader.removeFile(file, true);
            }
        });
    });

    // 当validate不通过时，会以派送错误事件的形式通知调用者
    uploader.on('error', function (reason)
    {
        $Loading.fadeOut(500);
        if(reason == 'F_EXCEED_SIZE'){
            error("附件不能大于30M。");
        }else if(reason != 'Q_TYPE_DENIED'){
            error("上传验证失败。");
        }
    });

    this.resetFileList = function(){
        // 加载之前已删除
        vewArea.find("li").remove();
        initFileList();
    };

    // 加载已经存在文件列表
    function initFileList(){
        $(options.viewAreaId + "_dataItems").find("span").each(function(){
            var id = $(this).attr("id");
            var size = $(this).attr("size");
            var accessUrl = $(this).attr("accessUrl");
            var showName = $(this).attr("showName");
            var businessId =  $(this).attr("businessId");

            var fileQueued = getFileTemp(id, id, businessId , showName  , accessUrl , size);
            fileQueued.find(".file-remove").removeClass("hidden");
            vewArea.append(fileQueued);
            new DeleteFile(id, businessId, showName,  accessUrl, size  , null);
        });
    };

    // 初始化列表
    this.resetFileList();

    // 删除文件
    function DeleteFile(id , businessId , showName  , accessUrl , size  , file){
        vewArea.find('#' + id).find(".file-remove").bind("click", function(){
            var that = $(this);
            confirm('您确定要删除该文件吗？', function ()
            {
                if(businessId == undefined || businessId == '' || businessId == null){
                    // 新上传, 直接删除
                    vewArea.find('#' + id).remove();
                    if(file != null){
                        uploader.removeFile(file, true);
                    }
                }else{
                    // 已经和数据建立关系，需要最后提交在删除
                    vewArea.find('#' + id).attr("deleteFlag", 1);
                    vewArea.find('#' + id).hide();
                }

                // 文件容器发生变化
                fileChangeEvent(id, {id:id, showName:showName, accessUrl:accessUrl, size:getFileSize(size) , deleteFlag : 1} );
            });
        });
    };

    function fileChangeEvent(id, file)
    {
        if(typeof options.fileChange == "function")
        {
            options.fileChange(id, file);
        }else if(typeof options.fileChange != 'undefined' && options.fileChange != "")
        {
            eval(options.fileChange + "(id, file)");
        }
    }

    // 模板
    function getFileTemp(id , fileUseId ,  businessId , showName  , accessUrl , size){
        var html = '<li id="' + id +'" showName="' + showName + '" isDel="0" fileSize="' + size + '" businessId="' + businessId + '" fileUseId="' + fileUseId + '" accessUrl="' + accessUrl +  '">' +
            '<a href="javascript:void(0);" class="file-operate file-remove hidden">' +
            '	 <i class="fa fa-close"></i>' +
            '</a>' +
            '<a href="javascript:void(0);" class="file-text" title="' + name + '">' +
            '	<span style="float:left;padding: 0 5px;"><i class="fa fa-paperclip"></i></span>' +
            '  	<span style="float:left;">' + showName + '</span>' +
            '  	<span style="float:right;">' + getFileSize(size) + '</span>' +
            '</a>' +
            '<div style="clear: both;"></div>' +
            '</li>';

        return $(html);
    }

}




});

