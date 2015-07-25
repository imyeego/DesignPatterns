package com.liu.strategy;

public class DuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("测试鸭子程序");
		
		Duck duck = null;
		//duck = new RedHeadDuck();
		duck = new MarllardDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
		
		System.out.println("测试完毕！");
	}

}
