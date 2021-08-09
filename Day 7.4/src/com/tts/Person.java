package com.tts;

public class Person {

	private String name;
	private Integer age;
	private String location;

	//Getters

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	//Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	//Constructors

	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person() {
	}
	//Methods

	public void sayHello(){
		System.out.println("Hello, my name is " + name);
	}

	public void sayHello(Person person){
		System.out.println("Hello " +person.name+ ", my name is " + name);
	}

	public int birthday(){
		return age++;
	}

	//toString override

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", location='" + location + '\'' +
				'}';
	}
}
