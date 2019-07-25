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
			colkey : "Cp_id",
			name : "产品id"
		}, {
			colkey : "Cp_mc",
			name : "产品名称"
		},{
			colkey : "Cp_sl",
			name : "产品数量"
		},{
			colkey : "Cp_dj",
			name : "产品单价"
		},{
			colkey : "Cp_jj",
			name : "产品金价"
		},{
			colkey : "Cp_jz",
			name : "产品金重"
		},{
			colkey : "Cp_zj",
			name : "产品总价"
		}],
		jsonUrl : rootPath + '/xszi/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addxszi").click("click", function() {
		addxszi();
	});
	$("#editxszi").click("click", function() {
		
		editxszi();
	});
	$("#delxszi").click("click", function() {
		delxszi();
	});
});
function editxszi() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/xszi/editUI.shtml?id=' + cbox
	});
}

function addxszi() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/xszi/addUI.shtml'
	});
}
function delxszi() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/xszi/deleteEntity.shtml';
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
