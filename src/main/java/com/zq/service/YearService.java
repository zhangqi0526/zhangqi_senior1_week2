package com.zq.service;

import java.util.List;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;
import com.zq.entity.Year;

public interface YearService {

	/**
	 * 批量导数据
	 * @return list<>
	 */
	public List<Year> readFileText();

	public PageInfo<Year> list(Model model, Integer page, Integer pageSize, Year year);
}
