<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>健康小屋-HealthHut</title>
<!-- 引入css样式文件 -->
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/HealthHut/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- MetisMenu CSS -->
<link href="${pageContext.request.contextPath}/HealthHut/css/metisMenu.min.css"
	rel="stylesheet" />
<!-- DataTables CSS -->
<link
	href="${pageContext.request.contextPath}/HealthHut/css/dataTables.bootstrap.css"
	rel="stylesheet" />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/HealthHut/css/sb-admin-2.css"
	rel="stylesheet" />
<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/HealthHut/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/HealthHut/css/HealthHut.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="wrapper">
		<!-- 导航栏部分 -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<a class="navbar-brand" >HealthHut后台管理系统 v1.0</a><span id="yeshu" style="display: none;">${yeshu }</span>
			</div>
			<!-- 导航栏右侧图标部分 -->
			<ul class="nav navbar-top-links navbar-right">
				<!-- 邮件通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i
						class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a></li>
				<!-- 邮件通知 end -->
				<!-- 任务通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a></li>
				<!-- 任务通知 end -->
				<!-- 消息通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a></li>
				<!-- 消息通知 end -->
				<!-- 用户信息和系统设置 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i>
								用户：${USER_SESSION.user_name} </a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/logout">
								<i class="fa fa-sign-out fa-fw"></i>退出登录
						</a></li>
					</ul></li>
				<!-- 用户信息和系统设置结束 -->
			</ul>
			<!-- 左侧显示列表部分 start-->
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="查询内容...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
									</button>
								</span>
							</div>
						</li>
					<li><a href="${pageContext.request.contextPath }/HealthHut/toWorkers"
							class="active"> <i class="fa fa-edit fa-fw"></i> 医生管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/toDrugdetail"
							class="active"> <i class="fa fa-edit fa-fw"></i> 药品管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/toTeachers"
							class="active"> <i class="fa fa-edit fa-fw"></i> 教师管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/toStudents"
							class="active"> <i class="fa fa-edit fa-fw"></i> 学生管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/toRecipeMain"
							class="active"> <i class="fa fa-edit fa-fw"></i> 处方管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/HealthHut/toCaseRecord"
							class="active"> <i class="fa fa-edit fa-fw"></i> 电子病历管理
						</a></li>
					</ul>
				</div>
			</div>
			<!-- 左侧显示列表部分 end-->
		</nav>
		<!-- 客户列表查询部分  start-->
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">教师管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<%-- <div class="panel panel-default">
				<div class="panel-body">
						<div class="form-group">
							<label for="customerName">客户名称<input type="text"
								class="form-control" id="customerName" value="${custName }"
								name="custName" /><button type="submit" onclick="chaxun()" class="btn btn-primary">查询</button></label> 
						</div>
						
					
				</div>
			</div> --%>
			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#newCustomerDialog" onclick="clearCustomer()">新建</a>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">教师信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>编号</th>
									<th>教师登录账户</th>
									<th>教师姓名</th>
									<th>教师登录密码</th>
									<th>联系电话</th>
									<th>教工号</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="chaxunList" >
									<tr id="chaxunList0"></tr>
									<tr id="chaxunList1"></tr>
									<tr id="chaxunList2"></tr>
									<tr id="chaxunList3"></tr>
									<tr id="chaxunList4"></tr>
									<tr id="chaxunList5"></tr>
									<tr id="chaxunList6"></tr>
									<tr id="chaxunList7"></tr>
									<tr id="chaxunList8"></tr>
									
							</tbody>
						</table>
						
						<div class="col-md-12 text-right">
							<button type="submit" onclick="chashang()" class="btn btn-primary">上一页</button>
							<button type="submit" onclick="chaxia()" class="btn btn-primary">下一页</button>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- 客户列表查询部分  end-->
	</div>
	<!-- 创建客户模态框 -->
	<div class="modal fade" id="newCustomerDialog" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新建教师用户信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="new_customer_form">
						<div class="form-group">
							<label for="newworkers_id" class="col-sm-2 control-label">
								登录账户</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newworkers_id"
									placeholder="登录账户" name="usercode" />
							</div>
						</div>
						
					<!-- 	dd_id drug_no name unit min_unit stock_num effective_date update_date operator -->
						<div class="form-group">
							<label for="newname" class="col-sm-2 control-label">教师姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newname"
									placeholder="教师姓名" name="username" />
							</div>
						</div>
						<div class="form-group">
							<label for="newsex" class="col-sm-2 control-label">登录密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newsex"
									placeholder="登录密码" name="password" />
							</div>
						</div>
						<div class="form-group">
							<label for="newbirth" class="col-sm-2 control-label">联系电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newbirth"
									placeholder="联系电话" name="telephone" />
							</div>
						</div>
						<div class="form-group">
							<label for="newposition" class="col-sm-2 control-label">教工号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newposition"
									placeholder="教工号" name="st_number" />
							</div>
						</div>
						<input type="hidden" id="updateworkers_id1" name="issutdent" value="n" />
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="createCustomer()">新增</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 修改客户模态框 -->
	<div class="modal fade" id="customerEditDialog" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改教师用户信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_customer_form" >
						<input type="hidden" id="updateworkers_id" name="userid" />
						<input type="hidden" id="updateworkers_id1" name="issutdent" value="n" />
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">登录账户</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="name"
									placeholder="登录账户" name="usercode" />
							</div>
						</div>
						<div class="form-group">
							<label for="sex" class="col-sm-2 control-label">教师姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="sex"
									placeholder="教师姓名" name="username" />
							</div><!-- userid usercode username password telephone issutdent st_number -->
						</div>
						<div class="form-group">
							<label for="birth" class="col-sm-2 control-label">登录密码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="birth"
									placeholder="登录密码" name="password" />
							</div>
						</div>
						<div class="form-group">
							<label for="position" class="col-sm-2 control-label">联系电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="position"
									placeholder="联系电话" name="telephone" />
							</div>
						</div>
						<div class="form-group">
							<label for="title" class="col-sm-2 control-label">教工号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title"
									placeholder="教工号" name="st_number" />
							</div>
						</div>
						
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="updateWorker()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 引入js文件 -->
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/HealthHut/js/jquery-1.11.3.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/HealthHut/js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="${pageContext.request.contextPath}/HealthHut/js/metisMenu.min.js"></script>
	<!-- DataTables JavaScript -->
	<script
		src="${pageContext.request.contextPath}/HealthHut/js/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/HealthHut/js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="${pageContext.request.contextPath}/HealthHut/js/sb-admin-2.js"></script>
	<!-- 编写js代码 -->
	<script type="text/javascript">
//清空新建客户窗口中的数据
	function clearCustomer() {
	    $("#newworkers_id").val("");
	    $("#newname").val("");
	    $("#newsex").val("");
	    $("#newbirth").val("");<!-- userid usercode username password telephone issutdent st_number -->
	    $("#newposition").val("");
	    $("#newtitle").val("");
	    $("#newupdate_date").val("");
	    $("#newoperator").val("");
	    
	}
	// 创建客户
	function createCustomer() {
	$.post("${pageContext.request.contextPath}/HealthHut/createTeachers",
	$("#new_customer_form").serialize(),function(data){
	        if(data =="OK"){
	            alert("新增成功！");
	            window.location.reload();
	        }else{
	            alert("新增失败！");
	            window.location.reload();
	        }
	    });
	}
	
	// 通过id获取修改的客户信息
	function editCustomer(id) {
		 $("#updateworkers_id").val(id);
	    $.ajax({
	        type:"get",
	        url:"${pageContext.request.contextPath}/HealthHut/findTeachersById",
	        data:{"id":id},
	        success:function(data) {
	            $("#name").val(data.usercode);
	            $("#sex").val(data.username);
	            $("#birth").val(data.password);
	            $("#position").val(data.telephone);
	            $("#title").val(data.st_number);
	        }
	    });
	}
	chaxun(); 
	
	
	// 查询列表
	function chaxun() {
		var str= "";
		$.ajax({
	        type:"get",
	        url:"${pageContext.request.contextPath}/HealthHut/findTeachersList?page=0",
	        success:function(data) {
	        	for( var i=0; i<9; i++){
	        		str = '<td>'+data[i].userid
	        		+'</td><td>'+data[i].usercode
	        		+'</td><td>'+data[i].username
	        		+'</td><td>'+data[i].password
	        		+'</td><td>'+data[i].telephone
	        		+'</td><td>'+data[i].st_number
	        		+'</td><td><a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer('+data[i].userid+')">修改</a>'
	        		+'<a href="#" class="btn btn-danger btn-xs" onclick="deleteWorker('+data[i].userid+')">删除</a></td>';
	        		$("#chaxunList"+i).html(str);
	        	}
	        }<!-- userid usercode username password telephone issutdent st_number -->
	    });
	}
	var i = 0;
	var str= "";	
	//上一页
	function chashang() {
		if(i>0){
			$.ajax({
		        type:"get",
		        url:"${pageContext.request.contextPath}/HealthHut/findTeachersList?page="+(--i),
		        success:function(data) {
		        	if(data != null){
			        	for( var i=0; i<9; i++){
			        		str = '<td>'+data[i].userid
			        		+'</td><td>'+data[i].usercode
			        		+'</td><td>'+data[i].username
			        		+'</td><td>'+data[i].password
			        		+'</td><td>'+data[i].telephone
			        		+'</td><td>'+data[i].st_number
			        		+'</td><td><a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer('+data[i].userid+')">修改</a>'
			        		+'<a href="#" class="btn btn-danger btn-xs" onclick="deleteWorker('+data[i].userid+')">删除</a></td>';
			        		$("#chaxunList"+i).html(str);
			        	}
		        	}
		        }
		    });
		
		}else{
			alert("已经是最前一页");
		}
		
	}
	
	//下一页
	function chaxia() {
		var yeshu =parseInt($("#yeshu").text());
		if(i<yeshu-1){
			$.ajax({
		        type:"get",
		        url:"${pageContext.request.contextPath}/HealthHut/findTeachersList?page="+(++i),
		        success:function(data) {
			        	for( var i=0; i<9; i++){
			        		if(data[i] != undefined){
				        		str = '<td>'+data[i].userid
				        		+'</td><td>'+data[i].usercode
				        		+'</td><td>'+data[i].username
				        		+'</td><td>'+data[i].password
				        		+'</td><td>'+data[i].telephone
				        		+'</td><td>'+data[i].st_number
				        		+'</td><td><a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer('+data[i].userid+')">修改</a>'
				        		+'<a href="#" class="btn btn-danger btn-xs" onclick="deleteWorker('+data[i].userid+')">删除</a></td>';
				        		$("#chaxunList"+i).html(str);
			        		}else{
			        			$("#chaxunList"+i).html("");
			        		}
			        	}
		        }
		    });
		}else{
			alert("已经是最后一页");
		}
		
	}
	function cha(){
		
	}
	
    // 执行修改客户操作
	function updateWorker() {
		$.post("${pageContext.request.contextPath}/HealthHut/updateTeachers",$("#edit_customer_form").serialize(),function(data){
			if(data =="OK"){
				alert("教师信息更新成功！");
				window.location.reload();
			}else{
				alert("教师信息更新失败！");
				window.location.reload();
			}
		});
	}
	// 删除客户
	function deleteWorker(id) {
	    if(confirm('确实要删除该教师吗?')) {
	$.post("${pageContext.request.contextPath}/HealthHut/deleteTeachers",{"id":id},
	function(data){
	            if(data =="OK"){
	                alert("教师信息删除成功！");
	                window.location.reload();
	            }else{
	                alert("删除教师信息失败！");
	                window.location.reload();
	            }
	        });
	    }
	}
</script>
</body>
</html>