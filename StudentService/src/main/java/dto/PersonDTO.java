package dto;

import java.util.Date;

import model.Person;

public class PersonDTO {
	
	private int personId;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private String password;
	private String username;
	private TownDTO townDTO;
	
	
	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PersonDTO(Person person) {
		setPersonId(person.getPersonId());
		setBirthDate(person.getBirthDate());
		setFirstName(person.getFirstName());
		setLastName(person.getLastName());
		setGender(person.getGender());
		setUsername(person.getUsername());
		setPassword(person.getPassword());
		setTownDTO(new TownDTO(person.getTown()));
	}

	public PersonDTO(int personId, Date birthDate, String firstName, String lastName, String gender, String password,
			String username, TownDTO townDTO) {
		super();
		this.personId = personId;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.username = username;
		this.townDTO = townDTO;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public TownDTO getTownDTO() {
		return townDTO;
	}

	public void setTownDTO(TownDTO townDTO) {
		this.townDTO = townDTO;
	}

	@Override
	public String toString() {
		return "PersonDTO [personId=" + personId + ", birthDate=" + birthDate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", password=" + password + ", username=" + username
				+ ", townDTO=" + townDTO + "]";
	}
	
}
