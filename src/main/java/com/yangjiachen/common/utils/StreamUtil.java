/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: StreamUtil.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午1:13:19 
 */
package com.yangjiachen.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/** 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午1:13:19  
 */
public class StreamUtil {
	
	
	//整行读取
	public static List<String> readLine(InputStream is){
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		List<String> list = new ArrayList<String>();
		String str = "";
		try {
			while((str=br.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
									//可变参数
	public static void closeAll(Closeable ... closeables){
		//判断传入的参数是否有值
		if(null!=closeables && closeables.length>0) {
			//遍历参数并且关闭每一个流
			for (Closeable closeable : closeables) {
				try {
					closeable.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 * 
	*/
	
	public static String readTextFile(InputStream src) {
		String str = "";
		byte[] b = new byte[1024];
		int i = 0;
		try {
			//read(b)返回的i是每一次读的长度
			while((i=src.read(b))>-1) {
				 str += new String(b, 0, i, "utf-8");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用close方法关流
			closeAll(src);
		}
		return str;
	}
	
	/**
	 	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	//直接将文件对象开启流调用readTextFile(InputStream )的方法
	public static String readTextFile(File txtFile){
		String file = "";
		try {
			file = readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	
}
