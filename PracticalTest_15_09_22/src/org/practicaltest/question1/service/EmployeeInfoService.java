package org.practicaltest.question1.service;

import org.practicaltest.question1.EmployeeInfo ;
import org.practicaltest.question1.dao.EmployeeInfoDAO;
public class EmployeeInfoService {
	
		public static boolean addEmployeeData(EmployeeInfo  emp) {
			boolean result=false;
			EmployeeInfoDAO.addEmployeeData(emp);
			return result;
		}
		public static EmployeeInfo [] displayEmployeeDatas() {
			return EmployeeInfoDAO.displayEmployeeInfos();
		}
	}
