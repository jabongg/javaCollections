public class ProducerConsumerDemo {
	
    int[] queue = new int[5];
			
	public static void main(String[] args) {
		
		ProducerThread p = new ProducerThread();
		Thread  producer = new Thread(p,"producer");

		ConsumerThread c = new ConsumerThread();
		Thread consumer = new Thread(c,"consumer");
		
		producer.start();
		consumer.start();
	}
}