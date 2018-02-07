package com.web.ljmb.test.exception.custom;
/**
 *@author ZJL
 *@Date 2018年1月22日 下午5:02:03
 *业务类异常
 */
public class BusinessException extends Exception {
	private static final long serialVersionUID = -2804653132841942056L;
	//业务类型
	private String bizType;
	//业务编码
	private String bizCode;
	//异常信息
	private String message;
	
	public BusinessException(String bizType,String bizCode,String message) {
		super(message);
		this.bizCode=bizCode;
		this.bizType=bizType;
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

}
