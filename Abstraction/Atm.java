package abstraction;
import java.util.Scanner;
abstract class atm_abs{ // parent class 
	double balance;   // initial balance 
	atm_abs(double balance){  // parent constructor 
		this.balance = balance;
	}
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	abstract void checkbalance();
}
class SBI extends atm_abs{
	SBI(double balance){
		super(balance);
	}
	// withdraw method body
	void withdraw(double amount) {
		if (amount>0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw Success : Available Balance : "+ balance);
		}
			else {
				System.out.println("No Balance");
			}
	}
	// Deposit method 
	void deposit(double amount) {
		if (amount>0 && amount <= balance) {
			balance = balance + amount;
			System.out.println("Deposit Success : Available Balance : "+ balance);
		}
			else {
				System.out.println("Deposit Failed ");
			}
	}
	// checking balance 
	void checkbalance() {
		System.out.println("Current Balance : "+ balance);
	}
}
public class Atm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI(9000);	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("**** ATM - MENU ****");
			System.out.println("======================");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposit Money");
			System.out.println("3. Checking Money");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();		
			switch(choice) {
			case 1:
				System.out.println("Enter Withdraw Amount : ");
				double with_amount = sc.nextDouble();
				obj.withdraw(with_amount);
				break;
			case 2:
				System.out.println("Enter Deposit Amount : ");
				double dept_amount = sc.nextDouble();
				obj.deposit(dept_amount);
				break;
			case 3:
				System.out.println("Available Balance :");
				obj.checkbalance();
				break;
			case 4:
				System.out.println("**** Thanks for Using ATM ****");
				System.exit(0);
			default:
				System.out.println("Enter Correct Option....");
			}
			}
	}
}

// otp to change pin 
// otp generate
