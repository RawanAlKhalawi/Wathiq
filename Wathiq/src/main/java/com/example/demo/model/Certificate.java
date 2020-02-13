package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "certificate")
@Getter
@Setter
public class Certificate implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;



	@Id
	@Column(name = "certificateID")
	private String certificateID;


	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "nationalID", nullable= false, unique= true)
	private Individual nationalID;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "eduInstitutionID", nullable= false, unique= true)
	private EduInstitution eduInstitutionID;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "universityName", nullable= false)
	private EduInstitution universityName;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "universityType", nullable= false)
	private EduInstitution universityType;

	@NotNull
	@Column(name = "addBy")
	private String addBy;

	@NotNull
	@Column(name = "graduationDate")
	private Timestamp graduationDate;

	@NotNull
	@Column(name = "gpa")
	private Double gpa ;
	
	@NotNull
	@Column(name = "degree")
	private String degree;
	
	@NotNull
	@Column(name = "major")
	private String major;

	public Certificate() {
	}

	@Builder

	public Certificate(String certificateID, Individual nationalID, EduInstitution eduInstitutionID,
			EduInstitution universityName, EduInstitution universityType, String addBy, Timestamp graduationDate, Double gpa,
			String degree, String major) {

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