package rjava;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;

public class Test3 {

	public static void main(String[] args) 
			throws Exception{
		RConnection rc = new RConnection();
		rc.setStringEncoding("utf8");
		rc.eval("source('C:/rtest/r4/r4.R',encoding='UTF-8')");
		RList rl = rc.eval("db()").asList();
		System.out.println(rl.size());
		String [] ids = rl.at("ID").asStrings();
		String [] pwds = rl.at("PWD").asStrings();
		String [] names = rl.at("NAME").asStrings();
			
		JSONArray ja = new JSONArray();
		for(int i=0;i<ids.length;i++) {
			JSONObject jo = new JSONObject();
			jo.put("ID", ids[i]);
			jo.put("PWD", pwds[i]);
			jo.put("NAME", names[i]);
			ja.add(jo);
		}
		System.out.println(ja.toJSONString());
	}

}

















