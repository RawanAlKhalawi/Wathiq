package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RecommendationDTO;
import com.example.demo.mapperImp.RecommendationMapperImp;
import com.example.demo.model.Recommendation;
import com.example.demo.repository.RecommendationRepository;

@Service

public class RecommendationService {
	@Autowired
	RecommendationRepository recommendationRepository;
	private static final RecommendationMapperImp recommendationMapper = new RecommendationMapperImp();

	public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
		Recommendation recommendation = Recommendation.builder()
				.nationalID(recommendationDTO.getNationalID())
				.companyRefrence(recommendationDTO.getCompanyRefrence())
				.eduInstitutionID(recommendationDTO.getEduInstitutionID())
				.recommendationFrom(recommendationDTO.getRecommendationFrom())
				.recommendationDate(recommendationDTO.getRecommendationDate())
				.recommendationAddBy(recommendationDTO.getRecommendationAddBy())
				.recommendationAttach(recommendationDTO.getRecommendationAttach())
				.build();


		Recommendation saveRecommendation = recommendationRepository.save(recommendation);
		return recommendationMapper.domainToDto(saveRecommendation);
	}
	public RecommendationDTO findById(long recommendationId) throws Exception {
		return recommendationRepository
				.findById(recommendationId)
				.map(recommendationMapper::domainToDto)
				.orElseThrow(() -> new Exception("RecommendationId not found - " + recommendationId));

	}

}
