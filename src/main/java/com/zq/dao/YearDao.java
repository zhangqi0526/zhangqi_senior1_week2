package com.zq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zq.entity.Year;

public interface YearDao {

	int insert(@Param("yearList")List<Year> yearList);

	List<Year> list(Year year);

}
