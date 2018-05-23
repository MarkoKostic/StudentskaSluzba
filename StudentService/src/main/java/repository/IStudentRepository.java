package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
