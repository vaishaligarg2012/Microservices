package io.microservice.courseService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.microservice.courseService.Models.Courses;
import io.microservice.courseService.respository.CourseRepository;

@RestController
public class CoursesManage {
             
	         @Autowired
             CourseRepository courseRepository;
	       
             
             @PostMapping("/addCourses")
             public Courses addCourses(@RequestBody Courses course) {
            	 System.out.println("I am here "+course.getCourseId());
            	 Courses added = courseRepository.save(course);
            	 return added;
             }
             
             @GetMapping("/getAllCourses")
             public List<Courses> getAllCourse() {
            	 return courseRepository.findAll();
            	 
            	 
             }
             
             @GetMapping("/getCourseById/{id}")
             public Courses getCourseById(@PathVariable long id) {
            	 Optional<Courses> course = courseRepository.findById(id);
            	 
            	 course.ifPresent(user -> {
            		    System.out.println("Course's name = " + user.getCourseName());    
            		});
               Courses course1= course.get();
            	 return course1;
             }
	 
}
