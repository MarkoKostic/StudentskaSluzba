package service.interfaces;

import java.util.List;

import dto.TownDTO;

public interface ITownService {
	
	public boolean addTown(TownDTO townDTO);
	
	public List<TownDTO> listTowns();
	
	public TownDTO findTownById(int id);
	
	public TownDTO listTownsUniversities(int id);
	
	public boolean removeTown(int id);
	
	public TownDTO updateTown(int id, TownDTO townDTO);

}
