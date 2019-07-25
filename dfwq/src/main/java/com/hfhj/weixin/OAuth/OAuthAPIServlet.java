package com.hfhj.weixin.OAuth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import com.hfhj.weixin.dao.impl.WeiXinDaoImpl;
import com.hfhj.weixin.model.OAuthAccessToken;
import com.hfhj.weixin.model.UserEntity;
import com.hfhj.weixin.model.useValue;

@SuppressWarnings("serial")
public class OAuthAPIServlet extends HttpServlet {
	private static Logger log = Logger.getLogger(OAuthAPIServlet.class.getName());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8"); 
		response.setCharacterEncoding("utf-8");
		String code = request.getParameter("code");
	    log.info("code:"+code);
	    WeiXinDaoImpl dao=new WeiXinDaoImpl();
	    UserEntity entity=null;
		try {
			OAuthAccessToken oac = dao.getOAuthAccessToken(useValue.AppId, useValue.AppSecret,code);//通过code换取网页授权access_token
			log.info("--------------------"+oac.getAccessToken()+";"+oac.getRefreshToken()+";"+oac.getScope()+";"+oac.getOpenid());
			OAuthAccessToken oacd=dao.refershOAuthAccessToken(useValue.AppId, oac.getRefreshToken());//刷新access_token
			log.info("--------------------"+oacd.getAccessToken()+";"+oacd.getRefreshToken()+";"+oacd.getScope()+";Openid:"+oacd.getOpenid());
			entity=dao.acceptOAuthUserNews(oacd.getAccessToken(),oacd.getOpenid());//获取用户信息
			log.info("--------------------"+entity.getNickname()+";"+entity.getCountry());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("-------------------sdffsd-"+entity.getNickname()+";"+entity.getCountry());
		request.setAttribute("user", entity);
		
		//跳转到界面
		request.getRequestDispatcher("../index.jsp").forward(request, response);
	}

}
