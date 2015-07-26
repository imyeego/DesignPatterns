package com.liu.observer;
/*
 * 具体目标对象，负责把有关状态存入到相应的观察者对象中。
 */
public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyObservers();
	}
	
	
}
