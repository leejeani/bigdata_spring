package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sds.frame.Product;
import com.sds.frame.Service;
import com.sds.frame.User;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		Service<Product, Integer> service
		= (Service<Product, Integer>) factory.getBean("productService");
		
		//service.register(new User("id01","pwd01","ÀÌ¸»¼÷"));
		Product p = service.get(100);
		System.out.println(p);
	}

}







