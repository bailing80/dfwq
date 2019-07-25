package com.hfhj.mapper;

import java.util.List;


import com.hfhj.entity.CpFormMap;
import com.hfhj.entity.GkFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface CpMapper extends BaseMapper{
	public List<CpFormMap> findCpPage(CpFormMap cpFormMap);
	public void deleteById(CpFormMap map);
	

	public List<CpFormMap> findCpByNames(List<String> names);//20171219 lyb Add
	
	
}
