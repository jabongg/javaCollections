public class ConsumerThread implements Runnable {
	
	public void run() {
		System.out.println("consumer thread");
		
	}
	
	/* consume() {
		synchronized (q) {
			if (q.isEmpty()) {
				q.wait();
			} else {
				//consume items from the queue
			}
		}
	} */
}