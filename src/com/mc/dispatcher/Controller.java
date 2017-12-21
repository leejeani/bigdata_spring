package com.mc.dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String handler(HttpServletRequest request,
			HttpServletResponse response);
}
