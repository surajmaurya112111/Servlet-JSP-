package com.jsp.Servlet_http_session.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession=req.getSession();
		
		httpSession.invalidate();
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("login-form.jsp");
		dispatcher.forward(req, resp);
	}
	
}
