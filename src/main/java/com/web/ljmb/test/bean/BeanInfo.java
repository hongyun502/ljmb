package com.web.ljmb.test.bean;

public class BeanInfo {
	private static final String finalFlag="111";
	private static String staticFlag="222";
	
	
	private String beanId;
	private String beanName;
	
	public String getBeanId() {
		return beanId;
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
