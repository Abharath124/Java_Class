package Inheritence1;

class Car1{
	void cardisplay(){
	String carcomapny= "Toyoto";
	String carname = "Innova";
	System.out.println("1st car Company is : "+ carcomapny);
	System.out.println("1st car Name is : "+ carname);
	}
}

class car2{
	void cardisplay1() {
		String car1company = "Maruti";
		String car1name = "Baleno";
		System.out.println("2nd car Company is : "+ car1company);
		System.out.println("2nd car Name is : "+ car1name);
	}
}

public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car1 ca = new Car1();
       car2 ca1 = new car2();
       ca.cardisplay();
       ca1.cardisplay1();
	}
}
