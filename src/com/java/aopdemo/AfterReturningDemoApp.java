package com.java.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.aopdemo.dao.Account;
import com.java.aopdemo.dao.AccountDAO; 

public class AfterReturningDemoApp {
	public static void main(String[] args) {
		
		//read spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the AccountDAO bean from spring container
		AccountDAO accDao = context.getBean("accountDAO", AccountDAO.class);
		
		//call the method to find the Accounts
		List<Account> accounts = accDao.findAccounts();
		
		//display the Accunts
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----------");
		System.out.println(accounts+"\n");
		
		//close the
		context.close();
	}
}
