package io.microservcices.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.microservcices.Student.Model.Student;
import io.microservcices.Student.Repository.StudentRepository;

@RestController
public class StudentController {

	   @Autowired
	   StudentRepository studentRepository;
	   
	   @PostMapping("/addStudent")
	   public Student createStudent(@RequestBody Student student) {
		   
		   return studentRepository.save(student);
		   
	   }
	   
	   @GetMapping("/getAllStudent")
	   public List<Student> getAllStudent(){
		return   studentRepository.findAll();
	   }
	   
	   
}
