package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.model.Company;
import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CourseDTO {



	private String courseID;
	private Individual nationalID;
	private Company companyRefrence;
	private EduInstitution eduInstitutionID;
	private String nameCourse;
	private String addedBy;
	private String nameInstittion;
	private String courseAttach;
	private Timestamp startDate;
	private Timestamp endDate;


	public CourseDTO() {
	}

	public CourseDTO(String courseID, Individual nationalID, Company companyRefrence, EduInstitution eduInstitutionID,
			String nameCourse, String addedBy, String nameInstittion, String courseAttach, Timestamp startDate,
			Timestamp endDate) {
		super();
		this.courseID = courseID;
		this.nationalID = nationalID;
		this.companyRefrence = companyRefrence;
		this.eduInstitutionID = eduInstitutionID;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.nameInstittion = nameInstittion;
		this.courseAttach = courseAttach;
		this.startDate = startDate;
		this.endDate = endDate;
	}




}
