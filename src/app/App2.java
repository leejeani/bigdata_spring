package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import frame.Biz;
import vo.Product;

public class App2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		Biz biz = 
			(Biz)factory.getBean("productBiz");
		Product product = 
			new Product(100, "¹ÙÁö", 10000); 
		biz.register(product);
	
	
	}

}







