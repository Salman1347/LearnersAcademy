package com.prepared;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class prepare extends HttpServlet {
	Connection con;
	PreparedStatement smt;
	public void init() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root123");
			System.out.println(con);
			smt=con.prepareStatement("insert into product values(?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String description=request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		
		try {
			smt.setInt(1,id);
			smt.setString(2,name);
			smt.setString(3,description);
			smt.setInt(4,price);
			int result=smt.executeUpdate();
			PrintWriter out = response.getWriter();
			out.print(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
