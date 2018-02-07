package com.web.ljmb.test.exception.custom;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/**
 *@author ZJL
 *@Date 2018年1月22日 下午5:16:32
 *自定义异常捕获
 */
public class MyExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception ex) {
		 Map<String, Object> map = new HashMap<String,Object>();
		 map.put("ex", ex.getMessage());
		// 根据不同错误转向不同页面  
	        if(ex instanceof BusinessException) {  
	            return new ModelAndView("error-business", map);  
	        }else if(ex instanceof ParameterException) {  
	            return new ModelAndView("error-parameter", map);  
	        } else {  
	            return new ModelAndView("error", map);  
	        }  
	        
	}

}
