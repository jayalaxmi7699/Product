package com.optional1;

public class Demo1 {
	public static void main(String[] args) {
		Trainer trainer1 = new Trainer("Srinivas", "sri@jlc", "12345");
		Course course1 = new Course("DevOps", 15000, trainer1);
		Student student1 = new Student("Hello", "hello@gmail", 111, course1);
		Student studen1 = new Student("Hai", "ram@gmail", 567, course1);
		Student studen2 = new Student("Have", "ace@gmail", 234, course1);
		Student studen3 = new Student("Apple", "bye@gmail", 123, course1);
		Student studen4 = new Student("science", "via@gmail", 789, course1);
		
		
		// I have access to Only Student Object and want trainer Email and Phone
		String trainerName = student1.getCourse().getTrainer().getTrainerName();
		String trainerEmail = student1.getCourse().getTrainer().getTrainerEmail();
		String trainerPhone = student1.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		System.out.println("-----------------------------");
		Course course2 = new Course("Java8 New", 500, null);
		Student student2 = new Student("Hai", "hai@gmail", 222, course2);
		// I have access to Only Student Object and want trainer Email and Phone
		trainerName = student2.getCourse().getTrainer().getTrainerName();
		trainerEmail = student2.getCourse().getTrainer().getTrainerEmail();
		trainerPhone = student2.getCourse().getTrainer().getTrainerPhone();
		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
		Student student3 = new Student("Sri", "sri@gmail", 333, null);
		// I have access to Only Student Object and want trainer Email and Phone
		trainerName = student3.getCourse().getTrainer().getTrainerName();
		trainerEmail = student3.getCourse().getTrainer().getTrainerEmail();
		trainerPhone = student3.getCourse().getTrainer().getTrainerPhone();

		System.out.println(trainerName);
		System.out.println(trainerEmail);
		System.out.println(trainerPhone);
	}
}
