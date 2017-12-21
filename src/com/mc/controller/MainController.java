package com.mc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.dispatcher.Controller;

public class MainController implements Controller {

	@Override
	public String handler(HttpServletRequest request, HttpServletResponse response) {
		return "main";
	}

}
