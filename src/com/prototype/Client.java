package com.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date();
		Sheep s = new Sheep("ÂêÀö", date);
		System.out.println(s);
		System.out.println(s.getBirthday());
		
		Sheep s1 = (Sheep)s.clone();
		System.out.println(s1);
		System.out.println(s1.getBirthday());
		s.setBirthday(new Date(12156415L));
		System.out.println(s1.getBirthday());
	}
}
