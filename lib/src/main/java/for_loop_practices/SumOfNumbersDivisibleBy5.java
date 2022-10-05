package for_loop_practices;

public class SumOfNumbersDivisibleBy5 {

	static int sum = 0;
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum = "+sum);
	}

}
