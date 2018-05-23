package dto;

import java.util.List;

import model.Town;

public class TownDTO {
	
	private int townId;
	private int postalCode;
	private String townName;
	private List<UniversityDTO> universityDTO;
	
	public TownDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TownDTO(Town town) {
		setTownId(town.getTownId());
		setPostalCode(town.getPostalCode());
		setTownName(town.getTownName());
		//setUniversityDTO(town.getUniversities().stream().map(x -> new UniversityDTO(x)).collect(Collectors.toList()));
	}
	
	public TownDTO(int townId, int postalCode, String townName) {
		super();
		this.townId = townId;
		this.postalCode = postalCode;
		this.townName = townName;
	}

	public TownDTO(int townId, int postalCode, String townName, List<UniversityDTO> universityDTO) {
		super();
		this.townId = townId;
		this.postalCode = postalCode;
		this.townName = townName;
		this.universityDTO = universityDTO;
	}

	public int getTownId() {
		return townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public List<UniversityDTO> getUniversityDTO() {
		return universityDTO;
	}

	public void setUniversityDTO(List<UniversityDTO> universityDTO) {
		this.universityDTO = universityDTO;
	}

	@Override
	public String toString() {
		return "TownDTO [townId=" + townId + ", postalCode=" + postalCode + ", townName=" + townName
				+ ", universityDTO=" + universityDTO + "]";
	}
	
}
