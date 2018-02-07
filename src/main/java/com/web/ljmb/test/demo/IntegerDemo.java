package com.web.ljmb.test.demo;

import java.util.HashMap;
import java.util.Map;

/**
 *@author ZJL
 *@Date 2018年1月25日 上午10:12:53
 *
 */
public class IntegerDemo {

	public static void main(String[] args) {
		String data = "180124134731865-1599||gfyw1516772755662|3000002933|2018006811|0001|111100|2222|0|0|蓝宇农电公司|1001|20180124|商城一般代收产品";
		String[] datas = data.split("\\|");
		System.out.println("---"+datas[3]+"-------"+datas[3].length());
		Map<String, Object> infoMap = new HashMap<String, Object>();
		infoMap.put("PAY_FEE", datas[7]);
		
		Object obj = 2222;
		Integer a = Integer.valueOf(infoMap.get("PAY_FEE").toString());
		Integer b = Integer.valueOf(obj.toString());
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.intValue()==b.intValue());
		 
		
		
	}

}
