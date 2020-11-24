package com.employees;

public class Employee implements IEmployee {
	private String name;
	private int age;
	private String department;

	public Employee() {}

	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello!");
	}

	@Override
	public void whatAmI() {
		System.out.println("I am an Employee");
	}

	public String toString() {
		return String.format("%s\t%d\t%s", this.name,this.age,this.department);
	}
}
