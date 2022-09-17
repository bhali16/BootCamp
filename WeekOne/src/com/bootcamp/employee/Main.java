package com.bootcamp.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Employee employees[] = new Employee[3];
		
		employees[0] = new Employee(1,"Waqar","IT");
		employees[1] = new Employee(2,"Ahmad","Finance");
		employees[2] = new Employee(3,"Khan","Human Resource");
		
		// Print all Employees
		System.out.println("Employees with Department:-");
		System.out.println("----------------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Name: " + employees[i].getEmpName());
			System.out.println("Department: " + employees[i].getEmpDept());
			System.out.println("----------------------------------------");
		}
		
		//Print all employees except employee with id 2 using Stream API and filter method
		
		Stream<Employee> stream = Arrays.stream(employees);
		List<Employee> newstream = stream.filter(e -> (e.getEmpId()!=2)).collect(Collectors.toList());
		
		System.out.println("Employees with Department:-");
		System.out.println("----------------------------------------");
		for (int i = 0; i < newstream.size(); i++) {
			System.out.println("ID: " + newstream.get(i).getEmpId());
			System.out.println("Name: " + newstream.get(i).getEmpName());
			System.out.println("Department: " + newstream.get(i).getEmpDept());
			System.out.println("----------------------------------------");
		}
	}
}
