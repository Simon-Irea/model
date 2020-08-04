package com.simon.proxy.dynamicProxy.JDK;

import java.lang.reflect.Proxy;

public class Client {
	/**
	 * 动态代理可以没有实现类，如果没有实现类，那么不可以调用method.invoke()方法，具体可以参考mybatis中的实现
	 * @param args
	 */
	public static void main(String[] args) {
		Star realStar = new RealStar();
		
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		System.out.println("sdgsg");
		proxy.bookTicket();
		proxy.sing();
	}

}
