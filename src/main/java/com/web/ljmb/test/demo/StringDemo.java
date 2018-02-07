package com.web.ljmb.test.demo;
/**
 * @author ZJL
 * @Date 2018年1月3日
 * @remark   
 */
public class StringDemo {

	public static void main(String[] args) {
		String strs="01234567890  abcdefghijklmn";
		System.out.println("从开始位置截取以后所有的字符:"+strs.substring(5)+"\n"+
				"从开始位置截取 到结束位置的字符串:"+strs.substring(5, 7));
		String info = "尊敬的%s，您有一个可抢单的光伏电站运维订单，电站地址:%s，请登录“光e宝”进行抢单。【光e宝】";
		System.out.println(String.format(info, "中国公民","中国天安门"));
	}

}
