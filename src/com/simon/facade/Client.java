package com.simon.facade;

public class Client {

	public static void main(String[] args) {
		RegisterFacade facade = new RegisterFacade();
		facade.register();
	}

}
