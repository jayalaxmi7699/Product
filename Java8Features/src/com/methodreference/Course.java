package com.methodreference;

public class Course {
	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;

	public Course() {
		System.out.println("Course - 0 arg Con");
	}

	public Course(int courseId, String courseName, String duration, String trainer) {
		System.out.println("Course - 4 arg Con");
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.trainer = trainer;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", trainer="
				+ trainer + "]";
	}

}
