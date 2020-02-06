package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.mapperImp.LanguageMapperImp;
import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;

@Service

public class LanguageService {
	@Autowired
	private LanguageRepository languageRepository;
	private static final LanguageMapperImp languageMapper =new LanguageMapperImp() ;



	public LanguageDTO createLanguageDTO(LanguageDTO languageDTO) {

		Language language = Language.builder()
				.nationalID(languageDTO.getNationalID())
				.langugeName(languageDTO.getLangugeName())
				.addBy(languageDTO.getAddBy())
				.langugeDate(languageDTO.getLangugeDate())
				.langugeRefrenceNo(languageDTO.getLangugeRefrenceNo())
				.durationValid(languageDTO.getDurationValid())
				.langugeAttach(languageDTO.getLangugeAttach())  
				.build();


		Language saveIndividual = languageRepository.save(language);
		return languageMapper.domainToDto(saveIndividual);

	}
	public LanguageDTO findById(long languge_id) throws Exception {
		return languageRepository
				.findById(languge_id)
				.map(languageMapper::domainToDto)
				.orElseThrow(() -> new Exception("Languge_id not found - " + languge_id));

	}

}