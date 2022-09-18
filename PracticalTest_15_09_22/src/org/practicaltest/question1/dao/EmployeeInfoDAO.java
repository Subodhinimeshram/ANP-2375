package org.practicaltest.question1.dao;

import org.practicaltest.question1.EmployeeInfo ;

public class EmployeeInfoDAO {
	
	static EmployeeInfo  employeeArray[]=new EmployeeInfo [5];
	public static boolean addEmployeeData(EmployeeInfo emp) {
		boolean result=false;
		
		for(int i=0;i<employeeArray.length;i++)
		{
			if(employeeArray[i]==null) {
				employeeArray[i]=emp;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static EmployeeInfo [] displayEmployeeInfos() {
		return employeeArray;
	}
	

}