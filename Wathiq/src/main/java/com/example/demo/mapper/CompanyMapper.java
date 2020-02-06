package com.example.demo.mapper;

import com.example.demo.dto.CompanyDTO;
import com.example.demo.model.Company;

public interface CompanyMapper {

	Company dtoToDomain(final CompanyDTO company );
	CompanyDTO domainToDto(final Company company );

}
