package com.hfhj.controller.weixin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hfhj.controller.index.BaseController;
import com.hfhj.util.Common;

import com.hfhj.weixin.dao.impl.WeiXinDaoImpl;
import com.hfhj.weixin.model.OAuthAccessToken;
import com.hfhj.weixin.model.UserEntity;
import com.hfhj.weixin.model.useValue;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
//@RequestMapping("/")
public class WeixinController extends BaseController {
	/**
	 * @param model
	 *            存放返回界面的model
	 * @return
	 */
		
	@RequestMapping(value="/wx",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
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
		String userinfo = "Good!";
	    System.out.println("user is:" + userinfo);
	    session.setAttribute("userinfo", userinfo);
	    
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
	        
	    //return "redirect:dfwqsy.jsp";
	    return "forward:dfwqsy.jsp";	
	}
	
	@RequestMapping(value="/chd",method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public String chduserinfo(HttpServletRequest request, HttpServletResponse response,Model model) {
		
		//System.out.println("The user info is:" + userinfo);
		return "redirect:index.html";
	}
}
