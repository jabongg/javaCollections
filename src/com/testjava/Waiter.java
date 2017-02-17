/**
 * created by ejangpa
 */ 
 
public class Waiter extends Thread {
	public static void main(String[] args) {
		new Waiter().start();
	}
	
	@Override 
	public void run() {
		try {
			System.out.println("Starting to wait");
			synchronized (this) {
				wait(5000);
			}
			//sleep(5000);
			System.out.println("done waiting , returning lock");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Caught InterruptedException");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Caught Exception");
		}
	}
}