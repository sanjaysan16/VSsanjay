package openpractice;

public class Nested_switch {
	public static void main(String[]args) {
		int tan =2;
		int tea =1;
		switch(tan) {
		case 1:
			System.out.println("dai");
			break;
		case 2: 
		
			switch(tea) {
			case 1:
		
			System.out.println("doi");
			break;
		case 2:
			System.out.println("iii");
			break;
			}
		}
	}

}
