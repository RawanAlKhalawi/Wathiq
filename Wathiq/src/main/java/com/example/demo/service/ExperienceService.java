package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ExperienceDTO;
import com.example.demo.mapperImp.ExperienceMapperImp;
import com.example.demo.model.Experience;
import com.example.demo.repository.ExperienceRepository;
@Service
public class ExperienceService {
	@Autowired
	ExperienceRepository experienceRepository;

	private static final ExperienceMapperImp experienceMapper = new ExperienceMapperImp();



	public ExperienceDTO createExperienceDTO(ExperienceDTO experienceDTO) {

		Experience experience = Experience.builder()
				.nationalID(experienceDTO.getNationalID())
				.companyRefrence(experienceDTO.getCompanyRefrence())
				.eduInstitutionID(experienceDTO.getEduInstitutionID())
				.companyName(experienceDTO.getCompanyName())
				.experiencePosition(experienceDTO.getExperiencePosition())
				.startDate(experienceDTO.getStartDate())
				.endDate(experienceDTO.getEndDate())
				.addBy(experienceDTO.getAddBy())
				.refrenceName(experienceDTO.getRefrenceName())
				.refrenceEmail(experienceDTO.getRefrenceEmail())

				.build();


		Experience saveExperience = experienceRepository.save(experience);
		return experienceMapper.domainToDto(saveExperience);

	}

	public ExperienceDTO findById(long experienceID) throws Exception {
		return experienceRepository
				.findById(experienceID)
				.map(experienceMapper::domainToDto)
				.orElseThrow(() -> new Exception("ExperienceID not found - " + experienceID));

	}
}