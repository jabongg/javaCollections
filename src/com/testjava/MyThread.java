 public class MyThread {
	 public static void main(String[] args) {
		 Thread thread = new Thread();
		 thread.start();
	 }
	 public static class NewThread extends Thread {
		 public void run() {
			 System.out.println("Hello Thread !");
		 }
	 }
 }