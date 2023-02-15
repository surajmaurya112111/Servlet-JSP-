package com.jsp.Simple_Servlet_project_8Am.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registraion implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s=req.getParameter("uname");
		String s1=req.getParameter("password");
		String s2=req.getParameter("email");
		String s3=req.getParameter("phone");
		
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h4>Name : "+s+"</h4>");
		printWriter.write("<h4>Password : "+s1+"</h4>");
		printWriter.write("<h4>Email : "+s2+"</h4>");
		printWriter.write("<h4>Phone Number : "+s3+"</h4>");
		printWriter.write("</html></body>");
		
        RequestDispatcher dispatcher=req.getRequestDispatcher("Registration.jsp");
		
		dispatcher.include(req, res);
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
