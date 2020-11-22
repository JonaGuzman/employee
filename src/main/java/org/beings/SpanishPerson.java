package org.beings;

public class SpanishPerson extends Person {
	public SpanishPerson() {
		super();
	}

	public SpanishPerson(String name, int age, String location) {
		super(name, age, location);
	}

	public void sayHello() {
		System.out.println("HOLA");
	}

	public void whatAmI() {
		System.out.println("Soy una persona");
	}
}
