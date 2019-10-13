/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午6:39:23 
 */
package com.yangjiachen.common.utils;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午6:39:23  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.yangjiachen.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String fileName = FileUtil.getExtendName("D:\\AuI18N\\2052\\StringBundle.xml");
		System.out.println(fileName);
		
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}
}
