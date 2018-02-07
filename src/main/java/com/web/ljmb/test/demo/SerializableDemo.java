package com.web.ljmb.test.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.web.ljmb.test.bean.StudentInfo;

/**
 *@author ZJL
 *@Date 2018年1月26日 下午2:32:12
 * 文件序列化相关 
 */
public class SerializableDemo  {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileItem="D:"+File.separator+"opt"+File.separator+"entity.txt";
		String fileList="D:"+File.separator+"opt"+File.separator+"list.txt";
			
		SerializableDemo sd = new SerializableDemo();
		sd.createFileItem(fileItem);
		sd.createFileList(fileList);
		sd.readFileItem(fileItem);
		sd.readFileList(fileList);
	}
	
	//读取文件
	public String readFileItem(String filePath) throws IOException, ClassNotFoundException {
		File file = new File(filePath);
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		StudentInfo entity = (StudentInfo)ois.readObject();
		is.close();
		ois.close();
		System.out.println(entity.getStuId()+"------"+entity.getStuName());
		return null;
	}
	
	//创建文件
	public void createFileItem(String filePath) throws IOException {
		File file = new File(filePath);
		OutputStream os = new FileOutputStream(file);  
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(new StudentInfo("1001", "中国人"));
		oos.close();
		os.close();
		System.out.println("完成");
	}
	
	//读取文件
	public String readFileList(String filePath) throws IOException, ClassNotFoundException {
		File file = new File(filePath);
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		StudentInfo entity = (StudentInfo)ois.readObject();
		is.close();
		ois.close();
		System.out.println(entity.getStuId()+"------"+entity.getStuName());
		return null;
	}
	
	//创建文件
	public void createFileList(String filePath) throws IOException {
		File file = new File(filePath);
		OutputStream os = new FileOutputStream(file);  
		ObjectOutputStream oos = new ObjectOutputStream(os);
		for(int i=1;i<10;i++) {
			oos.writeObject(new StudentInfo("100"+i, "中国人100"+i));
		}
		oos.close();
		os.close();
		System.out.println("完成");
	}
}
