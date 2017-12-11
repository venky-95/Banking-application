import java.util.Scanner;

public class Deposit {
	
	void cashDeposit(CustomerDO custDo)
	{
		System.out.println("************************************************************");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Please enter the amount to be deposited");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		float originalAmount=custDo.currentBalance;
		custDo.setCurrentBalance(amount+originalAmount);
		
		System.out.println("Amount deposited successfully Current Balance is "+ custDo.currentBalance );
		
	}
	

}
