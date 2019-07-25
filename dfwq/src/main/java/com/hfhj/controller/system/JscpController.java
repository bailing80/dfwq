package com.hfhj.controller.system;

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
import com.hfhj.entity.JscpFormMap;
import com.hfhj.mapper.JscpMapper;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;

/**
 * 
 * @author wyb 2017-11-20
 * @Email: 
 * @version 1.0v
 */
@Controller
@RequestMapping("/jscp/")
public class JscpController extends BaseController {
	@Inject
	private JscpMapper jscpMapper;
	
	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/jscp/list";
	}	
	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		JscpFormMap jscpFormMap = getFormMap(JscpFormMap.class);
		jscpFormMap=toFormMap(jscpFormMap, pageNow, pageSize,jscpFormMap.getStr("orderby"));
        pageView.setRecords(jscpMapper.findByPage(jscpFormMap));
		return pageView;
	}
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/jscp/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		JscpFormMap jscpFormMap = getFormMap(JscpFormMap.class);
		jscpMapper.addEntity(jscpFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			jscpMapper.deleteByAttribute("id", id, JscpFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("jscp", jscpMapper.findbyFrist("id", id, JscpFormMap.class));
			
		}
		return Common.BACKGROUND_PATH + "/system/jscp/edit";
	}
	

	

}