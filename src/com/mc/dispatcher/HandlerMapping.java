package com.mc.dispatcher;

import java.util.HashMap;

import com.mc.controller.AddController;
import com.mc.controller.ListController;
import com.mc.controller.MainController;

public class HandlerMapping {
	private HashMap<String, Controller> map;
	public HandlerMapping(){
		map = new HashMap<String, Controller>();
		initConfig();
	}
	private void initConfig(){
		map.put("/main.mc", new MainController());
		map.put("/list.mc", new ListController());
		map.put("/add.mc", new AddController());
	}
	public Controller getController(String path){
		return map.get(path);
	}
}
