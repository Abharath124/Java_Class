package my;
import java.io.FileWriter;
import java.io.IOException;


public class File_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter java = new FileWriter("Java.txt");
			java.write("I Love Python Language, "+"After that i am master in Machine Learning");
			java.close();
			System.out.println("File Created");
		} 
		catch(IOException e) {
			System.out.println("File Not Found Error");
			e.printStackTrace();
		}

	}

}
