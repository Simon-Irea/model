package com.simon.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator iter = cma.createIterator();
		while (iter.hasNext()) {
			//一般在返回一个对象的时候游标会自动加一
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}
}
