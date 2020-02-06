package com.example.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company")
@Getter
@Setter
public class Company extends WathiqUser implements Serializable  {

	private static final long serialVersionUID = -3009157732242241606L;


	@Id
	@NotNull
	@Column(name = "companyRefrence")
	private String companyRefrence;
	
	@NotNull
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "startDate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;


	public Company() {
	}
	public Company(String companyRefrence) {
		this.companyRefrence = companyRefrence;

	}


	@Builder
	public Company(String email, String phone_number, String address, String password, String companyRefrence,
			String companyName, Timestamp startDate, Timestamp endDate) {
		super(email, phone_number, address, password);
		this.companyRefrence = companyRefrence;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
	}







}