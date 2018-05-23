package dto;

import model.University;

public class UniversityDTO {
	
	private int universityId;
	private String name;
	private String shortName;
	private TownDTO townDTO;
	
	
	public UniversityDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UniversityDTO(University university) {
		setUniversityId(university.getUniveristyId());
		setName(university.getName());
		setShortName(university.getShortName());
		setTownDTO(new TownDTO(university.getTown().getTownId(), university.getTown().getPostalCode(), university.getTown().getTownName()));
	}

	public UniversityDTO(int universityId, String name, String shortName, TownDTO townDTO) {
		super();
		this.universityId = universityId;
		this.name = name;
		this.shortName = shortName;
		this.townDTO = townDTO;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public TownDTO getTownDTO() {
		return townDTO;
	}

	public void setTownDTO(TownDTO townDTO) {
		this.townDTO = townDTO;
	}

	@Override
	public String toString() {
		return "UniversityDTO [universityId=" + universityId + ", name=" + name + ", shortName=" + shortName
				+ ", townDTO=" + townDTO + "]";
	}
	
}
