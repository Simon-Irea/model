package com.simon.proxy.staticProxy;

public class Client {

	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.sing();
		proxy.signContract();
		proxy.bookTicket();
		proxy.collectMoney();
	}

}
