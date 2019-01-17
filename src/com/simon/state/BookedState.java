package com.simon.state;

public class BookedState implements State{

	public void handle() {
		System.out.println("房间已预定");
	}

}
