package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.TownDTO;
import dto.UniversityDTO;
import model.Town;
import repository.ITownRepository;
import service.interfaces.ITownService;

@Service
public class TownServiceImpl implements ITownService{
	
	@Autowired
	ITownRepository townRepository;

	@Override
	public boolean addTown(TownDTO townDTO) {
		
		Town town;
		if(townDTO.getTownId() == 0) {
			town = new Town();
			town.setTownId(townDTO.getTownId());
			town.setPostalCode(townDTO.getPostalCode());
			town.setTownName(townDTO.getTownName());
		} else {
			town = townRepository.findById(townDTO.getTownId()).orElse(null);
			town.setPostalCode(townDTO.getPostalCode());
			town.setTownName(townDTO.getTownName());
		}
		townRepository.save(town);
		return true;
	}

	@Override
	public List<TownDTO> listTowns() {
		
		return townRepository.findAll().stream().map(x -> new TownDTO(x)).collect(Collectors.toList());
	}

	@Override
	public TownDTO findTownById(int id) {
		
		Town town = townRepository.findById(id).orElse(null);
		return new TownDTO(town);
	}

	@Override
	public TownDTO listTownsUniversities(int id) {
		
		Town town = townRepository.findById(id).orElse(null);
		TownDTO townDTO = new TownDTO(town);
		townDTO.setUniversityDTO(town.getUniversities().stream().map(x -> new UniversityDTO(x)).collect(Collectors.toList()));
		
		return townDTO;
	}

	@Override
	public boolean removeTown(int id) {
		
		townRepository.deleteById(id);
		return true;
	}

	@Override
	public TownDTO updateTown(int id, TownDTO townDTO) {
		
		Town town = townRepository.findById(id).orElse(null);
		town.setTownName(townDTO.getTownName());
		town.setPostalCode(townDTO.getPostalCode());
		townRepository.save(town);
		
		return townDTO;
	}
	
}
