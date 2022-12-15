package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPatientDAO;

import com.nissan.model.Patient;
@Service
public class IPatientServiceImplementation implements IPatientService {
	@Autowired
	IPatientDAO patientDAO;


	@Override
	public Patient searchByPatientName(String _patientName) {
		Patient patient = patientDAO.searchByPatientName(_patientName);
		return patient;
	}

	@Override
	public List<Patient> listAllPatients() {
		// TODO Auto-generated method stub
		return patientDAO.findAll();
	}

	@Override
	@Transactional
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub return employeeDAO.save(employee); 
		return patientDAO.save(patient);
	}

}
