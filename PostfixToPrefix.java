package Stacks;

import java.util.Stack;


public class PostfixToPrefix {
    //Function to check if character is an opertor
    static boolean isOperator(char ch){
        return ch=='+' || ch=='*' || ch=='-' || ch=='/' || ch=='^';
    }
    //Function to convert postfix to prefix
    static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            //If character is an operator
            if (isOperator(ch)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = ch + op2 + op1; //Prefix notation
                stack.push(temp);
            } else {
                stack.push(String.valueOf(ch)); //If character is operand
            }
        }
        return stack.pop(); //Final result
    }

    public static void main(String[] args) {
        String postfix="AB+CD-*";
        String prefix = postfixToPrefix(postfix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + prefix);
    }


    
}
