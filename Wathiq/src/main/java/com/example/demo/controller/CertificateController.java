package com.example.demo.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.model.EduInstitution;
import com.example.demo.model.Individual;
import com.example.demo.service.CertificateService;

@RestController
public class CertificateController {


	@Autowired
	CertificateService certificateService;
	Individual individual=new Individual("1095653645");
	EduInstitution eduInstitution =new EduInstitution("11","11","11");
	CertificateDTO certificateDTO=new CertificateDTO("11",individual, eduInstitution,
			eduInstitution, eduInstitution, "11", Timestamp.valueOf("2070-11-12 01:02:03.123456789"), 0.0,
			"11", "11");

	@RequestMapping("/insertCertificate")
	public String process(){
		certificateService.createCertificateDTO(certificateDTO);

		return "Done";

	}


	@RequestMapping("/findCertificate")
	public String findCertificateDTO() {
		try {
			certificateService.findById("");
			return "Found";
		}catch(Exception e){
			return e.getMessage();
		}

	}
}
