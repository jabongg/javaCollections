public class ThreadB extends Thread {
	int total = 0; 
	public void run() {

		synchronized (this) {
			System.out.println("child thread executing run");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
		
			this.notify();			
			
			System.out.println("child thread notifying main");
		}
	}
}