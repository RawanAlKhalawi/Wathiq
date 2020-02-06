package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.mapperImp.CourseMapperImp;
import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
@Service

public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	private static final CourseMapperImp courseMapper =new CourseMapperImp() ;



	public CourseDTO createCourseDTO(CourseDTO courseDTO) {

		Course course = Course.builder()
				.courseID(courseDTO.getCourseID())
				.nationalID(courseDTO.getNationalID())
				.companyRefrence(courseDTO.getCompanyRefrence())
				.eduInstitutionID(courseDTO.getEduInstitutionID())
				.nameCourse(courseDTO.getNameCourse())
				.addedBy(courseDTO.getAddedBy())
				.nameInstittion(courseDTO.getNameInstittion())
				.courseAttach(courseDTO.getCourseAttach())
				.startDate(courseDTO.getStartDate())
				.endDate(courseDTO.getEndDate())

				.build();


		Course saveCourse = courseRepository.save(course);
		return courseMapper.domainToDto(saveCourse);

	}

	public CourseDTO findById(String courseID) throws Exception {
		return courseRepository
				.findById(courseID)
				.map(courseMapper::domainToDto)
				.orElseThrow(() -> new Exception("CourseID not found - " + courseID));

	}
}
