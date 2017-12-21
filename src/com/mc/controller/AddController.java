package com.mc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.dispatcher.Controller;
import com.mc.frame.Biz;
import com.mc.model.User;
import com.mc.model.UserBiz;

public class AddController implements Controller {

	Biz<User,String> biz;
	
	public AddController() {
		biz = new UserBiz();
	}
	
	@Override
	public String handler(HttpServletRequest request, 
			HttpServletResponse response) {
		String next = "";
		String cmd = request.getParameter("cmd");
		if(cmd == null || cmd.equals("")) {
			next = "add";
		}else if(cmd.equals("impl")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			User user = new User(id, pwd, name);
			biz.register(user);
			next = "main";
		}else if(cmd.equals("detail")) {
			String id = request.getParameter("id");
			User user = biz.get(id);
			request.setAttribute("duser", user);
			next = "detail";
		}else if(cmd.equals("delete")) {
			//삭제 처리 
			
			//데이터를 조회 한다.
			biz.get();
			// setting
			request.setAttribute("", "");
			next = "list";
		
		}
		return next;
	}

}






