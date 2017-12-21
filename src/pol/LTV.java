package pol;

import org.springframework.stereotype.Component;

@Component("ltv")
public class LTV implements TV {
	public LTV() {
		System.out.println("LTV Constructor");
	}
	public void dMethod() {
		System.out.println("LTV dMethod");
	}
	@Override
	public void powerOn() {
		System.out.println("LTV Power On");

	}

}
