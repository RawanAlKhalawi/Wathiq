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
	IndividualDTO individual=new IndividualDTO("rawan2@gmail.com","0551024317","9565773","6756537","1090623645","63557", "6735", "657", "6537", "6537", "93579", Timestamp.valueOf("2020-11-12 01:02:03.123456789"),"5799");


	@RequestMapping("/insertIndividual")
	public IndividualDTO getDomain() {

		return individualService.createIndividualDTO(this.individual);

	}

	@RequestMapping("/findIndividual")
	public String findIndividualDTO() {
		try {
			individualService.findById("1090623645");
			return "Found";
		}catch(Exception e){
			return e.getMessage();
		}

	}

	@RequestMapping("/deleteIndividual")
	public String deleteIndividual()throws Exception {
			individualService.deleteIndividual("1090623645");
			return "Deleted";
	
	}


	@RequestMapping("/updateIndividual")
	public IndividualDTO updateIndividual() throws Exception {
		return individualService.updateAddressIndividualDTO("1095653645","258");

	}



	@RequestMapping("/findIndividualDTO")

	public String FindbyID() throws Exception{

		individualService.getById("1090653645");

		return "Find IndividualDTO";

	}




}
