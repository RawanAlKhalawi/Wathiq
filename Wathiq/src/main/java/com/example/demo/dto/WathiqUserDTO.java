package com.example.demo.dto;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class WathiqUserDTO {



	private String email;

	private String phoneNumber;

	private String address;

	private String password;

	public WathiqUserDTO() {
		
	}



}


