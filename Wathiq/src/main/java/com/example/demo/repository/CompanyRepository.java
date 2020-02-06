package com.example.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, String>
{ 
	@Modifying
	@Query("UPDATE Company company SET company.startDate = :startDate WHERE company.companyRefrence = :companyRefrence")
	void updateStartDate(@Param("companyRefrence") String companyRefrence, @Param("startDate") String startDate);

	@Modifying
	@Query("UPDATE Company company SET company.endDate = :endDate WHERE company.companyRefrence = :companyRefrence")
	void updateEndDate(@Param("companyRefrence") String companyRefrence, @Param("endDate") String endDate);
	
	@Modifying
	@Query("UPDATE Company company SET company.email = :email WHERE company.companyRefrence = :companyRefrence")
	void updateEmail(@Param("companyRefrence") String companyRefrence, @Param("email") String email);
	
	@Modifying
	@Query("UPDATE Company company SET company.phoneNumber = :phoneNumber WHERE company.companyRefrence = :companyRefrence")
	void updatePhoneNumber(@Param("companyRefrence") String companyRefrence, @Param("phoneNumber") String phoneNumber);

	
	@Modifying
	@Query("UPDATE Company company SET company.address = :address WHERE company.companyRefrence = :companyRefrence")
	void updateAddress(@Param("companyRefrence") String companyRefrence, @Param("address") String address);
	
	@Modifying
	@Query("UPDATE Company company SET company.password = :password WHERE company.companyRefrence = :companyRefrence")
	void updatePassword(@Param("companyRefrence") String companyRefrence, @Param("password") String password);





}