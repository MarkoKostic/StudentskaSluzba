package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UniversityDTO;
import model.Town;
import model.University;
import repository.IUniversityRepository;
import service.interfaces.IUniversityService;

@Service
public class UniversityServiceImpl implements IUniversityService{

	@Autowired
	IUniversityRepository universityRepository;
	
	@Override
	public List<UniversityDTO> listUniversities() {
		
		return universityRepository.findAll().stream().map(x -> new UniversityDTO(x)).collect(Collectors.toList());
	}

	@Override
	public boolean addUniversity(UniversityDTO universityDTO) {
		
		University university;
		if(universityDTO.getUniversityId() == 0) {
			university = new University();
			university.setName(universityDTO.getName());
			university.setShortName(universityDTO.getShortName());
			university.setTown(new Town(universityDTO.getTownDTO().getTownId(),universityDTO.getTownDTO().getPostalCode(), universityDTO.getTownDTO().getTownName()));
		} else {
			university = universityRepository.findById(universityDTO.getUniversityId()).orElse(null);
		}
		universityRepository.save(university);
		return true;
	}

}
