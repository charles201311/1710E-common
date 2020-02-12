package com.yangchunbo.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2020年1月2日 下午2:57:43
 */
public class DateUtil {
	
	
	
	 //把传入的日期向前 推减24 个小时。 即 1天
	public static Date subDate(Date date) {
		//用当前系统时间去实例化一个日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期示例化日历类
		c.setTime(date);
		
		//借助日历类，减去1天
		c.add(Calendar.DATE, -1);
		
		return c.getTime();
		
	}
	
	//获取一个月的月初 如 ：2020-01-01 00:00:00
	public static Date initMonth(Date date) {
		//获取一个日期类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始日历类
		c.setTime(date);
		
	   c.set(Calendar.DAY_OF_MONTH, 1);//设置为当前日期的第一天
	   c.set(Calendar.HOUR_OF_DAY, 0);//设置小时
	   c.set(Calendar.MINUTE, 0);//分钟
	   c.set(Calendar.SECOND, 0);//秒
		return c.getTime();
		
	}
	//返回一个月月末
	//思路： 让月加1 ，再变成月初，最后减去1秒
	public static Date endMonth(Date date) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//让月份+1
		c.add(Calendar.MONTH, 1);
		//让时间变成月初
		Date initMonth = initMonth(c.getTime());
		c.setTime(initMonth);
		//让日期减去1
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
	
	
	
	
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 使用日历类 计算     ：根据出生日期算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	//2020-02-02    2000-03-03 
	public static int getAgeByBirthday(Date date) {
		//用系统时间获取日历类
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);//获取系统的年
		int s_month = c.get(Calendar.MONTH);//获取系统的月
		int s_day = c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		
		//用传入的日期初始化一个日历类
		c.setTime(date);
		int b_year = c.get(Calendar.YEAR);//获取出生日期的年
		int b_month = c.get(Calendar.MONTH);//获取出生日期的月
		int b_day = c.get(Calendar.DAY_OF_MONTH);//获取出生日期的日
		
		int age = s_year - b_year;//用系统年 -出生年 
		
		if(s_month < b_month)//如果系统月小于出生月年龄减一
			age --;
		if(s_month == b_month && s_day < b_day )//如果系统月和初始月一致并且系统日小于出生日 年龄减一
		   age --;
		return age;
		
	}
	
	
	
      /**
       * 
       * @Title: randomDate 
       * @Description: 随机返回一个在start--end 之间的日期
       * @param start
       * @param end
       * @return
       * @return: Date
       */
	public static Date randomDate(Date start,Date end) {
		//获取开始日期的毫秒数
		long t1 = start.getTime();
		//获取结束日期的毫秒数
		long t2 = end.getTime();
		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);
		
		return new Date(t);
	}
}
