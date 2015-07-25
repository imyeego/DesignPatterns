package com.liu.threadtest;

class MyThreadRunnable implements Runnable{
	private int ticketCount = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticketCount > 0){
			ticketCount --;
			System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数为"+ ticketCount);
		}
	}
	
	
}



public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable mtr = new MyThreadRunnable();
		Thread tr1 = new Thread(mtr,"窗口1");
		Thread tr2 = new Thread(mtr,"窗口2");
		Thread tr3 = new Thread(mtr,"窗口3");
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
