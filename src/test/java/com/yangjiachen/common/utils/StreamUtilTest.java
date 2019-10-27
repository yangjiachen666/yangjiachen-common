/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午7:30:18 
 */
package com.yangjiachen.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午7:30:18  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StreamUtil#closeAll(java.io.Closeable[])}.
	 * @throws Exception 
	 */
	
	
	@Test
	public void testReadLine() {
		try {
			List<String> list = StreamUtil.readLine(new FileInputStream("C:\\Users\\丑小鸭\\Desktop\\开发文档\\Java获取当前系统的信息.txt"));
			for (String string : list) {
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCloseAll() throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\丑小鸭\\Desktop\\开发文档\\aaa.txt");
		StreamUtil.closeAll(is);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\丑小鸭\\Desktop\\开发文档\\aaa.txt");
		String file = StreamUtil.readTextFile(is);
		System.out.println(file);
	}

	/**
	 * Test method for {@link com.yangjiachen.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		InputStream is;
		try {
			is = new FileInputStream("C:\\Users\\丑小鸭\\Desktop\\开发文档\\aaa.txt");
			String file = StreamUtil.readTextFile(is);
			System.out.println(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
