package t3;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			fileWriter.write("Hello world");
			fileWriter.close();//this function closes the txt file after writing the text
			System.out.println("written successfully");
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("not written");
		}
		
	}

}