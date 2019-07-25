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
import com.hfhj.entity.CpFormMap;
import com.hfhj.entity.GkFormMap;
import com.hfhj.mapper.CpMapper;
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
@RequestMapping("/cp/")
public class CpController extends BaseController {
	@Inject
	private CpMapper cpMapper;

	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/cp/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		CpFormMap cpFormMap = getFormMap(CpFormMap.class);
		cpFormMap=toFormMap(cpFormMap, pageNow, pageSize,cpFormMap.getStr("orderby"));
        pageView.setRecords(cpMapper.findByPage(cpFormMap));
		return pageView;
	}
	
	
//	@RequestMapping("/export")
//	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		String fileName = "产品表";
//		BmfFormMap bmfFormMap = findHasHMap(BmfFormMap.class);
//
//		String exportData = bmfFormMap.getStr("exportData");// 列表头的json字符串
//
//		List<Map<String, Object>> listMap = JsonUtils.parseJSONList(exportData);
//
//		List<BmfFormMap> lis = bmfMapper.findBmfPage(bmfFormMap);
//		POIUtils.exportToExcel(response, listMap, lis, fileName);
//	}
//	
	
	
	
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/cp/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		CpFormMap cpFormMap = getFormMap(CpFormMap.class);
		cpMapper.addEntity(cpFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			cpMapper.deleteByAttribute("id", id, CpFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("cp", cpMapper.findbyFrist("id", id, CpFormMap.class));
			
		}
		return Common.BACKGROUND_PATH + "/system/cp/edit";
	}
	
	//2017.12.19 LYB Add
	@ResponseBody
	@RequestMapping("getjewelry")
	public List<CpFormMap> getone(Model model) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		//String id = getPara("id");
		String cp_lb = URLDecoder.decode(getPara("cplb"),"utf-8");
		System.out.println("进入getjweelry..." + cp_lb);
		
		String jeprop = cp_lb;
		String[] jepropa = jeprop.split("\\s+");
		List<String> propb = new ArrayList<String>();
		for(String aa:jepropa)
		{
			if(aa.trim() == null || (aa.trim().equals("")))
			   continue;
			else
				propb.add(aa);				
		}
		
		for(String a:propb)
			System.out.println(a);
		//if(Common.isNotEmpty(id)){
		model.addAttribute("gk", cpMapper.findCpByNames(propb));
		//}
		System.out.println("查询结果为:" + cpMapper.findCpByNames(propb));
		
		//return Common.BACKGROUND_PATH + "/system/customer/edit";
		//return "success";
		//return mapper.writeValueAsString(id);
		return cpMapper.findCpByNames(propb);
	}



	

}