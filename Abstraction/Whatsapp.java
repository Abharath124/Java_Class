package abstraction;

import java.util.Scanner;

abstract class Appss{  // parent class
	
	String PNumber ;
	String otp;
	void user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Your Phone Number : ");
		PNumber = sc.nextLine();
		System.out.println("Enter OTP : ");
		otp = sc.nextLine();
	}
	void user_login() {
		System.out.println("Welcome to Whats App");
		System.out.println("---------------------");
		System.out.println("Please Log in here..!!");
	}
	abstract void app_open();
}

class Whatsappp extends Appss{// child class
	void app_open() {  // normal me
