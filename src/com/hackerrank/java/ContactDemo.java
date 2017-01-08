
package com.hackerrank.java;

/**
 * Created by ejangpa on 10/1/2016.
 */

        import java.util.Map;
        import java.util.HashMap;
        import java.util.Scanner;
public class ContactDemo {

    public static void main(String []argh){
        System.out.println("Inside ");
        Map <String,Integer> contact = new HashMap <String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contact.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(" Search For :" + s);
            // Write code here
               /* for(Map.Entry entry: contact.entrySet()){
                    if(contact.containsKey(s)){
                       System.out.println(entry.getKey() + "=" + contact.get(s));
                        break; //breaking because its one to one map
                    }
                    else{
                        System.out.println("Not found");
                        break;
                    }
                }*/
//            for(Map.Entry entry: contact.entrySet()){
            if(contact.containsKey(s)){
//                            if(s.equals(entry.getKey())){
//                            System.out.println(entry.getKey() +" : " + entry.getValue());
                System.out.println(s + " = " + contact.get(s));
//                            continue ;
            }
            else{
                System.out.println("Not found");

            }
//                            continue;
//            }
//            continue ;
        }
        in.close();
    }


}

