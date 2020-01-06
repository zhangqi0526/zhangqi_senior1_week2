package com.zq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zq.entity.Year;
import com.zq.service.YearService;

@Controller
public class YearController {

	@Autowired
	private YearService yearService;
	
	@RequestMapping("/list")
	public String list(Model model,Year year,@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="6")Integer pageSize) {
		// 分页工具类
		
		PageInfo<Year> pageInfo = yearService.list(model,page,pageSize,year);
		model.addAttribute("pageInfo", pageInfo);
		return "list";
	}
	
	@RequestMapping("update")
	public String update(Model model,Integer id) {
		List<Year> list =  yearService.selectOne(id);
		model.addAttribute("list", list);
		return "update";
	}
}
