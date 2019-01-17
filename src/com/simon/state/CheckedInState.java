package com.simon.state;

public class CheckedInState implements State{

	public void handle() {
		System.out.println("已入住的状态");
	}

}
