package com.simon.observer.observerDIY;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	//����µĹ۲���
	public void registerObserver(Observer obs) {
		list.add(obs);
	}
	//�Ƴ�һ���۲���
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	//֪ͨ���еĹ۲��߸���״̬
	public void notifyAllObservers() {
		for(Observer obs : list) {
			obs.update(this);
		}
	}

}
