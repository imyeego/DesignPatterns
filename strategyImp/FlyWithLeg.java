package com.liu.strategyImp;

import com.liu.strategy.FlyingStrategy;

public class FlyWithLeg implements FlyingStrategy {

	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		System.out.println("用腿飞行！");
	}

}
