package example.view;
import example.service.addition;

public class Main {
	
	public static void main(String args[]) {
		addition additionobj=new addition();
		System.out.println(additionobj.add(1));
		System.out.println(additionobj.add(2,11.11));
		System.out.println(additionobj.add(3,4));
		
		
	}

}
