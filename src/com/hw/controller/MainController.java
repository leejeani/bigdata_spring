package com.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.frame.Biz;
import com.hw.vo.Product;
import com.hw.vo.User;

@Controller
public class MainController {
	
	@Resource(name="userBiz")
	Biz<User,String> biz;
	@Resource(name="productBiz")
	Biz<Product,Integer> pbiz;
	
	@RequestMapping("/main.hw")
	public String main() {
		return "main";
	}
	@RequestMapping("/login.hw")
	public String login() {
		return "login";
	}
	@RequestMapping("/getdata.hw")
	@ResponseBody
	public List<Product> getdata(
			HttpServletResponse res) {
		List<Product> list = 
			pbiz.get();
		return list;
	}
	
	@RequestMapping("/loginimpl.hw")
	public String loginimpl(String id,
			String pwd,
			HttpServletRequest request) {
		User dbUser = biz.get(id);
		if(dbUser == null) {
			return "error";
		}else {
			if(pwd.equals(dbUser.getPwd())) {
				HttpSession session = 
					request.getSession();
				session.setAttribute("loginuser", dbUser);
			}else {
				return "error";
			}
		}
		return "main";
	}
	
	
	@RequestMapping("/logout.hw")
	public String logout(
			HttpServletRequest request) {
		HttpSession session =
				request.getSession();
		if(session != null) {
			session.invalidate();
		}
		return "main";
	}
}



