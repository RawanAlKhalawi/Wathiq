package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "individual")
@Getter
@Setter
public class Individual extends WathiqUser implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "nationalID", unique=true)
	private String nationalID;

	@NotNull
	@Column(name = "fName")
	private String fName;

	@NotNull
	@Column(name = "mName")
	private String mName;

	@NotNull
	@Column(name = "lName")
	private String lName;

	@NotNull
	@Column(name = "gender")
	private String gender;

	@Column(name = "status")
	private String status;

	@Column(name = "skills")
	private String skills;

	@NotNull
	@Column(name = "dateOfBirth")
	private Timestamp dateOfBirth;

	@Column(name = "attachments")
	private String attachments;

	public Individual() {
	}
	
	public Individual(String nationalID) {
		this.nationalID = nationalID;

	}
    
	@Builder
	public Individual(String email, String phone_number, String address, String password, String nationalID,
			String fName, String mName, String lName, String gender, String status, String skills, Timestamp dateOfBirth,
			String attachments) {
		super(email, phone_number, address, password);
		this.nationalID = nationalID;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.dateOfBirth = dateOfBirth;
		this.attachments = attachments;
	}

	
}