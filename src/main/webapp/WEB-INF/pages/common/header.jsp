<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp" %>
<nav id="navbar-example" class="navbar navbar-default navbar-static"
	role="navigation">
	
	<div class="container">
		<div class="navbar-header">
		<!-- 屏幕过小时，隐藏导航条，变成下拉式导航 -->
		<button class="navbar-toggle" type="button" data-toggle="collapse"
			data-target=".bs-js-navbar-scrollspy">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<img style="margin-top:2px;" alt="moodle" src="${basePath}/resource/jpg/moodle2.png" id="moodleImg">
		<!-- <a class="navbar-brand" href="${basePath}/index"><strong>Moodle</strong></a> -->
	</div>
		<div class="collapse navbar-collapse bs-js-navbar-scrollspy">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${basePath}/index">首页</a></li>
				<li><a href="#mdo">训练营</a></li>
				<li class="dropdown"><a href="#" id="navbarDrop1"
					class="dropdown-toggle" data-toggle="dropdown">课程类型 <b
						class="caret"></b></a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="navbarDrop1">
						<li><a href="#one" tabindex="-1">软件编程</a></li>
						<li><a href="#two" tabindex="-1">网络通信</a></li>
						<li class="divider"></li>
						<li><a href="#two" tabindex="-1">职业证书</a></li>
						<li><a href="#three" tabindex="-1">兴趣爱好</a></li>
					</ul></li>
				<li><a href="#mdo">社区</a></li>				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li ><a href="${basePath}/login/index">登录/注册</a></li>	
			</ul>
		</div>
	</div>
</nav>

<script type="text/javascript">
	$("#moodleImg").click(function(){
		window.location.href="http://www.baidu.com/";
	});
</script>