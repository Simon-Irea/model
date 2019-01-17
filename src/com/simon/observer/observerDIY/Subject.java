package com.simon.observer.observerDIY;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	//添加新的观察者
	public void registerObserver(Observer obs) {
		list.add(obs);
	}
	//移除一个观察者
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	//通知所有的观察者更新状态
	public void notifyAllObservers() {
		for(Observer obs : list) {
			obs.update(this);
		}
	}

}
