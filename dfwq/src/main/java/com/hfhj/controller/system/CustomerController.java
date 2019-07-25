package com.hfhj.controller.system;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfhj.mapper.GkMapper;
import com.hfhj.mapper.UserMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hfhj.annotation.SystemLog;
import com.hfhj.controller.index.BaseController;
import com.hfhj.entity.GkFormMap;
import com.hfhj.entity.ResUserFormMap;
import com.hfhj.entity.UserFormMap;
import com.hfhj.entity.UserGroupsFormMap;
import com.hfhj.exception.SystemException;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;
import com.hfhj.util.JsonUtils;
import com.hfhj.util.POIUtils;
import com.hfhj.util.PasswordHelper;

/**
 * 
 * @author lanyuan 2014-11-19
 * @Email: mmm333zzz520@163.com
 * @version 3.0v
 */
@Controller
@RequestMapping("/customer/")
public class CustomerController extends BaseController {
	@Inject
	private UserMapper userMapper;
	
	@Inject
	private GkMapper gkMapper;
	
	@RequestMapping("list")
	public String listUI(Model model) throws Exception {
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/customer/list";
	}

	@ResponseBody
	@RequestMapping("findByPage")
	public PageView findByPage( String pageNow,
			String pageSize,String column,String sort) throws Exception {
		UserFormMap userFormMap = getFormMap(UserFormMap.class);
		userFormMap=toFormMap(userFormMap, pageNow, pageSize,userFormMap.getStr("orderby"));
		userFormMap.put("column", column);
		userFormMap.put("sort", sort);
        pageView.setRecords(userMapper.findUserPage(userFormMap));//不调用默认分页,调用自已的mapper中findUserPage
        return pageView;
	}
	
	@RequestMapping("/export")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "用户列表";
		UserFormMap userFormMap = findHasHMap(UserFormMap.class);
		//exportData = 
		// [{"colkey":"sql_info","name":"SQL语句","hide":false},
		// {"colkey":"total_time","name":"总响应时长","hide":false},
		// {"colkey":"avg_time","name":"平均响应时长","hide":false},
		// {"colkey":"record_time","name":"记录时间","hide":false},
		// {"colkey":"call_count","name":"请求次数","hide":false}
		// ]
		String exportData = userFormMap.getStr("exportData");// 列表头的json字符串

		List<Map<String, Object>> listMap = JsonUtils.parseJSONList(exportData);

		List<UserFormMap> lis = userMapper.findUserPage(userFormMap);
		POIUtils.exportToExcel(response, listMap, lis, fileName);
	}

	@RequestMapping("addUI")
	public String addUI(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/customer/add";
	}

	@ResponseBody
	@RequestMapping("addEntity")
	@SystemLog(module="系统管理",methods="顾客管理-新增顾客")//凡需要处理业务逻辑的.都需要记录操作日志
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	public String addEntity(String txtGroupsSelect){
		try {
			//UserFormMap userFormMap = getFormMap(UserFormMap.class);
			GkFormMap gkFormMap = getFormMap(GkFormMap.class);
			//userFormMap.put("txtGroupsSelect", txtGroupsSelect);
			gkFormMap.put("txtGroupsSelect", txtGroupsSelect);
			//PasswordHelper passwordHelper = new PasswordHelper();
			//userFormMap.set("password","123456789");
			//passwordHelper.encryptPassword(userFormMap);
			//userMapper.addEntity(userFormMap);//新增后返回新增信息
			gkMapper.addEntity(gkFormMap);//新增后返回新增信息
			
			/*if (!Common.isEmpty(txtGroupsSelect)) {
				String[] txt = txtGroupsSelect.split(",");
				UserGroupsFormMap userGroupsFormMap = new UserGroupsFormMap();
				for (String roleId : txt) {
					userGroupsFormMap.put("userId", userFormMap.get("id"));
					userGroupsFormMap.put("roleId", roleId);
					userMapper.addEntity(userGroupsFormMap);
				}
			}*/
		} catch (Exception e) {
			 throw new SystemException("添加顾客异常");
		}
		return "success";
	}

	@ResponseBody
	@RequestMapping("deleteEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="客户管理-删除客户")//凡需要处理业务逻辑的.都需要记录操作日志
	public String deleteEntity() throws Exception {
		String[] ids = getParaValues("ids");
		for (String id : ids) {
			//userMapper.deleteByAttribute("userId", id, UserGroupsFormMap.class);
			//userMapper.deleteByAttribute("userId", id, ResUserFormMap.class);
			gkMapper.deleteByAttribute("id", id, GkFormMap.class);
		}
		return "success";
	}

	@RequestMapping("editUI")
	public String editUI(Model model) throws Exception {
		String id = getPara("id");
		if(Common.isNotEmpty(id)){
			model.addAttribute("gk", gkMapper.findbyFrist("id", id, GkFormMap.class));
		}
		return Common.BACKGROUND_PATH + "/system/customer/edit";
	}

	@ResponseBody
	@RequestMapping("editEntity")
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="客户管理-修改客户")//凡需要处理业务逻辑的.都需要记录操作日志
	public String editEntity(String txtGroupsSelect) throws Exception {
		GkFormMap gkFormMap = getFormMap(GkFormMap.class);
		gkFormMap.put("txtGroupsSelect", txtGroupsSelect);
		gkMapper.editEntity(gkFormMap);
		//gkMapper.deleteByAttribute("gkId", gkFormMap.get("id")+"", GkGroupsFormMap.class);
		/*
		if(!Common.isEmpty(txtGroupsSelect)){
			String[] txt = txtGroupsSelect.split(",");
			for (String roleId : txt) {
				UserGroupsFormMap userGroupsFormMap = new UserGroupsFormMap();
				userGroupsFormMap.put("userId", userFormMap.get("id"));
				userGroupsFormMap.put("roleId", roleId);
				userMapper.addEntity(userGroupsFormMap);
			}
		}*/
		return "success";
	}
	/**
	 * 验证账号是否存在
	 * 
	 * @author lanyuan Email：mmm333zzz520@163.com date：2014-2-19
	 * @param name
	 * @return
	 */
	@RequestMapping("isExist")
	@ResponseBody
	public boolean isExist(String name) {
		UserFormMap account = userMapper.findbyFrist("accountName", name, UserFormMap.class);
		if (account == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//密码修改
	@RequestMapping("updatePassword")
	public String updatePassword(Model model) throws Exception {
		return Common.BACKGROUND_PATH + "/system/user/updatePassword";
	}
	
	//保存新密码
	@RequestMapping("editPassword")
	@ResponseBody
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	@SystemLog(module="系统管理",methods="用户管理-修改密码")//凡需要处理业务逻辑的.都需要记录操作日志
	public String editPassword() throws Exception{
		// 当验证都通过后，把用户信息放在session里
		UserFormMap userFormMap = getFormMap(UserFormMap.class);
		userFormMap.put("password", userFormMap.get("newpassword"));
		//这里对修改的密码进行加密
		PasswordHelper passwordHelper = new PasswordHelper();
		passwordHelper.encryptPassword(userFormMap);
		userMapper.editEntity(userFormMap);
		return "success";
	}
	
	@ResponseBody
	@RequestMapping("getjewelry")
	public List<GkFormMap> getone(Model model) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		//String id = getPara("id");
		String gk_xm = getPara("gkxm");
		System.out.println("进入getjweelry..." + gk_xm);
		
		String jeprop = gk_xm;
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
		model.addAttribute("gk", gkMapper.findGkByNames(propb));
		//}
		System.out.println("查询结果为:" + gkMapper.findGkByNames(propb));
		
		//return Common.BACKGROUND_PATH + "/system/customer/edit";
		//return "success";
		//return mapper.writeValueAsString(id);
		return gkMapper.findGkByNames(propb);
	}
}