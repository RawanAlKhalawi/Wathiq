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
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recommendation")
@Getter
@Setter
public class Recommendation implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long recommendationId;

	
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
	@Column(name = "recommendationFrom")
	private String recommendationFrom;

	@Column(name = "recommendationDate")
	private Timestamp recommendationDate;

	@Column(name = "recommendationAddBy")
	private String recommendationAddBy;

	@Column(name = "recommendationAttach")
	private String recommendationAttach;



	public Recommendation() {
	}
	@Builder
	public Recommendation( Individual nationalID, Company companyRefrence,
			EduInstitution eduInstitutionID, String recommendationFrom, Timestamp recommendationDate, String recommendationAddBy,
			String recommendationAttach) {
		this.nationalID = nationalID;
		this.companyRefrence = companyRefrence;
		this.eduInstitutionID = eduInstitutionID;
		this.recommendationFrom = recommendationFrom;
		this.recommendationDate = recommendationDate;
		this.recommendationAddBy = recommendationAddBy;
		this.recommendationAttach = recommendationAttach;
	}




}