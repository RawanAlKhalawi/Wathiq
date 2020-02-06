package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EduInstitution;
import com.example.demo.repository.EduInstitutionRepository;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class EduInstitutionController {
	
	
	@Autowired
	EduInstitutionRepository eduInstitutionRepository;
	
    @RequestMapping("/insertEdu")
    
    
    public String process(){
		eduInstitutionRepository.save(new EduInstitution("","","","","ID","",""));

		return "Done";
		
	}

}
