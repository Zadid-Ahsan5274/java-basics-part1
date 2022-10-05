package conditional_statement_practices;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		try {
           System.out.print("Enter a number: ");
           Scanner user_input = new Scanner(System.in);
           int number = user_input.nextInt();
           if(number < 0) {
        	   System.out.println(number + " is a negative number");
           }else if(number > 0) {
        	   System.out.println(number + " is a positive number");
           }else {
        	   System.out.println(number + " is equal to 0");
           }
		}catch(Exception e) {
			System.out.println("Please enter a number "+e);
		}
	}

}
