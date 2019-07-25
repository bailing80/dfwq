var pageii = null;
var grid = null;
$(function() {
//alert("111111111");
	grid = lyGrid({
		id : 'paging',
		l_column : [ {
			colkey : "id",
			name : "id",
			width : "50px",
			
		}, {
			colkey : "xs_rq",
			name : "销售日期"
		}, {
			colkey : "xs_WXMCh",
			name : "微信"
		},{
			colkey : "xs_sjhm",
			name : "手机号码"
		}],
		jsonUrl : rootPath + '/xsz/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addxsz").click("click", function() {
		addxsz();
	});
	$("#editxsz").click("click", function() {
		
		editxsz();
	});
	$("#delxsz").click("click", function() {
		delxsz();
	});
});
function editxsz() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/xsz/editUI.shtml?id=' + cbox
	});
}

function addxsz() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/xsz/addUI.shtml'
	});
}
function delxsz() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/xsz/deleteEntity.shtml';
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
