package io.microservcices.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.microservcices.Student.Model.Courses;
import io.microservcices.Student.Model.Student;
import io.microservcices.Student.Repository.StudentRepository;

@RestController
public class StudentController {

	   @Autowired
	  private StudentRepository studentRepository;
	   
	   @Autowired
	   private   RestTemplate restTemplate;
	   
	   @PostMapping("/addStudent")
	   public Student createStudent(@RequestBody Student student) {
		   
		   return studentRepository.save(student);
		   
	   }
	   
	   @GetMapping("/getAllStudent")
	   public List<Student> getAllStudent(){
		   int id=1;
		  Courses course= restTemplate.getForObject("http://localhost:8081/getCourseById/"+id, Courses.class);
		  System.out.println(course.getCourseName());
		return   studentRepository.findAll();
	   }
	   
	   
} 
