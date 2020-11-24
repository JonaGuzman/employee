package com.employees;

public class SalesEmployee extends Employee {
	public SalesEmployee() {
		super();
	}

	public SalesEmployee(String name, int age, String department) {
		super(name, age, department);
	}

	public void sayHello() {
		System.out.println("Hello From Sales");
	}

	public void whatAmI() {
		System.out.println("I am a Sales Employee");
	}
}
