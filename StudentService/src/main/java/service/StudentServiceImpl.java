package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.StudentDTO;
import model.Person;
import model.Student;
import model.Town;
import repository.IStudentRepository;
import service.interfaces.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public List<StudentDTO> listStudents() {
		
		return studentRepository.findAll().stream().map(x -> new StudentDTO(x)).collect(Collectors.toList());
	}

	@Override
	public boolean addStudent(StudentDTO studentDTO) {
		
		Student student;
		
		if(studentDTO.getStudentId() == 0) {
			student = new Student();
			student.setStudentId(studentDTO.getStudentId());
			student.setHobby(studentDTO.getHobby());
			student.setSport(studentDTO.getSport());
			student.setPerson(new Person(studentDTO.getPersonDTO().getPersonId(), 
					studentDTO.getPersonDTO().getBirthDate(),
					studentDTO.getPersonDTO().getFirstName(),
					studentDTO.getPersonDTO().getGender(),
					studentDTO.getPersonDTO().getLastName(),
					studentDTO.getPersonDTO().getPassword(),
					studentDTO.getPersonDTO().getUsername(),
					new Town(studentDTO.getPersonDTO().getTownDTO().getTownId(), 
							studentDTO.getPersonDTO().getTownDTO().getPostalCode(),
							studentDTO.getPersonDTO().getTownDTO().getTownName())));
		} else {
			
			student = studentRepository.findById(studentDTO.getStudentId()).orElse(null);
			student.setHobby(studentDTO.getHobby());
			student.setSport(studentDTO.getSport());
		}
		studentRepository.save(student);
		return true;
	}

}
