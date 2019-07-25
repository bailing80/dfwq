package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.GkFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface GkMapper extends BaseMapper{

	//public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	public List<GkFormMap> findGkPage(GkFormMap gkFormMap);
	
	public List<GkFormMap> findGkByNames(List<String> names);
	
}
