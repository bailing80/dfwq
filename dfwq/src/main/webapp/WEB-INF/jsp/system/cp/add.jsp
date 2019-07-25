<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common/common.jspf" %>
<script type="text/javascript" src="${ctx}/js/system/cp/add.js">
</script>
<style type="text/css">
.col-sm-3 {
	width: 15%;
	float: left;
}

.col-sm-9 {
	width: 85%;
	float: left;
}
label[class^="btn btn-default"]{
	margin-top: -4px;
}
</style>
</head>
<body>
	<div class="l_err" style="width: 100%; margin-top: 2px;"></div>
	<form id="form" name="form" class="form-horizontal" method="post"
		action="${ctx}/cp/addEntity.shtml">
		<section class="panel panel-default">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">编码</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入编码" name="cpFormMap.cp_bm" id="cp_bm">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">名称</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入名称" name="cpFormMap.cp_mc" id="cp_mc">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">所属类别</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入所属类别" name="cpFormMap.cp_sslb" id="cp_sslb">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">五行属性</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入五行属性" name="cpFormMap.cp_wxsx" id="cp_wxsx">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">宝石种类</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入宝石种类" name="cpFormMap.cp_flmc" id="cp_flmc">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">单价</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入单价" name="cpFormMap.cp_dj" id="cp_dj">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">数量</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入数量" name="cpFormMap.cp_sj" id="cp_sj">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">金价</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入金价" name="cpFormMap.cp_jj" id="cp_jj">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">金重</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入金重" name="cpFormMap.cp_jz" id="cp_jz">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">颜色</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入颜色" name="cpFormMap.cp_ys" id="cp_ys">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">备注</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkcp"
						placeholder="请输入备注" name="cpFormMap.cp_bz" id="cp_bz">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>

		</div>
		<footer class="panel-footer text-right bg-light lter">
			<button type="submit" class="btn btn-success btn-s-xs">提交</button>
		</footer> 
		</section>
	</form>
</body>
</html>