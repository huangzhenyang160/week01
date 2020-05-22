package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Infos;
import com.bw.bean.Tea;
import com.bw.mapper.InfosMapper;
@Service
public class InfoServiceImp implements InfosService{

	@Autowired
	private InfosMapper sMapper;
	
	public List<Infos> cx(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sMapper.cx(map);
	}

	public List<Tea> cxtea() {
		// TODO Auto-generated method stub
		return sMapper.cxtea();
	}

	public Infos add(Infos infos) {
		// TODO Auto-generated method stub
		return sMapper.add(infos);
	}

	public Infos update(Integer id) {
		// TODO Auto-generated method stub
		return sMapper.update(id);
	}

	public Infos ck(Integer id) {
		// TODO Auto-generated method stub
		return sMapper.ck(id);
	}

}
