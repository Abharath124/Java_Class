import java.util.Scanner;
public class student_details{
      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("-----------Student Details----------");

          System.out.println("Enter Your ID :");          
          int id = s.nextInt();   
      //     System.out.println(id);

          System.out.println("Enter Your name :");
          String name = s.next();     
      //     System.out.println("My name is : " + name);


          System.out.println("Enter Your Department :");
          String department = s.next();     
      //     System.out.println(department);


          System.out.println("Enter Your Location :");
          String location = s.next();     
      //     System.out.println(location);


          System.out.println("Enter Your Mobile Number :");
          int mn = s.nextInt(); 
      //     System.out.println(mn);


          System.out.println(id + "\n "+ name + "\n "+ department + "\n "+  location + "\n "+  mn);

          s.close();

        


      }
}