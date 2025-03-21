package abstraction;

import java.util.Scanner;

abstract class Apps{  // parent class
	
	String user_name ;
	String password;
	void user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username : ");
		user_name = sc.nextLine();
		System.out.println("Enter Password : ");
		password = sc.nextLine();
	}
	void user_login() {
		System.out.println("Welcome to Instagram");
		System.out.println("---------------------");
		System.out.println("Please Log in here..!!");
	}
	abstract void app_open();
}

class Instagram extends Apps{// child class
	void app_open() {  // normal method
		if(user_name.equals("Raghav") && password.equals("123@")){
			System.out.println("Successfully Login.  App is Open..!!");
		}
		else {
			System.out.println("Invalid User name and Password, Please Try Again");
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Instagram i = new Instagram();
		i.user_login();
		i.user_input();
		i.app_open();
	}

}
