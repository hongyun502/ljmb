package com.web.ljmb.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZJL
 * @Date 2018年1月5日
 * @remark   
 */
public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = "20180104";
		try {
			System.out.println(sdf.parse(date));
		} catch (Exception e) {
			 e.printStackTrace();
		}
		System.out.println(date.substring(0, 4));

	}

}
