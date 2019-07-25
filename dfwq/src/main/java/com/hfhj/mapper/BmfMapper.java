package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.BmfFormMap;

import com.hfhj.mapper.base.BaseMapper;


public interface BmfMapper extends BaseMapper{

	public List<BmfFormMap> findBmfPage(BmfFormMap bmfFormMap);
	public void deleteById(BmfFormMap map);
	
}
