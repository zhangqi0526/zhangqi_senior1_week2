package com.zq.controller;

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
}
