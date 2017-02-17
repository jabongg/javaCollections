
/**
 * Created by ejangpa on 9/29/2016.
 */
 
 import java.lang.Thread;
 import java.util.*;
 public class ThreadSimpleDemo implements Runnable {
    public static void main (String args []) throws InterruptedException{
            String sleepArray [] = new String [] {
				"mike",
				"vladimir",
				"chin yun",
				"ki hara"
			};			
			for(int i = 0; i < sleepArray.length; i++) {
				System.out.println("Array Elements : "+sleepArray[i]);
				Thread.sleep(3000);
			}			
			Thread thread = new Thread(new ThreadSimpleDemo(),"My_Thread");	
			thread.start();
	}	
	public void run(){
		System.out.println("Entering run");
	}
 }