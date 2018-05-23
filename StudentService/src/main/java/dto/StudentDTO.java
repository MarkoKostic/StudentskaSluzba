package dto;

import model.Student;

public class StudentDTO {
	
private int studentId;
	
	private String hobby;
	private String sport;
	private PersonDTO personDTO;
	private SubjectDTO subjectDTO;
	private TestDTO testDTO;
	private UniversityDTO universityDTO;
	
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDTO(Student student) {
		setPersonDTO(new PersonDTO(student.getPerson()));
		setSubjectDTO(new SubjectDTO(student.getSubject()));
		setTestDTO(new TestDTO(student.getTest()));
		setUniversityDTO(new UniversityDTO(student.getUniversity()));
		setStudentId(student.getStudentId());
		setHobby(student.getHobby());
		setSport(student.getSport());
	}

	public StudentDTO(int studentId, String hobby, String sport, PersonDTO personDTO, SubjectDTO subjectDTO,
			TestDTO testDTO, UniversityDTO universityDTO) {
		super();
		this.studentId = studentId;
		this.hobby = hobby;
		this.sport = sport;
		this.personDTO = personDTO;
		this.subjectDTO = subjectDTO;
		this.testDTO = testDTO;
		this.universityDTO = universityDTO;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public PersonDTO getPersonDTO() {
		return personDTO;
	}

	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}

	public SubjectDTO getSubjectDTO() {
		return subjectDTO;
	}

	public void setSubjectDTO(SubjectDTO subjectDTO) {
		this.subjectDTO = subjectDTO;
	}

	public TestDTO getTestDTO() {
		return testDTO;
	}

	public void setTestDTO(TestDTO testDTO) {
		this.testDTO = testDTO;
	}

	public UniversityDTO getUniversityDTO() {
		return universityDTO;
	}

	public void setUniversityDTO(UniversityDTO universityDTO) {
		this.universityDTO = universityDTO;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", hobby=" + hobby + ", sport=" + sport + ", personDTO="
				+ personDTO + ", subjectDTO=" + subjectDTO + ", testDTO=" + testDTO + ", universityDTO=" + universityDTO
				+ "]";
	}
	
}
