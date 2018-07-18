<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz后台管理系统" />



<div region='north'>
    <div class="navigation">
        <!-- 面包屑 -->
        <%--<ul class="breadcrumb">
            <li><a href="#">首页</a> <span class="divider">/</span></li>
            <li><a href="#">Library</a> <span class="divider">/</span></li>
            <li class="active">Data</li>
        </ul>--%>


        <span class="words"><a>${breadcrumb}</a></span>


    </div>
    <div id="content-sec" style="padding: 10px 10px 0 10px;">
        <!-- 筛选条件表单开始 -->
        <form id="searchForm" onsubmit="return false" >
            <!-- 隐藏域 -->
            <input type="hidden"  name="typeId" value="0">
            <input type="hidden"  name="statusId" value="0">
            <input type="hidden"  name="stageId" value="0">
            <input type="hidden"  name="investStageId" value="0">
            <input type="hidden"  name="item1" value="1">

            <!-- 筛选条件数据表格开始 -->
            <table class="table table-bbd table-search">
                <tr>
                    <td width="120px" align="right">项目类型  ：</td>
                    <td>
                        <div class="filter-container" >
                            <a href="javascript:void(0);" onclick="isChecked(this,'0','typeId');" class="active">全部</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,166,'typeId');">三板定增</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,37,'typeId');">股权投资项目</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,161,'typeId');">地产投资并购</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,162,'typeId');">不良资产处置</a>

                        </div>
                    </td>
                </tr>
                <tr>
                    <td width="150px" align="right">执行状态  ：</td>
                    <td>
                        <div class="filter-container" >
                            <a href="javascript:void(0);" onclick="isChecked(this,'0','statusId');" class="active">全部</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,1,'statusId');">进行中</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,2,'statusId');">已暂缓</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,3,'statusId');">已终止</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,4,'statusId');">已退出</a>

                        </div>
                    </td>
                </tr>
                <tr class="more-conditions hidden">
                    <td width="150px" align="right" >投资阶段  ：</td>
                    <td>
                        <div class="filter-container" >
                            <a href="javascript:void(0);" onclick="isChecked(this,'0','investStageId');" class="active">全部</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,40,'investStageId');">种子期</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,41,'investStageId');">起步期</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,42,'investStageId');">扩张期</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,43,'investStageId');">过渡期</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,44,'investStageId');"> 重建期</a>

                            <a href="javascript:void(0);"  onclick="isChecked(this,45,'investStageId');">已上市</a>

                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="right">关键字：</td>
                    <td><input style="display: inline-block;" type="text" name="keyWords" class="form-control input-sm" placeholder="项目名称/项目企业名称/项目经理/投资阶段" onkeydown='enterKeySearch(event, search);' />
                        <button type="button" class="btn btn-primary btn-sm" onclick="search()">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                            </svg>
                            <span>查 询</span>
                        </button>

                        <button type="button" class="btn btn-warning btn-sm" id="showMore"></button></td>
                    </td>
                </tr>
            </table>
        </form>
        <div class="btn-bar" style="margin-left: -10px;">
            <button type="button" class="btn btn-primary btn-sm" onclick="doAdd()">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                </svg>
                <span>新建 </span>
            </button>
            <button type="button" class="btn btn-primary btn-sm" onclick="doDel(-1)">
                <svg class="icon" aria-hidden="true">
                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use>
                </svg>
                <span>删除 </span>
            </button>
        </div>
    </div>
    <!-- 筛选条div结束 -->
</div>

<div region='center' style="padding: 0px 10px 0 10px;">
    <table id='tableDataArea' class='easyui-datagrid' method='post' fit='true' pagination='true' fitColumns="true" border='true' sortName="id" sortOrder="desc" style="width: 100%;">
        <thead>
        <tr>
            <th field="ck" checkbox="true"></th>
            <th field='projectName' align="left" width="1" sortable='true' formatter='titleFmt'>项目名称</th>
            <th field='typeName' align="left" width="1" sortable='true' >项目类型</th>
            <th field='companyName' align="left" width="1" sortable='true'>项目企业名称</th>
            <th field='companyCode' align="left" width="1" sortable='true'>企业信用代码</th>
            <th field='investTradeName' align="left" width="1" sortable='true'>投资行业</th>
            <th field='investStageName' align="left" width="1" sortable='true'>投资阶段</th>
            <th field='statusName' align="left" width="1" sortable='true'>执行状态</th>
            <th field='stageName' align="left" width="1" sortable='true'>执行阶段</th>
            <th field='makes' align="center" formatter='makesFmt'>操作</th>
        </tr>
        </thead>
    </table>
</div>




<script>
    // Global Const
    var $AppContext = '${ctx}';
    var ctx = $AppContext;
    var $PagingSize = 50 || 20;
    var $AttachmentEngine = 'file';
    var $AlibabaMediaNameSpace = '';
</script>

<script language="JavaScript">



</script>


<bms:contentFooter />