package org.my.company.view;
import org.my.company.model.Employee;
import org.my.company.service.EmployeeService;

public class EmployeeView {

		public static void main(String args[]) {
		Employee employee = new Employee(2, 'A', 10000);
		EmployeeService employeeservice = new EmployeeService();
		Employee updateEmployee = employeeservice.calaulateSalaryIncrement(employee);
		System.out.println("Employee Id : " + updateEmployee.getemployeeId());
		System.out.println("Employee Initial : " + updateEmployee.getemployeeId());
		System.out.println("Updated Salary : " + updateEmployee.getemployeeId());
		
	 }
		
	}

