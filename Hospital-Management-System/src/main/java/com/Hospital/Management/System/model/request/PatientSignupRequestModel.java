package com.Hospital.Management.System.model.request;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PatientSignupRequestModel {

	private String firstName;
	private String lastName;
    private String gender;
	private int age;
	private Date dob;
	private String mobileNumber;
	private String address;
	private String bloodGroup;
	private LocalDateTime registrationDate;
	
}
