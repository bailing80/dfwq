package com.hfhj.controller.system;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfhj.annotation.SystemLog;
import com.hfhj.controller.index.BaseController;

import com.hfhj.entity.XsziFormMap;
import com.hfhj.mapper.XsziMapper;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;
import com.hfhj.util.JsonUtils;
import com.hfhj.util.POIUtils;

/**
 * 
 * @author wyb 2017-11-20
 * @Email: 
 * @version 1.0v
 */
@Controller
@RequestMapping("/xszi/")
public class XsziController extends BaseController {
	@Inject
	private XsziMapper xsziMapper;

	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/xszi/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		XsziFormMap xsziFormMap = getFormMap(XsziFormMap.class);
		xsziFormMap=toFormMap(xsziFormMap, pageNow, pageSize,xsziFormMap.getStr("orderby"));
        pageView.setRecords(xsziMapper.findByPage(xsziFormMap));
		return pageView;
	}
	
	
	@RequestMapping("/export")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "本命佛列表";
		XsziFormMap xsziFormMap = findHasHMap(XsziFormMap.class);

		String exportData = xsziFormMap.getStr("exportData");// 列表头的json字符串

		List<Map<String, Object>> listMap = JsonUtils.parseJSONList(exportData);

		List<XsziFormMap> lis = xsziMapper.findXsziPage(xsziFormMap);
		POIUtils.exportToExcel(response, listMap, lis, fileName);
	}
	
	
	
	
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/xszi/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		XsziFormMap xsziFormMap = getFormMap(XsziFormMap.class);
		xsziMapper.addEntity(xsziFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			xsziMapper.deleteByAttribute("id", id, XsziFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("xszi", xsziMapper.findbyFrist("id", id, XsziFormMap.class));
			
		}
		return Common.BACKGROUND_PATH + "/system/xszi/edit";

	}	

}