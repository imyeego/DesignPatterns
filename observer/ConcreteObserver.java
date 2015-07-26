package com.liu.observer;
/*
 * 具体的观察者对象，实现更新的方法，使得自身的状态与目标状态一致。
 */
public class ConcreteObserver implements Observer {
	private String observerName;
	private String remindThing;
	private String observerState;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		observerState = ((ConcreteSubject)subject).getState();
		
		System.out.println(observerName + "收到了" + observerState + "," + remindThing);
	}

}
