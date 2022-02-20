package com.jdbccrud;

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
@WebServlet("/save")
public class SaveFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Properties props = new Properties();

		String airline = request.getParameter("airline");
		String weekdays = request.getParameter("weekdays");
		String From_location = request.getParameter("From_location");
		String destination = request.getParameter("destination");

		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config = new DatabaseConfig(props.getProperty("driver"), props.getProperty("url"),
					props.getProperty("username"), props.getProperty("password"));

			Connection conn = config.getConnection();

			PreparedStatement stmt = conn.prepareStatement(
					"insert into flight (airline,weekdays, From_location, destination) values (?,?,?,?)");
			stmt.setString(1, airline);
			stmt.setString(2, weekdays);
			stmt.setString(3, From_location);
			stmt.setString(4, destination);

			int x = stmt.executeUpdate();
			if (x > 0)
				System.out.println("Data Inserted Successfully");
			else
				System.out.println("Error while inserting a data");

			response.sendRedirect("list");

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
