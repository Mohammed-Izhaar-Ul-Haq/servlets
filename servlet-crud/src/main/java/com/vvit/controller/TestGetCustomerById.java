package com.vvit.controller;

import com.vvit.dao.CustomerCrud;
import com.vvit.dto.Customer;

public class TestGetCustomerById {
	public static void main(String[] args) {
		CustomerCrud cc = new CustomerCrud();
		Customer c = cc.getCustomerById(10);
		if(c!=null) {
			System.out.println("Cutsomer ID: "+c.getId());
			System.out.println("Cutsomer Name: "+c.getName());
			System.out.println("Cutsomer Email: "+c.getEmail());
			System.out.println("Cutsomer Age: "+c.getAge());
			System.out.println("Cutsomer Phone: "+c.getPhone());
		}else {
			System.out.println("No Customer With Given ID");
		}
	}
}
