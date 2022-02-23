package com.komal.TimetableManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.komal.TimetableManagementSystem.dao.FacultyRepo;
import com.komal.TimetableManagementSystem.entity.Faculty;
@Controller
public class FacultyController {
	@Autowired
	FacultyRepo fr;

	/*
	 * @RequestMapping("/") public String show() { return "index.jsp"; }
	 */
	
	@RequestMapping("/addfaculty")
	@ResponseBody
	public String addfaculty(Faculty f)
	{	try {
		fr.save(f);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Faculty Added...";
	}
	
	@RequestMapping("/viewfaculty")
	@ResponseBody
	public String viewfaculty(int fid)
	{
		
		Faculty f = fr.findById(fid).orElse(new Faculty());
		return f.toString();
	}

	
	  @RequestMapping("/viewallfaculty")
	  @ResponseBody 
	  public String viewallfaculty() { 
		  List<Faculty> l = (List<Faculty>)
	  fr.findAll(); return l.toString(); }

	@RequestMapping("/updatefaculty")
	@ResponseBody
	public String updatefaculty(Faculty f)
	{	try {
		fr.save(f);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Faculty Updated...";
	}
	
	@RequestMapping("/deletefaculty")
	@ResponseBody
	public String deletefaculty(int fid)
	{	try {
			fr.deleteById(fid);
	}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return "Faculty Deleted";
	}

}
