import java.util.ArrayList;
import java.util.List;

class Collection {
    public static void main(String[] args) {
        //Syntax 
        List<Integer> numbers = new ArrayList<>();
        System.out.println("My number list:" + numbers);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("My number list after :" + numbers);

        numbers.remove(2);
        System.out.println("My number list after :" + numbers);
        
        for(int nums:numbers){
            System.out.println("My number list using ITERATORS :" + nums);
        }
        
}
}