package question1.service;

import question1.model.Customer;

public class CustomerService {
	
	public boolean checkEligibility(Customer c){
		boolean value;
		int Age = c.getAge();
		
		if (Age>=18){
			value = true;
		}
		else {
			value = false;	
		}
		return value;
	
		
	}
	

}

