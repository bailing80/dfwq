package com.hfhj.controller.system;

import java.net.URLDecoder;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfhj.annotation.SystemLog;
import com.hfhj.controller.index.BaseController;
import com.hfhj.entity.BmfFormMap;
import com.hfhj.entity.JsbFormMap;
import com.hfhj.mapper.JsbMapper;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;

/**
 * 
 * @author wyb 2017-11-20
 * @Email: 
 * @version 1.0v
 */
@Controller
@RequestMapping("/jsb/")
public class JsbController extends BaseController {
	@Inject
	private JsbMapper jsbMapper;
	
	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/jsb/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		JsbFormMap jsbFormMap = getFormMap(JsbFormMap.class);
		jsbFormMap=toFormMap(jsbFormMap, pageNow, pageSize,jsbFormMap.getStr("orderby"));
        pageView.setRecords(jsbMapper.findByPage(jsbFormMap));
		return pageView;
	}

	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/jsb/add";
	}

	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		JsbFormMap jsbFormMap = getFormMap(JsbFormMap.class);
		jsbMapper.addEntity(jsbFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("ids");
		for (String id : ids) {
			jsbMapper.deleteByAttribute("id", id, JsbFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("jsb", jsbMapper.findbyFrist("id", id, JsbFormMap.class));
		}
		return Common.BACKGROUND_PATH + "/system/jsb/edit";
	}

	@ResponseBody
	@RequestMapping("editEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-修改组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String editEntity() throws Exception {
		JsbFormMap jsbFormMap = getFormMap(JsbFormMap.class);
		jsbMapper.editEntity(jsbFormMap);
		return "success";
	}
	//2017.12.10 LYB ADD
	@ResponseBody
	@RequestMapping("getjs")
	public List<JsbFormMap> getjishou(Model model) throws Exception {
		System.out.println("进入getjishou...");
		JsbFormMap jsbFormMap = getFormMap(JsbFormMap.class);
		String gk_sx = URLDecoder.decode(getPara("gksx"),"utf-8");
		System.out.println("顾客生肖为:" + gk_sx);
		//Object userId = roleFormMap.get("userId");
		if(StringUtils.isNotBlank(gk_sx)){
				//bmfFormMap.put("where", " where bmf_sx = " + gk_sx);
		jsbFormMap.put("jsb_sx", gk_sx);
			
		//List<BmfFormMap> bmfs = bmfMapper.findByWhere(bmfFormMap);
		List<JsbFormMap> jshous = jsbMapper.findByNames(jsbFormMap);
		model.addAttribute("jshou",jshous);
		return jshous;
		}
		else
			return null;
	}
	
	
}	
	