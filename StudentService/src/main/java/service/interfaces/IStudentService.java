package service.interfaces;

import java.util.List;

import dto.StudentDTO;

public interface IStudentService {

	public List<StudentDTO> listStudents();
	
	public boolean addStudent(StudentDTO studentDTO);
	
}
