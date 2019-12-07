<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	int port = request.getServerPort();
	String basePath = null;
	if (port == 80) {
		basePath = request.getScheme() + "://" + request.getServerName() + path;
	} else {
		basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	}
	pageContext.setAttribute("basePath", basePath);
%>

<link rel="stylesheet" type="text/css"
	href="${basePath}/resource/css/bootstrap.min.css" media="screen">
<link rel="stylesheet" type="text/css"
	href="${basePath}/resource/css/common.css">

<script type="text/javascript"
	src="${basePath}/resource/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="${basePath}/resource/js/Scripts/umd/popper.js"></script>
<script type="text/javascript"
	src="${basePath}/resource/js/bootstrap.min.js"></script>
	
	