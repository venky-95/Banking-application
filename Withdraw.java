import java.util.Scanner;

public class Withdraw {
	
	void withDraw(CustomerDO custDo)
	{
		System.out.println("************************************************************");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Please enter the amount to be Withdraw ");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		float originalAmount=custDo.currentBalance;
		if(amount<originalAmount)
		{
			custDo.setCurrentBalance(originalAmount-amount);
			System.out.println("Amount withdrawn successfully Current Balance is "+ custDo.currentBalance );
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
}
