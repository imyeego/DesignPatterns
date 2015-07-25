package com.liu.chainofresponse;
/*
 * priceHandler工厂类：从PriceHandler类中move过来，原因：
 * 1.不符合面向对象设计原则中的“单一职责原则”
 * 2.不符合Java命名规范“见名知义”
 * 单一职责原则：在设计一个接口的时候，应该只将业务相关的方法放在接口之中
 * 
 */
public class PriceHandlerFactory {

	public static PriceHandler createPriceHandler() {
		// TODO Auto-generated method stub
		PriceHandler sales = new Sales();
		PriceHandler manager = new Manager();
		PriceHandler director = new Director();
		PriceHandler ceo = new CEO();
		
		sales.setSeccessor(manager);
		manager.setSeccessor(director);
		director.setSeccessor(ceo);
		
		
		return sales;
	}

}
