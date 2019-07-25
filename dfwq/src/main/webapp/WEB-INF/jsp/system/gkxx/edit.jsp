<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/common.jspf"%>
<script type="text/javascript" src="${ctx}/js/system/gkxx/edit.js"></script>
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
		action="${ctx}/gkxx/editEntity.shtml">
		<input type="hidden" class="form-control checkacc" value="${gkxx.id}"
			name="gkxxFormMap.id" id="id">
		<section class="panel panel-default">
			<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客姓名</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客姓名" name="gkxxFormMap.gk_XM" id="gk_XM" value="${gkxx.gk_XM}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客手机号码</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客手机号码" name="gkxxFormMap.gk_SJHM" id="gk_SJHM" value="${gkxx.gk_SJHM}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客公历生日</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客公历生日" name="gkxxFormMap.gk_glcs" id="gk_glcs" value="${gkxx.gk_glcs}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客农历生日</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客农历生日" name="gkxxFormMap.gk_nlcs" id="gk_nlcs" value="${gkxx.gk_nlcs}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客微信</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客微信" name="gkxxFormMap.gk_WXMCh" id="gk_WXMCh" value="${gkxx.gk_WXMCh}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">顾客OpenId</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkGkxx"
							placeholder="请输入顾客OpenId" name="gkxxFormMap.gk_OpenId" id="gk_OpenId" value="${gkxx.gk_OpenId}"/>
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