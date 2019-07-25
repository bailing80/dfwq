<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common/common.jspf" %>
<script type="text/javascript" src="${ctx}/js/system/xszi/add.js">
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
		action="${ctx}/xszi/addEntity.shtml">
		<section class="panel panel-default">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">产品id</label>
				<div class="col-sm-9">
					<input type="text" class="form-control"
						placeholder="请输入产品id" name="xsziFormMap.Cp_id" id="Cp_id">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">产品名称</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkxszi"
						placeholder="请输入产品名称" name="xsziFormMap.Cp_mc" id="Cp_mc">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">产品数量</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入产品数量" name="xsziFormMap.Cp_sl" id="Cp_sl">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">产品单价</label>
				<div class="col-sm-9">
					<input type="text" class="form-control"
						placeholder="请输入产品单价" name="xsziFormMap.Cp_dj" id="Cp_dj">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">产品金价</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入产品金价" name="xsziFormMap.Cp_jj" id="Cp_jj">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">产品金重</label>
				<div class="col-sm-9">
					<input type="text" class="form-control "
						placeholder="请输入产品金重" name="xsziFormMap.Cp_jz" id="Cp_jz">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
						<div class="form-group">
				<label class="col-sm-3 control-label">产品总价</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkxszi"
						placeholder="请输入产品总价" name="xsziFormMap.Cp_zj" id="Cp_zj">
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