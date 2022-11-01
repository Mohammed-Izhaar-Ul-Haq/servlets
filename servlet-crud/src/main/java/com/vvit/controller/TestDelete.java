package com.vvit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.vvit.dao.CustomerCrud;
@WebServlet(value = "/delete")
public class TestDelete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		CustomerCrud crud = new CustomerCrud();
		int a = crud.deleteCustomerById(Integer.parseInt(req.getParameter("id")));
		if(a>0) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("view");
			dispatcher.forward(req, res);
		}else {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("No Customer To Delete With Given ID");
		}		
	}
	
}
