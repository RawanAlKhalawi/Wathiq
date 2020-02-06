package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.CompanyDTO;
import com.example.demo.mapper.CompanyMapper;
import com.example.demo.model.Company;

public class CompanyMapperImp implements CompanyMapper{

	private ModelMapper modelMapper;

	public CompanyMapperImp() {
		modelMapper=new ModelMapper();
	}


	@Override
	public Company dtoToDomain(CompanyDTO company) {
		return modelMapper.map(company,Company.class );

	}

	@Override
	public CompanyDTO domainToDto(Company company) {
		return modelMapper.map(company,CompanyDTO.class );

	}

}
