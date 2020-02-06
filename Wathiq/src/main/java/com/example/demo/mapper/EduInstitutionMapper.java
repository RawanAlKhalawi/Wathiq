package com.example.demo.mapper;

import com.example.demo.dto.EduInstitutionDTO;
import com.example.demo.model.EduInstitution;

public interface EduInstitutionMapper {
	
	EduInstitution dtoToDomain(final EduInstitutionDTO eduInstitution );
	EduInstitutionDTO domainToDto(final EduInstitution eduInstitution );

}
