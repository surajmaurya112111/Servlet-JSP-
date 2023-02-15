package com.jsp.Simple_Servlet_project_8Am.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionController implements Servlet{

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
		
		int number1=Integer.parseInt(req.getParameter("number1"));
		int number2=Integer.parseInt(req.getParameter("number2"));
		
		int add=number1+number2;
		
		System.out.println(add);
		
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body>");
		
		printWriter.write("<h3>The Adition of Tow number:"+add+"</h3>");
		
		
		printWriter.write("</html></body>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Adition.jsp");
		
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
