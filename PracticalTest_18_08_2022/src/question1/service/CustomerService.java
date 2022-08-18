package question1.service;

import question1.model.Customer;

public class CustomerService {
	
	public boolean checkEligibility(Customer c){
		boolean result = false;
		int Age = c.getAge();
		if (Age>=18){
			result = true;
		}
		else {
			result = false;	
		}
		return result;
	
		
	}
	

}

