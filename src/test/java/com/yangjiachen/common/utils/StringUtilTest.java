/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月12日 上午10:00:32 
 */
package com.yangjiachen.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月12日 上午10:00:32  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		String str="";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(10);
		System.out.println(randomChineseString);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}
	
	@Test
	public void testIsNumber() {
		String str = "0.999";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}

}
