package com.fundamentos.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;


@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//@Autowired
	private ComponentDependency componentDependency;
	@Autowired
	private MyBean mybean;
	@Autowired
	private MyBeanWithDependency myBeanWithDependency;
	
	//Es otro Autowired, otra inyeccion de dependecia a partir del constructor
public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency ) {
		this.componentDependency = componentDependency;
		//this.mybean = mybean;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	
	}
	@Override
	public void run(String... args) throws Exception {
		
		componentDependency.saludar();
		mybean.print();
		myBeanWithDependency.printWithDependency();
		
	}
	

}
