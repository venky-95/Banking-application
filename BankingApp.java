import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Please register your self \n 1. UserName \n 2. Password \n 3. InitailBalance");
		Scanner sc=new Scanner(System.in);
		
		CustomerDO customerObj=new CustomerDO();
		customerObj.username=sc.nextLine();
		customerObj.password=sc.nextLine();
		float amount=sc.nextFloat();
		customerObj.setCurrentBalance(amount);
		
		System.out.println("************************************************************");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Thanks for resgistering with us. Now you will be redirected to banking application ");
		
		
		
		
		System.out.println("\n");
		System.out.println("\n");
				
		System.out.println(" PLease login 1. Username 2. Password  ");
		
		String usernameInput=sc.next();
		String passwordInput=sc.next();
		
		if(usernameInput!=null&&passwordInput!=null&&usernameInput.equals(customerObj.username)
				&&passwordInput.equals(customerObj.password))
		{
		
			System.out.println("You have successfully logged in");
			Thread.sleep(50);
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Please enter your banking options number respectively");
			
			int x=0;
			
			do 
			{
				System.out.println("************************************************************");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("1.WithDraw 2.Deposit 3. Current Balance 4.exit");
				x=sc.nextInt();
				
				if(x==1)
				{
					Withdraw wd=new Withdraw();
					wd.withDraw(customerObj);
					
					
				}
				else if(x==2)
				{
					Deposit deposit=new Deposit();
					deposit.cashDeposit(customerObj);
				}
				else if(x==3)
				{
					BalanceCheck bc=new BalanceCheck();
					bc.balanceCheck(customerObj);
				}
				
				
			}while(x<4);
			
			
		}
		
		else
		{
			System.out.println("Login Failure occured");
		}
		
		
		
	}

}
