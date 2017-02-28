var userInfoModule=angular.module('UserInfoModule',[ 'ngResource' ]);
userInfoModule.controller('UserInfoController',['$scope','$resource',function($scope,$resource){
	$scope.userInfo={
		name : "jack",
		age : 20,
		tel : "13866667777",
		address : "sss"
	};
	$scope.getUserInfo=function(){
		console.log($scope.userInfo);
	};
	$scope.saveUserInfo = function(){
		// 创建一个resource对象
		var User = $resource('/user/new');
		// 调用save方法 
		//(其实和我们$http.post(url,data).success(function(){})是一样一样的，只是它封装一下而已) User.save({firstname:$scope.firstname,lastname:$scope.lastname,address:$scope.address,email:$scope.email}, function(response){
		User.save($scope.getUserInfo(), function(response){
			$scope.message = response.message;
		})
	}
}]);