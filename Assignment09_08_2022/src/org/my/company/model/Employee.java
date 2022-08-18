package org.my.company.model;

public class Employee {
	
		public int employeeId;
		public char employeeInitial;   //instant variable or member variable 
		public int employeeSalary;
		public Employee() {
			
			//empty constructor 
		}
		
		public Employee(int employeeId,char employeeInitial,int employeeSalary){
			               //parameterized constructor
			
			this.employeeId=employeeId;            // It refer to current object
			this.employeeInitial=employeeInitial;
			this.employeeSalary=employeeSalary;	
		}
		public int getemployeeId(){
			
			//getter method
			return employeeId;
		}
		public void setemployeeId(int employeeId) {
			
			this.employeeId=employeeId;
			//setter method
		}
		public char getemployeeInitial() {
			
			return employeeInitial;
		}
		public void setemployeeInitial(char employeeInitial) {
			
			this.employeeInitial=employeeInitial;
		}
		public int getemployeeSalary() {
			
			return employeeSalary;
		}
		public void setemployeeSalary(int employeeSalary){
			
			this.employeeSalary=employeeSalary;
		}
   }


