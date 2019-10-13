/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: RandomUtil.java 
 * @Prject: yangjiachen-commen
 * @Package: com.yangjiachen.common.utils 
 * @Description: TODO
 * @author: 杨家琛  
 * @date: 2019年10月11日 下午8:03:14 
 */
package com.yangjiachen.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/** 
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author:杨家琛
 * @date: 2019年10月11日 下午8:03:14  
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		//新建一个随机数对象
		Random r = new Random();
		//最大值减最小值+1 是最大值是多少,例如括号是5  那范围就是0-4  +最小值就是取了范围。
		int i = r.nextInt(max-min+1)+min;
		return i;
	}
	
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，
	//那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	
	public static int[] subRandom (int min, int max, int subs){
		//新建一个set集合
		Set<Integer> set = new HashSet<Integer>();
		//因为set的特性是不重复,所以判断set集合的长度如果小于我们所需要数字的个数就将随机数存入set集合
		//若等于set的长度等于subs则继续执行一次循环体,个数就多了一个才不满足条件,所以应该小于
		while(set.size()<subs) {
			//调用上边的方法生成随机数
			set.add(random(min,max));
		}
		
		int [] numbers = new int[subs];
		//遍历set将set内的数据全部放入int数组里并返回int数组
		int j = 0;
		for (int i : set) {
			numbers[j]=i;
			j++;
		}
		return numbers;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		char c = str.charAt(RandomUtil.random(0, str.length()-1));
		return c; 
	}

	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="";
		for (int i = 0; i<length; i++) {
			char c = randomCharacter();
			str+=c;
		}
		return str;
	}
}
