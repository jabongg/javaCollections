/**
Calculate the hourglass sum for every hourglass in below array , then print the maximum hourglass sum.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19
*/

import java.util.Scanner;

public class HourGlassSumMax {
		public static void main (String args []) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Array Length : ");
			int arrayLength = scan.nextInt();
			int ArrayHourGlass [] [] = new int [arrayLength] [arrayLength];
			
			System.out.println("Enter Array Elements :");
			for(int i = 0; i < arrayLength; i++) {
				for(int j = 0; j < arrayLength; j++) {
					ArrayHourGlass[i][j] = scan.nextInt();
				}
			}

			int sum [] = new int[16];
			int count = 0;
			
			int MaxSum = -10000;
			for(int i = 0; i < arrayLength-2; i++) {
				for(int j = 0; j < arrayLength-2; j++) {
					sum[count] = ArrayHourGlass[i][j] + ArrayHourGlass[i][j+1] + ArrayHourGlass[i][j+2]
														+ ArrayHourGlass[i+1][j+1] +
								ArrayHourGlass[i+2][j] + ArrayHourGlass[i+2][j+1] + ArrayHourGlass[i+2][j+2];
					
					if(MaxSum < sum[count]) {
						MaxSum = sum[count];
					} 
					System.out.println();
					System.out.print(ArrayHourGlass[i][j] +" " +ArrayHourGlass[i][j+1] +" " + ArrayHourGlass[i][j+2]);
					System.out.println();
					System.out.print("  " +ArrayHourGlass[i+1][j+1] +"  " );
					System.out.println();
					System.out.print(ArrayHourGlass[i+2][j] +" " + ArrayHourGlass[i+2][j+1] +" " + ArrayHourGlass[i+2][j+2]);
					System.out.println();
					System.out.println();

					count++;
				}
					
			}
			System.out.println(MaxSum);
		}
}



{}{({})}()[][]([])([[{[]{({{}}[](){})}}{}[](()[(())()[]{}][][{}([{}])][{}]{})]]){}{}()[[[(){}]]]{}()[[()]]()[([]){}]()()()[](){}[[]{()}]{{[{}]()[{([((){}){{{(())}()[{([]{[((){[{}()[]]})]}[])}[]][]{({()}((({[]}{{()()[][()]}([])({[{{}}](()())})}))[()([])[()]{}]{}){}{()}())}}}])}[]][[]]}}{[]{}}{[]}(()[[{}]({[]})])[][][{()}]{{}()({[(([][({()}[{{{(){[]}}{([[][][]]{})[[[[(){(())[]}]]]]}{}[()()({})[]{{()}((){{}}{()})()}]}{}}])])){}]}){({[]}){([])}}}()[{}](()){}(){[({}[{()}])(){}]}[]{}({()}){}[][]()[]()()(){}([()][{}][[]]){[][{((){})}]}()({})({})[]({[[]]})(){{{[{}]}}{}({})()}(((){}){[]}){(){}}[[(([[{}(({()}))](())()()]()))]([[]])[(){{{}}[]({})}]{}][{{{}(((()[{()}{[][]()}[]{(())[]{}{}{}{}{[]}{()}[]}]{([][])}{(([[()({}(()){(){}}[]((()))){(()([]))}(({(([[[]]][[()]]{{}}){})}))][{({})}]{[{}({(())})({})]()}()])){}}[]{}[({()}{{[[()]][((((){}([[]{}()[[()[{(({})){}{}}()[]]]()]()[[()[]{{[{}(){}[([{()}([])()[][{}[[]()]]({}({[(()[][][])][()][]}[{[]{}[()[]]}])[()]{}{})])]][[]][{}]([{}])}}]]]))))]}})])))}}]