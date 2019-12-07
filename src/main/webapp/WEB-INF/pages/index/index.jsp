<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--<jsp:include page="../common/common.jsp" flush="true" ></jsp:include>-->
<jsp:include page="../common/header.jsp" flush="true" ></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>moodle首页</title>
</head>
<body>
	<div class="container">
		12345677
	</div>
	
</body>

<script type="text/javascript">
	var basePath = "${basePath}";
	console.log(basePath);
	if (isEmpty($(".username").text())) {
		$(".title").text("未登录");
		$("#login").attr("href", basePath + "/login/index");
		$("#login").text("点击登陆");
	}
	/**
	 * 判断非空
	 * 
	 * @param val
	 * @returns {Boolean}
	 */
	function isEmpty(val) {
		val = $.trim(val);
		if (val == null)
			return true;
		if (val == undefined || val == 'undefined')
			return true;
		if (val == "")
			return true;
		if (val.length == 0)
			return true;
		if (!/[^(^\s*)|(\s*$)]/.test(val))
			return true;
		return false;
	}
</script>
</html>