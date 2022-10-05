import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input your choice: \n"+"1. Tea\n"+"2. Coffee");
        int userInput = input.nextInt();
        switch(userInput) {
        case 1:
        	System.out.println("Your tea is ready");
        	break;
        case 2:
        	System.out.println("Your coffee is ready");
        	break;
        default:
        	System.out.println("Please input 1 or 2");
        }
	}

}
