package com.Hospital.Management.System.converter.model;

import org.springframework.stereotype.Component;


import com.Hospital.Management.System.entity.Patient;
import com.Hospital.Management.System.model.response.PatientResponseModel;
@Component
public class PatientEntitytoModelConverter {

	
	public PatientResponseModel getfindById(Patient patient) {
		
		PatientResponseModel patientResponseModel = new PatientResponseModel();
		patientResponseModel.setId(patient.getId());
		patientResponseModel.setFirstName(patient.getFirstName());
		patientResponseModel.setLastName(patient.getLastName());
		patientResponseModel.setAddress(patient.getAddress());
		patientResponseModel.setAge(patient.getAge());
		patientResponseModel.setBloodGroup(patient.getBloodGroup());
		patientResponseModel.setMobileNumber(patient.getMobileNumber());
		patientResponseModel.setRegistrationDate(patient.getRagistrationDate());
		patientResponseModel.setGender(patient.getGender());
		patientResponseModel.setDob(patient.getDob());
		return patientResponseModel;
	}
}
