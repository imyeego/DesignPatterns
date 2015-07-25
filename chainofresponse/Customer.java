package com.liu.chainofresponse;

import java.util.Random;

/*
 * 请求折扣
 */
public class Customer {
	private PriceHandler priceHandler;
	
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	//请求折扣
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		cus.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		for(int i = 0;i<=40;i ++){
			System.out.print(i + ":");
			cus.requestDiscount(new Random().nextFloat());
		}
	}

}
