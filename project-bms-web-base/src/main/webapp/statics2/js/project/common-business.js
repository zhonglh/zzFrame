//业务功能



/**
 * 打开待办处理新窗口
 * @param url 待办处理窗口链接
 */
function showTodoNewWindow(url)
{
	window.open(url, "flowTodoWin");
}


//------------------------------------------------------------------------------------------
//		部门弹出框选择组件
//------------------------------------------------------------------------------------------

var dlgCommonDept = null;
/**
 * 选择部门
 */
function chooseDept(callback)
{
	if (null == dlgCommonDept)
	{
		// 1 初始化对话框
		dlgCommonDept = iDialog(
		{
			width: 400, height: '60%', effect: 'i-super-scale', content:
			'<table id="tableCommonDept" class="easyui-treegrid" url="' + $AppContext + '/platform/dept/sons" idField="nodeNo" treeField="name" animate="true" singleSelect="true" fitColumns="true" height=400>' +
			'	<thead>' +
			'		<tr>' +
			'			<th field="name" align="left" formatter="deptNameColumnFormatter">部门名称</th>' +
			'			<th field="remark" width=1 align="left">备注</th>' +
			'		</tr>'+
			'	</thead>' +
			'</table>',
			btn:
			{
				ok:
				{
					val: '确定', type: 'green', click: function(btn)
					{
						var r = $('#tableCommonDept').treegrid('getSelected');
						if (!r)
						{
							warn('请选择一个部门节点！');
							return false;
						}

						callback(r.id, r.name);
					}
				},
				cancle: {val: '取消'}
			}
		});

		$('#tableCommonDept').treegrid(
		{
			loadFilter: function(rsp)
			{
				$.each(rsp, function(index, r)
				{
					r.iconCls = 'tree-icon-none';

					if (r.children && r.children.length > 0)
					{
						formatDeptTreeNodes(r.children);
					}
				});

				return rsp;
			}
		});
		dlgCommonDept.$title.html('<i class="fa fa-sitemap"/>&nbsp;请选择部门');
	}
	var _treeGridHt = dlgCommonDept.$dialog.height()-80-15-7 + 'px';
	dlgCommonDept.$dialog.find("#tableCommonDept").parent().parent().height(_treeGridHt);
	dlgCommonDept.show();
}

// Formatter - 部门名称列
function deptNameColumnFormatter(value, record, rowIndex)
{
	return ('001' == record.nodeNo ? '<i class="fa fa-home"></i>' : '<i class="fa fa-sitemap"></i>')+ '&nbsp;' + value;
}

// 格式化部门Tree节点数据
function formatDeptTreeNodes(nodes)
{
	$.each(nodes, function(index, r)
	{
		r.iconCls = 'tree-icon-none';

		if (r.children && r.children.length > 0)
		{
			formatDeptTreeNodes(r.children);
		}
	});
}

//------------------------------------------------------------------------------------------
//		人员弹出框选择组件
//------------------------------------------------------------------------------------------

var dlgCommonUser = null;
/**
 * 选择部门
 */
function choosUser(callback)
{
	if (null == dlgCommonUser)
	{
		// 1 初始化对话框
		dlgCommonUser = iDialog(
		{
			width: 600, height: 500, effect: 'i-super-scale', content:
			'<div id="commUserToolbar" style="padding-left: 7px; padding-bottom: 3px; display: inline-flex;">\
				<input type="text" id="commUserNameFilter" class="form-control input-sm" style="width: 515px; margin-right: 5px; vertical-align: middle;" placeholder="员工姓名/登陆账号/部门名称" onkeydown="enterKeySearch(event, commUserFilter);"/>\
				<button type="submit" class="btn btn-success btn-sm" onclick="commUserFilter();" style="vertical-align: middle;"><i class="fa fa-search"></i>&nbsp;查询</button>\
			</div>\
			<table id="tableCommonUser" class="easyui-treegrid" method="post" pagination="true" fitColumns="true" height=375 toolbar="commUserToolbar" sortName="userName" sortOrder="asc">\
				<thead>\
					<tr>\
						<th field="id" checkbox=true></th>\
						<th field="userName" width=1 sortable=true align="left" formatter="commonUserNameFormatter">员工姓名</th>\
						<th field="loginName" width=1 sortable=true>登录账号</th>\
						<th field="gender" sortable=true formatter="commonGenderFormatter">性别</th>\
						<th field="deptName" sortable=true>部门</th>\
					</tr>\
				</thead>\
			</table>',
			btn:
			{
				ok:
				{
					val: '确定', type: 'green', click: function(btn)
					{
						var rows = $('#tableCommonUser').treegrid('getSelections');
						if (!rows || rows.length < 1)
						{
							warn('请选择一个员工账号！');
							return false;
						}

						callback(rows);
					}
				},
				cancle: {val: '取消'}
			}
		});

		// 初始化列表
		$('#tableCommonUser').datagrid({url: $AppContext + '/platform/user', queryParams: getCommonUserQueryParams()});

		dlgCommonUser.$title.html('<i class="fa fa-sitemap"/>&nbsp;请选择员工账号');
	}

	// 取消上次选中状态
	$('#tableCommonUser').datagrid('clearChecked');
	dlgCommonUser.show();
}

/**
 * Formatter - 用户姓名
 */
function commonUserNameFormatter(val, r)
{
	return '<img width=24 height=24 src="' + getUserAvatarUrl(r.headImg, r.domainId) + '" style="vertical-align: middle;"\'>&nbsp;' + val;
}

/**
 * Formatter - 性别
 */
function commonGenderFormatter(val, r)
{
	if (1 == val)
		return '<i class="fa fa-male fa-lg" aria-hidden="true" title=" 男 "></i>';
	else
		return '<i class="fa fa-female fa-lg" aria-hidden="true" title=" 女 "></i>';
}

// 员工账号DataGrid查询条件
function getCommonUserQueryParams()
{
	return {content: $('#commUserNameFilter').val(), state: 1};
}

// 员工账号数据过滤
function commUserFilter()
{
	$('#tableCommonUser').datagrid('reload', getCommonUserQueryParams());
}


// ======================================================= //
//										工作流															 //
// ======================================================= //

var dlgFlowTemplate = null;
/**
 * 选择工作流模板
 */
function chooseFlowTemplate(callback)
{
	var customTableId = 'tableCommonFlowTemplate_' + new Date().getTime();
	if (null == dlgFlowTemplate)
	{
		// 1 初始化对话框
		dlgFlowTemplate = iDialog(
		{
			width: 600, height: '60%', effect: 'i-super-scale', content:
			'<table id="' + customTableId + '" class="easyui-treegrid" idField="id" treeField="text" animate="true" singleSelect="true" fitColumns="true" height=450>' +
			'	<thead>' +
			'		<tr>' +
			'			<th field="text" align="left">名称</th>' +
			'			<th field="description" width=1 align="left">备注</th>' +
			'		</tr>'+
			'	</thead>' +
			'</table>',
			btn:
			{
				ok:
				{
					val: '确定', type: 'green', click: function(btn)
					{
						var r = $('#'+customTableId).treegrid('getSelected');

						if (!r)
						{
							warn('请选择一个模板！');
							return false;
						}

						if (r.id.startsWith("3,"))
							callback(r);
						else
						{
							warn('请选择一个有效的模板');
							return false;
						}
					}
				},
				cancle: {val: '取消'}
			}
		});

		//对话框添加自定义属性
		dlgFlowTemplate.customTableId = customTableId;
		
		// 初始化模板树
		$('#'+customTableId).treegrid(
		{
			url: $AppContext + '/flow/template/searchSettingTemplete',
			loadFilter: function(data)
			{
				// 转换数据格式
				var treeNode = [];
				$.each(data,function(index, item)
				{
					treeNode[index] = convertFlowTemplateTreeNode(item);
				});
				return treeNode;
			}
		});

		dlgFlowTemplate.$title.html('<i class="fa fa-sitemap"/>&nbsp;请选择流程模板');
	}
	else
	{
		$('#'+dlgFlowTemplate.customTableId).treegrid('reload');
	}

	dlgFlowTemplate.$dialog.css({zIndex: 2000});	// 避免该对话框处于其它对话框底部
	$('#'+customTableId).parent().parent().css("height",dlgFlowTemplate.$dialog.height() - 100 + 'px');
	dlgFlowTemplate.show();
}

/**
 * 此处是把后台传过来的json数据转成easyui规定的格式
 *
 * @param node	原始树节点对象
 */  
function convertFlowTemplateTreeNode(node)
{  
	var tree = new Object();  
	tree.id = "1," + node.id;  
	tree.text = node.templateTypeName;  
	tree.state = 'open';  
	tree.checked = false;
	tree.description = node.description;
	tree.children = [];

	var nums = 0;
	// 遍历二级模板类型
	if (node.children.length && node.children.length != 0)
	{
		nums = node.children.length;
		for (var i = 0;i<node.children.length;i++)
		{
			var twoLevel = node.children[i];
			var tree1 = new Object();  
	    	tree1.id = "2,"+twoLevel.id;  
	    	tree1.text = twoLevel.templateTypeName;
			tree1.description= twoLevel.description;
	    	tree1.state = 'open';  
			tree1.children = []; 
			
			// 遍历二级模板类型下模板
			if (twoLevel.templates.length && twoLevel.templates.length != 0)
			{
				for (var z = 0;z<twoLevel.templates.length;z++)
				{
					var threeLevel = twoLevel.templates[z];

					var tree2 = new Object();  
			    	tree2.id = "3,"+threeLevel.id;  
			    	tree2.text = threeLevel.templateName;  
			    	tree2.state = 'open';
					tree2.description = threeLevel.description;
					tree2.templateIds = threeLevel.templateIds;
					tree2.children = [];
					tree1.children.push(tree2);
				}
			}

			tree.children.push(tree1);
		}
	}

	// 遍利一级模板类型下模板
	if (node.templates.length && node.templates.length != 0)
	{
		for (var j = 0;j<node.templates.length;j++)
		{
			var twoLevel2 = node.templates[j];

			var tree3 = new Object();  
	    	tree3.id = "3,"+twoLevel2.id;  
	    	tree3.text = twoLevel2.templateName;
			tree3.description = twoLevel2.description;
			tree3.templateIds = twoLevel2.templateIds;
	   		tree3.state = 'open';  
			tree3.children  = [];
			tree.children.push(tree3);
		}
	}

	return tree;
}

//======================================================= //
//                   自定义表单通用方法										//
//======================================================= //

var ForpFormTools =
{
	_dd : '<div id="_dd" style="dispaly: none;"></div>',
	_ddl : '<div id="_ddl" style="dispaly: none;"></div>',
	idialog : {},
	// memoChooser 参数
	memoWordId : '',
	wordNum : '',
	memoTypeId : '',
	numberDetailName : '',
	// entityChooser 参数{metaDataId:实体元数据ID,metaDataname:实体元数据名称}
	metaDataId:'',
	metaDataname:'',
	edialog:'',
	// 选择文号
	memoChooser : function (memoWordId,wordNum,memoTypeId,numberDetailName){
		this.memoWordId = memoWordId;
		this.wordNum = wordNum;
		this.memoTypeId = memoTypeId;
		this.numberDetailName = numberDetailName;
		if(this.idialog.memo == null)
		{
			var _iframe = '<iframe id="_iframe" style="border: none; margin-left: 5px;" width="100%" height="445"></iframe>';
			var _url = $AppContext+'/form/common/select-memos';
			if($('#_dd').length <= 0){
				$('body').append(this._dd);
			}
			if($('#_iframe').length<=0){
				$('#_dd').append(_iframe);
			}
			$('#_iframe').attr('src',_url);
			this.idialog.memo = iDialog({
				title: "选择文号",
				content: $('#_dd')[0], 
				lock: true,
				effect: 'i-super-scale',
				width: $(window).width()*0.5,
				height: 500
			});
		} else {
			this.idialog.memo.show();
		}
	},
	onSelectMemo : function (row) {
		if(row != null){
			$('#'+this.memoWordId).val(row.id);
			$('#'+this.wordNum).val(row.wordNum);
			$('#'+this.memoTypeId).val(row.detailId);
			$('#'+this.numberDetailName).val(row.numberDetails);
			this.idialog.memo.hide();
		}
	},
	//选择元数据使用方法
	entityChooser : function (metaDataId,metaDataname){
		this.metaDataId = metaDataId;
		this.metaDataname = metaDataname;
		if(this.idialog.entity == null)
		{
			var _iframe = '<iframe id="_iframel" style="border: none; margin-left: 5px;" width="100%" height="450"></iframe>';
			var _url = $AppContext+'/form/settings/metadata/todialog/choose';
			if($('#_ddl').length <= 0){
				$('body').append(this._ddl);
			}
			if($('#_iframel').length<=0){
				$('#_ddl').append(_iframe);
			}
			$('#_iframel').attr('src',_url);
			this.idialog.entity =iDialog({
				id:10,
				title: "选择元数据",
				content: $('#_ddl')[0], 
				lock: true,
				effect: 'i-super-scale',
				width: 600,
				height: 500
			});
		} else {
			this.idialog.entity.show();
			this.idialog.entity.$dialog.css('z-index',this.getMaxZIndex()+1);
		}
	},
	onSelectEntity : function (row) {
		if(row != null){

			$("[name='metaDataId']").val(row.id);
			$("[name='metaDataname']").val(row.metaDataname);
			$("#metaDataname").val(row.metaDataname);
			if(row.id!=null){
				$.ajax({ 
					url : $AppContext+'/form/settings/metadata/querymetadatalist',
					type: "POST",
					dataType: "json", 
					async:false,
					data:{'id':row.id},
					success: function(rsp){
						if(rsp.length>0){
							var tableHtml="<table class='table table-bordered width' >";
							tableHtml+="<thead><tr class='info'>";
							tableHtml+="<th>元数据</th>";
							tableHtml+="<th>使用</th>";
							tableHtml+="<th>字段名称</th>";
							tableHtml+="<th>选择项</th>";
							tableHtml+="<th>可计算</th>";
							tableHtml+="<th>默认值</th>";
							tableHtml+="</tr></thead><tbody>";
							for(var i=0;i<rsp.length;i++){
								if((i+1)%2 == 0){
									tableHtml+="<tr class='trhover'>";
								}else{
									tableHtml+="<tr class='active'>";
								}
								tableHtml+="<td>"+rsp[i].metaDataname+"<input type='hidden' id='metaDatacode' value='"+rsp[i].metaDatacode+"'/></td>";
								tableHtml+="<td><input type='checkbox' onclick='bigChange(this)' name='entityItem' value='"+rsp[i].id+"'/></td>";
								tableHtml+="<td><input type='text' value='"+rsp[i].metaDataname+"' disabled='disabled' class='form-control input-sm wv'/></td>";
								tableHtml+="<td><input type='checkbox'  name='choiceBox' disabled='disabled'/></td>";
								tableHtml+="<td><input type='checkbox' disabled='disabled'/></td>";
								tableHtml+="<td><input type='text' value='' disabled='disabled' class='form-control input-sm wv'/></td>";
								tableHtml+="</tr>";
							}
							tableHtml+="</tbody></table>";
							$("#entity_list_div").html(tableHtml);
						}
					}
				});
			}
			//$(window.frames["fieldFram_entity"].contentDocument).find("#dgentity").datagrid({ url: $AppContext+"/form/settings/metadata/queryMetaDataList/"+row.id}); 
			this.idialog.entity.hide();
		}
	},
	// 自定义事件管理
	customEvent : function (formId, callback){
		if(this.idialog.customEvent == null){
			var _iframe = '<iframe id="_iframe" style="border: none; margin-left: 5px;" width="100%" height="450"></iframe>';
			var _url = $AppContext+'/form/common/custom-event?formId='+formId;
			if($('#_dd').length <= 0){
				$('body').append(this._dd);
			}
			if($('#_iframe').length<=0){
				$('#_dd').append(_iframe);
			}
			$('#_iframe').attr('src',_url);
			this.idialog.customEvent = iDialog({
				title: "自定义事件管理",
				content: $('#_dd')[0], 
				lock: true,
				effect: 'i-super-scale',
				width: 575,
				height: 500,
				hide : function (){
					 if (typeof callback === "function"){
										callback(); 
								}
				}
			});
		} else {
			this.idialog.customEvent.show();
		}
	},
	// 表单流程状态
	flowState : function (formId, callback){
		if(this.idialog.flowState == null){
			var _iframe = '<iframe id="_iframe" style="border: none; margin-left: 5px;" width="100%" height="450"></iframe>';
			var _url = $AppContext+'/form/common/flow-state?formId='+formId;
			if($('#_dd').length <= 0){
				$('body').append(this._dd);
			}
			if($('#_iframe').length<=0){
				$('#_dd').append(_iframe);
			}
			$('#_iframe').attr('src',_url);
			this.idialog.flowState = iDialog({
				title: "流程状态管理",
				content: $('#_dd')[0], 
				lock: true,
				effect: 'i-super-scale',
				width: 575,
				height: 500,
				hide : function (){
					 if (typeof callback === "function"){
										callback(); 
								}
				}
			});
		} else {
			this.idialog.flowState.show();
		}
	},
	// 获取最大zindex
	getMaxZIndex : function () {
	    var maxZ = Math.max.apply(null, 
	    　　$.map($('body *'), function(e,n) {
	      　　if ($(e).css('position') != 'static')
	        　　return parseInt($(e).css('z-index')) || 1;
	    }));
	    return maxZ;
	}
	
}
/**
 * 流程状态格式化,返回格式化后的字符串
 * @param {Object} state 状态
 * @param {Object} viewMode  显示模式   1:显示流程状态    2:显示节点状态   3:显示待办状态
 * @param {String} cross 穿越
 */
function flowStateFormatter(state,viewMode,cross)
{
	if(typeof viewMode == 'undefined' || viewMode <=0 || viewMode > 3)
		viewMode = 1;
	var str = '';
	switch (parseInt(state)){
        case 0:
        	if(viewMode == 1)
        		str= '未完成' + '&nbsp;<i class="fa fa-mail-forward" style="color: #2dc3e8;"></i>';
        	else
            	str= '流转' + '&nbsp;<i class="fa fa-mail-forward" style="color: #2dc3e8;"></i>';
            break;
        case 2:
            str= '已完成' + '&nbsp;<i class="fa fa-check" style="color: #96e22a;"></i>';
            break;
        case 3:
            str= '已中止' + '&nbsp;<i class="fa fa-ban" style="color: #f35958;"></i>';
            break;
        case 4:
            str= '暂存' + '&nbsp;<i class="fa fa-save (alias)" style="color: #2dc3e8;"></i>';
            break;
        case 5:
        	if(viewMode == 3  )
                str= '等待' + '&nbsp;<i class="fa fa-hourglass-half" style="color: #2dc3e8;"></i>';
            else
                str= '待办' + '&nbsp;<i class="fa fa-hourglass-half" style="color: #2dc3e8;"></i>';
            break;
        case 6:
            str= '协办' + '&nbsp;<svg class="icon" aria-hidden="true" style="color: #2dc3e8;"><use xlink:href="#icon-daochu1"></use></svg>';
            break;
        case 8:
            str= '驳回' + '&nbsp;<i class="fa fa-reply-all" style="color: #2dc3e8;"></i>';
            break;
        case 10:
            str= '回复协办' + '&nbsp;<i class="fa fa-check" style="color: #2dc3e8;"></i>';
            break;
        case 11:
            str= '抄送' + '&nbsp;<i class="fa fa-copy" style="color: #2dc3e8;"></i>';
            break;
        case 12:
            str= '转办' + '&nbsp;<i class="fa fa-mail-forward" style="color: #2dc3e8;"></i>';
            break;
    }
    if(cross !='undefined' &&  cross == 'cross')
    {
    	str='身份重复跳过（相邻跳过）'+str;
    }
	return str;
}

/**
 * 流程时间差毫秒值格式化
 *
 * @param {long} mSeconds 时差毫秒数
 */
function flowUseTimeFormatter(mSeconds)
{
	var tempTimes;
	mSeconds = Math.abs(mSeconds);

	// 相差年数  
	var years = 0;
	if (mSeconds >= (365*24*60*60*1000))
	{
		years = parseInt(mSeconds / (365*24*60*60*1000));
	}
	var yearSurplus = mSeconds % (365*24*60*60*1000);

	// 相差月数
	var months = 0;
	if (yearSurplus >= (30*24*60*60*1000))
	{
		months = parseInt(yearSurplus / (30*24*60*60*1000));
	}
	var monthSurplus = yearSurplus % (30*24*60*60*1000);

	// 相差天数  
	var days = 0;
	if (monthSurplus >= (24*60*60*1000))
	{
		days = parseInt(monthSurplus / (24*60*60*1000));
	}
	var daySurplus = monthSurplus % (24*60*60*1000);

	// 相差小时数  
	var hours = 0;
	if (daySurplus >= (60*60*1000))
	{
		hours = parseInt(daySurplus / (60*60*1000));
	}
	var hourSurplus = daySurplus%(60*60*1000);

	// 相差分钟数  
	var minutes = 0;
	if (hourSurplus >= (60*1000))
	{
		minutes=parseInt(hourSurplus / (60*1000));
	}
	var minuteSurplus = hourSurplus % (60*1000);

	// 相差秒数
	var seconds = 0; 
	if (minuteSurplus >= 1000)
	{
		seconds = parseInt(minuteSurplus / 1000); 
	}
	var secondSurplus = minuteSurplus % 1000;

	if (secondSurplus > 0)
	{
		seconds = seconds + 1;
	}

	var resultStr = "";
	resultStr += (years == 0 ? "" : years + "年");
	resultStr += (months == 0 ? "" : months + "月");
	resultStr += (days == 0 ? "" : days + "日");
	resultStr += (hours == 0 ? "" : hours + "时");
	resultStr += (minutes == 0 ? "" : minutes + "分");

	if (resultStr == "")
		resultStr += seconds + "秒";
	else
		resultStr += (seconds == 0 ? "" : seconds + "秒");

	return resultStr;
}

