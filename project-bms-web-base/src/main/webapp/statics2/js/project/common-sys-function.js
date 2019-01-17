
/**
 * 文件上传
 * options{
	 * 		id: 绑定上传事件控件ID
	 * 		maxFileSize: 单个文件大小限制，默认为10 * 1024 * 1024
	 * 		uploadUrl: 文件上传地址
	 * 		deleteUrl: 文件删除地址
	 * 		viewAreaId: 上传完成后，文件显示区域
	 * 		dataId: 关联数据的ID
	 * 		fileSource: 数据来源，见cn.forp.cherry.cmm.vo.Attachment枚举定义
	 * 		maxCount: 最大上传文件数量，如果小于大于0，则没有限制，默认0.
	 * 		isDirectDel: 是否直接删除， 默认为是0.
	 * }
 */
function UploadFile(options)
{
    var that = this;
    that.id = options.id;
    // 最大上传文件数量
    options.isDirectDel = options.isDirectDel || 0;
    // 最大上传文件数量
    options.maxCount = options.maxCount || 0;
    // 单个文件大小限制
    options.dataId = options.dataId || "";
    // 单个文件大小限制
    options.fileSource = options.fileSource || "";
    // 单个文件大小限制
    options.maxFileSize = options.maxFileSize || (30 * 1024 * 1024);
    // 如果上传地址未指定，则为默认地址
    options.uploadUrl = options.uploadUrl || ($AppContext + "/base/file/upload?dataId=" + options.dataId + "&fileSource=" + options.fileSource);
    // 如果删除地址未指定，则为默认地址
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
        swf: $AppContext + '/js/webuploader/Uploader.swf',
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
            vewArea.append(getFileTemp(file.id, "", file.name, file.size));
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
        var id = "file-" + data.fileId;
        var fileQueued = vewArea.find('#' + file.id);
        fileQueued.attr("id", id)
        fileQueued.find('.progress').remove();
        fileQueued.attr("fileId", data.fileId);
        fileQueued.attr("docId", data.id);
        fileQueued.find(".file-remove").removeClass("hidden");
        // 文件容器发生变化
        fileChangeEvent(id, {id:data.id, fileId:data.fileId, name:file.name, size:getFileSize(file.size), isDel: 0});
        new DeleteFile(id, data.fileId, file.name, file, data.id, file.size);
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
        // 加载之前删除已经
        vewArea.find("li").remove();
        initFileList();
    };

    // 加载已经存在文件列表
    function initFileList(){
        $(options.viewAreaId + "_dataItems").find("span").each(function(){
            var fileId = $(this).attr("id");
            var size = $(this).attr("size");
            var docId = $(this).attr("docId");
            var name = $(this).html();
            var id = "file-" + fileId;

            var fileQueued = getFileTemp(id, fileId, name, size, docId);
            fileQueued.find(".file-remove").removeClass("hidden");
            vewArea.append(fileQueued);
            new DeleteFile(id, fileId, name, null, docId, size);
        });
    };

    // 初始化列表
    this.resetFileList();

    // 删除文件
    function DeleteFile(id, fileId, fileName, file, docId, size){
        vewArea.find('#' + id).find(".file-remove").bind("click", function(){
            confirm('您确定要删除该文件吗？', function ()
            {
                if(file || options.isDirectDel == 1){
                    // 新上传, 直接删除
                    $.ajax({
                        url: options.deleteUrl + fileId + "?fileName=" + fileName + "&docId=" + docId, type: 'DELETE',
                        success: function (rsp, status)
                        {
                            if (rsp.success) {
                                //删除成功
                                vewArea.find('#' + id).remove();
                                if(file != null){
                                    uploader.removeFile(file, true);
                                }
                                // 文件容器发生变化
                                fileChangeEvent(id, {id:docId, fileId:fileId, name:fileName, size:getFileSize(size), isDel: 1});
                            }
                            else {
                                error(rsp.msg);
                            }
                        }
                    });
                }else{
                    // 已经和数据建立关系，需要最后提交在删除
                    vewArea.find('#' + id).attr("isDel", 1);
                    vewArea.find('#' + id).hide();
                    // 文件容器发生变化
                    fileChangeEvent(id, {id:docId, fileId:fileId, name:fileName, size:getFileSize(size), isDel: 1});
                }
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
    function getFileTemp(id, fileId, name, size, docId){
        var html = '<li id="' + id +'" fileName="' + name + '" isDel="0" fileSize="' + size + '" fileId="' + fileId + '" docId="' + docId + '">' +
            '<a href="javascript:void(0);" class="file-operate file-remove hidden">' +
            '	<svg class="icon" aria-hidden="true">' +
            '		<use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>' +
            '	</svg>' +
            '</a>' +
            '<a href="javascript:void(0);" class="file-text" title="' + name + '">' +
            '	<svg class="icon" aria-hidden="true" style="float:left;margin-top: 6px;">' +
            '    	<use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-huixingzhen"></use>' +
            '  	</svg>' +
            '  	<span style="float:left;">' + name + '</span>' +
            '  	<span style="float:right;">' + getFileSize(size) + '</span>' +
            '</a>' +
            '<div style="clear: both;"></div>' +
            '</li>';

        return $(html);
    }
}


/**
 * 打开部门选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openDeptWin(config, callBack)
{
    var url = config.url || $AppContext + '/platform/dept/find-nodes';
    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden;" class="_w_height">' +
        '<table idField="id" treeField="name" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' +
        '			<th field="name" align="left">部门名称</th>' +
        '			<th field="remark" width=1 align="left">备注</th>' +
        '		</tr>'+
        '	</thead>' +
        '</table>' +
        '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_DeptList" + config.callId;
    options.url = url;
    options.callBack = callBack;
    options.sampleData = {id: "id", name: "name"};
    options.htmlTemple = tableTemple;
    var dialog = DialogTools.getDialog(options);

    return dialog;
};

/**
 * 地域选择窗口
 * @param config
 * @param callBack
 * @returns {*}
 */
function openAreaWin(config, callBack)
{
    var tableTemple = '<div class="easyui-panel" style="padding:0px 0px 0px 5px; border: 0; width: 415px;height:410px;">'
        + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
        + '<tr style="height: 35px;">'
        + '<td style="padding-left:8px;padding-top:5px">'
        + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
        + '<input name="_keyword" class="form-control input-sm" placeholder="市名称" title="请输入市名称" style="width: 300px; margin-left:-22px;">&nbsp;&nbsp;'
        + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
        + '</div>'
        + '</td>'
        + '</tr>'
        + '</table>'
        + '<div style="height: 350px; overflow-y:auto; overflow-x:hidden;" class="_w_height">'
        + '<table idField="id" treeField="areaName" class="_dataContorl">'
        + '	<thead>'
        + '		<tr>'
        + '			<th field="areaName" align="left">名称</th>'
        + '			<th field="remark" width=1 align="left">备注</th>'
        + '		</tr>'
        + '	</thead>'
        + '</table>'
        + '</div>'
        + '</div>';


    var options = config || {};
    options.width = 432;
    options.height = 510;
    options.id = "_AreaList" + config.callId;
    options.htmlTemple = tableTemple;
    options.url = $AppContext + '/base/area/all-tree';
    options.callBack = callBack;
    options.sampleData = {id: "id", name: "areaName"};
    options.callBack = callBack;
    options.compiledSuccess = function(){
        // 查询按钮事件
        dialog.tableTemple.find(".btn-success").bind("click", function(){
            search();
        });

        dialog.tableTemple.find('input[name="_keyword"]').keydown(function(e){
            if(e.keyCode==13){
                search();
            }
        });

        function search(){
            // 获取查询参数
            var params = options.params || {};
            params["keyword"] = dialog.tableTemple.find('input[name="_keyword"]').val();
            // 调用查询方法
            dialog.tableTemple.search(params);
        }
    };
    var dialog = DialogTools.getDialog(options);

    return dialog;
};


/**
 * 打开角色选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openUserRoleWin(config, callBack)
{
    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden; " class="_w_height">' +
        '<table idField="id" treeField="name" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' +
        '			<th field="name" width="100%" align="left">角色名称</th>' +
        '		</tr>' +
        '	</thead>' +
        '</table>' +
        '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_UserRoleList" + config.callId;
    options.htmlTemple = tableTemple;
    options.url = $AppContext + '/platform/role';
    options.callBack = callBack;

    var dialog = DialogTools.getDialog(options);

    return dialog;
};

/**
 * 打开岗位选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openStaffPostWin(config, callBack)
{
    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden; " class="_w_height">' +
        '<table idField="id" treeField="name" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' +
        '			<th field="name" width="100%" align="left">岗位名称</th>' +
        '		</tr>' +
        '	</thead>' +
        '</table>' +
        '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_StaffPostList" + config.callId;
    options.htmlTemple = tableTemple;
    options.url = $AppContext + '/base/staff/staffPost';
    options.callBack = callBack;

    var dialog = DialogTools.getDialog(options);

    return dialog;
};

/**
 * 打开通用选择窗口
 * callId	回显数据ID的控件ID
 * callName	回显数据名称的控件ID
 * clearId	清空选项的控件ID
 * callBack 选择后的回调函数
 * @returns
 */
function openSelectWin(config, callBack)
{
    var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden; " class="_w_height">' +
        '<table idField="' + config.sampleData.id + '" treeField="' + config.sampleData.name + '" class="_dataContorl">'  +
        '	<thead>'  +
        '		<tr>' +
        '			<th field="name" width="100%" align="left">' + config.title + '名称</th>' +
        '		</tr>' +
        '	</thead>' +
        '</table>' +
        '</div>';

    var options = config || {};
    options.width = 430;
    options.height = 450;
    options.id = "_SelectList" + config.callId;
    options.htmlTemple = tableTemple;
    options.callBack = callBack;

    var dialog = DialogTools.getDialog(options);

    return dialog;
};

// 部门选择控件
$.fn.OpenDeptSelectWin = function(config, callBack){
    var win = openDeptWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};


// 地区选择控件
$.fn.OpenAreaSelectWin = function(config, callBack){
    var win = openAreaWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};


// 选择控件
$.fn.OpenSelectWin = function(config, callBack){
    var win = openSelectWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};



// 系统角色选择控件
$.fn.OpenUserRoleSelectWin = function(config, callBack){
    var win = openUserRoleWin(config, callBack);
    $(this).unbind("click");
    $(this).bind("click", function(){
        win.show();
    });
    return win;
};


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


// 格式化时间
/*
Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "H+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}*/
