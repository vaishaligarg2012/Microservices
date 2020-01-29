package io.microservcices.Student.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    
	@Id
	private long id;
	private String name;
	private String enrollCourse;
	private String email;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, String enrollCourse, String email) {
		super();
		this.id = id;
		this.name = name;
		this.enrollCourse = enrollCourse;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollCourse() {
		return enrollCourse;
	}
	public void setEnrollCourse(String enrollCourse) {
		this.enrollCourse = enrollCourse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
