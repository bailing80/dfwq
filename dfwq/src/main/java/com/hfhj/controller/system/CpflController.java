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
import com.hfhj.entity.BmfFormMap;
import com.hfhj.entity.CpflFormMap;
import com.hfhj.mapper.CpflMapper;
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
@RequestMapping("/cpfl/")
public class CpflController extends BaseController {
	@Inject
	private CpflMapper cpflMapper;

	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/cpfl/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		CpflFormMap cpflFormMap = getFormMap(CpflFormMap.class);
		cpflFormMap=toFormMap(cpflFormMap, pageNow, pageSize,cpflFormMap.getStr("orderby"));
        pageView.setRecords(cpflMapper.findByPage(cpflFormMap));
		return pageView;
	}
	
	
	@RequestMapping("/export")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "产品分类表";
		CpflFormMap cpflFormMap = findHasHMap(CpflFormMap.class);

		String exportData = cpflFormMap.getStr("exportData");// 列表头的json字符串

		List<Map<String, Object>> listMap = JsonUtils.parseJSONList(exportData);

		List<CpflFormMap> lis = cpflMapper.findCpflPage(cpflFormMap);
		POIUtils.exportToExcel(response, listMap, lis, fileName);
	}
	
	
	
	
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/cpfl/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		CpflFormMap cpflFormMap = getFormMap(CpflFormMap.class);
		cpflMapper.addEntity(cpflFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			cpflMapper.deleteByAttribute("id", id, CpflFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("cpfl", cpflMapper.findbyFrist("id", id, CpflFormMap.class));
			
		}
		return Common.BACKGROUND_PATH + "/system/cpfl/edit";
	}

	

}