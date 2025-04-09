package my;
import java.util.Set;
import java.util.HashSet;

public class ExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> gods = new HashSet<>();
		System.out.println("My empty set"+gods);
		gods.add("Shree Krishna");
		gods.add("Amma");
		gods.add("Nanna");
		gods.add("Sisters");
		gods.add("Ramudu");
		gods.add("Bharath");

		System.out.println("My empty set After Adding"+gods);

		gods.remove("Bharath");
		System.out.println("Removed on god name:"+gods);
		
		for(String temp:gods) {
			System.out.println("My empty set using loop:"+temp);
		}
	}

}
