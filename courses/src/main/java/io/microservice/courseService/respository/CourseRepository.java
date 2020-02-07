package io.microservice.courseService.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import io.microservice.courseService.Models.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
    