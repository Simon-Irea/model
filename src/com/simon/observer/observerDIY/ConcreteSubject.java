package com.simon.observer.observerDIY;

public class ConcreteSubject extends Subject{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//主题对象值发生了变化，则通知所有观察者
		super.notifyAllObservers();
	}

	
	
}
