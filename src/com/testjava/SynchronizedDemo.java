 public class SynchronizedDemo {	 
	 public static void main(String[] args) {
			Display d = new Display();
			//Display d2 = new Display();
			
			YourThread t1 = new YourThread(d, "dhoni");
			YourThread t2 = new YourThread(d, "yubraj");
			YourThread t3 = new YourThread(d, "kohli");
			YourThread t4 = new YourThread(d, "nehra");
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
	 }
 }