package io.microservcices.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.microservcices.Student.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
