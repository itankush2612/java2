package Q2;





class Mythread3 extends Thread{
	
	
	@Override
	public void run() {
		
		try {
			System.out.println("Thread sleep");
			Thread.sleep(5000);
			System.out.println("thread awake");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
public class Main{
public static void main(String[] args) {
	Mythread3 mythread3 = new Mythread3();
	mythread3.start();
}
}
