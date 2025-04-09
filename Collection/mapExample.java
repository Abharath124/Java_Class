package my;
import java.util.Map;
import java.util.HashMap;
public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> birds = new HashMap<>();
		System.out.println("Empty Map:"+birds);
		
		birds.put("Swan", 22);
        birds.put("Peacock", 15);
        birds.put("Parrot", 30);
        birds.put("Crow", 50);
        birds.put("Eagle", 5);
        
        System.out.println("After add map:"+birds);
        
        birds.remove("Swan");
        System.out.println("After remove :"+birds);
        
        
        for (Map.Entry<String, Integer> entry : birds.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        
        	
        }
		
		
	}

}
