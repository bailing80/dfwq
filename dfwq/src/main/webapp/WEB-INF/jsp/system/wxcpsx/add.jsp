<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common/common.jspf" %>
<script type="text/javascript" src="${ctx}/js/system/wxcpsx/add.js">
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
		action="${ctx}/wxcpsx/addEntity.shtml">
		<section class="panel panel-default">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">五行名称</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入五行名称" name="wxcpsxFormMap.dycp_wh" id="dycp_wh">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			
			<div class="form-group">
				<label class="col-sm-3 control-label">补</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入补" name="wxcpsxFormMap.dycp_bu" id="dycp_bu">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">代表颜色</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入代表颜色" name="wxcpsxFormMap.dycp_dbys" id="dycp_dbys">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">宝石种类</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入宝石种类" name="wxcpsxFormMap.dycp_bszl" id="dycp_bszl">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">生肖</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入生肖" name="wxcpsxFormMap.dycp_sx" id="dycp_sx">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">本命佛</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入本命佛" name="wxcpsxFormMap.dycp_bmf" id="dycp_bmf">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">吉兽</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入吉兽" name="wxcpsxFormMap.dycp_js" id="dycp_js">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">经书</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入经书" name="wxcpsxFormMap.dycp_jsh" id="dycp_jsh">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
				<label class="col-sm-3 control-label">备注</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkwxcpsx"
						placeholder="请输入备注" name="wxcpsxFormMap.dycp_bz" id="dycp_bz">
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