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
import com.hfhj.entity.GkxxFormMap;
import com.hfhj.mapper.GkxxMapper;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;
import com.hfhj.plugin.PageView;
import com.hfhj.util.POIUtils;
/**
 * 
 * @author wyb 2017-11-20
 * @Email: 
 * @version 1.0v
 */
@Controller
@RequestMapping("/gkxx/")
public class GkxxController extends BaseController {
	@Inject
	private GkxxMapper gkxxMapper;
	
	
	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/gkxx/list";
	}

	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage(String pageNow,
			String pageSize) throws Exception {
		GkxxFormMap gkxxFormMap = getFormMap(GkxxFormMap.class);
		gkxxFormMap=toFormMap(gkxxFormMap, pageNow, pageSize,gkxxFormMap.getStr("orderby"));
        pageView.setRecords(gkxxMapper.findByPage(gkxxFormMap));
		return pageView;
	}
	
	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/gkxx/add";
	}
	@ResponseBody
	@RequestMapping("addEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-新增组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String addEntity() throws Exception {
		GkxxFormMap gkxxFormMap = getFormMap(GkxxFormMap.class);
		gkxxMapper.addEntity(gkxxFormMap);
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-删除组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("id");
		for (String id : ids) {
			gkxxMapper.deleteByAttribute("id", id, GkxxFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("gkxx", gkxxMapper.findbyFrist("id", id, GkxxFormMap.class));
		}
		return Common.BACKGROUND_PATH + "/system/gkxx/edit";
	}

	@ResponseBody
	@RequestMapping("editEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="组管理-修改组")//凡需要处理业务逻辑的.都需要记录操作日志
	public String editEntity() throws Exception {
		GkxxFormMap gkxxFormMap = getFormMap(GkxxFormMap.class);
		gkxxMapper.editEntity(gkxxFormMap);
		return "success";
	}

}