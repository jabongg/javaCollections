package com.datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ejangpa on 2/1/2017.
 */
public class PrefixEvaluation {

    static Stack<Integer> stack = new Stack<>();  //  creating a stack globally

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                       // String prefixExpression = "-+*23*5499"; // given sample of prefix expression
        String prefixExpression = scanner.nextLine();
        char[] prefixExprArray = prefixExpression.toCharArray();

        //check for empty string
        if (prefixExprArray.length == 0) {
            return;
        }
        // for infix , start iterating from right to left, because elements are always at the end.
        for (int i = prefixExprArray.length - 1; i >= 0; i--) {
            if (prefixExprArray[i] == '\u0000' || prefixExprArray[i] == ' ') {                  //unicode value for null '\u0000' ;
               continue;                                                                        //if space is there in expression, simply continue
            }
            switch (findOperator(prefixExprArray[i])) {
                case 2:                                                         //if operator , pop from the stack;
                    int operator = prefixExprArray[i];
                    int operand1 = stack.pop();
                    int operand2 = stack.pop();
                    int result = evaluateResult(operand1, operand2, operator);
                    stack.push(result); //push the result of expression onto stack
                    break;
                case 1:
                    int element =   prefixExprArray[i] - '0';                  //if operand, push to stack All operations are occuring on ASCII values
                    stack.push(element);
                    break;
            }
        }

        if (stack.size() != 1) {                                            // checking if stack size is one , then result is there
            System.out.println("invalid expression");                       // otherwise the expression is invalid
            return;
        }
        System.out.println(stack.peek());
    }
    /**
     * finds operator and returns if it is a valid operator else returns 1;
     */
    public static int findOperator(char operator) {
        switch (operator) {
            case '%': return 2;
            case '/': return 2;
            case '*': return 2;
            case '-': return 2;
            case '^': return 2;
            case '+': return 2;
            default : return 1;
        }
    }

    /**
     * evaluates the result and returns result;
     * @param operand1
     * @param operand2
     * @param operator
     * @return
     */
    public static int evaluateResult(int operand1, int operand2, int operator) {
        int result = 0;
        switch (operator) {
            case '^': result = operand1 ^ operand2;
                break;
            case '%': result = operand1 % operand2;
                break;
            case '/': result = operand1 / operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '-': result = operand1 - operand2;
                break;
            case '+': result = operand1 + operand2;
                break;
        }
        return result;
    }
}
