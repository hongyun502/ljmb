package com.web.ljmb.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.ljmb.test.util.MemcachedUtils;

/**
 *@author ZJL
 *@Date 2018年1月29日 下午8:27:38
 *
 */
@Controller
@RequestMapping(value="/memcached")
public class MemcachedController {
	
	@RequestMapping(value="/set")
	@ResponseBody
	private Object set() {
		Map<String ,Object> map = new HashMap<String ,Object>();
		MemcachedUtils.set("userName", "中国-China-0001");
		map.put("userName", MemcachedUtils.get("userName"));
		return map;
	}

}
