package question1.view;
import question1.model.Customer; 
import question1.service.CustomerService;

public class CustomerView {
	
	public static void main(String[] arg) {
		
		Customer Customer1 = new Customer(3,"abcd",19);
		CustomerService CustService1 = new CustomerService();
		boolean value = CustService1.checkEligibility(Customer1);
		
		if (value) {
			
			System.out.println(CustService1.checkEligibility(Customer1));
			System.out.println("you are elegible for Voting");
			
		}
		else{System.out.println(CustService1.checkEligibility(Customer1));
		
			System.out.println("you are not elegible for Voting");
		}
		
	}

}
