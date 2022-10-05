import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter another number: ");
	        int b = scanner.nextInt();
	        
	        if(a > b) {
	        	System.out.println("a is greater than b");
	        }else {
	        	System.out.println("b is greater than a");
	        }
		}catch(Exception e) {
			System.out.println("Please input an integer number "+e);
		}
        
	}

}
