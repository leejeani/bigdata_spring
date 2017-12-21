package design;

public class BeanFactory {
	public static Object getBean(String name) {
		Object result = null;
		if(name.equals("STV")) {
			result = new STV();
		}else if(name.equals("LTV")) {
			result = new LTV();
		}
		return result;
	}
}
