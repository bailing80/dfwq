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
			colkey : "cpfl_flmc",
			name : "分类名称"
		}, {
			colkey : "cpfl_bu",
			name : "补"
		},{
			colkey : "cpfl_dbys",
			name : "代表颜色"
		},{
			colkey : "cpfl_bszl",
			name : "宝石种类"
		},{
			colkey : "cpfl_sx",
			name : "生肖"
		},{
			colkey : "cpfl_bmf",
			name : "本命佛"
		},{
			colkey : "cpfl_js",
			name : "吉兽"
		},{
			colkey : "cpfl_jsh",
			name : "经书"
		},{
			colkey : "cpfl_bz",
			name : "备注"
		}],
		jsonUrl : rootPath + '/cpfl/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addcpfl").click("click", function() {
		addcpfl();
	});
	$("#editcpfl").click("click", function() {
		
		editcpfl();
	});
	$("#delcpfl").click("click", function() {
		delcpfl();
	});
});
function editcpfl() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/cpfl/editUI.shtml?id=' + cbox
	});
}

function addcpfl() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/cpfl/addUI.shtml'
	});
}
function delcpfl() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/cpfl/deleteEntity.shtml';
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
