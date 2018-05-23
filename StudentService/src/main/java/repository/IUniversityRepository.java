package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.University;

public interface IUniversityRepository extends JpaRepository<University, Integer>{

}
