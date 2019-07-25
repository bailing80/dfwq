package com.hfhj.mapper;

import java.util.List;


import com.hfhj.entity.GkxxFormMap;

import com.hfhj.mapper.base.BaseMapper;


public interface GkxxMapper extends BaseMapper{

	public List<GkxxFormMap> findGkxxPage(GkxxFormMap gkxxFormMap);
	
	public void deleteById(GkxxFormMap map);

}
