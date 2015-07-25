package com.liu.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 通过URL对象获取网络内容
 */
public class URLTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//创建URL对象
			URL url = new URL("http://www.baidu.com");
			//利用对象的openStream方法获取内容
			InputStream is = url.openStream();
			//字节流转换为字符流
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			while(data!=null){
				System.out.println(data);
				data = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
