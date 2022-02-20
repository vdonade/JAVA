package com.jdbccrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.controller.LoginServlet;

@WebServlet("/checkdetails")
public class CheckBookingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Properties props = new Properties();

		String flight_ID = request.getParameter("flight_ID");
		String From_location = request.getParameter("From_location");
		String destination = request.getParameter("destination");
		String date_added = request.getParameter("date_added");

		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config = new DatabaseConfig(props.getProperty("driver"), props.getProperty("url"),
					props.getProperty("username"), props.getProperty("password"));

			Connection conn = config.getConnection();

			PreparedStatement stmt = conn
					.prepareStatement("select * from flight where From_location=? AND destination=?");

			stmt.setString(1, From_location);
			stmt.setString(2, destination);

			ResultSet x = stmt.executeQuery();

			out.print("<h1>Flight Details</h1><hr>");

			if (x.next()) {
				out.print(flight_ID + "<br> " + x.getString(2) + "<br> " + x.getString(3) + " <br>" + x.getString(4)
						+ " <br>" + " <br>" + x.getString(5) + " <br>" + x.getTimestamp(6).toString());

			} else {
				out.print("Record not found!");
			}

			response.sendRedirect("payment.jsp");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}