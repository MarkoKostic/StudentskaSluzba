package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the professor database table.
 * 
 */
@Entity
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="professor_id")
	private int professorId;

	private String seminar;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;

	//bi-directional many-to-many association to University
	@ManyToMany
	@JoinTable(
		name="professor_university"
		, joinColumns={
			@JoinColumn(name="professor_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="university_id")
			}
		)
	private List<University> universities;

	public Professor() {
	}

	public int getProfessorId() {
		return this.professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getSeminar() {
		return this.seminar;
	}

	public void setSeminar(String seminar) {
		this.seminar = seminar;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<University> getUniversities() {
		return this.universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

}