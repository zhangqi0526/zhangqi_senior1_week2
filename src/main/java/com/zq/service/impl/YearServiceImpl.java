package com.zq.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangqi.common.utils.FileUtil;
import com.zhangqi.common.utils.StringUtil;
import com.zq.dao.YearDao;
import com.zq.entity.Year;
import com.zq.service.YearService;

@Service
public class YearServiceImpl implements YearService {

	@Autowired
	private YearDao yearDao;
	@Override
	public List<Year> readFileText() {
		List<Year> yearList = new ArrayList<Year>();
		/*List<String> readTextFileOfList = FileUtil.readTextFileOfList("C:\\Users\\Administrator\\Desktop\\cms附件-机械设备公司年检信息.txt");
		for (String record : readTextFileOfList) {
				System.out.println(record);
				String[] split = record.split("，");
				Year year = new Year();
				//  判断 id值是否位数字
				boolean number = StringUtil.isNumber(split[0]);
				//判断keywords	、description、公司名称、主营产品、地址要使用hasText()方法判断有没有值。
				boolean hasWords = FileUtil.hasText(split[0]);
				boolean hasDesc = FileUtil.hasText(split[1]);
				boolean hasName = FileUtil.hasText(split[2]);
				boolean hasGoods = FileUtil.hasText(split[3]);
				boolean hasAddress = FileUtil.hasText(split[4]);
				boolean hasPrice = FileUtil.hasText(split[5]);
				boolean price = StringUtil.isNumber(split[5]);
				
				if(hasWords) {
					year.setKeyWords(split[0]);
				}
				if(hasDesc) {
					year.setDescription(split[1]);
				}
				if(hasName) {
					year.setCompanyName(split[2]);
				}
				if(hasGoods) {
					year.setMainGoods(split[3]);
				}
				if(hasAddress) {
					year.setAddress(split[4]);
				}
				if(hasPrice) {
					year.setNumPrice(split[5]);
				}
				year.setStartDate(split[6]);
				
				if(split[7].equals("")) {
					year.setCheckDate(null);
					year.setStatus(split[7]);
				}else {
					year.setCheckDate(split[7]);
					year.setStatus(split[8]);
				}
				yearList.add(year);
		}
		System.out.println(yearList);
		yearDao.insert(yearList);*/
		return yearList;
	}
	@Override
	public PageInfo<Year> list(Model model, Integer page, Integer pageSize, Year year) {
		//分页工具类
		PageHelper.startPage(page, pageSize);
		List<Year> list = yearDao.list(year);
		return new PageInfo<Year>(list);
	}
	
	
}
