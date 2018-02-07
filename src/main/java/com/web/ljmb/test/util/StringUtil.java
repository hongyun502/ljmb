package com.web.ljmb.test.util;

public class StringUtil {

	public static void main(String[] args) {
		String string="zhang     ";
		System.out.println(string.length());
		string=string.trim();
		System.out.println(string.length());
		string=null;
		string=string==null?"":string.trim();
		System.out.println(string);
	}
}
