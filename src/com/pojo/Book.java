package com.pojo;

// Generated Oct 1, 2019 1:24:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book implements java.io.Serializable {

	private Integer bid;
	private String bname;
	private String bdate;
	private Set publications = new HashSet(0);

	public Book() {
	}

	public Book(String bname, String bdate, Set publications) {
		this.bname = bname;
		this.bdate = bdate;
		this.publications = publications;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBdate() {
		return this.bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public Set getPublications() {
		return this.publications;
	}

	public void setPublications(Set publications) {
		this.publications = publications;
	}

}
