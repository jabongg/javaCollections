public class Display {
	public /* synchronized */ void  wish(String name) {
		;;;;;;;;;;;;;;;					// one lac lines of codes
		
		int x = 10;
		synchronized (x) {
			for (int i = 0; i < 5; i++) {
			System.out.print("good morning! :");
				
				try{
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println(e);
				}
			
			System.out.print(name);
			System.out.println();
			}	
		}
		
		;;;;;;;;;;;;;;;;;;;;;;			// one lac lines of codes
	}
}