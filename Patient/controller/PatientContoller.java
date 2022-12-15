package com.nissan.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nissan.model.Patient;
import com.nissan.service.IPatientService;

@RestController
@RequestMapping("api/")
public class PatientContoller {
	@Autowired
	IPatientService patientService;

	
	@GetMapping("patients")
	public List<Patient> getAllPatients() {
		return patientService.listAllPatients();

	}
	
	@GetMapping("patients/{_patientName}")
	public Patient getEmployeeByPhoneNumber(@PathVariable String _patientName) {
		return patientService.searchByPatientName(_patientName);
	}
	
	@PostMapping("patients")
	public Patient insertEmployee(@RequestBody Patient patient) {
		// TODO Auto-generated method stub
		return patientService.addPatient(patient);
	}
	

}
