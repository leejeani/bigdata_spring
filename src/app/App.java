package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import frame.Biz;
import vo.User;

public class App {

	public static void main(String[] args) {
		
		//AbstractApplicationContext factory = 
		//new GenericXmlApplicationContext("myspring2.xml");
		ApplicationContext factory = 
		new ClassPathXmlApplicationContext("myspring2.xml");
		Biz biz = 
			(Biz)factory.getBean("userBiz");
		User user = 
			new User("id01", "pwd01", "ÀÌ¸»¼÷");
		biz.register(user);
	
	
	}

}







