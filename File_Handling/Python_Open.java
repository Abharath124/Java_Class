package my;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Python_Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader python_file = new BufferedReader(new FileReader("Python.txt"));
			String py;
			while((py = python_file.readLine())!=null) {
				System.out.println(py);				
			}
			python_file.close();
			
		}
		catch(IOException e) {
			System.out.println("File Not Found Error");
			e.printStackTrace();			
		}

	}

}
