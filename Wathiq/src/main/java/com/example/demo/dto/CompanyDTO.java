package com.example.demo.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO extends WathiqUserDTO{


	private String companyRefrence;
	private String companyName;
	private Timestamp startDate;
	private Timestamp endDate;

	public CompanyDTO(String email, String phoneNumber, String address, String password, String companyRefrence,
			String companyName, Timestamp startDate, Timestamp endDate) {
		super(email, phoneNumber, address, password);
		this.companyRefrence = companyRefrence;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public CompanyDTO() {

	}


}
