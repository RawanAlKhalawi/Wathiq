package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.IndividualDTO;
import com.example.demo.mapperImp.IndividualMapperImp;
import com.example.demo.model.Individual;
import com.example.demo.repository.IndividualRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class IndividualService {
	@Autowired
	IndividualRepository individualRepository;
	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();

	public IndividualDTO createIndividualDTO(IndividualDTO individualDTO) {

		Individual individual = Individual.builder()
				.email(individualDTO.getEmail())
				.phone_number(individualDTO.getPhoneNumber())
				.address(individualDTO.getAddress())
				.password(individualDTO.getPassword())
				.nationalID(individualDTO.getNationalID())
				.fName(individualDTO.getFName())
				.mName(individualDTO.getMName())
				.lName(individualDTO.getLName())
				.gender(individualDTO.getGender())
				.status(individualDTO.getStatus())
				.skills(individualDTO.getSkills())
				.dateOfBirth(individualDTO.getDateOfBirth())
				.attachments(individualDTO.getAttachments())
				.build();


		Individual saveIndividual = individualRepository.save(individual);
		return individualMapper.domainToDto(saveIndividual);

	}

	public IndividualDTO findById(String nationalID) throws Exception {
		return individualRepository
				.findById(nationalID)
				.map(individualMapper::domainToDto)
				.orElseThrow(() -> new Exception("NationalID not found - " + nationalID));

	}




	//
	//	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();
	//
	//	private List<IndividualDTO> individual= new ArrayList<>(Arrays.asList(
	//			new IndividualDTO("s","s","s","s","s","s", "s", "s", "s", "s", "s", Timestamp.valueOf("2018-11-12 01:02:03.123456789"),"s"),
	//			new IndividualDTO("t","t","t","t","t","t", "t", "t", "t", "t", "t", Timestamp.valueOf("2019-11-12 01:02:03.123456789"),"t")
	//
	//			));
	//
	//	public List<IndividualDTO> allIndividualDTO(){
	//		return individual;
	//	}
	//
	//	public boolean save(IndividualDTO individual) {
	//		return this.individual.add(individual);
	//	}
	//	
	//	public IndividualDTO findall(IndividualDTO individual) {
	//		return this.individual.(individual);
	//	}
	//	
	//	public IndividualDTO toDto(Individual individual) {
	//		return individualMapper.domainToDto(individual);
	//		
	//	}
	//	public IndividualDTO getById(String id) {
	//		for(IndividualDTO individualDTO: individual ) {
	//		if(individualDTO.getNationalID()== id)
	//			return individualDTO;
	//		}
	//		return null;
	//	}
	//	
	//	public Individual toDomain(IndividualDTO individual) {
	//		return individualMapper1.dtoToDomain(individual);
	//		
	//	}



}
