package conditional_statement_practices;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a year: ");
			int year = sc.nextInt();
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println("This is leap year");
					}else {
						System.out.println("This is not leap year");
					}
					
				}else {
					System.out.println("This is leap year");
				}
				
			}else {
				System.out.println("This is not a leap year");
			}
		}catch(Exception e) {
			System.out.println("Please enter a valid year"+e);
		}

	}

}
