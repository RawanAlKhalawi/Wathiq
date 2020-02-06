package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.model.Company;
import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecommendationDTO {


	private Individual nationalID;
	private Company companyRefrence;
	private EduInstitution eduInstitutionID;
	private String recommendationFrom;
	private Timestamp recommendationDate;
	private String recommendationAddBy;
	private String recommendationAttach;

	public RecommendationDTO(Individual nationalID, Company companyRefrence, EduInstitution eduInstitutionID,
			String recommendationFrom, Timestamp recommendationDate, String recommendationAddBy,
			String recommendationAttach) {
		this.nationalID = nationalID;
		this.companyRefrence = companyRefrence;
		this.eduInstitutionID = eduInstitutionID;
		this.recommendationFrom = recommendationFrom;
		this.recommendationDate = recommendationDate;
		this.recommendationAddBy = recommendationAddBy;
		this.recommendationAttach = recommendationAttach;
	}


	public RecommendationDTO() {
	}




}
