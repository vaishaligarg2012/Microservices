package io.microservcices.Student.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Bean;

@Entity
public class Courses {
	    @Id
        private Long courseId;
        private String courseName;
        
        
      
		public Courses() {
		
		}
		public Courses(Long courseId, String courseName) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
		}
		public Long getCourseId() {
			return courseId;
		}
		public void setCourseId(Long courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
       
}
