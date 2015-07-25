package com.liu.template;

/**
 * 抽象基类
 * @author liuzhao
 *
 */

public abstract class RefreshBeverage {
	/*
	 * 制备饮料的模版方法
	 * 封装了所有子类共同遵循的算法框架。
	 */
	
	public final void prepareBeverageTemplate(){
		
		//步骤1 将水煮沸
		boilWater();
		
		//步骤2 泡制饮料
		brew();
		
		//步骤3 将饮料倒入杯中
		pourInCup();
		
		//步骤4 加入调味料
		if(isCustomerWantsAddcondiments()){
			addCondimentes();
		}
		
		
		
	}
	
	/*
	 * Hook,提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩。
	 * 询问顾客是否添加调味料
	 */
	
	protected boolean isCustomerWantsAddcondiments() {
		// TODO Auto-generated method stub
		
		
		return true;
	}

	protected abstract void addCondimentes() ;

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("步骤3 将饮料倒入杯中");
	}

	protected abstract void brew() ;

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("步骤1 将水煮沸");
	}
}
