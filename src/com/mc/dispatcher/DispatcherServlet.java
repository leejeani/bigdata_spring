package com.mc.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/DispatcherServlet", "/dispatcher" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		HandlerMapping mapper = new HandlerMapping();
		Controller controller = mapper.getController(path);
		
		String next = "";
		next = controller.handler(request, response);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher(next+".jsp");
		rd.forward(request, response);
	}

}



