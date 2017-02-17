public class ProducerThread implements Runnable {
	public void run() {
		System.out.println("producer thread");
		produce();
	}
	
	public void produce() {		
		
	    synchronized (q) {
			//produce item
			
			for (int i = 1; i <= q.length; i++) {
				q[i] = i + 10;
			}
			
			q.notify();
		}
	} 
}