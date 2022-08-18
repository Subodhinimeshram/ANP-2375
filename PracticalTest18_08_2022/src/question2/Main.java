package question2;

public class Main {
	
		public static void main(String[] args) {
			
			int a = 7;
			int i = 0;
	        int j;
	        
			for (i=0;i<=a;i++) {
				
				for (j=0;j<i;j++) {
					
					System.out.print(i*j+" ");    //inside loop
				
				}
				System.out.println("  ");	   //outer loop
			}
			
		}

	}


