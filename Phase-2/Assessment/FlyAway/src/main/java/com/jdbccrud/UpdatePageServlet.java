package com.jdbccrud;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/updatepage")
public class UpdatePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Properties props = new Properties();

		String flight_ID = request.getParameter("flight_ID");

		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config = new DatabaseConfig(props.getProperty("driver"), props.getProperty("url"),
					props.getProperty("username"), props.getProperty("password"));

			Connection conn = config.getConnection();

			PreparedStatement stmt = conn.prepareStatement("select * from flight where flight_ID=?");
			stmt.setInt(1, Integer.parseInt(flight_ID));

			ResultSet result = stmt.executeQuery();
			result.next();
			out.println("<form action='update' method='post'>");
			out.println("<input type='hidden' name='flight_ID' value='" + result.getInt(1) + "'>");
			out.println("Airline: <input type='text' name='airline' value='" + result.getString(2) + "'><br><br>");
			out.println(
					"Flight Weekdays: <input type='text' name='weekdays' value='" + result.getString(3) + "'><br><br>");
			out.println("Flight From Location: <input type='text' name='From_location' value='" + result.getString(4)
					+ "'><br><br>");
			out.println("Flight Destination: <input type='text' name='destination' value='" + result.getString(5)
					+ "'><br><br>");
			out.print("<input type='submit' value='Update Data'>");
			out.print("<form>");

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