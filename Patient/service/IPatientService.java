package com.nissan.service;

import java.util.List;

import com.nissan.model.Patient;

public interface IPatientService {
	//List All Patient
	List<Patient> listAllPatients();
	//get a Single Patient by Name
	Patient searchByPatientName(String _patientName);
	//add patient 
	Patient addPatient(Patient patient);
}
