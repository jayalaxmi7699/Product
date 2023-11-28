package com.optional1;

public class Course {
	private String courseName;
	private double coursePrice;
	private Trainer trainer;

	public Course() {
	}

	public Course(String courseName, double coursePrice, Trainer trainer) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.trainer = trainer;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", coursePrice=" + coursePrice + ", trainer=" + trainer + "]";
	}

}
