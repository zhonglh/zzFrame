<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />
<!--
<div region='north' border=0>
    <div class="pro-tit">
        <h1 >
            <span><span class="fcol-org"></span></span>
        </h1>
    </div>
</div>
<div region='center' border=0 style='padding: 10px;' >
-->
    <div id='divTabs' class="easyui-tabs" plain="true" fit='true' border=0>
        <div title= "出资明细" >
            <iframe width='100%' height='99%' frameborder='0'></iframe>
        </div>

    </div>
<!--</div>-->




<bms:contentJS />

<script type="text/javascript">
    $(function(){
        $('#divTabs').tabs({onSelect: tabSelected});

        tabSelected("出资明细", 0);
    });

    var urls = [
            ctx+'/example/outmoney/${ m.id }/update?inAllPage=1',
    ];

    /**
     * Tab页点击事件：动态加载模块url
     */
    function tabSelected(title, index)
    {
        //动态根据TAB改变标题
        $(".tabSubTitle",parent.document).html(title);

        var iframe = $('#divTabs').find('iframe');
        if (0 == iframe[index].src.length)
        {

            iframe[index].src = urls[index];
            iframe[index].height = '100%';
        }

    }
</script>


<bms:contentFooter />