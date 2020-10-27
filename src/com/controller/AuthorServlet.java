package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Author;

@WebServlet("/AuthorServlet")
public class AuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AuthorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String aname=request.getParameter("aname");
		String aemail=request.getParameter("aemail");
		String aphone=request.getParameter("aphone");
		String aaddress=request.getParameter("aaddress");
		
		Author a=new Author();
		
		a.setAaddress(aaddress);
		a.setAemail(aemail);
		a.setAname(aname);
		a.setAphone(aphone);
		
		BLManager b=new BLManager();
		
		b.saveAuthor(a);
		 response.sendRedirect("Index.jsp");
		
	}

}
