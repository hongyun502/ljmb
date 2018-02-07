package com.web.ljmb.test.exception.custom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 
 * @author ZJL
 * @Date 2018年1月22日
 * @version
 *	
 */
public class BaseController {
	
	/**
	 * 异常处理
	 * @param request
	 * @param ex
	 * @return
	 */
	@ExceptionHandler  
    public String doException(HttpServletRequest request, Exception ex) {
		return null; 
    }

}
