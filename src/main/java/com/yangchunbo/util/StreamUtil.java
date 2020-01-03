package com.yangchunbo.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
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

	/**
	 * 
	 * @Title: readLine 
	 * @Description: 读取文件
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLine(InputStream in){
		List<String> list = new ArrayList<String>();
		   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		   String str=null;
		   try {
			while((str=reader.readLine())!=null) {
				list.add(str);
			   }
		} catch (IOException e) {
			e.printStackTrace();
		}
		   return list;
	}
}
