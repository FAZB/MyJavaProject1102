package org.mma.training.java;

public class Main {

	public static void main(String[] args) {
		// Creating Student class objects using the no-arg
		// constructor
		Student student = new Student();
		
		student.setId(100);
		student.setFirstName("Mohammad");
		student.setLastName("Ali");
		student.setMajor("CS");
		student.setYear("Junior");
		
		Student student1 = new Student();
		
		student1.setId(101);
		student1.setFirstName("Hassan");
		student1.setLastName("Rizvi");
		student1.setMajor("CS");
		student1.setYear("Senior");
		
		// Creating Student class object using the Field
		// constructor
		Student student2 = new Student(102, "John", "R", "Doe", "Accounting", "Freshman");
		Student student3 = new Student(103, "Joe", "M", "Don", "IT", "Freshman");
		Student student4 = new Student(104, "John", "R", "Doo", "IT", "Freshman");
		System.out.println(student3);

	}

}
