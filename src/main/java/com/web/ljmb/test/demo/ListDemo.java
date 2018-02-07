package com.web.ljmb.test.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@author ZJL
 *@Date 2018年1月30日 下午2:43:14
 *List 相关的操作
 */
public class ListDemo {

	public static void main(String[] args) {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String,String> map = null;
		//初始化
		for(int i=0;i<10;i++) {
			map=new HashMap<>();
			map.put("telephone"+i, "phone"+i);
			list.add(map);
		}
		//输入结果
		int i=0;
		for(Map<String,String> item :list) {
			System.out.println(("telephone"+i+"=====")+item.get("telephone"+i));
			i++;
		}
		
		//替换
		i=0;
		for(Map<String,String> item :list) {
			 item.put("telephone"+i, item.get("telephone"+i)+"0000");
			 i++;
		}
		
		//输入结果
		i=0;
		for(Map<String,String> item :list) {
			System.out.println(("telephone"+i+"=====")+item.get("telephone"+i));
			i++;
		}
	}

}
