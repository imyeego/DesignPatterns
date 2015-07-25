package com.liu.proxy;
/**
 * 通过聚合方式实现静态代理
 * @author liuzhao
 *
 */
public class CarTimeProxy implements Moveable {
	private Moveable m;
	
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始启动…………");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行驶结束……，行驶的时间为：" + (endTime - startTime)+"毫秒");

	}

}
