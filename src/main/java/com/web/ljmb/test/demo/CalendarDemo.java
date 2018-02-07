package com.web.ljmb.test.demo;

import java.util.Calendar;

/**
 * 日期相关的操作
 * @author ZJL
 * @Date 2018年1月3日
 */
public class CalendarDemo {

	public static void main(String[] args) {
		//获取当前的日期
		Calendar c = Calendar.getInstance();
		//获取年
		int year = c.get(Calendar.YEAR);
		//获取月,这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
		int month = c.get(Calendar.MONTH)+1;
		//获取日
		int day = c.get(Calendar.DAY_OF_MONTH);
		//获取小时数
		int hour = c.get(Calendar.HOUR);
		//获取分钟数
		int min = c.get(Calendar.MINUTE);
		//获取秒数
		int sec = c.get(Calendar.SECOND);
		//获取毫秒数
		int ss = c.get(Calendar.MILLISECOND);
		
		// 星期，英语国家星期从星期日开始计算
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("现在日期:"+year+"年"+month+"月"+day+"日"+
				" 时间: "+hour+":"+min+":"+sec+ss+
				" 星期"+weekDay);
	}

}
