package com.hfhj.mapper;

import java.util.List;


import com.hfhj.entity.JsbFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface JsbMapper extends BaseMapper{

	public List<JsbFormMap> findBmfPage(JsbFormMap JsbFormMap);
	public void deleteById(JsbFormMap map);
	
}
