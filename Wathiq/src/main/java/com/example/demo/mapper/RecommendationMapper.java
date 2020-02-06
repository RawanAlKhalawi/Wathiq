package com.example.demo.mapper;

import com.example.demo.dto.RecommendationDTO;
import com.example.demo.model.Recommendation;

public interface RecommendationMapper {

	Recommendation dtoToDomain(final RecommendationDTO recommendation );
	RecommendationDTO domainToDto(final Recommendation recommendation );


}
