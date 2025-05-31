package Q4;



  class Mythread4 extends Thread{
	  @Override
	public void run() {
		  System.out.println("Running thread name: " + Thread.currentThread().getName());
	}
  }
public class Main {
      public static void main(String[] args) {
		Mythread4  mythread4 = new Mythread4();
		mythread4.setName("New Thread");
		System.out.println("name: "+Thread.currentThread().getName());
		mythread4.start();
				
	}
}

