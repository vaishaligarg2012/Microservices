package io.microservices.Tutor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.Tutor.Model.Tutor;
import io.microservices.Tutor.Repository.TutorRepository;

@RestController
public class TutorController { 

	   @Autowired 
	   TutorRepository tutorRepository;
	   
	   @PostMapping("/addTutor")
	   public Tutor createTutor(@RequestBody Tutor tutor) {
		    System.out.print("Hey"); 
		   return tutorRepository.save(tutor);
		   
	   } 
	   
	   @GetMapping("/getAllTutors")
	   public List<Tutor> getAllTutors(){
		return   tutorRepository.findAll();
	   }
	   
	   
}
