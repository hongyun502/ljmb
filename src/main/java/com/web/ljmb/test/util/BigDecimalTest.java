package com.web.ljmb.test.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * BigDecimal 加减乘除测试
 * @author Administrator
 *
 */
public class BigDecimalTest {
	
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		DecimalFormat df = new DecimalFormat("#.00");
		BigDecimal bd = new BigDecimal("0.9356999999999");
		bd=bd.setScale(5, RoundingMode.HALF_UP);
		System.out.println(bd.doubleValue());
		String numA="0";
		String numB="60";
		String numC="1";
		String numD="61";
		String numE="0.8811";
		String numF="0.1189";
		
		bd=bd.add(new BigDecimal(numA)).add(new BigDecimal(numB)).add(new BigDecimal(numC));
		System.out.println(bd.toString());
		System.out.println(new BigDecimal("6014").divide(new BigDecimal(6430),5,RoundingMode.UP).doubleValue());
		System.out.println(new BigDecimal(numA).divide(bd,5,RoundingMode.UP).doubleValue());
		System.out.println(new BigDecimal(numB).divide(bd,5,RoundingMode.UP).doubleValue()*100);
		System.out.println(new BigDecimal(numC).divide(bd,5,RoundingMode.UP).doubleValue());
		System.out.println(new BigDecimal(numD).divide(bd,5,RoundingMode.UP).doubleValue());
		
		Double d=0.97537D;
		System.out.println(d*100000/1000);
		System.out.println(getAdd("0.893","0.107"));
		nf.setGroupingUsed(false);
		System.out.println(nf.format(6014123213213123L));
		
	}
	
	public static String getAdd(String numA,String numB){
		NumberFormat nf = NumberFormat.getInstance();
		BigDecimal bd=new BigDecimal(numA).add(new BigDecimal(numB)).multiply(new BigDecimal("100")).setScale(3, RoundingMode.HALF_UP);
		return nf.format(bd).concat("%");
	}

}
