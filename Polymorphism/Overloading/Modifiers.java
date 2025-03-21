package overloading;
// public, private, protected, default

class modi {
	public int a = 100; // public
	   protected int b = 200; // protected
	   int c = 300; // default
	   private int d = 400;  // private 

}
public class Modifiers {// main class
//   public int a = 100; // public
//   protected int b = 200; // protected
//   int c = 300; // default
//   private int d = 400;  // private 
	public static void main(String[] args) {
		Modifiers m = new Modifiers();
		modi m1 = new modi();
           System.out.println("A value is : "+m1.a);
           System.out.println("B value is : "+m1.b);
           System.out.println("C value is : "+m1.c);
           System.out.println("D value is : "+m1.d);
	}
}
