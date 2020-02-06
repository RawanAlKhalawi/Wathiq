package com.example.demo.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Individual;


@Repository
@Transactional
public interface IndividualRepository extends CrudRepository<Individual, String> 
{ 


	@Modifying
	@Query("UPDATE Individual individual SET individual.status = :status WHERE individual.nationalID = :nationalID")
	void updateStatus(@Param("nationalID") String nationalID, @Param("status") String status);

	@Modifying
	@Query("UPDATE Individual individual SET individual.skills = :skills WHERE individual.nationalID = :nationalID")
	void updateSkills(@Param("nationalID") String nationalID, @Param("skills") String skills);

	@Modifying
	@Query("UPDATE Individual individual SET individual.attachments = :attachments WHERE individual.nationalID = :nationalID")
	void updateAttachments(@Param("nationalID") String nationalID, @Param("attachments") String attachments);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.email = :email WHERE individual.nationalID = :nationalID")
	void updateEemail(@Param("nationalID") String nationalID, @Param("email") String email);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.phoneNumber = :phoneNumber WHERE individual.nationalID = :nationalID")
	void updatePhoneNumberl(@Param("nationalID") String nationalID, @Param("phoneNumber") String phoneNumber);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.address = :address WHERE individual.nationalID = :nationalID")
	void updateAddress(@Param("nationalID") String nationalID, @Param("address") String address);
	
	@Modifying
	@Query("UPDATE Individual individual SET individual.password = :password WHERE individual.nationalID = :nationalID")
	void updatePassword(@Param("nationalID") String nationalID, @Param("password") String password);
	
	

	



}