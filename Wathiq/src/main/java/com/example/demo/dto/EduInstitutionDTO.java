package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EduInstitutionDTO extends WathiqUserDTO {



	private String eduInstitutionID;
	private String universityName;
	private String universityType;


	public EduInstitutionDTO(String email, String phoneNumber, String address, String password, String eduInstitutionID,
			String universityName, String universityType) {
		super(email, phoneNumber, address, password);
		this.eduInstitutionID = eduInstitutionID;
		this.universityName = universityName;
		this.universityType = universityType;
	}
	public EduInstitutionDTO() {

	}

}
