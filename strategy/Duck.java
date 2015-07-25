package com.liu.strategy;
/**
 * 
 * @author liuzhao
 *
 */

/*
 * 超类，所有的鸭子都要继承此类
 * 抽象了鸭子的行为：显示与鸣叫
 */
public abstract class Duck {
	private FlyingStrategy flyingStrategy;
	
	public void quack(){
		System.out.println("嘎嘎嘎！");
	}
	/*
	 * 显示鸭子的外观
	 * 鸭子的外观各不相同，声明为abstract，由子类实现。
	 */
	public abstract void display();
	
	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	
	public void fly(){
		flyingStrategy.performFly();
	}
	
	
	
	
	
}
