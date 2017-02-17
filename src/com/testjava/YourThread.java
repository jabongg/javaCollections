class YourThread extends Thread {
		Display d;
		String name;
	
	public YourThread(Display d, String name) {
		this.d		 	= d;
		this.name 		= name;
	}
	
	public void run() {
		d.wish(name);
	}
		
		
/* 		YourThread t = new YourThread();
		//	Thread thread = new Thread(t);
			t.start();
			t.start();
		//thread.start();
		//t.run(4);
		System.out.println("main");
	}
	
	public void start() {
		System.out.println("start method");
		super.start();
	}
	 public void run() {
	 for (int i = 0; i < 10; i++) {
		System.out.println(i);
		System.out.println("no-arg run");
	 } */
			

}