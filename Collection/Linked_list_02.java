import java.util.LinkedList;
import java.util.List;
public class Linked_list_02 {
      public static void main(String[] args){
            List<String> heroines = new LinkedList<>();

            heroines.add("Deepika padukone");
            heroines.add("Alya batt");
            heroines.add("Kajal");
            heroines.add("Soundarya");
            heroines.add("Sam");

            System.out.println("My heroines list is: "+heroines);

            heroines.remove(2);

            for(String heroin:heroines){
                  System.out.println("My heroing in iterator method:"+heroin);
            }

           
      }
      
}
