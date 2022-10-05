package conditional_statement_practices;

public class CheckBalanceAndWithdrawMoney {

	public static void main(String[] args) {

          try {
        	  int initial_balance = 100000;
              int current_balance = 0;
              System.out.println("Initially your balance is "+initial_balance);
              if(initial_balance > 0) {
            	  int withdraw_amount = 100;
            	  current_balance = initial_balance - withdraw_amount;
            	  System.out.println("You have withdrawed "+withdraw_amount+" from your account and your current balance is "+current_balance);
              }else if(initial_balance == 0) {
            	  System.out.println("You can not withdraw at this moment");
              }else {
            	  System.out.println("Invalid operation...");
              }
          }catch(Exception e) {
        	  System.out.println("Exception is caught "+e);
          }
	}

}
