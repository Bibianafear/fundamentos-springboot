package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation {

	@Override
	public int suma(int number) {
		return number + 1;
	}
	
	public void holiMundo() {
		System.out.println("HoliMundo");
	}
	
	public void holiMundoTwo(String letrita) {
		System.out.println("HoliMundo" + letrita);
	}

}
