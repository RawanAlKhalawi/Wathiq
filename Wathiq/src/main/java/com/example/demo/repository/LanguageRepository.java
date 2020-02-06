package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Language;

@Repository
@Transactional
public interface LanguageRepository extends CrudRepository<Language, Long>{

	@Modifying
	@Query("UPDATE Language language SET language.langugeName = :langugeName WHERE language.languge_id = :languge_id")
	void updateLangugeName(@Param("languge_id") String languge_id, @Param("langugeName") String langugeName);

	@Modifying
	@Query("UPDATE Language language SET language.langugeDate = :langugeDate WHERE language.languge_id = :languge_id")
	void updateLangugeDate(@Param("languge_id") String languge_id, @Param("langugeDate") String langugeDate);

	@Modifying
	@Query("UPDATE Language language SET language.langugeRefrenceNo = :langugeRefrenceNo WHERE language.languge_id = :languge_id")
	void updateLangugeRefrenceNo(@Param("languge_id") String languge_id, @Param("langugeRefrenceNo") String langugeRefrenceNo);

	@Modifying
	@Query("UPDATE Language language SET language.durationValid = :durationValid WHERE language.languge_id = :languge_id")
	void updateDurationValid(@Param("languge_id") String languge_id, @Param("durationValid") String durationValid);

	@Modifying
	@Query("UPDATE Language language SET language.langugeAttach = :langugeAttach WHERE language.languge_id = :languge_id")
	void updateLangugeAttach(@Param("languge_id") String languge_id, @Param("langugeAttach") String langugeAttach);


}



