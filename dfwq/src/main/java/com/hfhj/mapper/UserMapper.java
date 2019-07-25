package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.UserFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
