<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/common.jspf"%>
<script type="text/javascript" src="${ctx}/js/system/csjg/edit.js"></script>
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
		action="${ctx}/csjg/editEntity.shtml">
		<input type="hidden" class="form-control checkBmf" value="${csjg.id}"
			name="csjgFormMap.id" id="id">
		<section class="panel panel-default">
			<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-3 control-label">测算时间</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入测算时间" name="csjgFormMap.csjg_sj" id="csjg_sj" value="${csjg.csjg_sj}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				
								<div class="form-group">
					<label class="col-sm-3 control-label">微信</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入微信" name="csjgFormMap.csjg_wxm" id="csjg_wxm" value="${csjg.csjg_wxm}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				
												<div class="form-group">
					<label class="col-sm-3 control-label">openid</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入openid" name="csjgFormMap.csjg_openid" id="csjg_openid" value="${csjg.csjg_openid}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">手机号码</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入手机号码" name="csjgFormMap.csjg_sjhm" id="csjg_sjhm" value="${csjg.csjg_sjhm}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">金的个数</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入金的个数" name="csjgFormMap.csjg_whj" id="csjg_whj" value="${csjg.csjg_whj}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">木的个数</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入木的个数" name="csjgFormMap.csjg_whm" id="csjg_whm" value="${csjg.csjg_whm}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">水的个数</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入水的个数" name="csjgFormMap.csjg_whs" id="csjg_whs" value="${csjg.csjg_whs}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">火的个数</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入火的个数" name="csjgFormMap.csjg_whh" id="csjg_whh" value="${csjg.csjg_whh}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">土的个数</label>
					<div class="col-sm-9">
						<input type="text" class="form-control "
							placeholder="请输入土的个数" name="csjgFormMap.csjg_wht" id="csjg_wht" value="${csjg.csjg_wht}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">本命佛</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入本命佛" name="csjgFormMap.csjg_bmf" id="csjg_bmf" value="${csjg.csjg_bmf}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">吉兽</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入吉兽" name="csjgFormMap.csjg_jx" id="csjg_jx" value="${csjg.csjg_jx}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">经书</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入经书" name="csjgFormMap.csjg_js" id="csjg_js" value="${csjg.csjg_js}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
												<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcsjg"
							placeholder="请输入备注" name="csjgFormMap.csjg_bz" id="csjg_bz" value="${csjg.csjg_bz}"/>
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