package org.practicaltest.question1;

import java.util.Objects;

public class EmployeeInfo {
	public String employeeId;
	public String employeeName;
	public String employeeJoiningDate;

public EmployeeInfo (String employeeId,String employeeName,String employeeJoiningDate){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeJoiningDate=employeeJoiningDate;

}

public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getEmployeeJoiningDate() {
	return employeeJoiningDate;
}

public void setEmployeeJoiningDate(String employeeJoiningDate) {
	this.employeeJoiningDate = employeeJoiningDate;
}

@Override
public String toString() {
	return "EmployeeData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeJoiningDate="
			+ employeeJoiningDate + "]";
}

@Override
public int hashCode() {
	return Objects.hash(employeeJoiningDate, employeeName, employeeId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeInfo  other = (EmployeeInfo ) obj;
	return Objects.equals(employeeJoiningDate, other.employeeJoiningDate) && Objects.equals(employeeName, other.employeeName)
			&& Objects.equals(employeeId, other.employeeId);
}	}