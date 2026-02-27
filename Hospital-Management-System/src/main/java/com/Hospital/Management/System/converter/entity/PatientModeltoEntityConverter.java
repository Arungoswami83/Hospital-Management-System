package com.Hospital.Management.System.converter.entity;

import org.springframework.stereotype.Component;

import com.Hospital.Management.System.entity.Patient;
import com.Hospital.Management.System.model.request.PatientSignupRequestModel;

@Component
public class PatientModeltoEntityConverter {

	public Patient getSaveConvert(PatientSignupRequestModel patientSignupRequestModel) {
		
	
   Patient patient = new Patient();
   patient.setFirstName(patientSignupRequestModel.getFirstName());
   patient.setLastName(patientSignupRequestModel.getLastName());
   patient.setAddress(patientSignupRequestModel.getAddress());
   patient.setAge(patientSignupRequestModel.getAge());
   patient.setBloodGroup(patientSignupRequestModel.getBloodGroup());
   patient.setDob(patientSignupRequestModel.getDob());
   patient.setMobileNumber(patientSignupRequestModel.getMobileNumber());
   patient.setGender(patientSignupRequestModel.getGender());
   
   return patient;
	}
}
