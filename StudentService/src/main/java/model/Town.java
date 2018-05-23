package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the town database table.
 * 
 */
@Entity
@NamedQuery(name="Town.findAll", query="SELECT t FROM Town t")
public class Town implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="town_id")
	private int townId;

	@Column(name="postal_code")
	private int postalCode;

	@Column(name="town_name")
	private String townName;

	//bi-directional many-to-one association to Person
	@OneToMany(mappedBy="town")
	private List<Person> persons;

	//bi-directional many-to-one association to University
	@OneToMany(mappedBy="town")
	private List<University> universities;

	public Town() {
	}

	public Town(int townId, int postalCode, String townName) {
		this.townId = townId;
		this.postalCode = postalCode;
		this.townName = townName;
	}
	
	public int getTownId() {
		return this.townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getTownName() {
		return this.townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person addPerson(Person person) {
		getPersons().add(person);
		person.setTown(this);

		return person;
	}

	public Person removePerson(Person person) {
		getPersons().remove(person);
		person.setTown(null);

		return person;
	}

	public List<University> getUniversities() {
		return this.universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

	public University addUniversity(University university) {
		getUniversities().add(university);
		university.setTown(this);

		return university;
	}

	public University removeUniversity(University university) {
		getUniversities().remove(university);
		university.setTown(null);

		return university;
	}

}