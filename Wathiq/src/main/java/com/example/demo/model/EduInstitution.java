package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "eduInstitution")
@Getter
@Setter
public class EduInstitution extends WathiqUser implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "eduInstitutionID")
	private String eduInstitutionID;

	@Column(name = "universityName")
	private String universityName;


	@Column(name = "universityType")
	private String universityType;

	public EduInstitution() {
	}


	public EduInstitution(String eduInstitutionID) {
		this.eduInstitutionID = eduInstitutionID;

	}
	public EduInstitution(String eduInstitutionID, String universityName, String universityType) {
		this.eduInstitutionID = eduInstitutionID;
		this.universityName = universityName;
		this.universityType = universityType;
	}
	@Builder
	public EduInstitution(String email, String phone_number, String address, String password, String eduInstitutionID,
			String universityName, String universityType) {
		super(email, phone_number, address, password);
		this.eduInstitutionID = eduInstitutionID;
		this.universityName = universityName;
		this.universityType = universityType;
	}



}