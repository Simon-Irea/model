package com.simon.observer.observerJDK;

public class Client {
	public static void main(String[] args) {
		//Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();

		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		//���������۲�����ӵ��۲��߶�����
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		//�ı�״̬
		subject.set(3000);

		//�۲��ߵ�״̬
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());


		//�ı�״̬
		subject.set(30);

		//�۲��ߵ�״̬
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
