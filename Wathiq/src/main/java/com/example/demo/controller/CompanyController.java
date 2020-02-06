package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class CompanyController {
	
	
	@Autowired
	CompanyRepository companyRepository;
	
    @RequestMapping("/insertCompany")
    
    
    public String process(){
	companyRepository.save(new Company("","","","","CR","",null,null));
    	
		return "Done";
		
	}

}
