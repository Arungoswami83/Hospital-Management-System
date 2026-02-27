package com.Hospital.Management.System.model.response;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;
@Data
public class PatientResponseModel {
	private int id;
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
