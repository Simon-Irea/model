package com.simon.memento;
/**
 * 负责人类
 * 负责管理备忘录对象
 * @author simon
 *
 */
public class CareTaker {
	//如果要备忘多个点，需要使用list
	private EmpMemento memento;
	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
