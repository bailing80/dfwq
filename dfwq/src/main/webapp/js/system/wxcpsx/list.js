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
			colkey : "dycp_wh",
			name : "五行名称"
		}, {
			colkey : "dycp_bu",
			name : "补"
		},{
			colkey : "dycp_dbys",
			name : "代表颜色"
		},{
			colkey : "dycp_bszl",
			name : "宝石种类"
		},{
			colkey : "dycp_sx",
			name : "生肖"
		},{
			colkey : "dycp_bmf",
			name : "本命佛"
		},{
			colkey : "dycp_js",
			name : "吉兽"
		},{
			colkey : "dycp_jsh",
			name : "经书"
		},{
			colkey : "dycp_bz",
			name : "备注"
		}],
		jsonUrl : rootPath + '/wxcpsx/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addwxcpsx").click("click", function() {
		addwxcpsx();
	});
	$("#editwxcpsx").click("click", function() {
		
		editwxcpsx();
	});
	$("#delwxcpsx").click("click", function() {
		delwxcpsx();
	});
});
function editwxcpsx() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/wxcpsx/editUI.shtml?id=' + cbox
	});
}

function addwxcpsx() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/wxcpsx/addUI.shtml'
	});
}
function delwxcpsx() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/wxcpsx/deleteEntity.shtml';
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
