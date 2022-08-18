package com.mybank.view;
import com.mybank.service.LoanAccountService;

public class MainView {
	
	public static void main(String args[]) {
		
		LoanAccountService interest1 = new LoanAccountService();
		System.out.println( interest1.calculateInterest(300,900,55,40));
	
	}

}
