var pageii = null;
var grid = null;
$(function() {
//	alert("11111111111");
	grid = lyGrid({
		id : 'paging',
		l_column : [ {
			colkey : "id",
			name : "id",
			width : "50px",
			hide : true
		}, {
			colkey : "gk_XM",
			name : "顾客姓名"
		}, {
			colkey : "gk_SJHM",
			name : "手机号码",
			width : "100px",
		}, {
			colkey : "gk_glcs",
			name : "公历生日"
		}, {
			colkey : "gk_nlcs",
			name : "农历生日"
		},{
			colkey : "gk_WXMCh",
			name : "微信号"
		}],
		jsonUrl : rootPath + '/gkxx/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addGkxx").click("click", function() {
		addGkxx();
	});
	$("#editGkxx").click("click", function() {
		editGkxx();
	});
	$("#delGkxx").click("click", function() {
		delGkxx();
	});
	});
function editGkxx() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/gkxx/editUI.shtml?id=' + cbox
	});
}

function addGkxx() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/gkxx/addUI.shtml'
	});
}
function delGkxx() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/gkxx/deleteEntity.shtml';
		var s = CommnUtil.ajax(url, {
			ids : cbox.join(",")
		}, "json");
		if (s == "success") {
			layer.msg('删除成功');
			grid.loadData();
		} else {
			layer.msg('删除失败');
		}
	});
}
