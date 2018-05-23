package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Town;

public interface ITownRepository extends JpaRepository<Town, Integer>{

}
