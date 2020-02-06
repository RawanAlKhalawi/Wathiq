package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.mapper.LanguageMapper;
import com.example.demo.model.Language;

public class LanguageMapperImp implements LanguageMapper{


	private ModelMapper modelMapper;

	public LanguageMapperImp() {
		modelMapper = new ModelMapper();
	}
	@Override
	public Language dtoToDomain(LanguageDTO language) {
		return modelMapper.map(language,Language.class );

	}

	@Override
	public LanguageDTO domainToDto(Language language) {
		return modelMapper.map(language,LanguageDTO.class );

	}

}
