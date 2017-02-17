//echoing java args 

import java.lang.Integer;
class Echo {
	public static void main (String [] args){
		if(args.length > 0){
			Integer IntegerArray [] = new Integer[args.length];
				for(int i = 0; i < args.length; i++){
						IntegerArray[i] = Integer.parseInt(args[i]);
						System.out.println(args[i] + " " + args[i].getClass().getName());
						System.out.println(IntegerArray[i]+" "+IntegerArray[i].getClass().getName());			
			}
		}

	}

}