package com.yangchunbo.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 0; i < 10000; i++) {
		
		 Person p = new Person();
		  // 姓名属性值调用StringUtil.generateChineseName()创建（4分）
		 p.setName(StringUtil.generateChineseName());
	        //年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
		 p.setAge(RandomUtil.random(1, 120));
			//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
		 p.setAbout(StringUtil.randomChineseString(140));
			//注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
		 
		 Calendar c = Calendar.getInstance();
		 c.set(2010, 0, 1);
		 p.setCreated(DateUtil.randomDate(c.getTime(), new Date()));
		 System.out.println(p);
		}
	}

}
