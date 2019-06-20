<%@tag pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="staticUrl" value="${pageContext.request.contextPath}"/>



<div class="shade" id="viewShade" onclick="closePanel(0)" style="display:none" >
    <div class="shade-img"><img src="${ctx}/images/packup.png"></div>
</div>
<iframe  frameborder='0' id="shadePanel" class="panal-layer" width="82%" height="99%"></iframe>
<div class="shade-close" onclick="closePanel(1)" style="display:none">
    <i class="fa fa-close"></i>
</div>