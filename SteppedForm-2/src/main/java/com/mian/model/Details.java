package com.mian.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ContactDetails contactDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EducationDetails educationDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public EducationDetails getEducationDetails() {
		return educationDetails;
	}
	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}
	
}