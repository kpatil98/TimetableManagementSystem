package com.komal.TimetableManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.komal.TimetableManagementSystem.dao.StudentRepo;
import com.komal.TimetableManagementSystem.entity.Student;

@Controller
public class StudentController {
	@Autowired
	StudentRepo st;
	
	/*
	 * @RequestMapping("/") public String show() { return "index.jsp"; }
	 */
	
	@RequestMapping("/addstudent")
	@ResponseBody
	public String addstudent(Student s)
	{	try {
		st.save(s);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Student Added...";
	}
	
	@RequestMapping("/viewstudent")
	@ResponseBody
	public String viewstudent(int sid)
	{
		
		Student s = st.findById(sid).orElse(new Student());
		return s.toString();
	}

	
	  @RequestMapping("/viewallstudent")
	  
	  @ResponseBody public String viewallstudent()
	  { 
		  List<Student> l = (List<Student>)
	  st.findAll(); 
		  return l.toString();
	  }
	
	@RequestMapping("/updatestudent")
	@ResponseBody
	public String updatestudent(Student s)
	{	try {
		st.save(s);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Student Updated...";
	}
	
	@RequestMapping("/deletestudent")
	@ResponseBody
	public String deletestudent(int sid)
	{	try {
			st.deleteById(sid);
	}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Student Deleted";
	}
}
