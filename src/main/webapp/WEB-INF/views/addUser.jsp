<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html>
   <head>
      <title>用户列表</title>
      <!-- 包含 jQuery angularjs bootstrap -->
      <%@ include file="./common/bootStrap.jsp" %>
      
      <style type="text/css">
      	td {
      		text-align: center;
      	}
      </style>
   </head>
   <body>
      <div class="panel panel-primary" style="width: 40%;margin-top: 20px;margin-left: 10%;" >
	    <div class="panel-heading" style="text-align: center;">
	        <h2>用户添加</h2>
	    </div>
	    <div class="panel-body">
	      	<table class="table table-hover" style="text-align: center;">
	    <form:form id="inputForm" action="${ctx}/user/addUser" modelAttribute="user" method="post">
			    <tr >
			      <td style="text-align: right;">姓名</td>
			      <td style="text-align: left;"><form:input type="text"  path="name" id="name" maxlength="50" cssClass="required form-control" /></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">年龄</td>
			      <td style="text-align: left;"><form:input type="text" path="age" id="age" class="form-control"/></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">手机号码</td>
			      <td style="text-align: left;"><form:input type="text" path="tel" id="tel" maxlength="11" class="form-control" placeholder="请输入11位手机号码"/></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">家庭地址</td>
			      <td style="text-align: left;"><form:input type="text" path="address" id="address" maxlength="33" class="form-control"/></td>
			    </tr>
			    <tr>
			   	 <td style="text-align: center;" colspan="2">${message}</td>
			    </tr>
			    <tr >
			      <td colspan="2"><input type="submit" value="提交"></td>
			    </tr>
		</form:form>
			</table>
	    </div>
	</div>
   </body>
</html>