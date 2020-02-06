package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.EduInstitutionDTO;
import com.example.demo.mapper.EduInstitutionMapper;
import com.example.demo.model.EduInstitution;

public class EduInstitutionMapperImp implements EduInstitutionMapper{


	private ModelMapper modelMapper;

	public EduInstitutionMapperImp() {
		modelMapper = new ModelMapper();
	}
	@Override
	public EduInstitution dtoToDomain(EduInstitutionDTO eduInstitution) {
		return modelMapper.map(eduInstitution,EduInstitution.class );

	}

	@Override
	public EduInstitutionDTO domainToDto(EduInstitution eduInstitution) {
		return modelMapper.map(eduInstitution,EduInstitutionDTO.class );

	}


}
