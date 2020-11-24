package com.factory;
import com.employees.*;


public class EmployeeFactory {
	public Employee getEmployee(String department) {
		if (department == null) {
			return null;
		}
		else if (department.equalsIgnoreCase("Human Resources")) {
			return new HumanResourceEmployee();
		}
		else if (department.equalsIgnoreCase("Sales")) {
			return new SalesEmployee();
		}
		else if (department.equalsIgnoreCase("Information Technology")) {
			return new InformationTechnologyEmployee();
		}
		return null;
	}
}
