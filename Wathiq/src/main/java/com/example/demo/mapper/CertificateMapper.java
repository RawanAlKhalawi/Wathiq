package com.example.demo.mapper;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.model.Certificate;

public interface CertificateMapper {

	Certificate dtoToDomain(final CertificateDTO certificate );
	CertificateDTO domainToDto(final Certificate certificate );

}
