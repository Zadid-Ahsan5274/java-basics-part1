import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {

		/*
		 * for(int a = 30; a>=0;a-=5) { System.out.println(a); }
		 */
		
		/*int num = 29;
		boolean flag = true;
		for(int i = 2; i < num / 2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
        if(flag == true) {
        	System.out.println(num + " is a prime number");
        }else {
        	System.out.println(num + " is not a prime number");
        }*/
	
		// Reverse a number
		/*
		 * int number = 543, reverse = 0; while(number != 0) { int rem = number % 10;
		 * number = number / 10; reverse = reverse * 10 + rem;
		 * 
		 * }
		 * 
		 * System.out.println(reverse);
		 */
		
		/*
		 * int sum = 0; System.out.println("Input a number: "); Scanner scanner = new
		 * Scanner(System.in); while(true) { int num = scanner.nextInt(); sum += num;
		 * System.out.println("sum = "+sum); if(num == -1) { break; } }
		 */
		
		int sum = 0; 
		System.out.println("Input a number: "); 
		Scanner scanner = new Scanner(System.in); 
		do { 
			int num = scanner.nextInt(); 
			if(num == -1) {
				break;
			}
		 sum += num;
		 System.out.println(sum);
		}while(true);
	}
}
