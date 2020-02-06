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
@Table(name = "course")
@Getter
@Setter
public class Course implements Serializable {


	private static final long serialVersionUID = -3009157732242241606L;



	@Id
	@Column(name = "courseID")
	private String courseID;

	
	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "nationalID", nullable= false, unique= true)
	private Individual nationalID;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "companyRefrence", nullable= false)
	private Company companyRefrence;

	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "eduInstitutionID", nullable= false)
	private EduInstitution eduInstitutionID;

	@NotNull
	@Column(name = "nameCourse")
	private String nameCourse;

	@Column(name = "addedBy")
	private String addedBy;

	@Column(name = "nameInstittion")
	private String nameInstittion;

	@Column(name = "courseAttach")
	private String courseAttach;

	@Column(name = "startDate")
	private Timestamp startDate;

	@Column(name = "endDate")
	private Timestamp endDate;


	@Builder
	public Course(String courseID, Individual nationalID, Company companyRefrence, EduInstitution eduInstitutionID,
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

	public Course() {
	}


}
