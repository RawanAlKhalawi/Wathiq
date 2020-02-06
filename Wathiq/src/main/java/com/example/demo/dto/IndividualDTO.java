package com.example.demo.dto;

import java.sql.Timestamp;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IndividualDTO extends WathiqUserDTO {
	
	

	private String nationalID;
	private String fName;
	private String mName;
	private String lName;
	private String gender;
	private String status;
	private String skills;
	private Timestamp dateOfBirth;
	private String attachments;

	public IndividualDTO(String email, String phoneNumber, String address, String password, String nationalID,
			String fName, String mName, String lName, String gender, String status, String skills,
			Timestamp dateOfBirth, String attachments) {
		super(email, phoneNumber, address, password);
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

	public IndividualDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

}
