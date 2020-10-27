package com.pojo;

// Generated Oct 1, 2019 1:24:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Author generated by hbm2java
 */
public class Author implements java.io.Serializable {

	private Integer aid;
	private String aname;
	private String aemail;
	private String aphone;
	private String aaddress;
	private Set publications = new HashSet(0);

	public Author() {
	}

	public Author(String aname, String aemail, String aphone, String aaddress, Set publications) {
		this.aname = aname;
		this.aemail = aemail;
		this.aphone = aphone;
		this.aaddress = aaddress;
		this.publications = publications;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAemail() {
		return this.aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public String getAphone() {
		return this.aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public String getAaddress() {
		return this.aaddress;
	}

	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}

	public Set getPublications() {
		return this.publications;
	}

	public void setPublications(Set publications) {
		this.publications = publications;
	}

}