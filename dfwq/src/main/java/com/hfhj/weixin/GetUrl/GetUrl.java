package com.hfhj.weixin.GetUrl;

import com.hfhj.weixin.dao.impl.WeiXinDaoImpl;
import com.hfhj.weixin.model.useValue;

public class GetUrl {

	public static void main(String[] args){

		
		String url="http://这个填写你的服务器ip或者域名/OAUTH/servlet/OAuthAPIServlet";
		WeiXinDaoImpl dao=new WeiXinDaoImpl();
		String pathUrl=null;
		try {
			pathUrl=dao.getCodeUrl(useValue.AppId,url,"snsapi_userinfo", "state");
		} catch (Exception e) {
			
		}
		System.out.println(pathUrl);
	}
}
