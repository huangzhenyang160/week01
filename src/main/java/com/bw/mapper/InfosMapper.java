package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Infos;
import com.bw.bean.Tea;

public interface InfosMapper {
	//查询
	public List<Infos> cx(Map<String,Object> map);
	//查询老师
	public List<Tea> cxtea();
	//添加
	public Infos add(Infos infos);
	//收被
	public Infos update(Integer id);
	//查看
	public Infos ck(Integer id);
}
