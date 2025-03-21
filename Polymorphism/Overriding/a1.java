package polymorphism;
// compile time polimorphism, run time polymorphism 

// Compile TIME polymorphism  (Method Overloading
public class a1 {
    public static int add(int a,int b) {// method 1
       return a+b;
    }
    public static double add(double a,double b) {// method 1
        return a+b;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method 1 : "+ add(10,20));
		System.out.println("Method 2 : "+ add(100,200));
    
	}

}
