package com.liu.template;

public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondimentes() {
		// TODO Auto-generated method stub
		System.out.println("步骤4 加入糖和牛奶");
	}

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("步骤2 用沸水冲泡咖啡");
		
	}

}
