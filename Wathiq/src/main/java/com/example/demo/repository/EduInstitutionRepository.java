package com.example.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EduInstitution;
@Repository
@Transactional
public interface EduInstitutionRepository extends CrudRepository<EduInstitution, String>
{ 
	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.universityName = :universityName WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updateUniversityName(@Param("eduInstitutionID") String eduInstitutionID, @Param("universityName") String universityName);


	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.universityType = :universityType WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updateUniversityType(@Param("eduInstitutionID") String eduInstitutionID, @Param("universityType") String universityType);
	

	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.email = :email WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updateEmail(@Param("eduInstitutionID") String eduInstitutionID, @Param("email") String email);
	

	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.phoneNumber = :phoneNumber WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updatePhoneNumber(@Param("eduInstitutionID") String eduInstitutionID, @Param("phoneNumber") String phoneNumber);

	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET eduInstitution.address = :address WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updateAddress(@Param("eduInstitutionID") String eduInstitutionID, @Param("address") String address);

	@Modifying
	@Query("UPDATE EduInstitution eduInstitution SET password.password = :password WHERE eduInstitution.eduInstitutionID = :eduInstitutionID")
	void updatePassword(@Param("eduInstitutionID") String eduInstitutionID, @Param("password") String password);





}