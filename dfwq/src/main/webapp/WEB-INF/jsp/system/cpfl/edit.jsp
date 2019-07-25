<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/common.jspf"%>
<script type="text/javascript" src="${ctx}/js/system/cpfl/edit.js"></script>
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
		action="${ctx}/cpfl/editEntity.shtml">
		<input type="hidden" class="form-control checkcpfl" value="${cpfl.id}"
			name="cpflFormMap.id" id="id">
		<section class="panel panel-default">
			<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-3 control-label">分类名称</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkflmc"
							placeholder="请输入分类名称" name="cpflFormMap.cpfl_flmc" id="cpfl_flmc" value="${cpfl.cpfl_flmc}"/>
					</div>
				</div>
				<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">补</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入补" name="cpflFormMap.cpfl_bu" id="cpfl_bu" value="${cpfl.cpfl_bu}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">代表颜色</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入代表颜色" name="cpflFormMap.cpfl_dbys" id="cpfl_dbys" value="${cpfl.cpfl_dbys}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">宝石种类</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入宝石种类" name="cpflFormMap.cpfl_bszl" id="cpfl_bszl" value="${cpfl.cpfl_bszl}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
				
				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">生肖</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入生肖" name="cpflFormMap.cpfl_sx" id="cpfl_sx" value="${cpfl.cpfl_sx}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">本命佛</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入本命佛" name="cpflFormMap.cpfl_bmf" id="cpfl_bmf" value="${cpfl.cpfl_bmf}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">吉兽</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入吉兽" name="cpflFormMap.cpfl_js" id="cpfl_js" value="${cpfl.cpfl_js}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">经书</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入经书" name="cpflFormMap.cpfl_jsh" id="cpfl_jsh" value="${cpfl.cpfl_jsh}">
					</div>
				</div>

				<div class="line line-dashed line-lg pull-in"></div>
				
				<div class="line line-dashed line-lg pull-in"></div>
								<div class="line line-dashed line-lg pull-in"></div>
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<input type="text" class="form-control checkcpfl"
							placeholder="请输入备注" name="cpflFormMap.cpfl_bz" id="cpfl_bz" value="${cpfl.cpfl_bz}">
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