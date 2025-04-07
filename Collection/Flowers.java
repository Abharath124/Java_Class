import java.util.ArrayList;
import java.util.List;

class Flowers {
      public static void main(String[] args){
            System.out.println("Flowers");
            List<String> flowers = new ArrayList<>();

            System.out.println("My flwers is :" + flowers);
            
            flowers.add("Rose");
            flowers.add("Mogra");
            flowers.add("Lily");
            flowers.add("Tulip");
            flowers.add("Orchid");
            flowers.add("Sunflower");
            flowers.add("Marigold");
            flowers.add("Jasmine");
            flowers.add("Hibiscus");
            flowers.add("Lavender");

            System.out.println("My flowers List after adding:" + flowers);

            flowers.remove(2);
            flowers.remove(3);
            System.out.println("My flower List after removing"+ flowers);

            for(String flow:flowers){
                  System.out.println("My flower list using iterators:"+flow);
            }

      }
      
}
