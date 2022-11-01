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
@WebServlet(value = "/register")
public class TestInsert extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Customer c = new Customer();
		c.setId(Integer.parseInt(req.getParameter("id")));
		c.setName(req.getParameter("name"));
		c.setEmail(req.getParameter("email"));
		c.setAge(Integer.parseInt(req.getParameter("age")));
		c.setPhone(Long.parseLong(req.getParameter("phone")));
		
		CustomerCrud crud = new CustomerCrud();
		int a = crud.insertCustomer(c);
		if(a>0) {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("Saved");
		}else {
			RequestDispatcher reDispatcher = req.getRequestDispatcher("register.jsp");
			reDispatcher.include(req, res);
		}
	}
	
}
