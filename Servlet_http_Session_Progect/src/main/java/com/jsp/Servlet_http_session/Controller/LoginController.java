package com.jsp.Servlet_http_session.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession=req.getSession();
		
		String name=req.getParameter("username");
		String email=req.getParameter("pasword");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		
		if((name.equalsIgnoreCase("root"))&&(email.equalsIgnoreCase("root@gmail.com")))
		{
			httpSession.setAttribute("myname", name);
			
			printWriter.write("<h3 style='color:green'>Login-successfully</h3>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("profile-page.jsp");
			dispatcher.include(req, resp);
		}else
		{
			printWriter.write("<h3 style='color:red'>Please check your username and password</h3>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login-form.jsp");
			dispatcher.include(req, resp);
		}
		printWriter.write("</html></body>");
	}

}
