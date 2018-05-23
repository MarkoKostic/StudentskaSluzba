package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.ProfessorDTO;
import dto.StudentDTO;
import dto.TownDTO;
import dto.UniversityDTO;
import service.interfaces.IProfessorService;
import service.interfaces.IStudentService;
import service.interfaces.ITownService;
import service.interfaces.IUniversityService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/service")
public class RestController {
	
	@Autowired
	IStudentService studentService;
	
	@Autowired
	IProfessorService professorService;
	
	@Autowired
	ITownService townService;
	
	@Autowired
	IUniversityService universityService;
	
	
	@RequestMapping("/students")
	public List<StudentDTO> listStudents() {
		
		return studentService.listStudents();
	}
	
	@RequestMapping("/towns")
	public List<TownDTO> listTowns() {
		
		return townService.listTowns();
	}
	
	@RequestMapping("/towns/{id}")
	public TownDTO findTown(@PathVariable("id") int id) {
		
		return townService.findTownById(id);
	}
	
	@RequestMapping("/towns/{id}/universities")
	public TownDTO listTownsUniversities(@PathVariable("id") int id) {
		
		return townService.listTownsUniversities(id);
	}
	
	@RequestMapping(path = "/towns/add", method = RequestMethod.POST)
	public TownDTO addTown(@RequestBody TownDTO townDTO) {
		
		townService.addTown(townDTO);
		return townDTO;
	}
	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public boolean deleteTown(@PathVariable("id") int id) {
		
		townService.removeTown(id);
		return true;
	}
	
	@RequestMapping(path = "/towns/update/{id}", method = RequestMethod.POST)
	public TownDTO updateTown(@PathVariable("id") int id, @RequestBody TownDTO townDTO) {
		townService.updateTown(id, townDTO);
		return townDTO;
	}
	
	@RequestMapping("/professors")
	public List<ProfessorDTO> listProfessors(){
		return professorService.listProfessors();
	}
	
	@RequestMapping("/universities")
	public List<UniversityDTO> listUniversities(){
		
		return universityService.listUniversities();
	}
	
	@RequestMapping(path = "/universities/add", method = RequestMethod.POST)
	public UniversityDTO addUniversity(@RequestBody UniversityDTO universityDTO) {
		universityService.addUniversity(universityDTO);
		
		return universityDTO;
	}

}
