<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />


<div class="panel layout-panel layout-panel-north" style="width: 100%; left: 0px; top: 0px;">
    <div region="north" title="" class="panel-body panel-body-noheader layout-body" style="width: 100%; height: 35px;">
        <c:if test="${breadcrumb != ''}"><div class="navigation"><span class="words"><a>${ breadcrumb }</a></span></div></c:if>

    </div>
</div>


<div class="panel layout-panel layout-panel-west" style="width: 150px; left: 0px; top: 34px;">
    <div region="west" class="lf-mun panel-body panel-body-noheader layout-body" style="margin-top: 5px; width: 150px; height: 534px;overflow-y: auto;overflow-x: hidden" title="" id="">
        <div class="lf-muntit">类型</div>
        <div class="lf-muncon">
            <ul id="dicttypeList">
                <c:forEach items="${list}" var="item" varStatus="status">
                    <li data-typeid="${item.id}" <c:if test="${status.index == 0}">class="lf-act"</c:if>><a>${item.dictTypeName}</a><div class="triangle-right"></div></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>



<div class="panel layout-panel layout-panel-center" style="width: 980px; left: 149px; top: 34px;">
    <div region="center" style="padding: 5px 10px 0px; width: 100%; height: 538px;"
         title="" class="panel-body panel-body-noheader layout-body panel-noscroll" id="dictList">


        <c:if test="${list != null && fn:length(list) > 0}">

        <div class="btn-bar" style="margin-left: -10px;">
            <button type="button" class="btn btn-primary btn-sm" onclick="toAdd()">
                <i class="fa fa-plus"></i>
                <span>新建 </span>
            </button>
            <button type="button" class="btn btn-primary btn-sm" url="" onclick="doDelete()">
                <i class="fa fa-trash"></i>
                <span>删除 </span>
            </button>
        </div>

        <div style="height: 482px">
            <table id='tableData-${tableId}' class='easyui-datagrid'  method='post' fit='true' pagination='true' fitColumns="true"  border='true' sortName="id" sortOrder="desc" style="width: 100%;height: 100%">
                <thead>
                <tr>
                    <th field="ck" checkbox="true"></th>
                    <th field="dictName" align="left" width="2" sortable="false"  formatter="titleFmt">字典名称</th>
                    <th field="dictVal" align="left" width="1" sortable="false" >字典值</th>
                    <th field="dictReg"  align="left" width="2" sortable="false">字典规则</th>
                </tr>
                </thead>
            </table>
        </div>
        </c:if>


    </div>
</div>


<script language="JavaScript">
    var tableid = "tableData-${tableId}";
    var queryString = "dictTypeId=${fistTypeId}";


    var inAllPage = "${inAllPage}";
</script>


<bms:contentJS />
<script src="${staticUrl}/statics2/js/project/listCommon.js"></script>
<script src="${staticUrl}/statics2/js/project/list.js"></script>

<script language="JavaScript">

    var searchData = {};
    var listUrl = "";


    //字典类型选中事件
    $("#dicttypeList li").click(function(){
        $(this).addClass("lf-act");
        $(this).siblings().removeClass("lf-act");

        queryString = "dictTypeId="+ $(this).attr("data-typeid");

        //searchData = {"dictTypeId" : $(this).attr("data-typeid")};
        var url = ctx+dataUrl+"/toList?dictTypeId="+ $(this).attr("data-typeid");

        /*$("#dictList").panel(
            {
                title :'',
                href:url
            }
        );*/

        initPage();

    });

</script>


<bms:contentFooter />

