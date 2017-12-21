package pol;

public class STV implements TV {
	public STV() {
		System.out.println("STV Constructor");
	}
	public void iMethod() {
		System.out.println("STV iMethod");
	}
	@Override
	public void powerOn() {
		System.out.println("STV Power On");
	}

}
