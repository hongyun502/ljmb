package com.web.ljmb.test.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WebConfigUtil {
	private static Properties properties;
	private static final String filePath="jdbc.properties";
	static{
		init();
		synchronized (filePath) {
			
		}
	}
	
	//同步块
	synchronized private static void init(){
		InputStream is = null;
		properties = new Properties();
		try {
			is = WebConfigUtil.class.getClassLoader().getResourceAsStream(filePath);
			properties.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//读取key的值
	public static String getProperties(String key){
		if(null==properties){
			init();
		}
		return properties.getProperty(key);
	}
	
	//读取key的值 没有的话 返回默认值
	public static String getProperties(String key,String value){
		if(null==properties){
			init();
		}
		return properties.getProperty(key,value);
	}

	public static void main(String[] args) {
		//获取JVM的系统信息
		Properties pps = System.getProperties();
		pps.list(System.out);
		System.out.println(WebConfigUtil.getProperties("jdbc.driver"));
		System.out.println(WebConfigUtil.getProperties("jdbc.driver.url","100"));
		  
	}
	
	 //写入Properties信息
  public static void setProperties (String filePath, String pKey, String pValue) throws IOException {
      Properties pps = new Properties();
      
      InputStream in = new FileInputStream(filePath);
      //从输入流中读取属性列表（键和元素对） 
      pps.load(in);
      //调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。  
      //强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
      OutputStream out = new FileOutputStream(filePath);
      pps.setProperty(pKey, pValue);
      //以适合使用 load 方法加载到 Properties 表中的格式，  
      //将此 Properties 表中的属性列表（键和元素对）写入输出流  
      pps.store(out, "Update " + pKey + " name");
  }
  
  public static void setProperties (String pKey, String pValue) throws IOException {
      Properties pps = new Properties();
      
      InputStream in = new FileInputStream(filePath);
      //从输入流中读取属性列表（键和元素对） 
      pps.load(in);
      //调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。  
      //强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
      OutputStream out = new FileOutputStream(filePath);
      pps.setProperty(pKey, pValue);
      //以适合使用 load 方法加载到 Properties 表中的格式，  
      //将此 Properties 表中的属性列表（键和元素对）写入输出流  
      pps.store(out, "Update " + pKey + " name");
  }

}
