package org.beings;

public class Person implements IPerson {
	private String name;
	private int age;
	private String location;

	public Person() {}

	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello!");
	}

	@Override
	public void whatAmI() {
		System.out.println("I am a person");
	}

	public String toString() {
		return String.format("%s\t%d\t%s", this.name,this.age,this.location);
	}
}
