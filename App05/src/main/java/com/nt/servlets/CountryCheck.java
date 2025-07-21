package com.nt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CountryCheck  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
       String att=req.getParameter("p1");
       Locale []ls=Locale.getAvailableLocales();
       if(att.equalsIgnoreCase("lang")) {
    	   for(Locale l:ls) {
    		   pw.println(l.getDisplayLanguage());
    	   }
       }else if(att.equalsIgnoreCase("count")) {
    	   for(Locale l:ls) {
    		   pw.println(l.getDisplayCountry());
    	   }
       }
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

} 
