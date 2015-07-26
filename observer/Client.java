package com.liu.observer;
/*
 * 1.创建目标
 * 2.创建观察者
 * 3.注册观察者
 * 4.发布目标状态
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject weather = new ConcreteSubject();
		
		ConcreteObserver girl = new ConcreteObserver();
		girl.setObserverName("女朋友");
		girl.setRemindThing("上午十点约会");
		
		ConcreteObserver mom = new ConcreteObserver();
		mom.setObserverName("妈妈");
		mom.setRemindThing("上午十点逛街");
		
		weather.attach(girl);
		weather.attach(mom);
		
		weather.setState("明天天气晴朗，蓝天白云，气温28度");
		
		
	}

}
