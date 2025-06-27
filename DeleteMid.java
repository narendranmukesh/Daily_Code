package Stacks;
import java.util.Stack;

public class DeleteMid {
    public static void deleteMid(Stack<Integer> st){
        Stack<Integer> tempSt=new Stack<>();
        int mid = st.size() / 2;
        int count=0;

        while(count <mid){
            int c=st.pop();
            tempSt.push(c);
            count++;
        }
        st.pop();

        while(!tempSt.isEmpty()){
            st.push(tempSt.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);
        deleteMid(st);
        System.out.println("Stack after deleting middle element: " + st);   
        
    }
    
}
                //USING ARRAYLIST

package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteMid{
    public  static void  deleteMid(Stack<Integer> st,int  size){

    ArrayList<Integer> a=new ArrayList<>();
    while(!st.isEmpty()){
        a.add(st.pop());
    }
    int mid=a.size()/2;
    a.remove(mid);
    for(int i=a.size()-1;i>=0;i--){
        st.push(a.get(i));
    }
}


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); 
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int size=st.size();

        deleteMid(st, size);
        while(!st.isEmpty()){
           int p= st.pop();
           System.out.println(p+ "");
        }
    }
}

      

    



