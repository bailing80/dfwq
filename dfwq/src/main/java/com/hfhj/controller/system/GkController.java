package com.hfhj.controller.system;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hfhj.mapper.GkMapper;
import com.hfhj.mapper.UserMapper;
import com.hfhj.annotation.SystemLog;
import com.hfhj.controller.index.BaseController;
import com.hfhj.entity.GkFormMap;
import com.hfhj.entity.UserFormMap;
import com.hfhj.exception.SystemException;
import com.hfhj.plugin.PageView;
import com.hfhj.util.Common;
import com.hfhj.util.JsonUtils;
import com.hfhj.util.POIUtils;
import com.hfhj.util.PasswordHelper;
import com.hfhj.weixin.dao.impl.WeiXinDaoImpl;
import com.hfhj.weixin.model.OAuthAccessToken;
import com.hfhj.weixin.model.UserEntity;
import com.hfhj.weixin.model.useValue;

/**
 * 
 * @author lanyuan 2014-11-19
 * @Email: mmm333zzz520@163.com
 * @version 3.0v
 */
@Controller
@RestController
@RequestMapping("/gk")
public class GkController extends BaseController {
	@Inject
	private GkMapper gkMapper;
	
	UserEntity entity=null;
	String userinfo;
	
	@RequestMapping(value="/wxold",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String getuserinfo(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		
//		response.setContentType("text/html;charset=utf-8");
//		request.setCharacterEncoding("utf-8"); 
//		response.setCharacterEncoding("utf-8");
		//String code = request.getParameter("code");
	    //System.out.println("code:"+code);
	    	     
	    //WeiXinDaoImpl dao=new WeiXinDaoImpl();
	    //UserEntity entity=null;
	    //entity.setOpenid("111");
	    //entity.setNickname("kkk");
	    //entity.setCity("newyork");
		userinfo = "Good!";
	    System.out.println("user is:" + userinfo);
	    //session.setAttribute("userinfo", userinfo);
	    
	    //model.addAttribute("userinfo", userinfo);
	    
	    
	    //System.out.println("user is:" + entity.getCity());
	    /*
	    try {
			response.getWriter().print("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//result为后台需要抛出的内容字符串
	    */
	    /*
	    try {
			OAuthAccessToken oac = dao.getOAuthAccessToken(useValue.AppId, useValue.AppSecret,code);//通过code换取网页授权access_token
			System.out.println("----------获取AccessToken----------"+oac.getAccessToken()+";"+oac.getRefreshToken()+";"+oac.getScope()+";"+oac.getOpenid());
			OAuthAccessToken oacd=dao.refershOAuthAccessToken(useValue.AppId, oac.getRefreshToken());//刷新access_token
			System.out.println("----------刷新AccessToken----------"+oacd.getAccessToken()+";"+oacd.getRefreshToken()+";"+oacd.getScope()+";Openid:"+oacd.getOpenid());
			entity=dao.acceptOAuthUserNews(oacd.getAccessToken(),oacd.getOpenid());//获取用户信息
			System.out.println("----------获取用户信息----------"+entity.getNickname()+";"+entity.getCountry());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------------------用户信息-"+entity.getNickname()+";"+entity.getCountry());
		request.setAttribute("user", entity);
	    model.addAttribute("res", entity);*/
		//model.addAttribute("username", "张三");
		//return "redirect:index.html?username=zhangsan";
	    
	    /*
	    JSONArray json = new JSONArray().fromObject(entity);
	    PrintWriter outpw = null;
		try {
			outpw = response.getWriter();
			String jsonto = json.toString();
		    outpw.write(jsonto); 
		    System.out.println("json is:" + jsonto);
			//outpw.write("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/   
			
	    /*
	    ObjectMapper mapper = new ObjectMapper();
	    try {
			mapper.writeValueAsString(entity);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    /*
	    try {
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpServletResponse response = ServletActionContext.getResponse();
            String selectName = new String(request.getParameter("selectName").getBytes("iso-8859-1"),"utf-8");//用request获取URL传递的中文参数,防止乱码
            response.setCharacterEncoding("utf-8");
            PrintWriter out = response.getWriter();
            if (!selectName.equals("")) {            
                historyEvent = historyEventService.getHistoryEventByName(projectId, selectName);//获取对象
                response.setContentType("application/json; charset=utf-8");  
                JSONObject responseJSONObject = JSONObject.fromObject(historyEvent); //将实体对象转换为JSON Object转换  
                out.print(responseJSONObject.toString());
                out.flush();
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
	        
	    //return "redirect:index.html";
	    return "forward:index.html";
		//return Common.BACKGROUND_PATH + "/system/resources/list";
		
	}
	
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	@ResponseBody
	@SystemLog(module="系统管理",methods="顾客管理-新增顾客信息")//凡需要处理业务逻辑的.都需要记录操作日志
	@Transactional(readOnly=false)//需要事务操作必须加入此注解
	public Map<String,Object> addEntity(@RequestBody GkFormMap gkFormMap){
		
		System.out.println("开始执行添加顾客信息.....");
		System.out.println("userinfo的值为：" + userinfo);
		Map<String, Object> result = null;
		try {
			//GkFormMap gkFormMap = getFormMap(GkFormMap.class);
			//gkFormMap.put("txtGroupsSelect", txtGroupsSelect);
			
			gkMapper.addEntity(gkFormMap);//新增后返回新增信息
			result = new HashMap<String, Object>();  
            result.put("msg", "success");  
            return result;  
		} catch (Exception e) {
			//throw new SystemException("添加顾客信息异常" + e.getMessage());	
			result = new HashMap<String, Object>();  
            result.put("msg", "failure");  
            return result;
		}
		//System.out.println("执行完毕!");
		//return "success";
		
	}
	
	//@RequestMapping(value="/customer",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	@RequestMapping("/list")
	public String listUI(Model model) throws Exception {
		//System.out.println("开始执行顾客信息列表控制器...");
		//model.addAttribute("res", findByRes());
		//System.out.println("结束执行顾客信息列表控制器...");
		//return Common.BACKGROUND_PATH + "/system/gk/list";
		model.addAttribute("res", findByRes());
		return Common.BACKGROUND_PATH + "/system/user/list";
		
	}
	
	@ResponseBody
	@RequestMapping("/findByPage")
	public PageView findByPage( String pageNow,
			String pageSize,String column,String sort) throws Exception {
		GkFormMap gkFormMap = getFormMap(GkFormMap.class);
		gkFormMap=toFormMap(gkFormMap, pageNow, pageSize,gkFormMap.getStr("orderby"));
		gkFormMap.put("column", column);
		gkFormMap.put("sort", sort);
        pageView.setRecords(gkMapper.findGkPage(gkFormMap));//不调用默认分页,调用自已的mapper中findGkPage
        
        return pageView;
	}
}