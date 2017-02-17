 import java.util.ArrayList;
 
  class B {

 	 int a;
	 int b;

	 B(int a, int b){
		 this.a = a;
		 this.b = b;
	 }
	 
	 public void calculate(){
		 System.out.println(a * b);
	 }
	 
 }
 
  class ArrayListDemo extends B {	 	 
  
  int myNumber = 9599;
  
	 	public static void main (String args []){
		System.out.println("in ArrayListDemo");
		ArrayListDemo ald = new ArrayListDemo();
		
		B b = new B(10,15,myNumber);
		b.calculate();
		
	}
 }
 