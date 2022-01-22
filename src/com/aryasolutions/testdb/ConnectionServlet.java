package com.aryasolutions.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ConnectionServlet
 */
@WebServlet("/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set up connection variables
		String user = "gaurav";
		String pass = "gaurav";

		String jdbcUrl = "jdbc:mysql://localhost:3306/crm?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		// get connection to database
		try {
			PrintWriter out = response.getWriter();

			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			out.println("Success!!!");

			myConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
