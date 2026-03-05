package org.raoamigos.springboot3.repository;

import org.raoamigos.springboot3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getStudentById(Long id);
}
