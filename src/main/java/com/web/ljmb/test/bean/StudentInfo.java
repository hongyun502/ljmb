package com.web.ljmb.test.bean;

import java.io.Serializable;

/**
 *@author ZJL
 *@Date 2018年1月26日 下午3:06:34
 *
 */
public class StudentInfo implements Serializable {
 
	private static final long serialVersionUID = -5048320973106355568L;
	
	private String stuId;
	private String stuName;
	
	public StudentInfo(String stuId,String stuName) {
		this.stuId=stuId;
		this.stuName=stuName;
	}
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	 

}
