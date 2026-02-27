package com.Hospital.Management.System.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Management.System.converter.entity.PatientModeltoEntityConverter;
import com.Hospital.Management.System.converter.model.PatientEntitytoModelConverter;
import com.Hospital.Management.System.entity.Patient;
import com.Hospital.Management.System.model.request.PatientSignupRequestModel;
import com.Hospital.Management.System.model.response.PatientResponseModel;
import com.Hospital.Management.System.repo.PatientRepo;


@Service
public class PatientService {
	
	@Autowired
	private PatientRepo patientrepo;
	@Autowired

	private PatientModeltoEntityConverter patientModeltoEntityConverter;
	@Autowired

	private PatientEntitytoModelConverter patientEntitytoModelConverter;

	public PatientResponseModel signup(PatientSignupRequestModel signupRequestModel) {
		Patient patient = patientModeltoEntityConverter.getSaveConvert(signupRequestModel)
;		
		Patient savedPatient = patientrepo.save(patient);
		return patientEntitytoModelConverter.getfindById(savedPatient);
		
	}

}
