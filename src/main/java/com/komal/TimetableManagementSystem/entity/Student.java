package com.komal.TimetableManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private int scontact;
	private String smeetingid;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScontact() {
		return scontact;
	}
	public void setScontact(int scontact) {
		this.scontact = scontact;
	}
	public String getSmeetingid() {
		return smeetingid;
	}
	public void setSmeetingid(String smeetingid) {
		this.smeetingid = smeetingid;
	}
	
	@Override
	public String toString() 
	{
		return  "STUDENT DETAILS : " + 
				" Student ID :  "+this.sid +
				" Student Name :  "+this.sname +
				" Student Contact :  "+this.scontact +
				" Student MeetingID :  "+this.smeetingid;
	}
}
