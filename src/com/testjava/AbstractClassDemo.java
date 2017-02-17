public abstract class  AbstractClassDemo extends AbstractImplDemo {
    public static void main (String args []) {
		AbstractImplDemo abstractObj  = new AbstractClassDemo();
		abstractObj.getSpeed();
	}
	
	void getSpeed(){
		System.out.println("the speed is 40Km/h");
	}
}

class AbstractImplDemo {
    abstract void getSpeed();    
}