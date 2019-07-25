package com.hfhj.mapper;

import java.util.List;

import com.hfhj.entity.WxcpsxFormMap;
import com.hfhj.mapper.base.BaseMapper;


public interface WxcpsxMapper extends BaseMapper{

	List<WxcpsxFormMap> findWxcpsxPage(WxcpsxFormMap wxcpsxFormMap);

	
	
}
