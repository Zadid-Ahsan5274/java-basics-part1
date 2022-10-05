package for_loop_practices;

public class CalculateSumOfEvenNumbers {
	
	static int sum = 0;

	public static void main(String[] args) {
		
		int i;
		
		for(i = 2; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			
		}
        System.out.println("sum = "+sum);
	}

}
