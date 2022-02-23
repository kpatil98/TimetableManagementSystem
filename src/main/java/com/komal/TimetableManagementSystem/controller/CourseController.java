package com.komal.TimetableManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.komal.TimetableManagementSystem.dao.CourseRepo;
import com.komal.TimetableManagementSystem.entity.Course;

@Controller
public class CourseController {
	@Autowired
	CourseRepo cr;
	
	
	  @RequestMapping("/") public String show() { return "index.jsp"; }
	 
	@RequestMapping("/addcourse")
	@ResponseBody
	public String addcourse(Course c)
	{	try {
		cr.save(c);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Course Added...";
	}

	@RequestMapping("/viewcourse")
	@ResponseBody
	public String viewcourse(int cid)
	{
		
		Course c = cr.findById(cid).orElse(new Course());
		return c.toString();
	}

	
	  @RequestMapping("/viewallcourse")
	  
	  @ResponseBody 
	  public String viewallcourse() 
	  { 
		  List<Course> l = (List<Course>)
	  cr.findAll(); 
		  return l.toString(); 
	  }
	
	@RequestMapping("/updatecourse")
	@ResponseBody
	public String updatecourse(Course c)
	{	try {
		cr.save(c);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Course Updated...";
	}
	
	@RequestMapping("/deletecourse")
	@ResponseBody
	public String deletecourse(int cid)
	{	try {
			cr.deleteById(cid);
	}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Course Deleted";
	}

}
