package my;
import java.io.FileWriter;
import java.io.IOException;

public class Python_OOPsInformataion {
    public static void main(String[] args) {
        try {
            FileWriter python = new FileWriter("Python.txt");
            python.write("OOP is a programming paradigm based on objects and classes. " +
                         "A class is a blueprint for creating objects (instances). " +
                         "The __init__ method is a constructor, automatically called when an object is created. " +
                         "self refers to the current instance of the class and is used to access variables and methods. " +
                         "Encapsulation hides internal object details, exposing only what's needed. " +
                         "Inheritance allows a class to inherit methods and properties from another class. " +
                         "Polymorphism lets you use the same method name with different implementations. " +
                         "Abstraction hides complex logic and shows only essential features.");
            
            python.close();
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        }
    }
}
