package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.XszFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface XszMapper extends BaseMapper{

	List<XszFormMap> findXszPage(XszFormMap xszFormMap);

	
	
}
