package io.microservices.Tutor.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutor {
    
	@Id
	private long tutorId;
	private int courseId;
	
	private String area;
	private boolean available;
	

	public Tutor(long tutorId, int courseId, String area, boolean available) {
	
		this.tutorId = tutorId;
		this.courseId = courseId;
		this.area = area;
		this.available = available;
	}
	public long getTutorId() {
		return tutorId;
	}
	public void setTutorId(long tutorId) {
		this.tutorId = tutorId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", courseId=" + courseId + ", area=" + area + ", available=" + available
				+ "]";
	}
	
	
}
