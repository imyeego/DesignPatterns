package com.liu.template;

public class RefreshBeverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("制备咖啡……");
		
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTemplate();
		
		System.out.println("咖啡制备好了！");
		
		System.out.println("-------------------------------");
		
		System.out.println("制作茶……");
		
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		
		System.out.println("茶制作好了");
	}

}
