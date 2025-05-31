package t2;



import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if (file.delete()) {
			System.out.println("Deleted successfully");
		}else {
			System.out.println("not deleted yet");
		}
	}

}
