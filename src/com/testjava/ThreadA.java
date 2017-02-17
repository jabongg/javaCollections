 public class ThreadA  {
	 public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start(); // now two threads , main and child thread b;
		//Thread.sleep(0,1);
		// b.join();
		
		synchronized (b) {
			Thread.sleep(5000);
			System.out.println("main thread calling wait");
			b.wait();	
			System.out.println("main waiting");
		}
		System.out.println("main gets notification");
		System.out.println(b.total);
	 }
 }