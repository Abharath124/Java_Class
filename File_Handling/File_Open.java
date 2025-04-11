package my;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader read_java = new BufferedReader(new FileReader("Java.txt"));
			String temp;
			while((temp=read_java.readLine())!=null) {
				System.out.println(temp);				
			}
			read_java.close();
		}
		catch(IOException e) {
			System.out.println("File Not Found Error");
			e.printStackTrace();
		}
		

	}

}
