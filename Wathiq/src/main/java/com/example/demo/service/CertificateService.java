package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.mapperImp.CertificateMapperImp;
import com.example.demo.model.Certificate;
import com.example.demo.repository.CertificateRepository;

@Service

public class CertificateService {

	@Autowired
	private CertificateRepository certificateRepository;

	private static final CertificateMapperImp  certificateMapper=new CertificateMapperImp();

	public CertificateDTO createCertificateDTO(CertificateDTO certificateDTO) {

		

		Certificate certificate=Certificate.builder()
				.certificateID(certificateDTO.getCertificateID())
				.nationalID(certificateDTO.getNationalID())
				.eduInstitutionID(certificateDTO.getEduInstitutionID())
				.universityName(certificateDTO.getUniversityName())
				.universityType(certificateDTO.getUniversityType())
				.addBy(certificateDTO.getAddBy())
				.graduationDate(certificateDTO.getGraduationDate())
				.gpa(certificateDTO.getGpa())
				.degree(certificateDTO.getDegree())
				.major(certificateDTO.getMajor())
				.build();



		Certificate saveCertificate  = certificateRepository.saveAndFlush(certificate);
		return certificateMapper.domainToDto(saveCertificate);




	}
	public CertificateDTO findById(String certificateID) throws Exception {
		return certificateRepository
				.findById(certificateID)
				.map(certificateMapper::domainToDto)
				.orElseThrow(() -> new Exception("CertificateID not found - " + certificateID));

	}


}
