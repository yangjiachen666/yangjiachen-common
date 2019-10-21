/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: Dateutil.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午1:12:55 
 */
package com.yangjiachen.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: Dateutil 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午1:12:55  
 */
public class DateUtil {
	/**
	 * 
	 * @Title: initDate 
	 * @Description: 随即两个日期之间的日期
	 * @param date
	 * @return
	 * @return: Date
	 */
	//从minDate到maxDate中间随即一个时间并返回
	public static Date randomDate(Date minDate,Date maxDate) {
		//获取minDate的毫秒值
		long time1 = minDate.getTime();
		//获取maxDate的毫秒值
		long time2 = maxDate.getTime();
		long x = (long) (Math.random()*(time2-time1+1)+time1);
		return new Date(x);
	}
	
	
	public static Date initDate(Date date) {
		//这是一个日历类
		Calendar cal = Calendar.getInstance();
		//初始化日历类(就是将传入的日期时间存放在日历类中)
		cal.setTime(date);
		//对日历类进行重新赋值。
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}
	
	public static Date fullDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//对日历类的月份+1
		c.add(Calendar.MONTH, 1);
		//获取月份+1后的的第一时间
		Date date2 = DateUtil.initDate(c.getTime());
		//重新对日历类进行初始化
		c.setTime(date2);
		//对最新日历类的秒数-1
		c.add(Calendar.SECOND, -1);
		//日历类中的date
		return c.getTime();
	}
	
	//根据生日计算年龄
	public static int getAge(Date birthday) {
		//获取系统当前时间的年月日
		Calendar c = Calendar.getInstance();
		int yearNew = c.get(Calendar.YEAR);
		int monthNew = c.get(Calendar.MONTH);
		int dayNew = c.get(Calendar.DAY_OF_MONTH);
		
		//获取生日的年月日
		c.setTime(birthday);
		int yearOld = c.get(Calendar.YEAR);
		int monthOld = c.get(Calendar.MONTH);
		int dayOld = c.get(Calendar.DAY_OF_MONTH);
		//当前年份减去生日年份则为年龄
		int age = yearNew-yearOld;
		//如果当前月份大于生日月份，说明还没有过生日,则年龄-1
		if(monthOld>monthNew) {
			age--;
		}
		//如果当前日期大于生日日期,说明还没有过生日,则年龄-1
		if(monthNew==monthOld && dayOld>dayNew) {
			age--;
		}
		return age;
	}
}
