package com.komal.TimetableManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private int fid;
	private String fname; 
	private String fcourse;
	private String fmeetingid;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFcourse() {
		return fcourse;
	}
	public void setFcourse(String fcourse) {
		this.fcourse = fcourse;
	}
	public String getFmeetingid() {
		return fmeetingid;
	}
	public void setFmeetingid(String fmeetingid) {
		this.fmeetingid = fmeetingid;
	}
	
	@Override
	public String toString() 
	{
		return  "FACULTY DETAILS : " + 
				" Faculty ID :  "+this.fid +
				" Faculty Name :  "+this.fname +
				" Faculty Course :  "+this.fcourse +
				" Faculty MeetingID :  "+this.fmeetingid;
	}
}
