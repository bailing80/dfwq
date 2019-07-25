package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.RoleFormMap;
import com.hfhj.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
