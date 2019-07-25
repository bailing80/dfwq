package com.hfhj.controller.system;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hfhj.annotation.SystemLog;
import com.hfhj.controller.index.BaseController;
import com.hfhj.entity.BmfFormMap;
import com.hfhj.entity.GkFormMap;
import com.hfhj.entity.RoleFormMap;
import com.hfhj.mapper.BmfMapper;
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
@RequestMapping("/bmf/")
public class BmfController extends BaseController {
	@Inject
	private BmfMapper bmfMapper;

	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/bmf/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		BmfFormMap bmfFormMap = getFormMap(BmfFormMap.class);
		bmfFormMap=toFormMap(bmfFormMap, pageNow, pageSize,bmfFormMap.getStr("orderby"));
        pageView.setRecords(bmfMapper.findByPage(bmfFormMap));
		return pageView;
	}
	
	
	@RequestMapping("/export")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "本命佛列表";
		BmfFormMap bmfFormMap = findHasHMap(BmfFormMap.class);

		String exportData = bmfFormMap.getStr("exportData");// 列表头的json字符串

		List<Map<String, Object>> listMap = JsonUtils.parseJSONList(exportData);

		List<BmfFormMap> lis = bmfMapper.findBmfPage(bmfFormMap);
		POIUtils.exportToExcel(response, listMap, lis, fileName);
	}
	
	
	
	
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/bmf/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		BmfFormMap bmfFormMap = getFormMap(BmfFormMap.class);
		bmfMapper.addEntity(bmfFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			bmfMapper.deleteByAttribute("id", id, BmfFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("bmf", bmfMapper.findbyFrist("id", id, BmfFormMap.class));
			
		}
		return Common.BACKGROUND_PATH + "/system/bmf/edit";
	}

	//2017.12.20 LYB Add
	@ResponseBody
	@RequestMapping("getbmf")
	public List<BmfFormMap> getbmf(Model model) throws Exception {
		System.out.println("进入getbmf...");
		BmfFormMap bmfFormMap = getFormMap(BmfFormMap.class);
		String gk_sx = URLDecoder.decode(getPara("gksx"),"utf-8");
		System.out.println("顾客生肖为:" + gk_sx);
		//Object userId = roleFormMap.get("userId");
		if(StringUtils.isNotBlank(gk_sx)){
				//bmfFormMap.put("where", " where bmf_sx = " + gk_sx);
		bmfFormMap.put("bmf_sx", gk_sx);
			
		//List<BmfFormMap> bmfs = bmfMapper.findByWhere(bmfFormMap);
		List<BmfFormMap> bmfs = bmfMapper.findByNames(bmfFormMap);
		model.addAttribute("bmf", bmfs);
		return bmfs;
		}
		else
			return null;
	}
}