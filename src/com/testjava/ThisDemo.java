class ThisDemo {
	
	int x ;
	int y ;
	
	ThisDemo (int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	void display(){
		System.out.println(x + " " + y);
	}
	
	public static void main (String args []){
		ThisDemo td = new ThisDemo(10,24);
		td.display();
	}
}