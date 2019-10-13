/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: FileUtil.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午1:13:11 
 */
package com.yangjiachen.common.utils;

import java.io.File;

/** 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午1:13:11  
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		String newName = fileName.substring(fileName.lastIndexOf(".")); 
		return newName;
	}
	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		String property = System.getProperty("java.io.tmpdir");
		File file = new File(property);
		return file;
	}
	
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home"); 
		return new File(path);
	}
}
