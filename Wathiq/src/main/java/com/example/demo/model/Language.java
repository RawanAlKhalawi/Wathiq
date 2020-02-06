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
@Table(name = "language")
@Getter
@Setter
public class Language implements Serializable  {
	private static final long serialVersionUID = -3009157732242241606L;

	
	@ManyToOne(fetch = FetchType.LAZY, optional= false, cascade = CascadeType.ALL)
	@JoinColumn(name= "nationalID", nullable= false, unique= true)
	private Individual nationalID;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long languge_id;

	@NotNull
	@Column(name = "langugeName")
	private String langugeName;

	@Column(name = "addBy")
	private String addBy;

	@Column(name = "langugeDate")
	private Timestamp langugeDate;

	@Column(name = "langugeRefrenceNo")
	private long langugeRefrenceNo;

	@Column(name = "durationValid")
	private String durationValid;

	@Column(name = "langugeAttach")
	private String langugeAttach;

	public Language() {
	}

	@Builder
	public Language(Individual nationalID, String langugeName, String addBy, Timestamp langugeDate,
			long langugeRefrenceNo, String durationValid, String langugeAttach) {
		this.nationalID = nationalID;
		this.langugeName = langugeName;
		this.addBy = addBy;
		this.langugeDate = langugeDate;
		this.langugeRefrenceNo = langugeRefrenceNo;
		this.durationValid = durationValid;
		this.langugeAttach = langugeAttach;
	}






}