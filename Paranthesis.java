package Stacks;
import java.util.Stack;
public class Paranthesis {
    static  boolean isBalanced(String str){
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
        
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }else{
                if(!stack.empty() &&
                  ((str.charAt(i) == ')' && stack.peek() == '(') ||
                   (str.charAt(i) == '}' && stack.peek() == '{') ||
                   (str.charAt(i) == ']' && stack.peek() == '['))){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        return stack.empty();

    }

        public static void main(String[] args) {
        String s="({[]})";
        if(isBalanced(s)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

    
}
