package com.example.demo.controller;

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
	Individual individual=new Individual("1");
	EduInstitution eduInstitution =new EduInstitution("1","1","1");
	CertificateDTO certificateDTO=new CertificateDTO("1",individual, eduInstitution,
			eduInstitution, eduInstitution, "1", null, 0.0,
			"1", "1");

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
