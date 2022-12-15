package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Patient;
@Repository
public interface IPatientDAO extends JpaRepositoryImplementation<Patient, Integer> {
	//custom methods ---JPQL ---HQL
	
		@Query("from Patient where patientName=?1")
		public default Patient  searchByPatientName(String _patientName) {
			return null;
		
		}

}
