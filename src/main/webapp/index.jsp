<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"><%@ include file="/WEB-INF/views/common/taglib.jsp"%>
	<script src="https://code.jquery.com/jquery.js"></script>
</head>
<body>
	<div class="panel panel-default">
	  <div class="panel-body">
	  	<a href="${pageContext.request.contextPath}/user/list">
	    	<button class="btn btn-primary">用户列表</button>
	  	</a>
	  </div>
	</div>
</body>
</html>