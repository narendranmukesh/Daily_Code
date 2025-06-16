                            // Using Java Collection Frammework to implement a stack
// import java.util.Stack;
// public class StackImplementation{
//     public static void main(String args[]){
        
//         Stack<Integer> stack=new Stack<>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);

//         while(!stack.isEmpty()){
//             System.out.println(stack.pop());
//         }


//     }
    
// }

                    //Using ArrayList to implement a stack
import java.util.ArrayList;

public class StackImplementation {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
                 
