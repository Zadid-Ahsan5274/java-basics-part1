package for_loop_practices;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = user_input.nextInt();
		System.out.println("Factorial of "+number+" is "+factorial(number));
	}
	
	public static int factorial(int n) {
		for(int i = 1; i <= n; i++) {
			int sum = n * (n - 1);
		}
		return factorial(n-1);
	}

}
