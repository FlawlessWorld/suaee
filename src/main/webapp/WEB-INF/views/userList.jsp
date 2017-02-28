<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
   <head>
      <title>用户列表</title>
      <!-- 包含 jQuery angularjs bootstrap -->
      <%@ include file="./common/bootStrap.jsp" %>
      <style type="text/css">
      	th {
      		text-align: center;
      	}
      </style>
   </head>
   <body>
      <div class="panel panel-primary" style="width: 80%;margin-top: 20px;margin-left: 10%;" >
	    <div class="panel-heading" style="text-align: center;">
	        <h2>用户列表</h2>
	    </div>
	    <div class="panel-body">
	      	<table class="table table-hover" style="text-align: center;">
			  <thead >
			  	<tr >
			      <th style="text-align: left;margin-left: 20px">
			      	<a href="${ctx}/user/addUserPage">
			      		<button class="btn btn-primary">添加用户</button>
			      	</a>
			      </th>
			    </tr>
			    <tr >
			      <th>姓名</th>
			      <th>年龄</th>
			      <th>手机号码</th>
			      <th>家庭住址</th>
			      <th>操作</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="user" items="${users}">
			  		<tr>
			  			<td>${user.name}</td>
			  			<td>${user.age}</td>
			  			<td>${user.tel}</td>
			  			<td>${user.address}</td>
			  			<td>
			  				<a href="${ctx}/user/deleteUser?id=${user.id}">
			  					<button class="btn btn-primary">删除</button>
			  				</a>
			  			</td>
			  		</tr>
			  	</c:forEach>
			  </tbody>
			</table>
	    </div>
	</div>
   </body>
</html>