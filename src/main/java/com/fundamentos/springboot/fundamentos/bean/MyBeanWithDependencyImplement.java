package com.fundamentos.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

	@Autowired
	MyOperation myOperation;
	
	
	public  MyBeanWithDependencyImplement(MyOperation myOperation){
		this.myOperation = myOperation;
	}
	
	@Override
	public void printWithDependency() {
		int x = 2;
		long c =1L;
		int y = myOperation.suma(x);
		
		
		System.out.println("Hola desde la implementacion de un Bean con dependencia " + y );
		
	}
	
	

}
