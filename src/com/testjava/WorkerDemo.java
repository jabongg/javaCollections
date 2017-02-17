 public class WorkerDemo extends Thread {
	 @Override
	 public void run() {
		 
		 // which thread is  running run() ?
		 // worker thread is running thread.
		 System.out.println(Thread.currentThread().getName());
	 }
 }