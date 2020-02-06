package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Experience;

@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, Long>{

	@Modifying
	@Query("UPDATE Experience experience SET experience.experiencePosition = :experiencePosition WHERE experience.experienceID = :experienceID")
	void updateExperiencePosition(@Param("experienceID") String experienceID, @Param("experiencePosition") String experiencePosition);

	@Modifying
	@Query("UPDATE Experience experience SET experience.startDate = :startDate WHERE experience.experienceID = :experienceID")
	void updateStartDate(@Param("experienceID") String experienceID, @Param("startDate") String startDate);

	@Modifying
	@Query("UPDATE Experience experience SET experience.endDate = :endDate WHERE experience.experienceID = :experienceID")
	void updateEndDate(@Param("experienceID") String experienceID, @Param("endDate") String endDate);

	@Modifying
	@Query("UPDATE Experience experience SET experience.refrenceName = :refrenceName WHERE experience.experienceID = :experienceID")
	void updateRefrenceName(@Param("experienceID") String experienceID, @Param("refrenceName") String refrenceName);

	@Modifying
	@Query("UPDATE Experience experience SET experience.refrenceEmail = :refrenceEmail WHERE experience.experienceID = :experienceID")
	void updateRefrenceEmail(@Param("experienceID") String experienceID, @Param("refrenceEmail") String refrenceEmail);






}


