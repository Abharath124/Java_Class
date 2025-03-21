package polymorphism;

class Vehicles{
	public void vehicle_details()
		{
		  System.out.println("Vehicle - Details");
		}
}

class car1 extends Vehicles{
	public void vehicle_details()
	{
	  System.out.println("car 1 - Details");
	}
}

class car2 extends Vehicles{
	public void vehicle_details()
	{
	  System.out.println("car 2 - Details");
	}
}
public class DynamicBining {
     public static void main (String[]args) {
    	 car1 c = new car1();
    	 c.vehicle_details();
    	 car2 c1 = new car2();
    	 c1.vehicle_details();
//    	 System.out.println();
     }
}
