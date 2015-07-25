package com.liu.adapter;
/*
 * 使用组合方式实现适配器，推荐使用
 */
public class TwoPlugAdapter implements ThreePlugInter {
	private GBTwoPlug two;
	
	
	public TwoPlugAdapter(GBTwoPlug two) {
		super();
		this.two = two;
	}


	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("通过二相给三相充电");
		two.powerWithTwo();
	}

}
