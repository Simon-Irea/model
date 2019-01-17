package com.simon.prototype;

import java.util.Date;

/**
 * ǳ��¡
 * @author Administrator
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone(); //ֱ�ӵ���objec����Ŀ�¡����
		return obj;
		
	}

	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
