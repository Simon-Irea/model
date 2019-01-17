package com.simon.proxy.dynamicProxy.JDK;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Star realStar = new RealStar();
		
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		System.out.println("sdgsg");
		proxy.bookTicket();
		proxy.sing();
	}

}
