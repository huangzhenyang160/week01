package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Infos;
import com.bw.bean.Tea;
import com.bw.service.InfosService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class InfoController {
	@Autowired
	private InfosService ser;
	
	@RequestMapping("queryAll")
	public String queryAll(Model model,
			@RequestParam(defaultValue="1")Integer pageNum,
			String sid,String status,String cname
			){
		//分页
		PageHelper.startPage(pageNum, 2);
		//创建map容器
		Map<String, Object> map=new HashMap<String, Object>();
		//将值存入容器当中
		map.put("sid",sid );
		map.put("status",status );
		map.put("cname",cname );
		//调用方法
		List<Infos> list = ser.cx(map);
		//开始分页
		PageInfo<Infos> page=new PageInfo<Infos>(list);
		//存值
		model.addAttribute("page",page);
		
		List<Tea> cc = ser.cxtea();
		model.addAttribute("cc",cc);
		return "list";
	}
	@RequestMapping("cxtea")
	@ResponseBody
	public List<Tea> cxtea(){
		List<Tea> cc = ser.cxtea();
		return cc;
	}
	@RequestMapping("add")
	public String add(Infos infos){
		try {
			//调用添加方法
			Infos x = ser.add(infos);
			return "redirect:queryAll";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "add";
		}
	}
	@RequestMapping("update")
	public String update(Integer id){
		try {
			//调用修改方法
			Infos x = ser.update(id);
			return "redirect:queryAll";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "update";
		}
	}
	@RequestMapping("ck")
	public String ck(Integer id){
		try {
			//调用查看方法
			Infos x = ser.ck(id);
			return "redirect:queryAll";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "ck";
		}
	}
}
