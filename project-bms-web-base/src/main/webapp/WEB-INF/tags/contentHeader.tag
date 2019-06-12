<%@tag pageEncoding="UTF-8"%>
<%@attribute name="title" type="java.lang.String" required="false" %>
<%@attribute name="index" type="java.lang.Boolean" required="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="staticUrl" value="${pageContext.request.contextPath}"/>
<%--

<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en" xmlns="http://www.w3.org/1999/html">
<!--<![endif]-->
--%>

<!DOCTYPE html>
<html lang="zh-CN" >


<head>
    <meta charset="utf-8">
    <meta http-equiv="Window-target" content="_top">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />

    <meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <!-- 页面按原比例显示 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title><spring:message code='common.platform.info' text='zz后台管理系统' /></title>
    <link rel="icon" href="${staticUrl}/statics2/image/favicon.ico">
    <link rel="shortcut icon" href="${staticUrl}/statics2/image/favicon.ico">
    <%@include file="/WEB-INF/views/common/import-css.jspf"%>

    <style>
        body {
            overflow-y: auto !important
        }

        @media (min-width: 992px) {
            .col-md-5 .block-con {
                margin-left: 10px
            }
        }

        .table-cell .info-detail .input-check {
            margin-bottom: 5px
        }

        .datagrid-body {
            margin-bottom: -1px
        }
        input::-webkit-outer-spin-button,
        input::-webkit-inner-spin-button {
            -webkit-appearance: none;
        }
        input[type="number"]{
            -moz-appearance: textfield;
        }
        .show-area{
            display:none;
        }
    </style>




    <script>
        // Global Const
        var ctx = '${ctx}';
        var $AppContext = ctx;


        var staticUrl = '${staticUrl}';

        var $PagingSize = 50 || 20;

        var $AttachmentEngine = 'file';


        var dataUrl = "/${currParentUrl}";
        var breadcrumb = "${breadcrumb}";


    </script>




</head>

<body class="easyui-layout" id="content-all">

