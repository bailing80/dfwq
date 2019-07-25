package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.XsziFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface XsziMapper extends BaseMapper{

	List<XsziFormMap> findXsziPage(XsziFormMap xsziFormMap);

	
	
}
