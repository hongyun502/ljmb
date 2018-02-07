package com.web.ljmb.test.exception.dao;

import org.springframework.stereotype.Repository;

/**
 *@author ZJL
 *@Date 2018年1月22日 下午3:56:38
 *
 */
@Repository("exceptionDao")
public class ExceptionDao {
	
	public void exception(Integer i) throws Exception{
		switch (i) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
