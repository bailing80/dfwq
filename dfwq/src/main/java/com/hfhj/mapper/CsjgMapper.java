package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.CsjgFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface CsjgMapper extends BaseMapper{

	List<CsjgFormMap> findCsjgPage(CsjgFormMap csjgFormMap);

	
	
}
