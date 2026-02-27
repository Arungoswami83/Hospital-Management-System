package com.Hospital.Management.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hospital.Management.System.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient ,Long> {
	

}
