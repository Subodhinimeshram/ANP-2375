package task16;
public class Switch {
		
		public void star() {
			System.out.println("0");
		}
		public void displayInstriction() {
			System.out.println("1");
		}
		public void exit() {
			System.out.println("2");
		}
		
		public static void main(String[] arg) {
			int menuInput =7;
			Switch switchobj = new Switch();
			
			switch(menuInput) {		
			case 1:
				switchobj.star();
				break;
			case 2:
				switchobj.displayInstriction();
				break;
			case 3:
				switchobj.exit();
				break;
			default:
				System.out.println("invalid input");
				
			}
		}
	}

