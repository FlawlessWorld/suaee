<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理系统</title>
</head>
<body>
	
	 <div id="wrapper">

        <div class="container-fluid">
				<br />
				<div class="tiles">
					<!-- <div class="tile selected double-down bg-blue" >
						<div class="tile-body">
							<i class="icon-bell"></i>
						</div>
						<div class="tile-object">
							<div class="name">
								消息提醒
							</div>
							<div class="number">0</div>
						</div>
					</div> -->
					<div class="tile image bg-green selected" onclick="href_page('innerChannel')">
						<!-- <div class="corner"></div> -->
						<div class="tile-body">
							<i class="icon-stackexchange"></i>
						</div>
						<div class="tile-object">
							<div class="name">渠道管理</div>
						</div>
					</div>
					<div class="tile image bg-blue selected" onclick="href_page('groupSend')">
						<!-- <div class="corner"></div> -->
						<div class="tile-body">
							<i class="icon-envelope"></i>
						</div>
						<%-- <div class="tile-body">
							<h4>${messageView.wechatAlias}</h4>
							<p>标题:${messageView.msgTitle}</p>
							<p style="text-align:right">
								${messageView.msgSendDate}
									<script>
									var content='${messageView.msgContent}';
									if(content!=null){
										if(content.length<=12){
											document.write(content);  
										}else{
											document.write(content.substring(0,8)+'...');  
										}
									}
								</script>
							</p>
						</div> --%>
						<div class="tile-object">
							<div class="number" style="font-size:12px;font-weight:300">微信消息群发</div>
						</div>
					</div>
					<!-- <div class="tile double bg-purple">
						<div class="tile-body">
							<img src="/blgroup-osp-social/static/media/image/photo1.jpg" alt="">
							<h3>Announements</h3>
							<p>Easily style icon color, size, shadow, and anything that's possible with CSS.</p>
						</div>
						<div class="tile-object">
							<div class="name" style="color:#7676">微信门户接入账号</div>
							<div class="number">5/2015-10-14</div>
						</div>
					</div>-->
					<div class="tile image bg-yellow selected" onclick="href_page('wechat')">
						<!-- <div class="corner"></div> -->
						<div class="tile-body">
							<i class="icon-comment"></i>
						</div>
						<div class="tile-object">
							<div class="name">微信门户</div>
						</div>
					</div>
					
					
					<!-- <div class="tile selected bg-blue" onclick="href_page('weibo')">
						<div class="corner"></div>
						<div class="tile-body">
							<i class="icon-weibo"></i>
						</div>
						<div class="tile-object">
							<div class="name">微博门户</div>
						</div>
					</div> -->
					
					<!-- <div class="tile selected bg-red" onclick="href_page('taskManage')">
						<div class="corner"></div>
						<div class="tile-body">
							<i class="icon-time"></i>
						</div>
						<div class="tile-object">
							<div class="name">定时任务定义</div>
						</div>
					</div> -->
					<div class="tile image selected" onclick="href_page('mediaInfo')">
						<div class="tile-body">
							<img src="/blgroup-osp-social/static/media/image/image2.jpg" alt="">
						</div>
						<div class="tile-object">
							<div class="name">素材库管理</div>
						</div>
					</div>
					<!-- <div class="tile selected bg-blue" onclick="href_page('weiboPublish')">
						<div class="corner"></div>
						<div class="tile-body">
							<i class="icon-comments-alt"></i>
						</div>
						<div class="tile-object">
							<div class="name" >微博发布</div>
						</div>
					</div> -->
					<!-- <div class="tile double bg-grey">
						<div class="tile-body">
							<img src="/blgroup-osp-social/static/media/image/photo2.jpg" alt="" class="pull-right">
							<h3>@lisa_wong</h3>
							<p>I really love this theme. I look forward to check the next release!</p>
						</div>
						<div class="tile-object">
							<div class="name" style="color:#7676">微博门户接入账号</div>
							<div class="number">5/2015-10-14</div>
						</div>
					</div> -->
				
					<!-- <div class="tile selected bg-red" onclick="href_page('keyword')">
						<div class="tile-body">
							<i class="icon-key"></i>
						</div>
						<div class="tile-object">
							<div class="name">关键字管理</div>
						</div>
					</div> -->
					<!-- <div class="tile selected bg-green" >
						<div class="tile-body">
							<i class="icon-bar-chart"></i>
						</div>
						<div class="tile-object">
							<div class="name">报表分析</div>
							<div class="number">
							</div>
						</div>
					</div> -->
					<div class="tile selected bg-purple" onclick="href_page('knowledge')">
						<div class="tile-body">
							<i class="icon-book"></i>
						</div>
						<div class="tile-object">
							<div class="name">知识库管理</div>
						</div>
					</div>
					
					<!-- <div class="tile selected bg-yellow" onclick="href_page('wechatSetmsg')">
						<div class="tile-body">
							<i class="icon-user"></i>
						</div>
						<div class="tile-object">
							<div class="name">公众号消息设置</div>
						</div>
					</div> -->
					<div class="tile selected bg-blue" onclick="href_page('allFans')">
						<div class="tile-body">
							<!-- <img src="/blgroup-osp-social/static/media/image/image4.jpg" alt=""> -->
							<i class="icon-group"></i>
						</div>
						<div class="tile-object">
							<div class="name">社交粉丝一览</div>
						</div>
					</div>
					
					<div class="tile selected bg-purple" onclick="href_page('tagManage')">
						<div class="tile-body">
							<i class="icon-tags"></i>
						</div>
						<div class="tile-object">
							<div class="name" >标签库管理</div>
						</div>
					</div>
				</div>
				<br>
				<!-- END PAGE CONTENT-->
				
				<div id="content" class="row-fluid">
				     <iframe id="vermiceChartsFrame" name="vermiceChartsFrame" src="${ctx}/social/charts" style="overflow:visible;"
							scrolling="no" frameborder="0" width="92%" height=500></iframe>
				</div>
			</div>
    </div>
    <!-- /#wrapper -->
</body>
</html>