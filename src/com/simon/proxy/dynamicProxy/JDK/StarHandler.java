package com.simon.proxy.dynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 代理类
 * @author simon
 *
 */
public class StarHandler implements InvocationHandler {
	Star realStar;


	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("方法执行前");
		System.out.println("=====================");
		if(method.getName().equals("sing")) {
			method.invoke(realStar, args);
		}
		System.out.println("=====================");
		System.out.println("方法执行后");
		return object;
	}

}
