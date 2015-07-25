package com.liu.strategy;

import com.liu.strategyImp.FlyWithWin;

public class RedHeadDuck extends Duck {
	public RedHeadDuck(){
		super();
		super.setFlyingStrategy(new FlyWithWin());	//向上转型
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是红头鸭！");
	}

}
