 public class YourRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		 for (int i = 0; i < 10; i++) {
			 System.out.println("in run");
		 }
	 }
	 
	 public static void main(String[] args) {
		 try {
			 Thread.currentThread().join();
		 } 
			catch(InterruptedException e) {}
		 
		 System.out.println(Thread.currentThread().getName());
		 YourRunnable r = new YourRunnable();
		 Thread t = new Thread(r);
		 t.start();
		 System.out.println(t.getPriority());
		 
		 t.setPriority(-10);
		 System.out.println(t.getPriority());
		 
	 }
 }