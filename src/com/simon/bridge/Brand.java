package com.simon.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println("БЄПл");
	}
	
}
class Dell implements Brand {

	@Override
	public void sale() {
	System.out.println("DELL");	
	}
	
}
