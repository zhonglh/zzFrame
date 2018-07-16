<%@tag pageEncoding="UTF-8"%>
<%@attribute name="title" type="java.lang.String" required="false" %>
<%@attribute name="index" type="java.lang.Boolean" required="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<html lang="zh-CN">


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

    <title>${title}</title>
    <link rel="icon" href="${staticUrl}/statics/image/favicon.ico">
    <link rel="shortcut icon" href="${staticUrl}/statics/image/favicon.ico">
    <%@include file="/WEB-INF/views/common/import-homecss.jspf"%>


    <script>
        // Global Const
        var ctx = '${ctx}';
        var staticUrl = '${staticUrl}';
    </script>



    <style>
        #full-screen {padding: 10px; background: #ffffff; position: fixed; top: 0; right: 0; bottom: 0; left: 0; z-index: 99999; overflow: auto}
        .fixed-top-show{position: fixed;top: 0;left: 0;right: 0;bottom: 0}
        @media (min-width: 992px){.col-md-3 .block-each{margin-left: 10px}}
        @media (max-width: 767px){.col-xs-12 .block-each{margin-left: 0}}
        .nav-personal .dropdown+li {border-left: 1px solid #0896ba;}
    </style>


</head>
<body>
