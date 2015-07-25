package com.liu.chainofresponse;

public class Sales extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		// TODO Auto-generated method stub
		if(discount <= 0.10){
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
		}else{
			this.seccessor.processDiscount(discount);
		}
	}

}
