package com.tts;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		var myString = "Hello world";
//		System.out.println(myString.getClass());


		Person jimmy = new Person("Jimmy", 11, "Jimbuktu");
		System.out.println(jimmy.getName());
		System.out.println(jimmy);

		Person arnold = new Person("Arnold");
		System.out.println(arnold);

		jimmy.sayHello();
		arnold.sayHello(jimmy);

//		List<Student> studentList = new ArrayList<>();
		List<Student> studentList = List.of(
				new Student("Bob",28,"USA",2022,false),
				new Student("Susie",21,"USA",2024,false),
				new Student("Sam",258,"USA",2023,false)
		);

		studentList.forEach(Student::enrolledStudent);

		System.out.println(studentList);

	}

}
