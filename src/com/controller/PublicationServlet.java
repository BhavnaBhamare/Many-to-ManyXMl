package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Author;
import com.pojo.Book;
import com.pojo.Publication;

/**
 * Servlet implementation class PublicationServlet
 */
@WebServlet("/PublicationServlet")
public class PublicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PublicationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

 Author a=new Author();
 Book b=new Book();
 Publication p=new Publication();
 BLManager bl=new BLManager();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String pname=request.getParameter("pname");
		String pprice=request.getParameter("pprice");
		String pphone=request.getParameter("pphone");
		String paddress=request.getParameter("paddress");
		String pemail=request.getParameter("pemail");
		String pdate=request.getParameter("pdate");
		String bname=request.getParameter("bname");
		String aname=request.getParameter("aname");
		
	a=bl.searchbyAuthorname(aname);
	b=bl.searchbyBookname(bname);
	
		p.setAuthor(a);
		p.setBook(b);
		p.setPaddress(paddress);
		p.setPdate(pdate);
		p.setPemail(pemail);
		p.setPname(pname);
		p.setPphone(pphone);
		p.setPprice(pprice);
		
		
		bl.savePublication(p);
		
		response.sendRedirect("Index.jsp");
		
		
	}

}
