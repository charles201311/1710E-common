package com.yangchunbo.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: charles
 * @date: 2020年1月3日 上午9:38:57
 */
public class StreamUtil {
	//读取文件对象到list集合中
	public static List<String> readFile2List(File file) throws FileNotFoundException{
		 FileInputStream fileInputStream = new FileInputStream(file);
		return readFile2List(fileInputStream);
	}
	//读取文件地址，并根据编码，把内容放入list集合中
	public static List<String> readFile2List(String filename,String charset) throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream(filename);
		return readFile2List(fileInputStream,charset);
	}
	//读取InputStream对象，把其内容放入集合中
	public static List<String> readFile2List(InputStream in){
		return readFile2List(in,"utf-8");
	}
	//读取InputStream对象，并根据编码 把其内容放入集合中
	public static List<String> readFile2List(InputStream inputStream, String charset)
		     {
		    List<String> list = new ArrayList<String>();
		 
		    BufferedReader br = null;
		    try {
		      br = new BufferedReader(new InputStreamReader(inputStream, charset));
		 
		      String s = null;
		      while ((s = br.readLine()) != null) {
		        list.add(s);
		      }
		    } catch (Exception e) {
				e.printStackTrace();
			}
		 
		    return list;
		  }

	
	
	
}
