package com.Hospital.Management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;

import com.Hospital.Management.System.model.request.PatientSignupRequestModel;
import com.Hospital.Management.System.model.response.PatientResponseModel;
import com.Hospital.Management.System.response.RestResponse;
import com.Hospital.Management.System.service.PatientService;


@RestController
@RequestMapping("/patient")

public class PatientController {
	@Autowired
	private PatientService patientService;
//	 @RequestMapping(method = RequestMethod.POST, value = "/signup", consumes = "application/json", produces = "application/json")
//	    public RestResponse signup(@RequestBody UserSignupRequestModel signupRequestModel) {
//
//	        LOGGER.info("Saving user data with email: {}", signupRequestModel.getEmail());
//	        try {
//	            UserResponseModel responseModel = userService.signup(signupRequestModel);
//	            return RestResponse.build().withSuccess("User created successfully", responseModel);
//	        } catch (Exception e) {
//	            LOGGER.error("Failed to save user due to: {}", e.getMessage(), e);
//	            return RestResponse.build().withError(e.getMessage());
//	        }
//	    }
	
	@RequestMapping(method = RequestMethod.POST,value = "/ragisterpatient",consumes = "application/json", produces = "application/json")
    public RestResponse signup(@RequestBody PatientSignupRequestModel patientSignupRequestModel) {

try {
	PatientResponseModel patientResponseModel = patientService.signup(patientSignupRequestModel);
    return RestResponse.build().withSuccess("User created successfully", patientResponseModel);

}
catch (Exception e) {
	return RestResponse.build().withError(e.getMessage());
}

}
}
