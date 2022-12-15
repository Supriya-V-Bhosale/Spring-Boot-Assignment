package com.nissan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.service.IProfessorService;

@RestController
@RequestMapping("api/")
public class ProfessorController<Professor>{
	@Autowired
	IProfessorService professorService;
	
	@GetMapping("professors")
	public List<com.nissan.model.Professor> getAllProfessor() {
		return professorService.listAllProfessors();

	}
	
	@PostMapping("professors")
	public com.nissan.model.Professor inserprofessors(@RequestBody com.nissan.model.Professor professor) {
		// TODO Auto-generated method stub
		return professorService.addProfessor(professor);
	}
	
	@GetMapping("professors/{id}")
	public Optional<Professor> search(@PathVariable Integer id) {
		
		return (Optional<Professor>) professorService.searchById(id);
	}
	
	@DeleteMapping("professors/{id}")
	public void deletById(@PathVariable Integer id) {
		
		professorService.deletProfessorById(id);
	}
	
	@PutMapping("professors/{id}")
	public Professor inserprofessorsById(@RequestBody com.nissan.model.Professor professor,Integer id) {
		// TODO Auto-generated method stub
		return (Professor) professorService.updateProfessorById(professor, id);
	}

}
