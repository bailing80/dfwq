<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/common.jspf"%>
<script type="text/javascript" src="${ctx}/js/system/user/edit.js"></script>

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
	<form id="form" name="form" class="form-horizontal" method="post" action="${ctx}/customer/editEntity.shtml">
		<input type="hidden" class="form-control checkacc"  value="${gk.id}" name="gkFormMap.id" id="id">
		<section class="panel panel-default">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">微信名</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="请输入用户名" value="${gk.gkwx_WXMCh}"
						name="gkFormMap.gkwx_WXMCh" id="gkwx_WXMCh">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">微信OpenId</label>
				<div class="col-sm-9">
					<input type="text" class="form-control checkacc" placeholder="请输入微信OpenId" value="${gk.gkwx_OpenId}"
						name="gkFormMap.gkwx_OpenId" id="gkwx_OpenId" readonly="readonly">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">客户名称</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="请输入客户姓名" value="${gk.gk_XM}"
						name="gkFormMap.gk_XM" id="gk_XM">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">性别</label>
				<div class="col-sm-9">
					<div class="btn-group m-r">
						<button data-toggle="dropdown"
							class="btn btn-sm btn-default dropdown-toggle">
							<span class="dropdown-label"><c:if
									test="${gk.gk_XB eq '男'}">男</c:if>
								<c:if test="${gk.gk_XB eq '女'}">女</c:if></span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu dropdown-select">
							<li class="active"><a href="#"><input type="radio" name="gkFormMap.gk_XB" value="男"
									<c:if test="${gk.gk_XB eq '男'}"> checked="checked"</c:if>>男</a>
						    </li>
							<li class=""><a href="#"><input type="radio" name="gkFormMap.gk_XB" value="女"
									<c:if test="${gk.gk_XB eq '女'}"> checked="checked"</c:if>>女</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">手机号码</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="请输入手机号码" value="${gk.gk_SJHM}" name="gkFormMap.gk_SJHM" id="gk_SJHM">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-3 control-label">出生日期</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="请输入出生日期" value="${gk.gk_glcs}" name="gkFormMap.gk_glcs" id="gk_glcs">
				</div>
			</div>
		</div>
		    <footer class="panel-footer text-right bg-light lter">
		        <button type="submit" class="btn btn-success btn-s-xs">保存</button>
		    </footer> 
	    </section>
	</form>
	<script type="text/javascript">
	    onloadurl();
    </script>
</body>
</html>