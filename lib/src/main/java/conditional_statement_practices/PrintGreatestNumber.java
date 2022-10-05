package conditional_statement_practices;

import java.util.Scanner;

public class PrintGreatestNumber {

	public static void main(String[] args) {
		try {
		Scanner user_input = new Scanner(System.in);
		System.out.print("Please enter first number: ");
        int number1 = user_input.nextInt();
        System.out.print("Please enter second number: ");
        int number2 = user_input.nextInt();
        System.out.print("Please enter third number: ");
        int number3 = user_input.nextInt();
        int temp = number1 > number2 ? number1 : number2;
        int c = temp > number3 ? temp : number3;
        System.out.println(c + " is the largest number");
	}catch(Exception e) {
		System.out.println("Please enter a number "+e);
	}
	}
}
