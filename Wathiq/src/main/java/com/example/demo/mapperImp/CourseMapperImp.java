package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.CourseDTO;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.model.Course;

public class CourseMapperImp implements CourseMapper{


	private ModelMapper modelMapper;

	public CourseMapperImp() {
		modelMapper = new ModelMapper();
	}
	@Override
	public Course dtoToDomain(CourseDTO course) {
		return modelMapper.map(course,Course.class );

	}

	@Override
	public CourseDTO domainToDto(Course course) {
		return modelMapper.map(course,CourseDTO.class );

	}


}
