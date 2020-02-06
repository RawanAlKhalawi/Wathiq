package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CertificateDTO {

	
	private String certificateID;
	private Individual nationalID;
	private EduInstitution eduInstitutionID;
	private EduInstitution universityName;
	private EduInstitution universityType;
	private String addBy;
	private Timestamp graduationDate;
	private Double gpa ;
	private String degree;
	private String major;

	public CertificateDTO() {

	}
	public CertificateDTO(String certificateID, Individual nationalID, EduInstitution eduInstitutionID,
			EduInstitution universityName, EduInstitution universityType, String addBy, Timestamp graduationDate,
			Double gpa, String degree, String major) {
		this.certificateID = certificateID;
		this.nationalID = nationalID;
		this.eduInstitutionID = eduInstitutionID;
		this.universityName = universityName;
		this.universityType = universityType;
		this.addBy = addBy;
		this.graduationDate = graduationDate;
		this.gpa = gpa;
		this.degree = degree;
		this.major = major;
	}






}
