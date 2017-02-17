import java.util.*;

class BitwiseXORDemo{  

 public static void main(String[] args) {
 
   
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	   System.out.println(m.hashCode());
	   System.out.println(m.getKey().hashCode());
	   System.out.println(m.getValue().hashCode());
	   System.out.println("\n \n \n");
	   System.out.println("Value entered to hashmap")
	  }			  
	}	  
}

