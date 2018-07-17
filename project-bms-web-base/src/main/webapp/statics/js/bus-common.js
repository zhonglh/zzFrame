
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
	 * 打开用户选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openUserWin(config, callBack)
	{
		var url = config.url || $AppContext + '/base/staff/list';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 605px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 40px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" >'
	    + '<select name="_userState" class="form-control input-sm" placeholder="状态" title="状态" style="margin-left: -15px; width: 80px;">'
	    + '<option value="0" selected>状态</option>'
	    + '<option value="1">有效</option>'
	    + '<option value="2">已停用</option>'
	    + '</select>&nbsp;&nbsp;'
	    + '<input name="_userName" class="form-control input-sm" placeholder="请输入姓名" title="请输入姓名" style="width: 300px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="orderIndex" sortOrder="asc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_UserListPanel" + config.callId;
		options.width = 616;
		options.height = 550;
		options.callBack = callBack;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"userName", title:"姓名", width: 170, align:"left"},
			{field:"loginName", title:"账号", width: 145, align:"left"},
			{field:"deptName", title:"部门", width: 170, align:"left"},
			{field:'state', title: "状态", width: 100, align:"left", 
				formatter: function(val,row,index){
					return val == "1"?"有效":"已停用";
				}
			}
		]];
		options.sampleData = {id: "id", name: "userName"};
		options.htmlTemple = tableTemple;
		options.compiledSuccess = function(){
			// 查询按钮事件
			dialog.tableTemple.find(".btn-success").bind("click", function(){
				search();
			});
			
			dialog.tableTemple.find('input[name="_userName"]').keydown(function(e){ 
				if(e.keyCode==13){ 
					search();
				} 
			});
			
			// 状态发生改变查询
			dialog.tableTemple.find("select").bind("change", function(){
				search();
			});
			
			function search(){
				// 获取查询参数
				var params = options.params || {};
				params["state"] = dialog.tableTemple.find('select[name="_userState"]').val();
				params["userName"] = dialog.tableTemple.find('input[name="_userName"]').val();
				
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		
		return dialog;
	};
	
	
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
	 * 打开科目选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openExpensesItemWin(config, callBack)
	{
		var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden; " class="_w_height">' +
		'<table idField="id" treeField="itemName" class="_dataContorl">'  +
		'	<thead>'  +
		'		<tr>' +
		'			<th field="itemName" align="left">科目名称</th>' +
		'			<th field="remark" width=1 align="left">备注</th>' +
		'		</tr>'+
		'	</thead>' +
		'</table>' +
		'</div>';
		
		var options = config || {};
		options.width = 430;
		options.height = 450;
		options.id = "_ExpensesItemList" + config.callId;
		options.htmlTemple = tableTemple;
		options.url = $AppContext + '/fms/expensesItem/tree';
		options.callBack = callBack;
		options.sampleData = {id: "id", name: "itemName"};
		var dialog = DialogTools.getDialog(options);

		return dialog;
	};
	
	/**
	 * 打开行业选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openIndustryWin(config, callBack)
	{
		var tableTemple = '<div style="height: 350px; overflow-y:auto; overflow-x:hidden; " class="_w_height">' +
		'<table idField="id" treeField="industryName" class="_dataContorl">'  +
		'	<thead>'  +
		'		<tr>' +
		'			<th field="industryName" align="left">行业名称</th>' +
		'			<th field="remark" width=1 align="left">备注</th>' +
		'		</tr>'+
		'	</thead>' +
		'</table>' +
		'</div>';
		
		var options = config || {};
		options.width = 430;
		options.height = 450;
		options.id = "_IndustryList" + config.callId;
		options.htmlTemple = tableTemple;
		options.url = $AppContext + '/base/industry/tree';
		options.callBack = callBack;
		options.sampleData = {id: "id", name: "industryName"};
		var dialog = DialogTools.getDialog(options);

		return dialog;
	};
	
	/**
	 * 打开选择窗口
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
	 * 打开选择窗口
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
	 * 打开选择窗口
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
	
	/**
	 * 打开投资者选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openCustomWin(config, callBack)
	{
		var url = config.url || $AppContext + '/cherry/crm/custom';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 615px;height:450px;" >'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="投资者名称/投资者类型/所属区域" title="请输入投资者名称/投资者类型/所属区域" style="width: 300px;margin-left:-15px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;"  pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_CustomListPanel" + config.callId;
		options.width = 626;
		options.height = 550;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"customName", title:"投资者名称", width: 235, align:"left"},
			{field:"customTypeName", title:"投资者类型", width: 115, align:"left"},
			{field:"areaName", title:"所属区域", width: 235, align:"left"}
		]];
		options.sampleData = {id: "id", name: "customName"};
		options.htmlTemple = tableTemple;
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
				params["skeyword"] = dialog.tableTemple.find('input[name="_keyword"]').val();
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		return dialog;
	};
	
	/**
	 * 打开基金选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openFundWin(config, callBack)
	{
		var url = config.url || $AppContext + '/cherry/fund/listPage?panel=1';
		var tableTemple = '<div class="easyui-panel" style="padding:5px;border: 0; width: 615px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="基金名称/基金代码/所属公司" title="请输入基金名称/基金代码/所属公司" style="width: 300px;margin-left:-15px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_FundListPanel" + config.callId;
		options.width = 626;
		options.height = 550;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"fundName", title:"基金名称", width: 235, align:"left"},
			{field:"fundCode", title:"基金代码", width: 115, align:"left"},
			{field:'ofCompany', title: "所属公司", width: 235, align:"left"}
		]];
		options.sampleData = {id: "id", name: "fundName"};
		options.htmlTemple = tableTemple;
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
				params["keyWords"] = dialog.tableTemple.find('input[name="_keyword"]').val();
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		return dialog;
	};
	
	/**
	 * 打开协议选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openAgreementWin(config, callBack)
	{
		var url = config.url || $AppContext + '/crm/agreement/list?examStatus=2&fundStatus=1';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 690px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="协议名称/投资者/基金名称" title="请输入协议名称/投资者/基金名称" style="width: 300px; margin-left:-15px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_AgreementListPanel" + config.callId;
		options.width = 701;
		options.height = 550;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"agreementName", title:"协议名称", width: 215, align:"left"}, 
			{field:"agreementCode", title:"协议编码", width: 115, align:"left"}, 
			{field:"customName", title:"投资者", width: 165, align:"left"},
			{field:"fundName", title:"基金名称", width: 165, align:"left"}
		]];
		options.sampleData = {id: "id", name: "agreementName"};
		options.htmlTemple = tableTemple;
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
				params["examStatus"] = 2;
				params["keyword"] = dialog.tableTemple.find('input[name="_keyword"]').val();
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		
		return dialog;
	};
	
	/**
	 * 打开项目选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openProjectWin(config, callBack)
	{
		var url = config.url || $AppContext + '/prj/project/list';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 615px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="项目名称/项目企业名称/项目经理/投资阶段" title="项目名称/项目企业名称/项目经理/投资阶段" style="width: 300px;margin-left:-15px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_PrjectListPanel" + config.callId;
		options.width = 626;
		options.height = 550;
		options.url = url;
		options.callBack = callBack;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"projectName", title:"项目名称", width: 235, align:"left"},
			{field:"companyName", title:"项目企业", width: 115, align:"left"},
			{field:"stageName", title:"执行阶段", width: 235, align:"left"}
		]];
		options.sampleData = {id: "id", name: "projectName"};
		options.htmlTemple = tableTemple;
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
				params["keyWords"] = dialog.tableTemple.find('input[name="_keyword"]').val();
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		return dialog;
	};
	
	/**
	 * 打开项目协议选择窗口
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openProjectAgreementWin(config, callBack)
	{
		var url = config.url || $AppContext + '/prj/invest-agreement/list';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 615px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="协议名称/协议编号/项目名称" title="请输入协议名称/协议编号/项目名称" style="width: 300px;margin-left:-15px;">&nbsp;&nbsp;'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>' 
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';

		var options = config || {};
		options.id = "_PrjectAgreementListPanel" + config.callId;
		options.width = 626;
		options.height = 550;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"name", title:"协议名称", width: 235, align:"left"},
			{field:"code", title:"协议编号", width: 115, align:"left"},
			{field:"projectName", title:"项目名称", width: 235, align:"left"}
		]];
		options.sampleData = {id: "id", name: "agreementName"};
		options.htmlTemple = tableTemple;
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
				params["examStatus"] = 2;
				params["keyWords"] = dialog.tableTemple.find('input[name="_keyword"]').val();
				// 调用查询方法
				dialog.tableTemple.search(params);
			}
		};
		
		var dialog = DialogTools.getDialog(options);
		return dialog;
	};
	
	
	/**
	 * 打开项目合同(自定义表单)
	 * callId	回显数据ID的控件ID
	 * callName	回显数据名称的控件ID
	 * clearId	清空选项的控件ID
	 * callBack 选择后的回调函数
	 * @returns
	 */
	function openProjectContractWin(config, callBack)
	{
		var url = $AppContext + '/base/form/projectContract';
		var tableTemple = '<div class="easyui-panel" style="padding:5px; border: 0; width: 615px;height:450px;">'
	    + '<table align="center" class="_searchTools" width="100%" border="0" style="background-color: #ffffff;">'
	    + '<tr style="height: 35px;">'
	    + '<td style="padding-top:5px">'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<input name="_keyword" class="form-control input-sm" placeholder="合同名称/合同类型/对方名称" title="请输入合同名称/合同类型/对方名称" style="margin-left: -15px; width: 380px;">'
	    + '</div>'
	    + '<div class="form-inline" role="form" style="padding-bottom: 5px;">'
	    + '<button type="submit" class="btn btn-success btn-sm" ><i class="fa fa-search"></i>&nbsp;查询</button>'
	    + '</div>'
	    + '</td>'
	    + '</tr>'
	    + '</table>'
	    + '<table class="_dataContorl _w_height" style="height: 300px;" pagination="true" border="true"  sortName="id" sortOrder="desc"></table>'
	    + '</div>';
		
		var options = config || {};
		options.id = "_ProjectContractListPanel" + config.callId;
		options.width = 626;
		options.height = 550;
		options.url = url;
		options.columns = [[
			{field:"id", checkbox: true, width: 40},
			{field:"colValue001", title:"合同名称", width: 235, align:"left"},
			{field:"colValue002", title:"合同类型", width: 115, align:"left"},
			{field:"colValue003", title:"对方名称", width: 235, align:"left"}
		]];
		options.sampleData = {id: "id", name: "colValue001"};
		options.htmlTemple = tableTemple;
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
	
	// 部门选择控件
	$.fn.OpenDeptSelectWin = function(config, callBack){
		var win = openDeptWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 用户选择控件
	$.fn.OpenUserSelectWin = function(config, callBack){
		var win = openUserWin(config, callBack);
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
	
	// 行业选择控件
	$.fn.OpenIndustrySelectWin = function(config, callBack){
		var win = openIndustryWin(config, callBack);
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
	
	// 投资者选择控件
	$.fn.OpenCustomSelectWin = function(config, callBack){
		var win = openCustomWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 基金选择控件
	$.fn.OpenFundSelectWin = function(config, callBack, openedCallBack){
		var win = openFundWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
			openedCallBack && openedCallBack();
		});
		return win;
	};
	
	// 协议选择控件
	$.fn.OpenAgreementSelectWin = function(config, callBack){
		var win = openAgreementWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 项目选择控件
	$.fn.OpenProjectSelectWin = function(config, callBack){
		var win = openProjectWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 项目协议选择控件
	$.fn.OpenProjectAgreementSelectWin = function(config, callBack){
		var win = openProjectAgreementWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 费用科目选择控件
	$.fn.OpenExpensesItemSelectWin = function(config, callBack){
		var win = openExpensesItemWin(config, callBack);
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
	
	// 系统岗位选择控件
	$.fn.OpenStaffPosSelectWin = function(config, callBack){
		var win = openStaffPostWin(config, callBack);
		$(this).unbind("click");
		$(this).bind("click", function(){
			win.show();
		});
		return win;
	};
	
	// 自定义表单（项目合同）
	$.fn.OpenProjectContractWin = function(config, callBack){
		var win = openProjectContractWin(config, callBack);
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
	
	// 给含有webuploader-container样式的元素绑定上传事件
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
	
	// 格式化时间
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
	} 
	
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
			if(key.indexOf("uploadFile") == 0){
				// 附件列表
				cell.find("a").remove();
				cell.find("br").remove();
				var files = data;
				if(files != null){
					for(var i=0; i<files.length; i++){
						var file = files[i];
						// 临时处理，项目文档地址
						if($("#" + key).attr("data-options").indexOf("document/upload") > 0)
						{
							cell.append('<a href="javascript:openDocumentView(\'' + file.docId + '\', \'' + file.fileId + '\', 0);">' + file.fileName + '</a><br>');
						}
						else
						{
							cell.append('<a href="' + $AppContext + '/base/download/' + file.fileId + '">' + file.fileName + '</a><br>');
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
		$("#" + that.options.formId).find("div[id^='uploadFile']").each(function(){
			var options = $(this).attr("data-options");
			options = stringToJson(options);
			
			var key = $(this).attr("id");
			var files = that.data[key];
			
			var viewArea = $(options.viewAreaId + "_dataItems");
			viewArea.find("span").remove();
			
			if(files != null){
				for(var i=0; i<files.length; i++){
					var file = files[i];
					viewArea.append('<span id="' + file.fileId + '" size="' + file.fileSize + '" docId="' + file.docId + '">' + file.fileName + '</span>');
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
					data[key + "_Name"] = text;
				}
			}else if(this.type != null && this.type.toLowerCase() == 'checkbox'){
				if(this.checked){
					var text = $(this).parent().find("span").text();
					// 复选框选中
					if(data.hasOwnProperty(key)){
						// 追加选中的值
						data[key] = data[key] + "," + val;
						data[key + "_Name"] = data[key + "_Name"] + "," + text;
					}else{
						// 第一个复选框值
						data[key] = val;
						data[key + "_Name"] = text;
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
			data[key + "_Name"] = text;
		});
		
		// 收集附件数据
		$(formId).find("div[id^='uploadFile']").each(function(){
			var options = $(this).attr("data-options");
			options = stringToJson(options);
			
			var key = $(this).attr("id");
			var files = [];
			$(options.viewAreaId).find("li").each(function(){
				var fileId = $(this).attr("fileId");
				var fileSize = $(this).attr("fileSize");
				var fileName = $(this).attr("fileName");
				var docId = $(this).attr("docId");
				var isDel = $(this).attr("isDel");
				if(isDel != "1"){
					files.push({fileId:fileId, fileSize:fileSize, fileName:fileName, docId:docId, isDel: 0});
				}
			});
			
			if(flag == true){
				files = [];
				$(options.viewAreaId + "_dataItems").find("span").each(function(){
					var fileId = $(this).attr("id");
					var fileSize = $(this).attr("size");
					var docId = $(this).attr("docId");
					var fileName = $(this).text();
					files.push({fileId:fileId, fileSize:fileSize, fileName:fileName, docId:docId, isDel: 0});
				});
			}
			
			data[key] = files;
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

/**
 * 小数位处理，目前在ie、火狐、谷歌浏览器已测试
 * @param that	JQuery对象
 * @param n		保留位数
 * @returns
 */
function decimalCheck(that, n)
{
	n = n || that.attr("precision");
	n = n || 0;
	console.log(that);
	console.log(n);
	$(that).unbind("input");
	$(that).bind("input", function(e){
		var obj = that[0];
		var oldValue = obj.value;
		if(!oldValue){
			return;
		}
		var selectStart = obj.selectionStart;
		
		//清除“数字”和“.”以外的字符 
		obj.value = obj.value.replace(/^\./g, "");
		obj.value = obj.value.replace(/[^\d.-]/g, ""); 

		//只保留第一个. 清除多余的  
		obj.value = obj.value.replace(/\.{2,}/g, ".");
		obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", "."); 
		eval("var re = \/^(\\-)*(\\d+)\\.(\\d{" + n + "}).*$/");

		//只能输入两个小数  
		obj.value = obj.value.replace(re, '$1$2.$3');
		
		if(obj.value.length > 0){
			// 以上已经过滤，此处控制的是如果没有小数点，首位不能为类似于 01、02的金额 
			obj.value = obj.value.replace(/^0{2}/g, "0");
			obj.value = obj.value.substring(0, 1) + obj.value.substring(1).replace(/\-/g, "");
		}
		
		if(n == 0){
			obj.value = obj.value.replace(/\./g, "");
		}
		var isFormat = $(this).attr("isFormat") || "true";
		if(isFormat == "true")
		{
			// 格式化金额
			obj.value = formatNumber(obj.value);
		}
		
		var endIndex = oldValue.length - selectStart;
		endIndex = endIndex < 0? 0: endIndex;
		endIndex = obj.value.length - endIndex;
		endIndex = endIndex < 0? 0: endIndex;
		obj.selectionStart = endIndex;
		obj.selectionEnd = endIndex;
	});

	var maxNumber = 99999999999999999999.9999;
	$(that).bind("keydown", function(e){
		e = e ? e : event;
		if((e.keyCode >= 48 && e.keyCode <= 57) || (e.keyCode >= 96 && e.keyCode <= 105))
		{
			var val = this.value.replaceAll(",", "").split(".")[0];
			if(val > maxNumber)
			{
				return false;
			}
		}
		return true;
	});
	
	function formatNumber(val)
	{
		if(val.length > 0 && val != "-")
		{
			var sign = (val == Math.abs(val));
			var numxy = val.toString().split(".");
			var numx = Math.abs(numxy[0]).toString();
			for (var i = 0; i < Math.floor((numx.length - (1 + i)) / 3); i++){
				var index = (4 * i + 3);
				numx = numx.substring(0, numx.length - index) + ',' + numx.substring(numx.length - index);
			}
			
			if(val.toString().indexOf('.') >= 0)
			{
				val = "." + ((numxy.length > 1)?numxy[1]:"");
			}
			else
			{
				val = "";
			}
			val = numx + val;
			val = (sign?'':'-') + val;
		}
		return val;
	}
}

/**
 * 将数值四舍五入后格式化.
 * 
 * @param num 			数值(Number或者String)
 * @param cent 			要保留的小数位(Number)
 * @param isThousand 	是否需要千分位, ;
 * @return 格式的字符串,如'1,234,567.45'
 * @type String
 */
function FormatMoney (num, cent, isThousand)
{
	 // 检查传入数值为数值类型
	 if(null == num){
		 num = "0";
	 }
	 num = num.toString().replace(/\$|\,/g,'');
	 num = isNaN(num)?"0":num;
	 
	 // 获取符号(正/负数)
	 sign = (num == (num = Math.abs(num)));

	 num = Math.floor(num * Math.pow(10, cent) + 0.50000000001); // 把指定的小数位先转换成整数.多余的小数位四舍五入
	 cents = num % Math.pow(10, cent);       // 求出小数位数值
	 num = Math.floor(num / Math.pow(10, cent)).toString();  // 求出整数位数值
	 cents = cents.toString();        // 把小数位转换成字符串,以便求小数位长度

	 // 补足小数位到指定的位数
	 while(cents.length < cent){
		 cents = "0" + cents;
	 }
	 
	 if(isThousand != false && (isThousand == null || isThousand)) {
		 // 对整数部分进行千分位格式化.
		 for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++){
			 num = num.substring(0, num.length - (4 * i + 3)) + ',' + num.substring(num.length - (4 * i + 3));
		 }
	 }

	 if (cent > 0){
		 return (((sign)?'':'-') + num + '.' + cents);
	 }
	 return (((sign)?'':'-') + num);
}

/**
 * 金额转大写
 * @param n
 * @returns
 */
function MoneyToCny(n)
{
	if(n == null || n == ''){
		return '';
	}
	var fraction = ['角', '分'];  
    var digit = [  
        '零', '壹', '贰', '叁', '肆',  
        '伍', '陆', '柒', '捌', '玖'  
    ];  
    var unit = [  
        ['元', '万', '亿'],  
        ['', '拾', '佰', '仟']  
    ];  
    var head = n < 0 ? '欠' : '';  
    n = Math.abs(n);  
    var s = '';  
    for (var i = 0; i < fraction.length; i++) {  
        s += (digit[Math.floor(n * 10 * Math.pow(10, i)) % 10] + fraction[i]).replace(/零./, '');  
    }  
    s = s || '整';  
    n = Math.floor(n);  
    for (var i = 0; i < unit[0].length && n > 0; i++) {  
        var p = '';  
        for (var j = 0; j < unit[1].length && n > 0; j++) {  
            p = digit[n % 10] + unit[1][j] + p;  
            n = Math.floor(n / 10);  
        }  
        s = p.replace(/(零.)*零$/, '').replace(/^$/, '零') + unit[0][i] + s;  
    }  
    return head + s.replace(/(零.)*零元/, '元').replace(/(零.)+/g, '零').replace(/^整$/, '零元整');  
}

/**
 * 格式化文件大小显示
 * @param fileSize	文件大小，单位B
 * @returns
 */
function getFileSize(fileSize)
{
	if(fileSize < 1024){
		return fileSize + "B";
	}else if(fileSize < (1024 * 1024)){
		return (fileSize/1024).toFixed(2) + "KB";
	}else if(fileSize < (1024 * 1024 * 1024)){
		return (fileSize/1024/1024).toFixed(2) + "M";
	}else{
		return (fileSize/1024/1024/1024).toFixed(2) + "G";
	}
};

/**
 * 解析参数
 * @param options JSON字符串
 * @returns
 */
function stringToJson(options)
{
	var jsonObj = {};
	if(options == null)
	{
		return jsonObj;
	}
	var params = options.split(",");
	for(var i=0; i<params.length; i++)
	{
		var item = params[i];
		if(item.split(":").length == 2)
		{
			var reg1 = new RegExp('"',"g");
			var reg2 = new RegExp('\'',"g");
			var key = $.trim(item.split(":")[0]).replace(reg1, "").replace(reg2, "");
			var val = $.trim(item.split(":")[1]).replace(reg1, "").replace(reg2, "");
			jsonObj[key] = val;
		}
	}
	return jsonObj;
}

/** 
* 禁止空格输入 
*/ 
function banInputSapce(e){ 
	var keynum; 
	if(window.event){ 
		keynum = e.keyCode 
	}else if(e.which){ 
		keynum = e.which 
	} 
	if(keynum == 32){ 
		return false; 
	} 
	return true; 
} 

/**
 * 获取请求地址参数
 * @param name
 * @returns
 */
function GetScriptParam(name)
{
	var val = "";
	for(var m=0; m<document.scripts.length; m++){
		var src = document.scripts[m].src;
		var args = src.substr(src.indexOf("?") + 1).split("&");
		for ( var i = 0; i < args.length; i++) {
		    var j = args[i].indexOf("=");
		    if (j > -1 && args[i].substr(0, j) == name) {
		    	val = args[i].substr(j + 1);
		    }
		}
	}
	
	return val;
}

/**
 * 将表单序列化为JSON
 */
(function($){  
     $.fn.serializeJson=function(){  
         var serializeObj = {};  
         var array = this.serializeArray();  
         $(array).each(function(){
        	 var val = this.value;
        	 var input = $("input[name='" + this.name + "']"); 
        	 if(input.hasClass("fd-decimal4") || input.hasClass("fd-decimal2") || input.hasClass("fd-decimal"))
        	 {
        		val = val.replaceAll(',', ''); 
        	 }
             if(serializeObj[this.name]){  
                 if($.isArray(serializeObj[this.name])){  
                     serializeObj[this.name].push(val);  
                 }else{  
                     serializeObj[this.name] = [serializeObj[this.name], val];  
                 }  
             }else{  
                 serializeObj[this.name] = val;   
             }  
         });  
         return serializeObj;  
     }; 
     
     $.fn.serializeToString = function(){
    	 var serializeObj = {};  
         var array = this.serializeArray();  
         $(array).each(function(){  
        	 var val = this.value;
        	 var input = $("input[name='" + this.name + "']"); 
        	 if(input.hasClass("fd-decimal4") || input.hasClass("fd-decimal2") || input.hasClass("fd-decimal"))
        	 {
        		val = val.replaceAll(',', ''); 
        	 }
             if(serializeObj[this.name]){  
                 if($.isArray(serializeObj[this.name])){  
                     serializeObj[this.name].push(val);  
                 }else{  
                     serializeObj[this.name] = [serializeObj[this.name], val];  
                 }  
             }else{  
                 serializeObj[this.name] = val;   
             }  
         });
         var serializeString = "";
         for(var o in serializeObj)
         {
        	 var val = serializeObj[o];
        	 if($.isArray(val))
        	 {
        		 val = val.join(",");
        	 }
        	 serializeString += (o + "=" + val + "&");
         }
         return encodeURI(serializeString);
     };
     
     $.extend($.validator.methods, { 
    	 min: function(value, element, param){
        	value = value.replaceAll(",", "");
        	return this.optional( element ) || value >= param;
    	 },
    	 max: function(value, element, param){
         	value = value.replaceAll(",", "");
         	return this.optional( element ) || value <= param;
     	 }
     });
})(jQuery);

 
 /**
  * 侧滑层
  * @param url
  * @param pHeight
  * @param pWidth
  * @returns
  */
function showPanel(url,pHeight,pWidth){
  	pHeight = pHeight?pHeight:'100%';
  	pWidth = pWidth?pWidth:'80%'
  	if($("body").find("#shadePanel").length==0){
  		var html = '<style>';
  		html += '#shadePanel {position:absolute;top:0;padding-top:10px;right:-50%;width:'+pWidth+';height:'+pHeight+';background:#fff;z-index:15;opacity:0;transition:all 1s;-moz-transition:all 1s;-webkit-transition:all 1s;-o-transition:all 1;}';
  		html += '</style>';
  		html += '<div class="shade" id="viewShade" onclick="closePanel(0)" style="display:none" ><div class="shade-img"> <img src="'+$AppContext+'/image/packup.png"></div></div>';
  		html += '<iframe  frameborder="0" id="shadePanel" ></iframe>';
  		html += '<script>'
  		html += 'function closePanel(type){if(type==0){confirm("确定关闭页面吗?",function(){';
  		html += '$("#shadePanel").css({right:-window.screen.availWidth,opacity:0});$("#viewShade").hide();})';
  		html += '}else{$("#shadePanel").css({right:-window.screen.availWidth,opacity:0});$("#viewShade").hide();}}';
  		html += '';
  		html += '<\/script>';
  		$("body").append(html);
  	}
  	$("#shadePanel").attr("src",url)
  	$("#viewShade").show();
  	$("#shadePanel").css({right:"0",opacity:1})
}

/**
 * 打开项目文档
 * @param id	文档ID
 * @param fileId	文档存储在Mongodb的ID
 * @param type		1.项目附件 2.其他业务附件
 * @param code		编码如果为项目，则是任务编码，否则是权限编码（1.浏览 9.管理）
 * @returns
 */
function openDocumentView(id, fileId, type, code)
{
	if (window.plus)
	{
		// App端下载
		plus.runtime.openURL(JSON.parse(plus.storage.getItem("forp_server_url")) + 'third/mongodb-download/' + fileId);
	}
	else
	{
		if(type <= 1)
		{
			// 项目文档
			window.open($AppContext + "/prj/document/view/" + type + "/" + id + (code?("?code=" + code):""));    
		}
		else
		{
			// 其他业务文档
			window.open($AppContext + "/base/file/view/" + code + "/" + id);    
		}
	}
}
