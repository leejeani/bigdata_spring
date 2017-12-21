package com.mc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.dispatcher.Controller;
import com.mc.frame.Biz;
import com.mc.model.User;
import com.mc.model.UserBiz;

public class ListController implements Controller {
	Biz<User, String> biz;
	public ListController() {
		biz = new UserBiz();
	}
	@Override
	public String handler(HttpServletRequest request, HttpServletResponse response) {
		List<User> list = null; 
		list = biz.get();
		request.setAttribute("ulist", list);
		return "list";
	}

}





