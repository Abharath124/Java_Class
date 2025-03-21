package polymorphism;

class Vehicle{
	public void carDetails() {
	    System.out.println("Vehicle Details");

	}
}
class Car1 extends Vehicle{
	public void carDetails() {
		String carcolor = "Red";
		String carname = " Baleno";
	    System.out.println("Car Color : "+ carcolor);
	    System.out.println("Car Name : "+ carname);
	}
}

class Car2 extends Vehicle{
	public void carDetails() {
		String carcolor = "Blue";
		String carname = " Glanza";
	    System.out.println("Car Color : "+ carcolor);
	    System.out.println("Car Name : "+ carname);
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c = new Car1();
		c.carDetails();
		Car2 c1 = new Car2();
		c1.carDetails();
	}
}
