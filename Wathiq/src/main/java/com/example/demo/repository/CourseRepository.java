package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

@Repository
@Transactional
public interface CourseRepository extends CrudRepository<Course, String>{

	@Modifying
	@Query("UPDATE Course course SET course.nameCourse = :nameCourse WHERE course.courseID = :courseID")
	void updateNameCourse(@Param("courseID") String courseID, @Param("nameCourse") String nameCourse);
	
	@Modifying
	@Query("UPDATE Course course SET course.nameInstittion = :nameInstittion WHERE course.courseID = :courseID")
	void updateNameInstittion(@Param("courseID") String courseID, @Param("nameInstittion") String nameInstittion);
	
	@Modifying
	@Query("UPDATE Course course SET course.courseAttach = :courseAttach WHERE course.courseID = :courseID")
	void updateCourseAttach(@Param("courseID") String courseID, @Param("courseAttach") String courseAttach);
	
	@Modifying
	@Query("UPDATE Course course SET course.startDate = :startDate WHERE course.courseID = :courseID")
	void updateStartDate(@Param("courseID") String courseID, @Param("startDate") String startDate);
	
	@Modifying
	@Query("UPDATE Course course SET course.endDate = :endDate WHERE course.courseID = :courseID")
	void updateEndDate(@Param("courseID") String courseID, @Param("endDate") String endDate);


}
