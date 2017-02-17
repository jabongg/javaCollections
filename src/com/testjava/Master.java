 
 public class Master {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Master");
		Thread worker = new Worker();
		worker.setName("Worker");
		worker.start(); // Here I have two threads
						// one is main thread named "Master"
						// and other is worker thread named as "Worker"
		
		Thread.currentThread().join(); // it will wait to end main thread.
										// if you join on main then main will
										// wait forever to execute it after 
										// it ends main.
		System.out.println(Thread.currentThread().getName());
	} 
 }
