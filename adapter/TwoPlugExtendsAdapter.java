package com.liu.adapter;
/*
 * 使用继承方式实现
 */
public class TwoPlugExtendsAdapter extends GBTwoPlug implements ThreePlugInter {

	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("使用继承方式转换");
		this.powerWithTwo();
	}

}
