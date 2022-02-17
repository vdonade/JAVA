package com.hibernate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




@WebServlet("/SaveProduct")
public class SaveProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}
	
	
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String name = request.getParameter("name");
			String price = request.getParameter("price");
			String size = request.getParameter("size");
	
			Product newproduct = new Product(name, price, size);
			
			//hibernate save:
			Session s =FactoryProvider.getFactory().openSession();
			//for permanent save in db
			// import org.hibernate transaction
			
			Transaction  tx = s.beginTransaction();
			s.save(newproduct);
			tx.commit();
			s.close();			
			PrintWriter out = response.getWriter();
			out.println("Product added.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
