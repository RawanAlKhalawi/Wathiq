package com.example.demo.mapper;




import com.example.demo.dto.IndividualDTO;
import com.example.demo.model.Individual;



public interface IndividualMapper {


	Individual dtoToDomain(final IndividualDTO individual );

	IndividualDTO domainToDto(final Individual individual );





}
