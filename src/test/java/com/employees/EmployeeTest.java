package com.employees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.factory.EmployeeFactory;
import com.singleton.Worker;
import org.junit.Test;

/**
 * Unit test for Employee Project.
 */
public class EmployeeTest
{
    Employee infoTechEmployee = new SalesEmployee("Drake", 34, "Information Technology");

    @Test
    public void shouldHaveDepmartmentsMatch() {
        assertEquals("Assert that Drake department is Information Technology",
                "Information Technology", Worker.getInstance().getAnyEmployeeDepartment(infoTechEmployee));
    }

    @Test
    public void shouldHaveAgesMatch() {
        assertTrue("Assert that Drakes age is 34",
                (Worker.getInstance().getAnyEmployeeAge(infoTechEmployee) == 34));
    }

    @Test
    public void shouldHaveNamesMatch() {
        assertEquals("Assert that Drake name is Drake",
                "Drake", Worker.getInstance().getAnyEmployeeName(infoTechEmployee));
    }

    @Test
    public void testToStringMethod() {
        assertEquals(infoTechEmployee.toString(),
                "Drake\t34\tInformation Technology" );
    }

    @Test
    public void testEmployeeFactory() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee salesEmployee = employeeFactory.getEmployee("Sales");
        salesEmployee.setDepartment("Sales");

        Employee hrEmployee = employeeFactory.getEmployee("Human Resources");
        hrEmployee.setDepartment("Human Resources");

        Employee itEmployee = employeeFactory.getEmployee("Information Technology");
        itEmployee.setDepartment("Information Technology");

        assertTrue((salesEmployee.getDepartment().equals("Sales") &&
                hrEmployee.getDepartment().equals("Human Resources") &&
                itEmployee.getDepartment().equals("Information Technology")));
    }
}
