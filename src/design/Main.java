package design;

public class Main {

	public static void main(String[] args) {
		TV tv1 = 
			(TV)BeanFactory.getBean("STV");
		TV tv2 = 
			(TV)BeanFactory.getBean("LTV");
		tv1.powerOn();
		tv2.powerOn();
	}

}
