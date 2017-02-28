<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglib.jsp"%>
<html >
   <head>
      <title>用户列表</title>
      <!-- 包含 jQuery angularjs bootstrap -->
      <%@ include file="./common/bootStrap.jsp" %>
      
      <style type="text/css">
      	td {
      		text-align: center;
      	}
      </style>
      	
	<script src="//cdn.bootcss.com/jquery/2.2.2/jquery.js"></script>
	<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
   </head>
   <body >
      <div class="panel panel-primary" style="width: 40%;margin-top: 20px;margin-left: 10%;" >
	    <div class="panel-heading" style="text-align: center;">
	        <h2>用户添加</h2>
	    </div>
	    <div class="panel-body" ng-app="myApp" ng-controller="myCtrl">
	      	<table class="table table-hover" style="text-align: center;">
	    <form id="inputForm" >
			    <tr >
			      <td style="text-align: right;">姓名</td>
			      <td style="text-align: left;"><input type="text" ng-model="userInfo.name" id="name" class="form-control" ></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">年龄</td>
			      <td style="text-align: left;"><input type="text" ng-model="userInfo.age" id="age" class="form-control" /></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">手机号码</td>
			      <td style="text-align: left;"><input type="text" ng-model="userInfo.tel" id="tel"  class="form-control" placeholder="请输入11位手机号码" /></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;">家庭地址</td>
			      <td style="text-align: left;"><input type="text" ng-model="userInfo.address" id="address" class="form-control" ng-model="userInfo.address"/></td>
			    </tr>
			    <tr >
			      <td style="text-align: right;margin-right: 10px;">
			      	<button class="btn btn-primary" ng-click="saveUserInfo()">提交</button>
			      </td>
			      <td style="text-left: right;margin-left: 10px;">
			      	<a href="${pageContext.request.contextPath}/user/list">
				    	<button class="btn btn-primary">用户列表</button>
				  	</a>
			      </td>
			    </tr>
		</form>
		
			</table>
	    </div>
	</div>
	<script>
		var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope,$http) {
			$scope.userInfo = {
		            name:'John',
		            age:10,
		            tel:'13566667777',
		        	address:'长宁区'
		        };
			$scope.saveUserInfo = function(){
	            $http({
	                method: "POST",
	                url: "${ctx}/user/saveByAngularJs",
	                data: $scope.userInfo
	            }).success(function (data, status){
                	if(status == 200){
                		//添加成功
                		$scope.userInfo.name="";
                		$scope.userInfo.age="";
                		$scope.userInfo.tel="";
                		$scope.userInfo.address="";
                		alert("添加用户成功");
                		
                	}
            	})
        };
		});
	</script>
   </body>
</html>