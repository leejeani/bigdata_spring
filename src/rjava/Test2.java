package rjava;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;

public class Test2 {

	public static void main(String[] args) 
			throws Exception{
		RConnection rc = new RConnection();
		rc.eval("source('C:/rtest/r4/r4.R')");
		RList rl = rc.eval("data1()").asList();
		System.out.println(rl.size());
		String [] years = rl.at("Year").asStrings();
		double [] qts = rl.at("Qt").asDoubles();
			
		// RList 데이터를 JSON 형태로 변경 하시오
		// [{"Year":"2016","Qt":182},{},....]
		JSONArray ja = new JSONArray();
		for(int i=0;i<years.length;i++) {
			JSONObject jo = new JSONObject();
			jo.put("Year", years[i]);
			jo.put("Qt", qts[i]);
			ja.add(jo);
		}
		System.out.println(ja.toJSONString());
	}

}

















