package for_loop_practices;

import java.util.Scanner;

public class Prime2ToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		boolean flag = true;
		for(int i = 2; i < num / 2; i++) {
			if(flag == true) {
				System.out.println("i = "+i);
			}
			else if(num % i == 0) {
				flag = false;
				break;
			}
			
		}
       

	}

}
