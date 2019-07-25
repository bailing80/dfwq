package com.hfhj.mapper;

import java.util.List;


import com.hfhj.entity.JscpFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface JscpMapper extends BaseMapper{

	public List<JscpFormMap> findBmfPage(JscpFormMap bmfFormMap);
	public void deleteById(JscpFormMap map);
	
}
