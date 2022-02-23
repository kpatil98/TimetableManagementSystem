package com.komal.TimetableManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private String ctime;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	@Override
	public String toString() 
	{
		return  "COURSE DETAILS : " + 
				" Course ID :  "+this.cid +
				" Course Name :  "+this.cname +
				" Course Time :  "+this.ctime;
	}

}
