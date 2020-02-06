package com.example.demo.mapper;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.model.Language;

public interface LanguageMapper {

	Language dtoToDomain(final LanguageDTO language );
	LanguageDTO domainToDto(final Language language );

}
