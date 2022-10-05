import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Hello Java");
		 * 
		 * int _a = 23;
		 * 
		 * int firstName = 23; int FirstName = 34;
		 * 
		 * System.out.println(_a); System.out.println("Hello\tJava");
		 * System.out.println("Hello \"Java\""); System.out.println("Hello \\Java\\");
		 * 
		 * int a = 2147483647; double d = a + 9857948504l; double b = 3845345456l; int r
		 * = (int) b; System.out.println(r); // char hello = 'r';
		 */		
		
		/*
		 * int a = 34; a += 2; System.out.println(a);
		 */
		
		// System.out.println(Math.max(34,45));
		/*
		 * int min = 100; int max = 999; int random =
		 * (int)(Math.random()*(max-min)+min);
		 * System.out.println("testuser"+random+"@test.com");
		 */
		try{
			Scanner input = new Scanner(System.in);
			System.out.print("Please input a value: ");
			int a = input.nextInt();
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("Please enter a number without decimal point");
		}
		
	}

}
