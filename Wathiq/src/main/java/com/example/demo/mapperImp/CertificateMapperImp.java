package com.example.demo.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.mapper.CertificateMapper;
import com.example.demo.model.Certificate;

public class CertificateMapperImp implements CertificateMapper {

	private ModelMapper modelMapper;

	public CertificateMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public Certificate dtoToDomain(CertificateDTO certificate) {
		return modelMapper.map(certificate,Certificate.class );
	}

	@Override
	public CertificateDTO domainToDto(Certificate certificate) {
		return modelMapper.map(certificate,CertificateDTO.class );
	}


}
