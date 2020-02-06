package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Certificate;

@Repository
@Transactional
public interface CertificateRepository extends CrudRepository<Certificate, String>{
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.graduationDate = :graduationDate WHERE certificate.certificateID = :certificateID")
	void updateGraduationDate(@Param("certificateID") String certificateID, @Param("graduationDate") String graduationDate);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.gpa = :gpa WHERE certificate.certificateID = :certificateID")
	void updateGpa(@Param("certificateID") String certificateID, @Param("gpa") String gpa);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.degree = :degree WHERE certificate.certificateID = :certificateID")
	void updateDegree(@Param("certificateID") String certificateID, @Param("degree") String degree);
	
	@Modifying
	@Query("UPDATE Certificate certificate SET certificate.major = :major WHERE certificate.certificateID = :certificateID")
	void updateMajor(@Param("certificateID") String certificateID, @Param("major") String major);




}
