package rjava;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Test1 {

	public static void main(String[] args) 
			throws Exception {
		int xx = 100;
		int yy = 200;
		RConnection rc = new RConnection();
		rc.eval("source('C:/rtest/r4/r4.R')");
		REXP x = rc.eval("mysum("+xx+","+yy+")");
		double result = x.asDouble();
		System.out.println("Result: "+result);
		
	}

}


