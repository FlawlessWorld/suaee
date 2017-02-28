//模块化
var seckill = {
	//封装秒杀相关ajax的url
	URL : {
		// 获取秒杀入口ajax请求地址
		exposer : function(seckillId){
			return "/seckill/" + seckillId + "/exposer";
		}
	},
	//校验手机号码
	validatePhone : function(seckillId, startTime, endTime){
		var phone = $("#phoneNumber").val();
		 if(!(/^1[34578]\d{9}$/.test(phone))){ 
		        // 秒杀
			 $("#phoneError").html('手机号码有误');
			 return;
		 }
		 // 将号码写入cookie
		 $.cookie('killPhone', phone, { expires: 7 });
		 // 关闭输入框
		 $("#phoneModal").modal('hide');
		 
		 seckill.detail.init(seckillId,startTime,endTime);
		 
	},
	// 秒杀入口获取
	exposer : function(seckillId){
		$.post(seckill.URL.exposer(seckillId),{},function(result){
			if(result && result['success']){
				//获取到数据
				var exposer = result.data;
				if(exposer && exposer['exposed']){
					// 开启秒杀
					var seckillButton = "<button type='button' class='btn btn-danger'>立即秒杀</button>";
					$("#seckillButton").html(seckillButton);
				}
			}
		});
	},
	//详情页秒杀逻辑
	detail : {
		init : function(params){
			//手机验证和登录，计时交互
			var killPhone = jQuery.cookie('killPhone');
			var seckillId = params['seckillId'];
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			
			if(!killPhone){
				// 需要登录
				$("#phoneModal").modal({
					backdrop : false,
					keyboard: false,
				});
			}
			//已经登录
			var nowTime = new Date().getTime();
			// 秒杀未开始
			if(nowTime <= startTime){
				
				$("#searchSeckillResult").html("秒杀倒计时：");
			}
			// 秒杀已结束
			else if(nowTime >= endTime){
				$("#searchSeckillResult").html("秒杀已结束");
			}
			// 获取入口
			
		}
	}
}