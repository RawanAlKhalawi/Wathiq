package com.example.demo.controller;


import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.IndividualDTO;
import com.example.demo.repository.IndividualRepository;
import com.example.demo.service.IndividualService;



@RestController

public class IndividualController {

	@Autowired
	IndividualRepository individualRepository;
	@Autowired
	IndividualService individualService;
	IndividualDTO individual=new IndividualDTO("rawan5563@gmail.com","0551264317","9565773","6756537","1095653645","63557", "6735", "657", "6537", "6537", "93579", Timestamp.valueOf("2070-11-12 01:02:03.123456789"),"5799");


	@RequestMapping("/insertIndividual")
	public IndividualDTO getDomain() {

		return individualService.createIndividualDTO(this.individual);

	}

	@RequestMapping("/findIndividual")
	public String findIndividualDTO() {
		try {
			individualService.findById("1095653645");
			return "Found";
		}catch(Exception e){
			return e.getMessage();
		}

	}



}
