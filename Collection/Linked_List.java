import java.util.LinkedList;
import java.util.List;
public class Linked_List {
      public static void main(String[] args){
            //Syntax
            List<String> heroes = new LinkedList<>();
            System.out.println(heroes);    
            
            heroes.add("Superman");
            heroes.add("Prabhas");
            heroes.add("Sharukh");

            System.out.println(heroes);

            heroes.remove(2);
            System.out.println("After removing names: "+heroes);

            String temp = heroes.get(0);
            System.out.println("First name is: "+temp);

            for(String hero:heroes){
                  System.out.println("My linked list using iterator:"+hero);
            }

            ((LinkedList<String>) heroes).addFirst("Ironaman");
            System.out.println(heroes);

            ((LinkedList<String>) heroes).addLast("Hulk");
            System.out.println(heroes);
      }      
}
