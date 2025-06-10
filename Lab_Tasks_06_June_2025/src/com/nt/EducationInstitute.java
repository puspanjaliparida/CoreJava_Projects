package com.nt;

public class EducationInstitute {
    Course[] courses;
    Offer[] offers;
    
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}
    
	String enrollStudentInCourse(int courseId, String studentName){
		return "Enrolls in a course";
	}
}
