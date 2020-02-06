package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageDTO {


	private Individual nationalID;
	private String langugeName;
	private String addBy;
	private Timestamp langugeDate;
	private long langugeRefrenceNo;
	private String durationValid;
	private String langugeAttach;



	public LanguageDTO(Individual nationalID, String langugeName, String addBy, Timestamp langugeDate,
			long langugeRefrenceNo, String durationValid, String langugeAttach) {
		super();
		this.nationalID = nationalID;
		this.langugeName = langugeName;
		this.addBy = addBy;
		this.langugeDate = langugeDate;
		this.langugeRefrenceNo = langugeRefrenceNo;
		this.durationValid = durationValid;
		this.langugeAttach = langugeAttach;
	}

	public LanguageDTO() {
	}


}
