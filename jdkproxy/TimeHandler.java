package com.liu.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	
	private Object target;
	

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/*
	 * 参数
	 * proxy被代理对象
	 * 被代理对象的方法
	 * args方法的参数
	 * 
	 * 返回值：
	 * 方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始启动…………");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束……，行驶的时间为：" + (endTime - startTime)+"毫秒");
		return null;
	}

}
