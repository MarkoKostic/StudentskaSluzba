package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the university database table.
 * 
 */
@Entity
@NamedQuery(name="University.findAll", query="SELECT u FROM University u")
public class University implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="univeristy_id")
	private int univeristyId;

	private String name;

	@Column(name="short_name")
	private String shortName;

	//bi-directional many-to-many association to Professor
	@ManyToMany(mappedBy="universities")
	private List<Professor> professors;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="university")
	private List<Student> students;

	//bi-directional many-to-one association to Town
	@ManyToOne
	@JoinColumn(name="town_id")
	private Town town;

	public University() {
	}

	public int getUniveristyId() {
		return this.univeristyId;
	}

	public void setUniveristyId(int univeristyId) {
		this.univeristyId = univeristyId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public List<Professor> getProfessors() {
		return this.professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setUniversity(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setUniversity(null);

		return student;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

}