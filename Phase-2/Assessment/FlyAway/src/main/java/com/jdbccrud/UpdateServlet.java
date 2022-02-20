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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		String flight_ID = request.getParameter("flight_ID");
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
					"update flight set airline=? , weekdays=? , From_location=? , destination=? where flight_ID=?");

			stmt.setString(1, airline);
			stmt.setString(2, weekdays);
			stmt.setString(3, From_location);
			stmt.setString(4, destination);
			stmt.setInt(5, Integer.parseInt(flight_ID));

			int x = stmt.executeUpdate();
			if (x > 0)
				System.out.println("Data Updated Successfully");
			else
				System.out.println("Error while updating a data");

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