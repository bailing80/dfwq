package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.ResFormMap;
import com.hfhj.mapper.base.BaseMapper;

public interface ResourcesMapper extends BaseMapper {
	public List<ResFormMap> findChildlists(ResFormMap map);

	public List<ResFormMap> findRes(ResFormMap map);

	public void updateSortOrder(List<ResFormMap> map);
	
	public List<ResFormMap> findUserResourcess(String userId);
	
}
