package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.model.Company;
import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDTO {


	private Individual nationalID;
	private Company companyRefrence;
	private EduInstitution eduInstitutionID;
	private Company companyName;
	private String experiencePosition;
	private Timestamp startDate;
	private Timestamp endDate;
	private String addBy;
	private String refrenceName;
	private String refrenceEmail;

	public ExperienceDTO() {
	}


	public ExperienceDTO(Individual nationalID, Company companyRefrence, EduInstitution eduInstitutionID,
			Company companyName, String experiencePosition, Timestamp startDate, Timestamp endDate, String addBy,
			String refrenceName, String refrenceEmail) {
		super();
		this.nationalID = nationalID;
		this.companyRefrence = companyRefrence;
		this.eduInstitutionID = eduInstitutionID;
		this.companyName = companyName;
		this.experiencePosition = experiencePosition;
		this.startDate = startDate;
		this.endDate = endDate;
		this.addBy = addBy;
		this.refrenceName = refrenceName;
		this.refrenceEmail = refrenceEmail;
	}





}
