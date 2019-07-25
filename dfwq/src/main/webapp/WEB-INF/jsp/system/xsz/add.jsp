<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common/common.jspf" %>
<script type="text/javascript" src="${ctx}/js/system/xsz/add.js">
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
		action="${ctx}/xsz/addEntity.shtml">
		<section class="panel panel-default">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">销售日期</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkxsz"
						placeholder="请输入销售日期" name="xszFormMap.xsz_rq" id="xsz_rq">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">微信号</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkxsz"
						placeholder="请输入微信号" name="xszFormMap.xsz_WXMCh" id="xsz_WXMCh">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>	
						<div class="form-group">
				<label class="col-sm-3 control-label">手机号</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkxsz"
						placeholder="请输入手机号" name="xszFormMap.xsz_sjhm" id="xsz_sjhm">
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