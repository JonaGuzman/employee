package org.beings;

public class CanadianPerson extends Person {
	public CanadianPerson() {
		super();
	}

	public CanadianPerson(String name, int age, String location) {
		super(name, age, location);
	}

	public void sayHello() {
		System.out.println("Hello EH");
	}

	public void whatAmI() {
		System.out.println("I am a polite person EH");
	}
}
