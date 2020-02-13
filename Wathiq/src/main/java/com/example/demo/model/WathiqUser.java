package com.example.demo.model;


import javax.persistence.Column;


import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;




@MappedSuperclass
@Data
@Getter
@Setter
public class WathiqUser {


	@Email
	@Column(name = "email", unique=true)
	private String email;

	@NotNull
	@Column(name = "phoneNumber")
	@Pattern(regexp = "(\\+966|0)[0-9]{9}")
	private String phoneNumber;

	@NotNull
	@Column(name = "address")
	private String address;

	@NotNull
	@Column(name = "password")
	private String password;


	public WathiqUser() {
	}


	public WathiqUser( String email, String phone_number, String address, String password) {
		this.email = email;
		this.phoneNumber = phone_number;
		this.address = address;
		this.password = password;
	}

}