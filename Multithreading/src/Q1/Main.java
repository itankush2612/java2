package Q1;

class Mythread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Main {
     public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.start();
		
		Thread thread = new Thread();
		thread.start();
		
		new Thread() { //anonynous inner class it is called by another class
			public void run() {
				System.out.println("th is running");
			}
		}.start();
	    new Thread (new Runnable() {
			public void run() {
				System.out.println("th2 is running");
			}
		}).start();
		
		
     }
}