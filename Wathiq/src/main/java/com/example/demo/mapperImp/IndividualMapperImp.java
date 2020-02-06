package com.example.demo.mapperImp;



import org.modelmapper.ModelMapper;

import com.example.demo.dto.IndividualDTO;
import com.example.demo.mapper.IndividualMapper;
import com.example.demo.model.Individual;



public class IndividualMapperImp implements IndividualMapper{



	private ModelMapper modelMapper;

	public IndividualMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Individual dtoToDomain(IndividualDTO individual) {
		return modelMapper.map(individual,Individual.class );

	}


	@Override
	public  IndividualDTO domainToDto(Individual individual) {
		return modelMapper.map(individual,IndividualDTO.class );


	}


}
