package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CourseDTO;
import com.example.demo.model.Company;
import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	Individual nationalID=new Individual("p");
	Company companyRefrence=new Company("p");
	EduInstitution eduInstitutionID=new EduInstitution("p");
	CourseDTO courseDTO=new CourseDTO("p",nationalID, companyRefrence,eduInstitutionID, "p", "p","p","p", null, null);

	@RequestMapping("/insertCourse")
	public String process(){
		courseService.createCourseDTO(courseDTO);

		return "Done";

	}



}
