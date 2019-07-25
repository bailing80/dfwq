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
			colkey : "cp_bm",
			name : "编码"
		}, {
			colkey : "cp_mc",
			name : "名称"
		},{
			colkey : "cp_sslb",
			name : "所属类别"
		},{
			colkey : "cp_wxsx",
			name : "五行属性"
		},{
			colkey : "cp_flmc",
			name : "宝石种类"
		},{
			colkey : "cp_dj",
			name : "单价"
		},{
			colkey : "cp_sj",
			name : "数量"
		},{
			colkey : "cp_jj",
			name : "金价"
		},{
			colkey : "cp_jz",
			name : "金重"
		},{
			colkey : "cp_ys",
			name : "颜色"
		},{
			colkey : "cp_bz",
			name : "备注"
		}],
		jsonUrl : rootPath + '/cp/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addcp").click("click", function() {
		addcp();
	});
	$("#editcp").click("click", function() {
		
		editcp();
	});
	$("#delcp").click("click", function() {
		delcp();
	});
});
function editcp() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/cp/editUI.shtml?id=' + cbox
	});
}

function addcp() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/cp/addUI.shtml'
	});
}
function delcp() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/cp/deleteEntity.shtml';
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
