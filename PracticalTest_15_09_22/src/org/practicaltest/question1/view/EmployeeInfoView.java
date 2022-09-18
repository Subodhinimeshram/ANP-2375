package org.practicaltest.question1.view;

import java.util.Scanner;

import org.practicaltest.question1.EmployeeData;
import org.practicaltest.question1.EmployeeInfo;
import org.practicaltest.question1.service.EmployeeInfoService;

public class EmployeeInfoView {
	static Scanner scanner=new Scanner(System.in);
public static boolean addEmployeeInfo () {
	
	System.out.println("Enter an employee id");
	String employeeId=scanner.nextLine();
	System.out.println("Enter an employee name");
	String employeeName=scanner.nextLine();
	System.out.println("Enter Employee Joining Date");
	String employeeJoiningDate=scanner.nextLine();
	
	EmployeeInfo  employee=new EmployeeInfo(employeeId,employeeName,employeeJoiningDate);
	EmployeeInfoService.addEmployeeData(employee);
	return true;
}

	public static EmployeeInfo[] displayEmployeeDatas() {
	
		return EmployeeInfoService.displayEmployeeDatas();
		
	}
}