package t1;



import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		try {
        	file.createNewFile();//"createNewFile()" it is a command to create a new file
			System.out.println("file created successfully");
		} catch (IOException e) {
			System.out.println(e);//either file will be created or not
			System.out.println("Not created");
			
		}
		
	}

}
