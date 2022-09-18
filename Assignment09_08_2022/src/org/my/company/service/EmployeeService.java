package org.my.company.service;

import org.my.company.model.Employee;

public class EmployeeService {

		public Employee calaulateSalaryIncrement(Employee employee) {
			
			employee.setemployeeId(employee.getemployeeId() +  employee.getemployeeId()*25/100);
			return employee;
		}
		
	}

