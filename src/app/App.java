package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import pol.TV;

public class App {

	public static void main(String[] args) {
		System.out.println("App Start .......");
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started .......");
		TV tv1 = (TV)factory.getBean("ltv");
		TV tv2 = (TV)factory.getBean("stv");
		tv1.powerOn();
		tv2.powerOn();
		factory.close();
		System.out.println("Spring end .......");
		System.out.println("App end .......");
	
	
	}

}







