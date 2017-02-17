class ThreadDemo extends Thread {
	public void run(){
		try{
			Thread.sleep(3000);
			System.out.println("Thread is running ;");
		} 
		catch(InterruptedException ie) {
			System.out.println("Thread interrupted!");
		}
		
	}
	
	
	public static void main (String args []) throws InterruptedException{
		
		ThreadDemo td = new ThreadDemo();
		td.start();
		
		Worker wrk = new Worker();
		wrk.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("cheking sleep");			
		}
			
	}

}


class Worker extends Thread {
	public void run (){
		System.out.println("Worker");
	}
}