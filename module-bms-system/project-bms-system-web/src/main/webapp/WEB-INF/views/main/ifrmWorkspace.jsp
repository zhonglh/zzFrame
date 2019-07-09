
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="staticUrl" value="${pageContext.request.contextPath}"/>

<div style='position: absolute; left: 230px; top: 50px; bottom: 0px; right: 0px;'>
    <iframe id='ifrmWorkspace'  name='ifrmWorkspace' src="${ctx}/main/welcome" width='100%' height='100%' frameborder='0'  style="background-color: #ffffff;"></iframe>
</div>