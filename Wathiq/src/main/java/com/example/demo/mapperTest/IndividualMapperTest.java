package com.example.demo.mapperTest;

import org.junit.Assert;
import org.junit.Test;

import com.example.demo.dto.IndividualDTO;
import com.example.demo.mapperImp.IndividualMapperImp;
import com.example.demo.model.Individual;



public class IndividualMapperTest {

	private static final IndividualMapperImp individualMapper = new IndividualMapperImp();


	@Test
	public void IndividualMapper_domainToDto() {
		final IndividualDTO source =new IndividualDTO();

		source.setNationalID("W");
		source.setFName("W");
		source.setMName("W");
		source.setLName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkills("W");
		source.setDateOfBirth(null);
		source.setAttachments("W");

		final Individual target = individualMapper.dtoToDomain(source);

		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getNationalID());
		Assert.assertEquals("W", target.getFName());
		Assert.assertEquals("W", target.getMName());
		Assert.assertEquals("W", target.getLName());
		Assert.assertEquals("W", target.getGender());
		Assert.assertEquals("W", target.getStatus());
		Assert.assertEquals("W", target.getSkills());
		Assert.assertEquals(null, target.getDateOfBirth());
		Assert.assertEquals("W", target.getAttachments());




	}


	@Test
	public void IndividualMapper_dtoToDomain() {
		final Individual source =new Individual();
		source.setNationalID("W");
		source.setFName("W");
		source.setMName("W");
		source.setLName("W");
		source.setGender("W");
		source.setStatus("W");
		source.setSkills("W");
		source.setDateOfBirth(null);
		source.setAttachments("W");

		final IndividualDTO target = individualMapper.domainToDto(source);

		Assert.assertNotNull(target);
		Assert.assertEquals("W", target.getNationalID());
		Assert.assertEquals("W", target.getFName());
		Assert.assertEquals("W", target.getMName());
		Assert.assertEquals("W", target.getLName());
		Assert.assertEquals("W", target.getGender());
		Assert.assertEquals("W", target.getStatus());
		Assert.assertEquals("W", target.getSkills());
		Assert.assertEquals(null, target.getDateOfBirth());
		Assert.assertEquals("W", target.getAttachments());



	}



}
