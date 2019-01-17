package com.simon.proxy.dynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ����һ����������
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
		System.out.println("�����ķ���ִ��ǰ");
		System.out.println("=====================");
		if(method.getName().equals("sing")) {
			method.invoke(realStar, args);
		}
		System.out.println("=====================");
		System.out.println("�����ķ���ִ�к�");
		return object;
	}

}
