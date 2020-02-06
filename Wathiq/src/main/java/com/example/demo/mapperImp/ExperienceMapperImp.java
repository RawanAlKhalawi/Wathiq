package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.ExperienceDTO;
import com.example.demo.mapper.ExperienceMapper;
import com.example.demo.model.Experience;

public class ExperienceMapperImp implements ExperienceMapper{

	private ModelMapper modelMapper;

	public ExperienceMapperImp() {
		modelMapper = new ModelMapper();
	}


	@Override
	public Experience dtoToDomain(ExperienceDTO experience) {
		return modelMapper.map(experience,Experience.class );

	}

	@Override
	public ExperienceDTO domainToDto(Experience experience) {
		return modelMapper.map(experience,ExperienceDTO.class );

	}

}
