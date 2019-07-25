<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/common.jspf"%>
<script type="text/javascript" src="${ctx}/js/system/xsz/edit.js"></script>
<style type="text/css">
.col-sm-3 {
	width: 15%;
	float: left;
}

.col-sm-9 {
	width: 85%;
	float: left;
}
</style>
</head>
<body>
	<div class="l_err" style="width: 100%; margin-top: 2px;"></div>
	<form id="form" name="form" class="form-horizontal" method="post"
		action="${ctx}/xsz/editEntity.shtml">
		<input type="hidden" class="form-control checkxsz" value="${xsz.id}"
			name="bmfFormMap.id" id="id">
		<section class="panel panel-default">
			<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-3 control-label">销售日期</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkxsz"
							placeholder="请输入销售日期" name="xszFormMap.xs_rq" id="xs_rq" value="${xsz.xs_rq}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">微信号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkxsz"
							placeholder="请输入微信号" name="xszFormMap.xs_WXMCh" id="xs_WXMCh" value="${xsz.xs_WXMCh}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">手机号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkxsz"
							placeholder="请输入手机号" name="xszFormMap.xs_sjhm" id="xs_sjhm" value="${xsz.xs_sjhm}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>

			</div>
			<footer class="panel-footer text-right bg-light lter">
			<button type="submit" class="btn btn-success btn-s-xs">提交</button>
		</footer> 
	</section>
	</form>
	<script type='text/javascript'>
		/* $(function(){
			$("from input[name='enable'][value='${role.enable}']").attr("checked","checked");
			alert("input[name='enable'][value='${role.enable}']");
		}); */
	</script>
</body>
</html>