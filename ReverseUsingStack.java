package Stacks;

import java.util.Stack;
public class ReverseUsingStack {
    public static String reverseString(String s){
       Stack<Character> stack = new Stack<>();
       for (int i = 0; i < s.length(); i++) {
           stack.push(s.charAt(i));
       }
       StringBuilder res = new StringBuilder();
       while (!stack.isEmpty()) {
           res.append(stack.pop());
       }
       return res.toString();
        
       }
     

       public static void main(String[] args) {
        String s="muki";
        System.out.println(s);
        System.out.println(reverseString(s));
       }
       
}

