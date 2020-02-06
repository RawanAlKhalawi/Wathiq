package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.RecommendationDTO;
import com.example.demo.mapper.RecommendationMapper;
import com.example.demo.model.Recommendation;

public class RecommendationMapperImp implements RecommendationMapper{

	private ModelMapper modelMapper;

	public RecommendationMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Recommendation dtoToDomain(RecommendationDTO recommendation) {
		return modelMapper.map(recommendation,Recommendation.class );

	}

	@Override
	public RecommendationDTO domainToDto(Recommendation recommendation) {
		return modelMapper.map(recommendation,RecommendationDTO.class );

	}

}
