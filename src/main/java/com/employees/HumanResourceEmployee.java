package com.employees;

public class HumanResourceEmployee extends Employee {
	public HumanResourceEmployee() {
		super();
	}

	public HumanResourceEmployee(String name, int age, String department) {
		super(name, age, department);
	}

	public void sayHello() {
		System.out.println("HI From HR!");
	}

	public void whatAmI() {
		System.out.println("An HR Employee");
	}
}
