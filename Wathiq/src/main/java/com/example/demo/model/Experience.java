package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "experience")
@Getter
@Setter
public class Experience implements Serializable {


	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long experienceID;
	

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "nationalID", nullable= false, unique= true)
	private Individual nationalID;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "companyRefrence", nullable= false)
	private Company companyRefrence;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "eduInstitutionID", nullable= false)
	private EduInstitution eduInstitutionID;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "companyName", nullable= false)
	private Company companyName;

	@NotNull
	@Column(name = "experiencePosition")
	private String experiencePosition;

	@Column(name = "startDate")
	private Timestamp startDate;

	@Column(name = "endDate")
	private Timestamp endDate;

	@Column(name = "addBy")
	private String addBy;

	@Column(name = "refrenceName")
	private String refrenceName;

	@Email
	@Column(name = "refrenceEmail")
	private String refrenceEmail;


	public  Experience() {
	}


	@Builder

	public Experience(long experienceID, Individual nationalID, Company companyRefrence,
			EduInstitution eduInstitutionID, Company companyName, String experiencePosition, Timestamp startDate,
			Timestamp endDate, String addBy, String refrenceName, String refrenceEmail) {
		this.experienceID = experienceID;
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