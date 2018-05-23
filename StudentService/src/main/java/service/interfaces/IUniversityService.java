package service.interfaces;

import java.util.List;

import dto.UniversityDTO;

public interface IUniversityService {
	
	public List<UniversityDTO> listUniversities();
	
	public boolean addUniversity(UniversityDTO universityDTO);

}
