package my;
import java.util.Scanner;


public class BankingApplication {

  public static void main(String[] args) {
//		 TODO Auto-generated method stub
		BankAccount obj1 =new BankAccount("Anumandla Bharath Srinivas","UBI0000121");
		obj1.showMenu();
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String cname,String cid){
		customerName = cname;
		customerID = cid;
	}
	
	void deposit(int amount)
	{
		if (amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount)
	
		{
		    if (amount != 0 && amount <= balance)
		    {
		        balance = balance - amount;
		        previousTransaction = -amount;
		    }
		    else if (amount > balance)
		    {
		        System.out.println("Insufficient funds!");
		    }
		}

	
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.print("Deposit:"+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw:"+Math.abs(previousTransaction));	
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome:"+customerName);
		System.out.println("CustomerID:"+customerID);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.PreviousTransaction");
		System.out.println("E.Exit");
		
		
		do {
			System.out.println("================================================================");
			System.out.println("Enter an option");
			System.out.println("================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("---------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("---------------------------");
				System.out.println("\n");
				
				break;
				
			case 'B':
				System.out.println("---------------------------");
				System.out.println("Enter an amount to deposit:");
				int amount = scanner.nextInt();
				deposit(amount);				
				System.out.println("\n");
				
				break;
				
			case 'C':
				System.out.println("---------------------------");
				System.out.println("Enter an amount to Withdraw:");
				System.out.println("---------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);				
				System.out.println("\n");
				
				break;
				
			case 'D':
				System.out.println("---------------------------");
				getpreviousTransaction();
				System.out.println("---------------------------");
				System.out.println("\n");
				
				break;
			
			case 'E':
				System.out.println("*************************************");
				break;
			
			default:
				System.out.println("Invalid Option !! Please enter again");
				break;
			
				
			}
		}while(option!='E');
		System.out.println("ThankYou for using our service");
		scanner.close();
			
			
			
		
	}
	}
