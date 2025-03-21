package Inheritence1;

// updation is not possible from subclasses
class FinalKeyword{  // Parent class 
	int b = 100;
	public void final_method() {
		System.out.println("Iam Parent Final Method");
	}
}
class FinalKey extends FinalKeyword{  // child class
	public void final_method() {
		System.out.println("Iam Child Final Method");
	}
}
public class Final {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    final int a = 900; // Final Keyword in Variables is fixed we cannot alter 
		    System.out.println(" a value is : "+ a);
		    FinalKeyword fin = new FinalKeyword();
		    System.out.println(" b value is : "+fin.b);
		    
	}
}
