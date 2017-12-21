package collection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		CollectionBean collectionBean = 
		(CollectionBean)factory.getBean("collectionBean");
		
		List<String> list = 
			collectionBean.getAddressList();
		
		for(String s: list) {
			System.out.println(s);
		}
		
	}

}







