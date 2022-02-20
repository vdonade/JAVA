package com.validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/saveuser")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Properties props = new Properties();

		String user_name = request.getParameter("user_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config = new DatabaseConfig(props.getProperty("driver"), props.getProperty("url"),
					props.getProperty("username"), props.getProperty("password"));

			Connection conn = config.getConnection();

			PreparedStatement stmt = conn
					.prepareStatement("insert into user (user_name,email, password, gender) values (?,?,?,?)");
			stmt.setString(1, user_name);
			stmt.setString(2, email);
			stmt.setString(3, password);
			stmt.setString(4, gender);

			int x = stmt.executeUpdate();
			if (x > 0)
				System.out.println("Data Inserted Successfully");
			else
				System.out.println("Error while inserting a data");

			response.sendRedirect("userlogin.jsp");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
