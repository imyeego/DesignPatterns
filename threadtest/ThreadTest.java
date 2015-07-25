package com.liu.threadtest;


class MyThread extends Thread{
	private int ticketCount = 5;
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		while(ticketCount > 0){
			ticketCount --;
			System.out.println(name + "卖了一张票，剩余票数为"+ ticketCount);
		}
	}
} 


public class ThreadTest {
	/**
	 * 
	 */
	public static void main(String[] args){
		MyThread mt1 = new MyThread("窗口1");
		MyThread mt2 = new MyThread("窗口2");
		MyThread mt3 = new MyThread("窗口3");
		
		//启动线程
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
	
	
	
	
	
	
	
	
	
}
