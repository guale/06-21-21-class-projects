package com.tts;

public class Student extends Person {

	private Integer gradYear;
	private Boolean enrolled = false;

	public Student(String name,
				   int age,
				   String location,
				   Integer gradYear,
				   Boolean enrolled) {
		super(name, age, location);
		this.gradYear = gradYear;
		this.enrolled = enrolled;
	}

	public void enrolledStudent() {
		enrolled = true;
	}

	@Override
	public String toString() {
		return "Student{" +
				"gradYear=" + gradYear +
				", enrolled=" + enrolled +
				'}';
	}
}
