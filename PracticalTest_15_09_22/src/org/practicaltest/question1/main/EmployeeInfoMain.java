package org.practicaltest.question1.main;
import java.util.Scanner;

import org.practicaltest.question1.EmployeeData;
import org.practicaltest.question1.EmployeeInfo;
import org.practicaltest.question1.view.EmployeeInfoView;
public class EmployeeInfoMain {

	static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. EmployeeInfo Menu Options :");
		System.out.println("2. Display All EmployeeInfos :");
		System.out.println("Enter your choice :");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(EmployeeInfoView.addEmployeeInfo ())
				System.out.println("EmployeeInfo Added Sucessfully");
			break;
		case 2:
			EmployeeInfo book[]=EmployeeInfoView.displayEmployeeDatas();
			for(EmployeeInfo  localEmployeeData:book) {
				if(localEmployeeData!=null)
				System.out.println(localEmployeeData);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		
		int choice;
		do {
			
			System.out.println("1. Add Employee Data");
			System.out.println("2. Exit ");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}

	}