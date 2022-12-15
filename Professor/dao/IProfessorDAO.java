package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Professor;

public interface IProfessorDAO extends JpaRepositoryImplementation<Professor, Integer> {
	

}
