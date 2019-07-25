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
			colkey : "bmf_sx",
			name : "属相"
		}, {
			colkey : "bmf_bmf",
			name : "本命佛",
			
		}],
		jsonUrl : rootPath + '/bmf/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addBmf").click("click", function() {
		addBmf();
	});
	$("#editBmf").click("click", function() {
		
		editBmf();
	});
	$("#delBmf").click("click", function() {
		delBmf();
	});
});
function editBmf() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/bmf/editUI.shtml?id=' + cbox
	});
}

function addBmf() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/bmf/addUI.shtml'
	});
}
function delBmf() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/bmf/deleteEntity.shtml';
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
