package com.example.demo.mapper;

import com.example.demo.dto.CourseDTO;
import com.example.demo.model.Course;

public interface CourseMapper {
	Course dtoToDomain(final CourseDTO course );
	CourseDTO domainToDto(final Course course );

}
