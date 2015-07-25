package com.liu.sockets;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL的常用方法
 */
public class URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一步：创建URL的实例
		try {
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc, "/index.html?username=tom#test");
			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机：" + url.getHost());
			System.out.println("端口号：" + url.getPort());
			System.out.println("路径：" + url.getPath());
			System.out.println("文件：" + url.getFile());
			System.out.println("查询：" + url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
