package com.nt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoteCheck1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name = req.getParameter("Name");
		String tageStr = req.getParameter("Age");  
		int tage = Integer.parseUnsignedInt(tageStr);
		if(tage>18) {
		  pw.println("You Are Eligible");
		  pw.println("<a href='home.html'>Back To Home</a>");
		}else {
			pw.println("Not Are Eligible");
		    pw.println("<a href='home.html'>Back To Home</a>");
		}
	}

}
