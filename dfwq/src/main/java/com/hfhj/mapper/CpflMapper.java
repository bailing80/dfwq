package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.CpflFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface CpflMapper extends BaseMapper{

	List<CpflFormMap> findCpflPage(CpflFormMap cpflFormMap);

	
	
}
