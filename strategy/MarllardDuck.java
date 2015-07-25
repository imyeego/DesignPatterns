package com.liu.strategy;

import com.liu.strategyImp.FlyWithLeg;

public class MarllardDuck extends Duck {
	
	public MarllardDuck() {
		super();
		// TODO Auto-generated constructor stub
		super.setFlyingStrategy(new FlyWithLeg());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是绿脖鸭");
	}

}
