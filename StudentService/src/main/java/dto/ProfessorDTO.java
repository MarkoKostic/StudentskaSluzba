package dto;

import model.Professor;

public class ProfessorDTO {

	private int professorId;
	private String seminar;
	private PersonDTO personDTO;
	
	
	public ProfessorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessorDTO(Professor professor) {
		setProfessorId(professor.getProfessorId());
		setSeminar(professor.getSeminar());
		setPersonDTO(new PersonDTO(professor.getPerson()));
	}
	
	public ProfessorDTO(int professorId, String seminar, PersonDTO personDTO) {
		super();
		this.professorId = professorId;
		this.seminar = seminar;
		this.personDTO = personDTO;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getSeminar() {
		return seminar;
	}

	public void setSeminar(String seminar) {
		this.seminar = seminar;
	}

	public PersonDTO getPersonDTO() {
		return personDTO;
	}

	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}

	@Override
	public String toString() {
		return "ProfessorDTO [professorId=" + professorId + ", seminar=" + seminar + ", personDTO=" + personDTO + "]";
	}
	
}
