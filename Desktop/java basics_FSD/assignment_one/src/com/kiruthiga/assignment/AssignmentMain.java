package com.kiruthiga.assignment;
import com.kiruthiga.assignment.employees.Manager;
import com.kiruthiga.assignment.employees.Developer;
import com.kiruthiga.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {

	public static void main(String[] args) {
		Manager manager=new Manager("John",101,90000,"Sales");
		Developer developer=new Developer("Alice",102,80000,"Java");
		EmployeeUtilities.printEmployeeDetails(manager);
		EmployeeUtilities.printEmployeeDetails(developer);
	}

}
