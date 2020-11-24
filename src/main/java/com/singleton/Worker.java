package com.singleton;
import com.employees.Employee;

import java.util.HashSet;
import java.util.Set;

public class Worker {
	private static final Worker instance = new Worker();

	private Worker(){}

	public static Worker getInstance() {
		return instance;
	}

	public static void sayHelloFromAnyEmployee(Employee employee) {
		employee.sayHello();
	}

	public static void whatAmIFromAnyEmployee(Employee employee) {
		employee.whatAmI();
	}

	public String getAnyEmployeeName(Employee employee) {
		return employee.getName();
	}

	public int getAnyEmployeeAge(Employee person) {
		return person.getAge();
	}

	public String getAnyEmployeeDepartment(Employee employee) {
		return employee.getDepartment();
	}

	public static int getTotalAge(Employee[] employees) {
		int sum = 0;
		for(Employee employee : employees) {
			sum += employee.getAge();
		}
		return sum;
	}

	public static void printAllDepartments(Employee[] employees) {
		Set<String> set = new HashSet<>();
		for(Employee employee : employees) {
			set.add(employee.getDepartment());
		}
		System.out.println(java.util.Arrays.toString(set.toArray()));
	}
}
