
package Java;
class Addition{
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("Sum of a and b is : "+(a+b));
	}
	public int add(int a, int b) {
		return a+b;
		
	}
}
public class Methodoverloading {
	public static void mian (String[] args) {
		Addition obj = new Addition();
		obj.add();
//		obj.add(20,30);
		System.out.println(obj.add(20,30));
	}

}
