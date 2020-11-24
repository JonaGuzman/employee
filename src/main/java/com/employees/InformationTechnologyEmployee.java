package com.employees;

public class InformationTechnologyEmployee extends Employee {
	public InformationTechnologyEmployee() {
		super();
	}

	public InformationTechnologyEmployee(String name, int age, String department) {
		super(name, age, department);
	}

	public void sayHello() {
		System.out.println("Hello from IT");
	}

	public void whatAmI() {
		System.out.println("I am an IT Employee");
	}
}
