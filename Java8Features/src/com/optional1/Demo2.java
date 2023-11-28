package com.optional1;

public class Demo2 {
	public static void main(String[] args) {
		// Trainer trainer = new Trainer("Srinivas", "sri@jlc", "12345");
		// Course course = new Course("DevOps", 15000, null);
		Student mystudent = new Student("Hello", "hello@gmail", 111, null);
		// I have access to Only Student Object
		// I want trainer Email and Phone
		String trainerName = "No Name available";
		String trainerEmail = "No Email Provided";
		String trainerPhone = "No Phone Provided";
		if (mystudent != null) {
		Course mycourse = mystudent.getCourse();
		if (mycourse != null) {
		Trainer mytrainer = mycourse.getTrainer();
		if (mytrainer != null) {
		trainerName = mytrainer.getTrainerName();
		trainerEmail = mytrainer.getTrainerEmail();
		trainerPhone = mytrainer.getTrainerPhone();
		}
		}
		}
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		}
}
