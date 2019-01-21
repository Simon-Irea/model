package com.simon.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("maoyig", 18, 900);
		System.out.println("第一次创建对象" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
		
		taker.setMemento(emp.memento()); //备份一次
		
		emp.setAge(38);
		emp.setEname("simon");
		emp.setSalary(9000);
		
		System.out.println("第二次创建对象" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
		
		emp.recovery(taker.getMemento());//恢复到保存备忘录的状态
		
		System.out.println("第三次创建对象" + emp.getEname()+"---"+emp.getAge()+"---"+ emp.getSalary());
	}
}
