
/**
 * Created by ejangpa on 9/30/2016.
 */
 
 import java.lang.Runnable;
 import java.lang.Thread;
 
 import java.util.ArrayList;
 import java.util.List;
 
public class ProducerConsumerProblem {
			List <Integer> resourseQueue = new ArrayList<Integer> ();
    public static void main (String [] args){
		
		System.out.println("hello");
		
        Producer producer = new Producer();
        Thread producerThread = new Thread();
        producerThread.start();

        Consumer consumer = new Consumer();
        Thread consumerThread  = new Thread();
        consumerThread.start();
    }
}

class Producer  extends ProducerConsumerProblem implements Runnable {
    @Override
    public void run() {
        put();
    }
	
    public void put(){
		
		synchronized (resourseQueue) {
			for(int i = 0; i < 5; i++){
				System.out.println(resourseQueue.add(i));
			}
			while (resourseQueue.size() == 5) {
				resourseQueue.notify();
			}
		}
		
    }
}


class Consumer extends ProducerConsumerProblem implements Runnable {
    @Override
    public void run() {
		try {
			get();
		} catch (InterruptedException e) {}

    }
	
    public  void get() throws InterruptedException {
		synchronized (resourseQueue) {
			for(int i = 100; i > 95; i--){
				System.out.println(resourseQueue.add(i));
			}
			
			while (resourseQueue.size() == 0) {
				resourseQueue.wait();
			}
		}
    }
}