package Stacks;

import java.util.*;
public class ReverseIndividualWords {
    static  String  reverseWords(String str){
        Stack<Character> st= new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }else{
                while((!st.isEmpty())){ //If space is encountered, pop all characters from stack
                    result.append(st.pop());
                }
                result.append(' '); //Add space after reversing the word
            }     
        }
        while(!st.isEmpty()){ //For the last word
            result.append(st.pop());
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String str = "Hello World from Stack";
        String reversed = reverseWords(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed Words: " + reversed);
        
    }
    
}
