package com.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy s1 = new OldCustomerFewStrategy();
		Context ctx = new Context(s1);
		ctx.pringPrice(998);
	}
}
