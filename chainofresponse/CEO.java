package com.liu.chainofresponse;

public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		// TODO Auto-generated method stub
		if(discount <= 0.40){
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
		}else{
			System.out.println("由于折扣太大，"+this.getClass().getName()+"拒绝了折扣请求！"+ discount);;
		}
	}

}
