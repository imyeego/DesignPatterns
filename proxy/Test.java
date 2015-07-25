package com.liu.proxy;
/**
 * 测试类
 * @author liuzhao
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		CarLogProxy clp = new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}

}
