package com.zq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zq.entity.Year;

public interface YearDao {

	int insert(@Param("yearList")List<Year> yearList);

	List<Year> list(Year year);

	@Select("select * from year where id=#{id}")
	List<Year> selectOne(Integer id);

}
