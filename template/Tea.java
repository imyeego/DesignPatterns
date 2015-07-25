package com.liu.template;

/*
 * 这是另外一个具体子类
 */

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondimentes() {
		// TODO Auto-generated method stub
		System.out.println("步骤4 加入柠檬");
	}

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("步骤2 用80度的热水浸泡茶叶五分钟");
	}

	/*
	 * 子类通过复写选择挂钩
	 * @see com.liu.template.RefreshBeverage#isCustomerWantsAddcondiments()
	 */
	
	@Override
	protected boolean isCustomerWantsAddcondiments() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
