package question3;

public class Swapp {
	
	public static void main(String args[]) {
		
		int a=5,b=2;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping a and b:"+ " a=" + a + ", b= "+ b);
	}

}
