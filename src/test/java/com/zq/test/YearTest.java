package com.zq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zq.service.YearService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class YearTest {

	@Autowired
	private YearService yearService;
	
	@Test
	public void readFile() {
		System.out.println(yearService.readFileText());
	}
}
