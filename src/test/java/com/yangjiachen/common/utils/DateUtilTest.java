/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午1:34:48 
 */
package com.yangjiachen.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午1:34:48  
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.yangjiachen.common.utils.DateUtil#initDate(java.util.Date)}.
	 */
	@Test
	public void testInitDate() {
		//月份是0到11
		Calendar c = Calendar.getInstance();
		c.set(2011, 5, 3, 23, 54, 51);
		Date date = DateUtil.initDate(c.getTime());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = sf.format(date);
		System.out.println(date1);
		
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.DateUtil#fullDate(java.util.Date)}.
	 */
	@Test
	public void testFullDate() {
		Calendar c = Calendar.getInstance();
		c.set(2008, 1, 3, 23, 54, 51);
		Date date = DateUtil.fullDate(c.getTime());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = sf.format(date);
		System.out.println(date1);
	}
	
	
	@Test
	public void testSQL() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date = DateUtil.fullDate(new Date());
		Date date2 = DateUtil.initDate(new Date());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String sql1 = sql.replace("{1}", sf.format(date2)).replace("{2}", sf.format(date));
		System.out.println(sql1);
	}
}
