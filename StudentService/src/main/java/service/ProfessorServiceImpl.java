package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ProfessorDTO;
import repository.IProfessorRepository;
import service.interfaces.IProfessorService;

@Service
public class ProfessorServiceImpl implements IProfessorService{
	
	@Autowired
	IProfessorRepository professorRepository;

	@Override
	public List<ProfessorDTO> listProfessors() {
		
		return professorRepository.findAll().stream().map(x -> new ProfessorDTO(x)).collect(Collectors.toList());
	}
	
}
