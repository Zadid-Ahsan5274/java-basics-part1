package for_loop_practices;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int num = 37;
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
        }

	}

}
