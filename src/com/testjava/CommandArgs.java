public class CommandArgs {
 public static void main(String [] args) 
   /*  {
   //     String s1 = args[1];
        String s2 = args[2];
        String s3 = args[3];
        String s4 = args[4];
        System.out.print(" args[2] = " + s2);
    } jb */
	
	{
		String names [] = new String[5];
        for (int x=0; x < args.length; x++)
            names[x] = args[x];
        System.out.println(names[2]);
	}
	
}
