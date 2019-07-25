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
			colkey : "csjg_sj",
			name : "测算时间"
		}, {
			colkey : "csjg_wxm",
			name : "微信",
			
		}, {
			colkey : "csjg_openid",
			name : "openid",
			
		}, {
			colkey : "csjg_sjhm",
			name : "手机号码",
			
		}, {
			colkey : "csjg_whj",
			name : "金的个数",
			
		}, {
			colkey : "csjg_whj",
			name : "木的个数",
			
		}, {
			colkey : "csjg_whs",
			name : "水的个数",
			
		}, {
			colkey : "csjg_whh",
			name : "火的个数",
			
		}, {
			colkey : "csjg_wht",
			name : "土的个数",
			
		}, {
			colkey : "csjg_bmf",
			name : "本命佛",
			
		}, {
			colkey : "csjg_jx",
			name : "吉兽",
			
		}, {
			colkey : "csjg_js",
			name : "经书",
			
		},{
			colkey : "csjg_bz",
			name : "备注",
			
		}],
		jsonUrl : rootPath + '/csjg/findByPage.shtml',
		checkbox : true
	});
	$("#search").click("click", function() {// 绑定查询按扭
		var searchParams = $("#searchForm").serializeJson();// 初始化传参数
		grid.setOptions({
			data : searchParams
		});
	});
	$("#addcsjg").click("click", function() {
		addcsjg();
	});
	$("#editcsjg").click("click", function() {
		
		editcsjg();
	});
	$("#delcsjg").click("click", function() {
		delcsjg();
	});
});
function editcsjg() {
	
	var cbox = grid.getSelectedCheckbox();
	if (cbox.length > 1 || cbox == "") {
		layer.msg("只能选中一个");
		return;
	}
	pageii = layer.open({
		title : "编辑",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/csjg/editUI.shtml?id=' + cbox
	});
}

function addcsjg() {
	pageii = layer.open({
		title : "新增",
		type : 2,
		area : [ "600px", "60%" ],
		content : rootPath + '/csjg/addUI.shtml'
	});
}
function delcsjg() {
	var cbox = grid.getSelectedCheckbox();
	if (cbox == "") {
		layer.msg("请选择删除项！！");
		return;
	}
	layer.confirm('是否删除？', function(index) {
		var url = rootPath + '/csjg/deleteEntity.shtml';
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
