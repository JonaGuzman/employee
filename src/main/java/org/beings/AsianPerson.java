package org.beings;

public class AsianPerson extends Person {
	public AsianPerson() {
		super();
	}

	public AsianPerson(String name, int age, String location) {
		super(name, age, location);
	}

	public void sayHello() {
		System.out.println("NI-JAO");
	}

	public void whatAmI() {
		System.out.println("Wǒ shì yīgè rén");
	}
}
