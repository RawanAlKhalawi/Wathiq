package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CompanyDTO;
import com.example.demo.service.CompanyService;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class CompanyController {
	
	
	@Autowired
	CompanyService companyService;
	CompanyDTO companyDTO=new CompanyDTO("rawankh@gmail.com","0451264317","Riyadh","123","128523","",null,null);
	
    @RequestMapping("/insertCompany")
    
    
    public String process(){
    	companyService.createCompanyDTO(companyDTO);
    	
		return "Done";
		
	}

}
