package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.Professor;

public interface IProfessorService {
	//List of All Professors
	List<Professor> listAllProfessors();

	 //Add a new Professor
	Professor addProfessor(Professor professor);
	
	//find by id
	Optional<Professor> searchById(Integer id);
	
	//Delete an Professor
	void deletProfessorById(Integer id);
	
	Professor updateProfessorById(Professor professor,Integer id);

	

	 
	
	

}
