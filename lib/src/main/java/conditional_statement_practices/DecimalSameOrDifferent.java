package conditional_statement_practices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalSameOrDifferent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			
			System.out.print("Enter first decimal number: ");
			double d1 = Math.round((input.nextDouble()) * 100.0) / 100.0;
			System.out.print("Enter second decimal number: ");
			double d2 = Math.round((input.nextDouble()) * 100.0) / 100.0;
	        if(d1 == d2) {
	        	System.out.println("Same up to 2 decimal places");
	        }else {
	        	System.out.println("Not same up to 2 decimal places");
	        }
		}catch(Exception e) {
			System.out.println("Please enter a decimal number "+e);
		}
        
        
	}

}
