package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EduInstitutionDTO;
import com.example.demo.mapperImp.EduInstitutionMapperImp;
import com.example.demo.model.EduInstitution;
import com.example.demo.repository.EduInstitutionRepository;

@Service
public class EduInstitutionService {
	@Autowired
	EduInstitutionRepository eduInstitutionRepository;

	private static final EduInstitutionMapperImp eduInstitutionMapper =new EduInstitutionMapperImp() ;



	public EduInstitutionDTO createEducationDTO(EduInstitutionDTO eduInstitutionDTO) {

		EduInstitution eduInstitution = EduInstitution.builder()
				.email(eduInstitutionDTO.getEmail())
				.phone_number(eduInstitutionDTO.getPhoneNumber())
				.address(eduInstitutionDTO.getAddress())
				.password(eduInstitutionDTO.getPassword())
				.eduInstitutionID(eduInstitutionDTO.getEduInstitutionID())
				.universityName(eduInstitutionDTO.getUniversityName())
				.universityType(eduInstitutionDTO.getUniversityType())

				.build();


		EduInstitution saveEducation = eduInstitutionRepository.save(eduInstitution);
		return eduInstitutionMapper.domainToDto(saveEducation);

	}

	public EduInstitutionDTO findById(String eduInstitutionID) throws Exception {
		return eduInstitutionRepository
				.findById(eduInstitutionID)
				.map(eduInstitutionMapper::domainToDto)
				.orElseThrow(() -> new Exception("EduInstitutionID not found - " + eduInstitutionID));

	}
}
