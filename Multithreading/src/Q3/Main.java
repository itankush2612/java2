package Q3;




class Mythread2 extends Thread{
	@Override
	public void run() {
		System.out.println("name: "+Thread.currentThread().getName()+"priority:"+Thread.currentThread().getPriority());
	}
}

public class Main {
	public static void main(String[] args) {
		Mythread2 t1 = new Mythread2();
		Mythread2 t2 = new Mythread2();
        Mythread2 t3 = new Mythread2();
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        
     }

}
