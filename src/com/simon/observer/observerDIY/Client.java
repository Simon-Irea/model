package com.simon.observer.observerDIY;

public class Client {
	public static void main(String[] args) {
		//Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();

		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		//���������۲�����ӵ��۲��߶�����
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		//�ı�״̬
		subject.setState(3000);

		//�۲��ߵ�״̬
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());


		//�ı�״̬
		subject.setState(30);

		//�۲��ߵ�״̬
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
