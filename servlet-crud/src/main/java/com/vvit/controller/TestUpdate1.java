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
import com.vvit.dto.Customer;
@WebServlet(value = "/update")
public class TestUpdate1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		CustomerCrud crud = new CustomerCrud();
		Customer c  = crud.getCustomerById(Integer.parseInt(req.getParameter("id")));
		if(c!=null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			req.setAttribute("customer", c);
			dispatcher.forward(req, res);
		}else {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("No Customer To Update With Given ID");
		}
	}
	
}
