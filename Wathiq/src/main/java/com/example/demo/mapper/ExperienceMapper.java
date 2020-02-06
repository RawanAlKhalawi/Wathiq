package com.example.demo.mapper;

import com.example.demo.dto.ExperienceDTO;
import com.example.demo.model.Experience;

public interface ExperienceMapper {

	Experience dtoToDomain(final ExperienceDTO experience );
	ExperienceDTO domainToDto(final Experience experience );
}
