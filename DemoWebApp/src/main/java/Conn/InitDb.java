package Conn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/initDb")
public class InitDb extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("index.html").include(request, response);
		
		
		try {
			
		
		ConnectionClss con = new ConnectionClss();
		
		if(con.getConnection()!=null) {
			
			out.print("successfull connection");
		}
	}
		catch(Exception e) {
			out.print("unsuccessfull connection");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

}
