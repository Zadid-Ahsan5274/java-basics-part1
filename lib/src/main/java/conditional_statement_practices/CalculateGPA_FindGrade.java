package conditional_statement_practices;

import java.util.Scanner;

public class CalculateGPA_FindGrade {

	public static void main(String[] args) {
		
		try {
			Scanner user_input = new Scanner(System.in);
			System.out.print("Please enter your number: ");
	        int number = user_input.nextInt();	
	        if(number <= 100 && number > 90) {
	        	System.out.println("Your grade is: A+");
	        }else if(number <= 90 && number >= 85) {
	        	System.out.println("Your grade is: A");
	        }else if(number <= 84 && number >= 80) {
	        	System.out.println("Your grade is: A-");
	        }else if(number <= 79 && number >= 70) {
	        	System.out.println("Your grade is: B+");
	        }else if(number <= 69 && number >= 60) {
	        	System.out.println("Your grade is: C+");
	        }else if(number <= 59 && number >= 50) {
	        	System.out.println("Your grade is: D+");
	        }else {
	        	System.out.println("Your grade is: F");
	        }
		}catch(Exception e) {
			System.out.println("Please enter a valid number "+e);
		}
	}

}
