package pol;

public class Main {

	public static void main(String[] args) {
		TV tvs[] = new TV[3];
		
		TV tv1 = new STV();
		TV tv2 = new LTV();
		tv1.powerOn();
		tv2.powerOn();
	}

}
