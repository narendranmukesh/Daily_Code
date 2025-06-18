import java.util.Stack;

public class PushAttheBottom {
    public static void PushAttheBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        PushAttheBottom(data, stack);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);  
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack before pushing at the bottom: " + stack);

        PushAttheBottom(5, stack);

        System.out.println("Stack after pushing 5 at the bottom (top to bottom):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
