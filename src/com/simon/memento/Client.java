package com.simon.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("maoyig", 18, 900);
		System.out.println("��һ�δ�������" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
		
		taker.setMemento(emp.memento()); //����һ��
		
		emp.setAge(38);
		emp.setEname("simon");
		emp.setSalary(9000);
		
		System.out.println("�ڶ��δ�������" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
		
		emp.recovery(taker.getMemento());//�ָ������汸��¼��״̬
		
		System.out.println("�����δ�������" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
	}
}
