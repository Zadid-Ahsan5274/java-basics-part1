package while_loop_practices;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		int min = 1;
		int max = 10;
		int randomNumber1 = (int)(Math.random()*(max-min)+min);
        int randomNumber2 = (int)(Math.random()*(max-min)+min);
        System.out.print("Guess a number between 1 to 10");
        int userNumber = user_input.nextInt();
        int userScore = 0;
        int i = 0;
        while(i <= 10) {
        	while(userNumber == randomNumber1 || userNumber == randomNumber2) {
            	userScore = userScore + 1;
            	i++;
            }
        }
        
	}

}
