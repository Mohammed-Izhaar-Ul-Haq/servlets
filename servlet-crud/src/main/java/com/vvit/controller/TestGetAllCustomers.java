package com.vvit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.vvit.dao.CustomerCrud;
import com.vvit.dto.Customer;
@WebServlet(value = "/view")
public class TestGetAllCustomers extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		CustomerCrud crud  = new CustomerCrud();
		ArrayList<Customer> customers = crud.getAllCustomers();
		if(customers.size()>0) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
			req.setAttribute("cus", customers);
			dispatcher.forward(req, res);
		}else {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("No Customers");
		}
	}
	
}
