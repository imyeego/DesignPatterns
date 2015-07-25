package com.liu.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.liu.proxy.Car;
import com.liu.proxy.Moveable;

/**
 * JDK动态代理测试类
 * @author liuzhao
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		
		Class<?> cls = Car.class;		//有3种写法
		/*Class<?> cls1 = car.getClass();
		try {
			Class<?> cls2 = Class.forName("com.liu.proxy.Car");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}

}
