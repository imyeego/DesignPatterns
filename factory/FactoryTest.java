package com.liu.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HairInter left = new LeftHair();
//		left.draw();
		
		HairFactory factory = new HairFactory();
		
//		HairInter left = factory.getHair("left");
//		left.draw();
		
//		HairInter left = factory.getHairByClass("com.liu.factory.LeftHair");
//		left.draw();
		
		HairInter left= factory.getHairByClassKey("right");
		left.draw();
	}

}
