//定义工具


$(function(){

    /**
     * 弹出窗口设置
     * options: {
	 * 		id: "控件的ID",
	 *      title: "标题",
	 * 		width: "宽度",
	 * 		height: "高度",
	 * 		url: "数据地址",
	 * 		data: "本地数据",
	 * 		selectIds: "初始化选择的行ID", 如果初始值为-1，则没保存选择的记录
	 * 		columns: "如果是dataGrid必须设置",
	 *      selectType: "数据类型, t1.treeGrid 单选, t2.treeGrid 多选(带复选框), t3.treeGrid 多选 d1.dataGrid 单选, d2.dataGrid 多选",
	 * 		htmlTemple： "控件模板, 如果是treeGrid，需要设置idField,treeField;如果是datagrid,需要设置pagination, sortName, sortOrder",
	 * 		checkFun: "检查函数"
	 * 		callBack: "回调函数",
	 * 		callId: "回显数据ID",
	 * 		callName: "回显数据名称",
	 * 		clearId: "清楚控件ID",
	 * 		isSelectedLeaf: "是否必须选中子节点，如果为dataTree组件，参数有效"
	 * 		isSelectedTop: "是否运行顶级点击可以选中"
	 * 		sampleData: {id:"数据主键", name:"需要显示的数据名称"}
	 * 		compiledSuccess: 编译成功回调函数
	 * 		showSelectArea:多选时是否显示已选择的数据信息，默认true
	 * }
     */
    var DialogTools =
        {
            SelectType: {ST1:"t1", ST2:"t2", ST3:"d1", ST4:"d2", ST5:"t3"},
            dialogList: [], // Dialog集合
            getDialog: function(options){
                //判断是否已经创建
                var dialog = null;
                for(var i=0; i<this.dialogList.length; i++){
                    if(this.dialogList[i].options.id == options.id){
                        dialog = this.dialogList[i];
                        break;
                    }
                }
                if(dialog == null)
                {
                    // 创建新的Dialog窗口
                    dialog = new DialogTools.CreateDialog(options);
                    this.dialogList.push(dialog);
                }else{
                    dialog.params = options.params || {};
                }
                return dialog;
            },
            remove: function(id){
                $("#" + id).parent().remove();
                for(var i=0; i<this.dialogList.length; i++){
                    if(this.dialogList[i].options.id == id){
                        this.dialogList.splice(i, 1);
                        break;
                    }
                }
            }
        };

    /**
     * 创建新的窗口
     */
    DialogTools.CreateDialog = function(options)
    {
        var that = this;
        that.isDialogInit = false;
        that.options = options;
        that.isRemember = !(options.selectIds == "-1");
        that.selectIds = $("#" + that.options.callId).val();
        that.selectIds = (that.selectIds != "-1")?that.selectIds:"";
        that.options.width = options.width || 400;
        that.options.height = options.height || 500;
        that.options.sampleData = options.sampleData || {id:"id", name:"name"};
        that.params = options.params || {};
        that.options.isSelectedLeaf = (that.options.isSelectedLeaf || false) + "";
        that.options.isSelectedTop = (that.options.isSelectedTop || false) + "";
        that.offsetHeight = 0; //高度偏移
        that.options.showSelectArea = (that.options.showSelectArea || true) + "";

        // 如果设置高度大于浏览器高度，则已浏览器高度为准。
        var winHeight = $(window).height();
        var dval = that.options.height - winHeight;
        if(dval > 0){
            that.offsetHeight = dval + 20;
            that.options.height = that.options.height - that.offsetHeight;
        }

        // 初始化
        function init(){
            that.dialog = iDialog({
                lock: true,
                width: that.options.width,
                height: that.options.height,
                content: that.getGridTemple(),
                btn: {
                    ok: {
                        val: '确定', type: 'green', click: function (btn)
                        {
                            var item = that.getSelectItem();
                            if(item){
                                var checked = true;
                                if(that.options.checkFun){
                                    // 业务验证
                                    checked = that.options.checkFun(item.id, item.name, item.obj);
                                }

                                if(checked){
                                    // 回调函数
                                    that.setValue(item);
                                    that.options.callBack && that.options.callBack(item.id, item.name, item.obj);
                                }
                                return checked;
                            }else{
                                return false;
                            }
                        }
                    },
                    cancle: {val: '取消'}
                }
            });
            that.dialog.$title.html('<i class="fa fa-sitemap"/>&nbsp;请选择' + that.options.title);

            // 初始化化列表数据
            that.initGrid();

            // 编译完成
            that.options.compiledSuccess && that.options.compiledSuccess(that.tableTemple);
        }

        // 绑定清空事件
        if(that.options.clearId){
            $("#" + that.options.clearId).bind("click", function(){
                that.clearValue();
                that.clearSelectItem();
            });
        }

        // 销毁控件
        that.remove = function(){
            DialogTools.remove(this.options.id);
        }

        // 显示Dialog
        that.show = function(){
            that.selectIds = $("#" + that.options.callId).val();
            if(that.isDialogInit == false){
                that.isDialogInit = true;
                init();
            }else{
                that.dialog.show();
                that.clearSelectItem();
                that.checkSelectItem();
            }
        }
        return this;
    };

    /**
     * 清空选择的值显示
     */
    DialogTools.CreateDialog.prototype.clearValue = function()
    {
        var that = this;
        that.selectIds = "";
        $("#" + that.options.callId).val("");

        var names = that.options.callName.split(",");
        for(var i=0; i<names.length; i++){
            var name = names[i];
            if(name.indexOf("[") > 0){
                name = name.substring(0, name.indexOf("["));
            }
            $("#" + name).val("");
        }
    }

    /**
     * 设置显示的值
     */
    DialogTools.CreateDialog.prototype.setValue = function(item, ignoreName)
    {
        var that = this;
        if(that.isRemember){
            that.selectIds = item.id + "";
        }
        // 回填数据
        if(that.options.callId){
            $("#" + that.options.callId).val(item.id);
        }
        if(that.options.callName){
            var names = that.options.callName.split(",");
            for(var i=0; i<names.length; i++){
                var value = "";
                var name = names[i];
                var field = name;

                if(name.indexOf("[") > 0){
                    field = name.substring(name.indexOf("[") + 1, name.length - 1);
                    name = name.substring(0, name.indexOf("["));
                    value = getItemName(field);
                }else{
                    if(i == 0){
                        value = item.name;
                    }else{
                        value = getItemName(field);
                    }
                }

                if(!(ignoreName == true && name == that.options.callName)){
                    $("#" + name).val(value);
                    $("#" + name).focusin().focusout();
                }
            }
        }

        function getItemName(key){
            var val = "";
            if(item.obj instanceof Array){
                for(var i=0; i<item.obj.length; i++){
                    if(i > 0){
                        val += ",";
                    }
                    val += item.obj[i][key];
                }
            }else{
                val = item.obj[key];
            }
            return val;
        }
    }

    /**
     * 设置Table必须属性
     */
    DialogTools.CreateDialog.prototype.getGridTemple = function()
    {
        // 更改模板高度
        var htmlTemple = $(this.options.htmlTemple).attr("id", this.options.id);
        // 处理datagrid和treegird高度问题
        if(this.options.selectType == DialogTools.SelectType.ST3 || this.options.selectType == DialogTools.SelectType.ST4)
        {
            htmlTemple.find("._dataContorl").wrap("<div class='m-datagrid'></div>");
            htmlTemple.find("._w_height").parent().css({height: (htmlTemple.height() - this.offsetHeight - 48) + "px"});
        }
        else
        {
            htmlTemple.find("._w_height").css({height: (htmlTemple.height() - this.offsetHeight - 48) + "px"});
        }
        htmlTemple.css({height: (htmlTemple.height() - this.offsetHeight) + "px"});

        // 特殊处理查询条件边框问题
        var extendCss = '<style type="text/css">';
        if(!htmlTemple.hasClass("easyui-panel"))
        {
            extendCss += '.i-dialog .i-content #' + this.options.id + ' .panel{margin: 0px; padding: 0px;}';
            extendCss += '.i-dialog .i-content #' + this.options.id + '._w_height{padding-top: 5px; padding-left: 9px;}';
        }
        else
        {
            extendCss += '.i-dialog .i-content #' + this.options.id + ' .panel{margin: 0px; padding: 0px; padding-left: 5px;}';
        }
        extendCss += '.i-dialog .i-content #' + this.options.id + '.selected-users-alter{max-height: 75px; margin-bottom: 5px; overflow-y: auto;white-space:normal;word-break:break-all;line-height: 30px; padding: 5px 5px; color: #ce8f22; background-color: #fffcee; border: 1px solid #f0dbb4;}';
        extendCss += '</style>';
        htmlTemple.append(extendCss);

        htmlTemple = $("<div></div>").append(htmlTemple);
        var tableTemple = htmlTemple.find("._dataContorl");
        if(this.options.selectType == DialogTools.SelectType.ST1){
            // gridTree 单选
            tableTemple.addClass("easyui-treegrid");
            tableTemple.attr("singleSelect", true);
            tableTemple.attr("animate", true);
        }else if(this.options.selectType == DialogTools.SelectType.ST2 || this.options.selectType == DialogTools.SelectType.ST5){
            // gridTree 多选
            tableTemple.addClass("easyui-treegrid");
            tableTemple.attr("singleSelect", false);
            tableTemple.attr("animate", true);
            htmlTemple.find("._w_height").before("<div class='selected-users'></div>");
            if(htmlTemple.find(".selected-users").parent().parent().html() == null)
            {
                htmlTemple.find(".selected-users").wrap("<div style='padding-left: 9px;'></div>");
            }
        }else if(this.options.selectType == DialogTools.SelectType.ST3){
            // dataGrid 单选
            tableTemple.addClass("easyui-datagrid");
            tableTemple.attr("singleSelect", true);
            tableTemple.attr("method", "post");
            tableTemple.attr("nowrap", false);
        }else if(this.options.selectType == DialogTools.SelectType.ST4){
            // dataGrid 多选
            tableTemple.addClass("easyui-datagrid");
            tableTemple.attr("singleSelect", false);
            tableTemple.attr("method", "post");
            tableTemple.attr("nowrap", false);

            htmlTemple.find("._searchTools").after("<div class='selected-users'></div>");
        }
        tableTemple.attr("fit", true);
        tableTemple.attr("fitColumns", true);
        tableTemple.attr("width", (this.options.width - 10));
        return htmlTemple.html();
    };


    /**
     * 初始化列表数据
     */
    DialogTools.CreateDialog.prototype.initGrid = function()
    {
        var that = this;
        if(this.options.selectType == DialogTools.SelectType.ST1){
            // gridTree 单选
            this.singleGridTreeSelect();
        }else if(this.options.selectType == DialogTools.SelectType.ST2){
            // gridTree 多选(复选框)
            this.multiGridTreeSelect(true);
        }else if(this.options.selectType == DialogTools.SelectType.ST5){
            // gridTree 多选
            this.multiGridTreeSelect(false);
        }else if(this.options.selectType == DialogTools.SelectType.ST3){
            // dataGrid 单选
            this.dataGridSelect();

            // 删除全选
            $("#" + that.options.id).find(".datagrid-header-row").find("input").remove();
        }else if(this.options.selectType == DialogTools.SelectType.ST4){
            // dataGrid 多选
            this.dataGridSelect();
        }

        // 选择器
        that.tableTemple.find = function(v){
            return $("#" + that.options.id).find("._searchTools").find(v);
        };

        // 查询方法
        that.tableTemple.search = function(params){
            // 查询
            if(that.options.selectType == DialogTools.SelectType.ST1 || that.options.selectType == DialogTools.SelectType.ST2){
                that.tableTemple.treegrid("reload", params);
            }else{
                that.tableTemple.datagrid("reload", params);
            }
        };
    };

    /**
     * 获取选择的项
     */
    DialogTools.CreateDialog.prototype.getSelectItem = function()
    {
        var that = this;
        if(that.options.selectType == DialogTools.SelectType.ST1){
            // gridTree 单选
            var row = that.tableTemple.treegrid('getSelected');
            if (!row){
                warn('请选择一个' + that.options.title + '节点！');
                return;
            }
            if (row.parentId == -1 && that.options.isSelectedTop == "false"){
                warn('不能选择根节点');
                return;
            }

            var id = row[that.options.sampleData.id];
            var name = row[that.options.sampleData.name];
            if(that.options.isSelectedLeaf == "true"){
                // 判断是否叶子节点
                var children = that.tableTemple.treegrid('getChildren', id);
                if(row["state"] == "closed" || (row["state"] == "open" && children.length > 0)){
                    warn('请选择叶子节点');
                    return;
                }
            }
            return {id: id, name: name, obj: row};
        }else if(that.options.selectType == DialogTools.SelectType.ST2){
            // gridTree 多选
            var newRows = [];
            var selectIds = "";
            var selectNames = "";
            var rows = that.tableTemple.treegrid('getCheckedNodes');
            var users =  $("#" + that.options.id).parent().find(".selected-users");
            users.find("span").each(function(){
                var id = $(this).attr("uid");
                var name = $(this).text();

                if(selectIds != ""){
                    selectNames += ",";
                }
                selectIds += id + ",";
                selectNames += name;

                var row = getRow(id, rows);
                if(row == null)
                {
                    row = {};
                    row[that.options.sampleData.id] = id;
                    row[that.options.sampleData.name] = name;
                }

                if (row.parentId == -1 && that.options.isSelectedTop == "false"){
                    warn('不能选择根节点');
                    return;
                }

                if(that.options.isSelectedLeaf == "true"){
                    // 判断是否叶子节点
                    var children = that.tableTemple.treegrid('getChildren', id);
                    if(row["state"] == "closed" || (row["state"] == "open" && children.length > 0)){
                        warn('请检查是否都选择叶子节点。');
                        return;
                    }
                }
                newRows.push(row);
            });

            if (newRows.length <= 0) {
                warn('至少选择一个' + that.options.title + '节点！');
                return;
            }

            return {id: selectIds, name: selectNames, obj: newRows};
        }else if(that.options.selectType == DialogTools.SelectType.ST3){
            // dataGrid 单选
            var row = that.tableTemple.datagrid('getSelected');
            if (!row) {
                warn('请选择一行数据');
                return;
            }
            var id = row[that.options.sampleData.id];
            var name = row[that.options.sampleData.name];
            return {id: id, name: name, obj: row};
        }else if(that.options.selectType == DialogTools.SelectType.ST4){
            // dataGrid 多选
            var newRows = [];
            var selectIds = "";
            var selectNames = "";
            var rows = that.tableTemple.datagrid('getSelections');
            var users =  $("#" + that.options.id).find(".selected-users");
            users.find("span").each(function(){
                var id = $(this).attr("uid");
                var name = $(this).text();

                if(selectIds != ""){
                    selectNames += ",";
                }
                selectIds += id + ",";
                selectNames += name;

                var row = getRow(id, rows);
                if(row == null)
                {
                    row = {};
                    row[that.options.sampleData.id] = id;
                    row[that.options.sampleData.name] = name;
                }
                newRows.push(row);
            });

            if (newRows.length <= 0) {
                warn('至少选择一行数据');
                return;
            }

            return {id: selectIds, name: selectNames, obj: newRows};
        }else if(that.options.selectType == DialogTools.SelectType.ST5){
            //treeGrid 多选
            var newRows = [];
            var selectIds = "";
            var selectNames = "";
            var rows = that.tableTemple.treegrid('getSelections');
            var users =  $("#" + that.options.id).parent().find(".selected-users");
            users.find("span").each(function(){
                var id = $(this).attr("uid");
                var name = $(this).text();

                if(selectIds != ""){
                    selectNames += ",";
                }
                selectIds += id + ",";
                selectNames += name;

                var row = getRow(id, rows);
                if(row == null)
                {
                    row = {};
                    row[that.options.sampleData.id] = id;
                    row[that.options.sampleData.name] = name;
                }
                newRows.push(row);
            });

            if (newRows.length <= 0) {
                warn('至少选择一个节点');
                return;
            }

            return {id: selectIds, name: selectNames, obj: newRows};
        }

        function getRow(id, rows)
        {
            var selectRow = null;
            for(var i=0; i<rows.length; i++){
                var row = rows[i];
                var rid = row[that.options.sampleData.id];
                if(rid == id)
                {
                    selectRow = row;
                    break;
                }
            }
            return selectRow;
        }
    };

    /**
     * 检查数据项是否需要选中
     */
    DialogTools.CreateDialog.prototype.checkSelectItem = function()
    {
        var that = this;
        if(that.selectIds == null) {
            return;
        }

        // 获取已选择的数据ID
        if(that.options.callId && that.options.callId != ""){
            this.selectIds = $("#" + that.options.callId).val();
        }

        if(that.options.selectType == DialogTools.SelectType.ST1){
            // gridTree 单选
            that.tableTemple.treegrid('select', this.selectIds);
            that.tableTemple.treegrid("resize");
        }else if(that.options.selectType == DialogTools.SelectType.ST2){
            // gridTree 多选
            for(var i=0; i<that.selectIds.split(",").length; i++){
                var nodeId = that.selectIds.split(",")[i];
                if(nodeId != ""){
                    that.tableTemple.treegrid('checkNode', nodeId);
                }
            }
            that.tableTemple.treegrid("resize");
        }else if(that.options.selectType == DialogTools.SelectType.ST3){
            // dataGrid 单选
            var rows = that.tableTemple.datagrid('getRows');
            for(var i=0; i<rows.length; i++){
                checkedRow(rows[i], i);
            }
            that.tableTemple.datagrid("resize");
        }else if(that.options.selectType == DialogTools.SelectType.ST4){
            // dataGrid 多选
            var rows = that.tableTemple.datagrid('getRows');
            for(var i=0; i<rows.length; i++){
                checkedRow(rows[i], i);
            }
            that.tableTemple.datagrid("resize");
        }else if(that.options.selectType == DialogTools.SelectType.ST5){
            // gridTree 多选
            for(var i=0; i<that.selectIds.split(",").length; i++){
                var nodeId = that.selectIds.split(",")[i];
                if(nodeId != ""){
                    that.tableTemple.treegrid('select', nodeId);
                }
            }
            that.tableTemple.treegrid("resize");
        }

        /**
         * 检查选择DataGrid行
         */
        function checkedRow(row, index){
            var rowId = row[that.options.sampleData.id];
            for(var i=0; i<that.selectIds.split(",").length; i++){
                var nodeId = that.selectIds.split(",")[i];
                if(rowId == nodeId){
                    that.tableTemple.datagrid('checkRow', index);
                }
            }
        }
    };

    /**
     * 清空选择项
     */
    DialogTools.CreateDialog.prototype.clearSelectItem = function()
    {
        if(this.tableTemple == null){
            return;
        }
        if(this.options.selectType == DialogTools.SelectType.ST1){
            // gridTree 单选
            this.tableTemple.treegrid("unselectAll");
        }else if(this.options.selectType == DialogTools.SelectType.ST2){
            // gridTree 多选
            var rows = this.tableTemple.treegrid('getCheckedNodes');
            for(var i=0; i<rows.length; i++){
                this.tableTemple.treegrid('uncheckNode', rows[i][this.options.sampleData.id]);
            }
        }else if(this.options.selectType == DialogTools.SelectType.ST3){
            // dataGrid 单选
            this.tableTemple.treegrid("clearSelections");
        }else if(this.options.selectType == DialogTools.SelectType.ST4){
            // dataGrid 多选
            this.tableTemple.treegrid("clearSelections");
        }else if(this.options.selectType == DialogTools.SelectType.ST5){
            // dataGrid 多选
            try{
                this.tableTemple.treegrid("clearSelections");
            }catch(e){}
            try{
                this.tableTemple.treegrid("unselectAll");
            }catch(e){}
        }
    };

    /**
     *  GridTree 单选
     */
    DialogTools.CreateDialog.prototype.singleGridTreeSelect = function()
    {
        var that = this;
        var gridOptions = {
            queryParams:that.params,
            onLoadSuccess: function (rows, data) {
                // 加载成功后处理已经选中的行
                if (data != null && data.length > 0 && that.selectIds != null) {
                    selectChecked(data);
                }
            }
        };

        function selectChecked(data)
        {
            for(var i=0;i< data.length;i++){
                var dataId = data[i][that.options.sampleData.id];
                if(that.selectIds == dataId) {
                    that.tableTemple.treegrid('select', dataId);
                }

                if(data[i].children)
                {
                    selectChecked(data[i].children);
                }
            }
        }

        if(that.options.data){
            gridOptions.data = that.options.data;
        }

        if(that.options.url){
            gridOptions.url = that.options.url;
        }

        that.tableTemple = $("#" + that.options.id).find("._dataContorl");
        that.tableTemple.treegrid(gridOptions);
    };

    /**
     *  GridTree 多选
     */
    DialogTools.CreateDialog.prototype.multiGridTreeSelect = function(checkBox)
    {
        var that = this;
        var idialog = $("#" + that.options.id).parent();
        var dataGridHeight = idialog.find("._w_height").height();
        checkBox = checkBox || false;
        var gridOptions = {
            queryParams: that.params,
            cascadeCheck: false,
            onLoadSuccess: function (rows, data) {
                // 加载成功后处理已经选中的行
                if (data != null && data.length > 0 && that.selectIds != null) {
                    selectChecked(data);
                }
            },
            checkbox: function(row){
                return checkBox;
            },
            onCheckNode: function(row, checked)
            {
                if(row == null)
                {
                    return;
                }
                var nodes = that.tableTemple.treegrid('getChildren', row.id);
                var rows = nodes.slice(0);
                rows.push(row);
                if(checked)
                {

                    handleCheckedRows(rows);
                }
                else
                {
                    handleUncheckRows(rows);
                }
            },
            onSelect: function(row){
                if(row == null || checkBox)
                {
                    return;
                }
                handleCheckedRows([row]);
            },
            onUnselect: function(row){
                if(row == null || checkBox)
                {
                    return;
                }
                handleUncheckRows([row]);
            }
        };
        if(that.options.data){
            // 本地数据，级联选择
            gridOptions.cascadeCheck = true;
            gridOptions.data = that.options.data;
        }

        if(that.options.url){
            gridOptions.url = that.options.url;
        }

        function handleCheckedRows(rows)
        {
            var users = idialog.find(".selected-users");
            for(var i=0; i<rows.length; i++)
            {
                var bl = false;
                var id = rows[i][that.options.sampleData.id];
                var name = rows[i][that.options.sampleData.name];
                users.find("span").each(function(){
                    if($(this).attr("uid") == id)
                    {
                        bl = true;
                    }
                });
                if(!bl && id != -1)
                {
                    addRow(id, name);
                }
            }

            function addRow(id, name)
            {
                var html = $('<span style="background-color: #DDDDDD;padding: 5px 0 5px 5px;margin-right: 5px;">' + name + '<i class="fa fa-remove" style="margin-left: 5px; padding: 5px;cursor: pointer;color: #f35958;"></i></span>');
                html.attr("uid", id);
                html.find(".fa-remove").bind("click", function(){
                    $(this).parent().remove();
                    uncheckRow(id);
                })
                users.append(html);
            }

            changeDatagridHeight();
        }

        function handleUncheckRows(rows)
        {
            var users = idialog.find(".selected-users");
            for(var i=0; i<rows.length; i++)
            {
                var id = rows[i][that.options.sampleData.id];
                users.find("span").each(function(){
                    if($(this).attr("uid") == id)
                    {
                        $(this).remove();
                        uncheckRow(id);
                    }
                });
            }
        }

        function uncheckRow(id)
        {
            var rows = that.tableTemple.treegrid('getSelections');
            if(that.options.selectType == DialogTools.SelectType.ST2)
            {
                rows = that.tableTemple.treegrid('getCheckedNodes');
            }
            for(var i=0; i<rows.length; i++)
            {
                var rid = rows[i][that.options.sampleData.id];
                if(rid == id)
                {
                    if(checkBox)
                    {
                        that.tableTemple.treegrid('uncheckNode', id);
                    }
                    else
                    {
                        that.tableTemple.treegrid('unselect', id);
                    }
                }
            }
            changeDatagridHeight();
        }

        function changeDatagridHeight()
        {
            if(that.options.showSelectArea == "false")
            {
                idialog.find(".selected-users").hide();
                return;
            }

            var userHeight = idialog.find(".selected-users").outerHeight();
            var selectUsers = idialog.find(".selected-users").find("span");
            if(selectUsers.size() > 0)
            {
                userHeight = userHeight;
            }
            userHeight = selectUsers.size()==1?42:userHeight;
            userHeight = selectUsers.size()==0?0:userHeight;
            var dgh = dataGridHeight - userHeight;
            idialog.find("._w_height").css({height: dgh + "px"});
            that.tableTemple.treegrid("resize", {height: dgh, width: that.options.width});

            var users = idialog.find(".selected-users");
            if(users.find("span").size() > 0)
            {
                users.addClass("selected-users-alter");
            }
            else
            {
                users.removeClass("selected-users-alter");
            }
        }

        function selectChecked(data)
        {
            for(var i=0;i< data.length;i++){
                var dataId = data[i][that.options.sampleData.id];
                if(("," + that.selectIds).indexOf("," + dataId + ",") >= 0) {
                    if(checkBox)
                    {
                        that.tableTemple.treegrid('checkNode', dataId);
                    }
                    else
                    {
                        that.tableTemple.treegrid('select', dataId);
                    }
                }

                if(data[i].children)
                {
                    selectChecked(data[i].children);
                }
            }
        }

        that.tableTemple = $("#" + that.options.id).find("._dataContorl");
        that.tableTemple.treegrid(gridOptions);

        var dataValues = "";
        if(that.options.callName)
        {
            var callNames = that.options.callName.split(",");
            var inputName = callNames[0];
            if(inputName.indexOf("[") > 0){
                inputName = inputName.substring(0, inputName.indexOf("["));
            }
            dataValues = $("#" + inputName).val();
        }
        for(var i=0; i<(that.selectIds + "").split(",").length; i++){
            var id = (that.selectIds + "").split(",")[i];
            if(id == null || id == "")
            {
                break;
            }
            var value = dataValues.split(",")[i];
            var row = {};
            row[that.options.sampleData.id] = id;
            row[that.options.sampleData.name] = value;
            handleCheckedRows([row]);
        }
    };

    /**
     *  DataGrid 单选和多选
     */
    DialogTools.CreateDialog.prototype.dataGridSelect = function()
    {
        var that = this;
        var idialog = $("#" + that.options.id);
        var dataGridHeight = idialog.find(".m-datagrid").height();
        var gridOptions = {
            columns : that.options.columns,
            queryParams:that.params,
            onLoadSuccess: function (data){
                var rows = data.rows;
                if (rows != null && rows.length > 0) {
                    for (var i = 0; i < rows.length; i++) {
                        checkRow(rows[i], i);
                    }
                }
            },
            onCheck: function(index, row)
            {
                handleCheckedRows([row]);
            },
            onUncheck: function(index, row)
            {
                handleUncheckRows([row]);
            },
            onCheckAll: function(rows)
            {
                handleCheckedRows(rows);
            },
            onUncheckAll: function(rows)
            {
                handleUncheckRows(rows);
            }
        };

        function handleCheckedRows(rows)
        {
            var users = idialog.find(".selected-users");
            for(var i=0; i<rows.length; i++)
            {
                var bl = false;
                var id = rows[i][that.options.sampleData.id];
                var name = rows[i][that.options.sampleData.name];
                users.find("span").each(function(){
                    if($(this).attr("uid") == id)
                    {
                        bl = true;
                    }
                });
                if(!bl)
                {
                    addRow(id, name);
                }
            }

            function addRow(id, name)
            {
                var html = $('<span style="background-color: #DDDDDD;padding: 5px 0 5px 5px;margin-right: 5px;">' + name + '<i class="fa fa-remove" style="margin-left: 5px; padding: 5px;cursor: pointer;color: #f35958;"></i></span>');
                html.attr("uid", id);
                html.find(".fa-remove").bind("click", function(){
                    $(this).parent().remove();
                    uncheckRow(id);
                })
                users.append(html);
            }

            changeDatagridHeight();
        }

        function handleUncheckRows(rows)
        {
            var users = idialog.find(".selected-users");
            for(var i=0; i<rows.length; i++)
            {
                var id = rows[i][that.options.sampleData.id];
                users.find("span").each(function(){
                    if($(this).attr("uid") == id)
                    {
                        $(this).remove();
                        uncheckRow(id);
                    }
                });
            }
        }

        function uncheckRow(id)
        {
            var rows = that.tableTemple.datagrid('getRows');
            for(var i=0; i<rows.length; i++)
            {
                var rid = rows[i][that.options.sampleData.id];
                if(rid == id)
                {
                    that.tableTemple.datagrid('uncheckRow', i);
                }
            }
            changeDatagridHeight();
        }

        function changeDatagridHeight()
        {
            if(that.options.showSelectArea == "false")
            {
                idialog.find(".selected-users").hide();
                return;
            }

            var userHeight = idialog.find(".selected-users").outerHeight();
            var selectUsers = idialog.find(".selected-users").find("span");
            if(selectUsers.size() > 0)
            {
                userHeight = userHeight + 5;
            }
            userHeight = selectUsers.size()==1?42:userHeight;
            userHeight = selectUsers.size()==0?0:userHeight;
            var dgh = dataGridHeight - userHeight;
            idialog.find(".m-datagrid").css({height: dgh + "px"});
            that.tableTemple.datagrid("resize", {height: dgh, width: that.options.width});

            var users = idialog.find(".selected-users");
            if(users.find("span").size() > 0)
            {
                users.addClass("selected-users-alter");
            }
            else
            {
                users.removeClass("selected-users-alter");
            }
        }

        // 初始化时已经选择的选中  前判断是否有可选中项
        function checkRow(row, index){
            if(that.selectIds == null){
                return;
            }

            var users = idialog.find(".selected-users");
            users.find("span").each(function(){
                if($(this).attr("uid") == row[that.options.sampleData.id])
                {
                    that.tableTemple.datagrid('checkRow', index);
                }
            });
        }

        if(that.options.data){
            gridOptions.data = that.options.data;
        }

        if(that.options.url){
            gridOptions.url = that.options.url;
        }

        that.tableTemple = idialog.find("._dataContorl");
        that.tableTemple.datagrid(gridOptions);

        // 初始化选择数据
        var dataValues = "";
        if(that.options.callName)
        {
            var callNames = that.options.callName.split(",");
            var inputName = callNames[0];
            if(inputName.indexOf("[") > 0){
                inputName = inputName.substring(0, inputName.indexOf("["));
            }
            dataValues = $("#" + inputName).val();
        }
        for(var i=0; i<(that.selectIds + "").split(",").length; i++){
            var id = (that.selectIds + "").split(",")[i];
            if(id == null || id == "")
            {
                break;
            }
            var value = dataValues.split(",")[i];
            var row = {};
            row[that.options.sampleData.id] = id;
            row[that.options.sampleData.name] = value;
            handleCheckedRows([row]);
        }
    };



    window.DialogTools = DialogTools;
});


$(function(){
    /**
     * Form表单工具，收集参数和显示数据
     * options:{
	 * 		id: 编辑form表单ID
	 * 		viewId：详情显示控件ID
	 * 		formId: form表单控件ID
	 * }
     */
    var FormTools = {
        formList: [],
        getForm: function(options){
            //判断是否已经创建
            var formData = null;
            for(var i=0; i<this.formList.length; i++){
                if(this.formList[i].options.id == options.id){
                    formData = this.formList[i];
                    break;
                }
            }
            if(formData == null){
                // 创建新的Dialog窗口
                formData = new FormTools.FormData(options);
                formData.init(true);
                this.formList.push(formData);
            }
            return formData;
        },
        FormData: function(options){
            var that = this;
            that.data = null;
            that.options = options;
            that.options.formId = that.options.formId || that.options.id;

            that.init = function(flag){
                that.data = that.findParams(flag);
            }
        }
    };


    /**
     * 显示详情
     */
    FormTools.FormData.prototype.showDetail = function(flag){

        var that = this;
        // 是否提交数据成功
        flag = flag || false;
        if(flag == true){
            that.init();
        }
        // 显示数据
        for(key in that.data){
            // 处理class
            var className = key;
            className = key.replace("[","").replace("]","").replace(".","");
            var cell = $("#" + that.options.viewId).find(".fd_" + className);
            var data = that.data[key];
            if(key.indexOf("File") > 0 || key.indexOf("Image") > 0){
                // 附件列表
                cell.find("li").remove();
                var files = data;
                var $ul = cell.find("ul");
                if(files != null){
                    for(var i=0; i<files.length; i++){
                        var file = files[i];
                        var ahref = "";
                        /*if(file.fileEngine == '1'){
                            ahref = "javascript:viewFile('"+file.fileUseId+"'')";
                        }else {
                            ahref = file.accessUrl;
                        }*/

                        ahref = "javascript:viewFile('"+file.fileUseId+"'')";

                        if(key.indexOf("Image") > 0 ){

                            $ul.append(
                                '<li  style="float: left;margin-left: 10px;margin-top: 5px; margin-bottom: 5px" >' +
                                '   <div style="width: 80px;height: 80px"  class="image-text">' +
                                '       <a href="'+ahref+'"  class="file-operate">' +
                                '       <img style="float:left;height: 80px;width: 80px" src="'+ctx+'/oss/file/view/'+file.fileUseId+'">' +
                                '       </a>' +
                                '   </div>' +
                                '   <div style="clear: both;"></div>' +
                                '</li>'
                            );

                        }else{

                            $ul.append(
                                '<li>' +
                                '   <a href="' + ahref + '" class="file-text" title="' + file.showName + '" style="float:left;"' +
                                '       <span style="float:left;">' + file.showName + '</span>' +
                                '       <span style="float:right;" class="fileSize" fileSize="' + file.fileSize + '">(' + file.fileSize + ')</span>' +
                                '   </a>' +
                                '   <a href="javascript:downloadFile(\'' + file.fileUseId + '\');" class="file-operate" style="float:right;"><i class="fa fa-download"></i></a>' +
                                '   <div style="clear: both;"></div>' +
                                '</li>'
                            );
                        }

                    }
                }
            }else if(cell.hasClass("fd_fmoney")){
                // 金额
                var money = that.data[key];
                money = money == null?'':money;
                if(money != ""){
                    money = FormatMoney(money, 2, true);
                    that.data[key] = money;
                }
                cell.text(money + "元");
            }else if(cell.hasClass("fd_fnumber_ratio")){
                // 占比
                var fnum = that.data[key];
                fnum = fnum == null?'':fnum;
                if(fnum != ""){
                    fnum = FormatMoney(fnum, 2, false);
                    that.data[key] = fnum;
                }
                cell.text(fnum + "%");
            }else if(cell.hasClass("fd_fnumber") || cell.hasClass("fd_fnumber4")){
                // 保留cent小数位
                var cent = cell.hasClass("fd_fnumber4")?4:2;
                var fnumber = data == null?'':data;
                if(fnumber != ""){
                    fnumber = FormatMoney(fnumber, cent, true);
                    that.data[key] = fnumber;
                }
                cell.text(fnumber);
            }else{
                // 普通文本
                var text = data;
                if(text != null && !(text instanceof Array) ){
                    text = text.replace(/\r\n/g, "<br />").replace(/\n/g, "<br />");
                }
                cell.html(text);
            }
        }
        return that.data;
    };

    /**
     * 显示编辑
     */
    FormTools.FormData.prototype.showEdit = function(){
        var that = this;
        // 是否提交数据成功
        // 调用功能的form数据回填方法
        that.fillFormData();

        // 填充附件信息
        $("#" + that.options.formId).find(".webuploader-container").each(function(){

            var options = $(this).attr("data-options");
            options = stringToJson(options);

            var key = $(this).attr("id");
            var file = that.data[key];

            var viewArea = $(options.viewAreaId + "_items");
            viewArea.find("span").remove();

            if(file != null){
                for(var i=0; i<file.length; i++){
                    var file = file[i];
                    viewArea.append('<span id="' + file.id + '" accessUrl="' + file.accessUrl + '" fileEngine="' + file.fileEngine + '" fileSize="' + file.fileSize + '" showName="' + file.showName + '" businessId="' + file.businessId + '">' + file.showName + '</span>');
                }
            }

            $("#" + key).UploadFile().resetFileList();
        });
        return that.data;
    };

    /**
     * 收集表单参数
     */
    FormTools.FormData.prototype.findParams = function(flag){
        var that = this;
        var data = {};
        var formId = "#" + that.options.formId;

        // 收集普通文本数据
        $(formId).find("input").each(function(){
            var key = $(this).attr("name");
            var val = $(this).val();
            if(this.type != null && this.type.toLowerCase() == 'radio'){
                if(this.checked){
                    // 单选选中
                    var text = $(this).parent().find("span").text();
                    data[key] = val;
                    data[key + "Name"] = text;
                }
            }else if(this.type != null && this.type.toLowerCase() == 'checkbox'){
                if(this.checked){
                    var text = $(this).parent().find("span").text();
                    // 复选框选中
                    if(data.hasOwnProperty(key)){
                        // 追加选中的值
                        data[key] = data[key] + "," + val;
                        data[key + "Name"] = data[key + "Name"] + "," + text;
                    }else{
                        // 第一个复选框值
                        data[key] = val;
                        data[key + "Name"] = text;
                    }
                }
            }else if($(this).hasClass("fd-decimal") || $(this).hasClass("fd-decimal2") || $(this).hasClass("fd-decimal4")){
                // 保留cent小数位
                var cent = $(this).hasClass("fd-decimal4")?4:2;
                cent = $(this).hasClass("fd-decimal")?0:cent;
                if(val != ""){
                    val = FormatMoney(val, cent, true);
                }
                data[key] = val;
            }else{
                // 普通文本
                data[key] = val;
            }
        });

        // 收集textarea数据
        $(formId).find("textarea").each(function(){
            var key = $(this).attr("name");
            var val = $(this).val();
            data[key] = val;
        });

        // 收集select数据
        $(formId).find("select").each(function(){
            var key = $(this).attr("name");
            var val = $(this).val();
            var text = "";
            $(this).find("option:selected").each(function(){
                if(text != "")
                {
                    text += ","
                }

                text += $(this).text();
            });
            if(val == null || val == ""){
                text = "";
            }
            data[key] = val;
            data[key + "Name"] = text;
        });

        // 收集文件数据
        $(formId).find(".webuploader-container").each(function(){

            var options = $(this).attr("data-options");
            options = stringToJson(options);

            var key = $(this).attr("id");
            var file = [];
            $(options.viewAreaId).find("li").each(function(){

                var id = $(this).attr("id");
                var fileUseId = $(this).attr("fileUseId");
                var fileSize = $(this).attr("fileSize");
                var businessId = $(this).attr("businessId");
                var showName = $(this).attr("showName");
                var accessUrl = $(this).attr("accessUrl");
                var fileEngine = $(this).attr("fileEngine");
                var isDel = $(this).attr("isDel");
                if(isDel == "0"){
                    file.push({id:id, fileUseId:fileUseId, fileSize:fileSize, businessId:businessId,showName:showName,accessUrl:accessUrl,fileEngine:fileEngine, isDel: '0'});
                }
            });

            if(flag == true){
                file = [];
                $(options.viewAreaId + "_items").find("span").each(function(){
                    var id = $(this).attr("id");
                    var fileUseId = $(this).attr("fileUseId");
                    var fileSize = $(this).attr("fileSize");
                    var businessId = $(this).attr("businessId");
                    var showName = $(this).attr("showName");
                    var accessUrl = $(this).attr("accessUrl");
                    var fileEngine = $(this).attr("fileEngine");
                    file.push({id:id, fileUseId:fileUseId, fileSize:fileSize, businessId:businessId,showName:showName,accessUrl:accessUrl,fileEngine:fileEngine, isDel: '0'});
                });
            }

            data[key] = file;
        });
        return data;
    };

    /**
     * 表单数据回填
     */
    FormTools.FormData.prototype.fillFormData = function(){
        var that = this;
        var thisInput = null;
        var form = $('form[id=' + that.options.formId + ']');
        var inputs = form.find('input,select,radio,checkbox,textarea');
        for (var i = 0; i < inputs.length; i++)
        {
            thisInput = $(inputs[i]);
            var key = thisInput.prop('name');
            var val = thisInput.val();
            if(!that.data.hasOwnProperty(key))
            {
                // 不存在，忽略
                continue;
            }

            if (thisInput.prop('type').toLowerCase() == 'checkbox')
            {
                var checkIds = that.data[key] + ",";
                if(checkIds.indexOf(val + ",") >= 0){
                    // 选中
                    thisInput.prop('checked', true);
                }else{
                    // 未选中
                    thisInput.prop('checked', false);
                }
            }
            else if(thisInput.prop('type').toLowerCase() == 'radio')
            {
                if(that.data[key] == val)
                {
                    // 选中
                    thisInput.prop('checked', true);
                }else{
                    // 未选中
                    thisInput.prop('checked', false);
                }
            }
            else
            {
                thisInput.val(that.data[key]).trigger("change");
            }
        }

        $(inputs[0]).focus();
    };

    function initForm(obj){
        var id = $(obj).attr("id");
        var viewId = $(obj).attr("viewId");
        var formId = $(obj).attr("formId");
        return FormTools.getForm({id: id, viewId: viewId, formId:formId});
    }

    $.fn.tform = function(){
        return initForm(this);
    };

    // 界面加载完后自动初始化
    $(".form-auto-fill").each(function(){
        initForm(this);
    });

    // 小数位处理，目前在ie、火狐、谷歌浏览器已测试
    $.fn.inputDecimal = function(num){
        $(this).each(function(){
            decimalCheck($(this), num);
        });
    };

    // 小数位个数从 precision 属性中获取，如果未能取到则默认为0
    $(".fd-decimal").each(function(){
        $(this).inputDecimal(0);
    });

    // 保留两位小数
    $(".fd-decimal2").each(function(){
        $(this).inputDecimal(2);
    });

    // 保留4位小数
    $(".fd-decimal4").each(function(){
        $(this).inputDecimal(4);
    });
});
