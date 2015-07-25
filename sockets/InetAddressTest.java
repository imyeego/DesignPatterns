package com.liu.sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("The computer's name is:" + address.getHostName());
		System.out.println("The computer's ip is:" + address.getHostAddress());
		byte[] bytes = address.getAddress();
		System.out.println(Arrays.toString(bytes));
		
		//根据机器名获取InetAddress实例
		InetAddress address2 = InetAddress.getByName("LiudeMacBook-Pro.local");
		System.out.println("The computer's name is:" + address.getHostName());
		System.out.println("The computer's ip is:" + address.getHostAddress());
	}
}
