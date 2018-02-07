package com.web.ljmb.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller 
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/test")
	public String test(){
		
		return "test/test";
	}
	
	@RequestMapping(value="/map")
	public String map(){
		
		return "test/map";
	}
	
	@RequestMapping(value="/json")
	@ResponseBody
	public Map<String,Object> json(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id", "id001");
		map.put("name", "name001");
		map.put("age", "age001");
		return map;
	}
	
	@RequestMapping(value="/profile")
	@ResponseBody
	public Map<String,Object> profile(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String, Object>();
		//String name = WebConfigUtil.getProperties("jdbc.username");
		String env = System.getProperty("spring.profiles.default");
		ServletContext ctx=request.getServletContext();//创建ServletContext对象
		String profile = ctx.getInitParameter("spring.profiles.default");
		System.out.println(System.getProperties().toString());
		System.out.println("------------"+env);
		System.out.println("------------"+profile);
		map.put("profile", profile);
		map.put("env", env);
		return map;
	}

}
