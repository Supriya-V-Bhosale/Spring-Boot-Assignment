package com.nissan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nissan.dao.IProfessorDAO;
import com.nissan.model.Professor;
@Service
public class ProfesssorServiceimplementation implements IProfessorService {
	@Autowired
	IProfessorDAO professorDAO;
	
	@Override
	
	public List<Professor> listAllProfessors() {
		// TODO Auto-generated method stub
		return professorDAO.findAll();
	}

	@Override
	@Transactional
	public Professor addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return professorDAO.save(professor);
	}
	
	
	@Override
	public Optional<Professor> searchById(Integer id) {
		
		Optional<Professor>  professor=professorDAO.findById(id);
		Professor p=professor.get();
		 if(p!=null) {
			 return professor;
		 }
		 else
		 {
			 return null;
		 }
	}

	@Override
	public void deletProfessorById(Integer id) {
		// TODO Auto-generated method stub
		professorDAO.deleteById(id);

	}

	@Override
	public Professor updateProfessorById(Professor professor, Integer id) {
		// TODO Auto-generated method stub
		return professorDAO.save(professor);
	}

}
