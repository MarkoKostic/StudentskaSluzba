package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Professor;

public interface IProfessorRepository extends JpaRepository<Professor, Integer>{

}
