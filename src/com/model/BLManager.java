package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Author;
import com.pojo.Book;
import com.pojo.Publication;

public class BLManager {

	SessionFactory sf= new Configuration().configure().buildSessionFactory();

	public void saveBook(Book b) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(b);
		t.commit();
		s.close();
	}

	public void saveAuthor(Author a) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(a);
		t.commit();
		s.close();
	}

	public void savePublication(Publication p) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
	}

	public Author searchbyAuthorname(String aname) {
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Author.class);
		cr.add(Restrictions.eq("aname", aname));
		Author a=(Author)cr.uniqueResult();
		return a;
	}

	public Book searchbyBookname(String bname) {
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Book.class);
		cr.add(Restrictions.eq("bname", bname));
		Book b=(Book)cr.uniqueResult();
		return b;
	}

	public List<Author> serachAuthorlist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Author.class);
		List<Author> al=cr.list();
		return al;
		
	}
	public List<Book> serachBooklist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Book.class);
		List<Book> bl=cr.list();
		return bl;
		
	}
	
}
