package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CompanyDTO;
import com.example.demo.mapperImp.CompanyMapperImp;
import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyService {


	@Autowired
	private CompanyRepository companyRepository;
	private static final CompanyMapperImp companyMapper =new CompanyMapperImp() ;



	public CompanyDTO createCompanyDTO(CompanyDTO companyDTO) {

		Company company = Company.builder()
				.email(companyDTO.getEmail())
				.phone_number(companyDTO.getPhoneNumber())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.companyRefrence(companyDTO.getCompanyRefrence())
				.companyName(companyDTO.getCompanyName())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())

				.build();


		Company saveCompany = companyRepository.save(company);
		return companyMapper.domainToDto(saveCompany);

	}

	public CompanyDTO findById(String companyRefrence) throws Exception {
		return companyRepository
				.findById(companyRefrence)
				.map(companyMapper::domainToDto)
				.orElseThrow(() -> new Exception("CompanyRefrence not found - " + companyRefrence));

	}

}