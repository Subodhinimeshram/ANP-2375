package com.mybank.service;

public class LoanAccountService {
	
	private int loanId;
	private int loanAmount;
	private int rateOfInterest;
	private int timePeriod;
	
	
	public int calculateInterest(int loanId,int loanAmount,int rateOfInterest,int timePeriod) {
		
		int interestAmount=(loanAmount*rateOfInterest*timePeriod)/100;
		return interestAmount;
		
	}

}
